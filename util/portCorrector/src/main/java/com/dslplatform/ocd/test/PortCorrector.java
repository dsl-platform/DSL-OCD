package com.dslplatform.ocd.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * An ad-hoc class to be used at runtime to check if any of the predefined ports
 * in 'projectNamesAndPortsRepository.properties' are in use.
 */
public class PortCorrector {

	private static final Map<String, Integer> sequences = new HashMap<String, Integer>();

	public static void main(String[] args) throws Exception {
		if(args.length <1) {
			System.out.println("No properties file provided.");
			return;
		}

		String propertiesFilename = args[0];
		Properties props = new Properties();
		props.load(new FileInputStream(propertiesFilename));

		new PortCorrector().sanitizePorts(props);

		props.store(new java.io.FileOutputStream(propertiesFilename), "Generated mappings for project names to their server ports.");
	}

	private void sanitizePorts(Properties props) {
		maximizeSequences(props);

		Map<String, String> newValues = new HashMap<String, String>();
		for(Object key : props.keySet()) {
			try {
				String projectShortName = projectShortName(props, (String) key);
				String host = host(props, (String) key);
				Integer port = port(props, (String) key);
				if(eitherNull(projectShortName, host, port)) continue;

				if(!portIsFree(host, port)) {
					while (!portIsFree(host, port)) {
						port = nextFreePort(projectShortName);
					}
					System.out.println("Port clash detected. New port for project: " + projectShortName + " is " + port);
					newValues.put(projectShortName+".revenjHost", port.toString());
				}
			} catch(Exception e) {
				continue;
			}
		}

		props.putAll(newValues);

	}

	private static boolean portIsFree(String host, int port) {
		Socket s = null;
		try {
			s = new Socket(host, port);
			return false;
		} catch(Exception e) {
			return true;
		} finally {
			if(s!=null) {
				try {
					s.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	private void maximizeSequences(Properties props) {
		for(Map.Entry<Object, Object> e : props.entrySet()) {
			try {
				String key = (String) e.getKey();
				String value = (String) e.getValue();

				String projectShortName = projectShortName(props, key);
				String host = host(props, key);
				Integer port = port(props, key);
				if(eitherNull(projectShortName, host, port)) continue;
				sequences.put(projectShortName, Math.max(nextFreePort(host), port));

			} catch(Exception ex) {
				continue;
			}
		}
	}

	private static int nextFreePort(String projectShortName) {
		if(!sequences.containsKey(projectShortName))
			sequences.put(projectShortName, 10000);

		int sequence = sequences.get(projectShortName);
		if(portIsFree(projectShortName, sequence)) {
			sequences.put(projectShortName, sequence + 1);
			return sequence;
		} else {
			sequences.put(projectShortName, sequence + 1);
			return nextFreePort(projectShortName);
		}
	}

	private static String projectShortName(Properties props, String key) {
		String projectShortName = null;
		if(key.endsWith(".revenjHost")) {
			projectShortName = key.replaceAll("\\.revenjHost$", "");
		}
		if(key.endsWith(".revenjPort")) {
			projectShortName = key.replaceAll("\\.revenjPort$", "");
		}
		return projectShortName;
	}

	private static String host(Properties props, String key) {
		String projectShortName = projectShortName(props, key);
		if(projectShortName == null) return null;
		return (String) props.get(projectShortName + ".revenjHost");
	}

	private static Integer port(Properties props, String key) {
		String projectShortName = projectShortName(props, key);
		if(projectShortName == null) return null;
		return Integer.parseInt((String) props.get(projectShortName + ".revenjPort"));
	}

	private static boolean eitherNull(Object ... objs) {
		if(objs == null) return false;
		for(Object obj : objs) {
			if(obj == null) return true;
		}
		return false;
	}
}
