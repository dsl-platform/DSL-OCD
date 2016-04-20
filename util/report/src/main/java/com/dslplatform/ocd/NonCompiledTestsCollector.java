package com.dslplatform.ocd;

import com.dslplatform.ocd.generated.Properties;
import com.dslplatform.ocd.generated.Property;
import com.dslplatform.ocd.generated.Testsuite;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonCompiledTestsCollector {

	private static final Pattern BUILD_LOG_REGEX = Pattern.compile("TEST-(.*)_build.log");
	private static final Pattern SERVER_LOG_REGEX = Pattern.compile("TEST-(.*)_server.log");
	private static final Pattern TEST_RESULT_REGEX = Pattern.compile("TEST-(.*).xml");
	private static final Pattern BUILD_XML_REGEX = Pattern.compile("build\\.xml");

	private static class RegexPatternFilter implements FileFilter {
		private final Pattern pattern;
		public RegexPatternFilter(final Pattern pattern) {
			this.pattern = pattern;
		}

		@Override
		public boolean accept(File pathname) {
			return pattern.matcher(pathname.getName()).matches();
		}
	}
	private static final RegexPatternFilter BUILD_LOG_FILE_FILTER = new RegexPatternFilter(BUILD_LOG_REGEX);
	private static final RegexPatternFilter BUILD_XML_FILE_FILTER = new RegexPatternFilter(BUILD_XML_REGEX);
	private static final RegexPatternFilter SERVER_LOG_FILE_FILTER = new RegexPatternFilter(SERVER_LOG_REGEX);
	private static final RegexPatternFilter TEST_RESULT_FILE_FILTER = new RegexPatternFilter(TEST_RESULT_REGEX);

	private static class NonCompiledTestSuiteDirectoryFilter implements FileFilter {
		@Override
		public boolean accept(File pathname) {
			return pathname.isDirectory() &&
					(pathname.listFiles(BUILD_LOG_FILE_FILTER).length > 0
							|| pathname.listFiles(BUILD_XML_FILE_FILTER).length > 0)
				  && pathname.listFiles(TEST_RESULT_FILE_FILTER).length == 0
				;
		}
	}
	private static final NonCompiledTestSuiteDirectoryFilter FILTER = new NonCompiledTestSuiteDirectoryFilter();

	public List<Testsuite> collect() {
		List<Testsuite> result = new ArrayList<Testsuite>();

		for(File dir: nonCompiledTestDirs(new File("."))) {
			File buildLog = firstOrNull(dir.listFiles(BUILD_LOG_FILE_FILTER));
			File serverLog = firstOrNull(dir.listFiles(SERVER_LOG_FILE_FILTER));
			String testName = tryExtractTestName(dir); //tryExtractTestName(buildLog, serverLog);
			if(testName != null) {
				Testsuite ts = new Testsuite();
				ts.setName(testName);

				ts.setProperties(new Properties());
				if(buildLog != null) {
					Property buildLogProp = new Property();
					buildLogProp.setName("build.log");
					buildLogProp.setValue(buildLog.getAbsolutePath());
					ts.getProperties().getProperty().add(buildLogProp);
				}
				if(serverLog != null) {
					Property serverLogProp = new Property();
					serverLogProp.setName("server.log");
					serverLogProp.setValue(serverLog.getAbsolutePath());
					ts.getProperties().getProperty().add(serverLogProp);
				}

				result.add(ts);
			}
		}
		return result;
	}

	private List<File> nonCompiledTestDirs(File root) {
		List<File> result = new ArrayList<>();
		if(root != null) {
			if (FILTER.accept(root)) result.add(root);
			File[] listed = root.listFiles();
			if(listed != null)
			for (File child : listed) {
				result.addAll(nonCompiledTestDirs(child));
			}
		}
		return result;
	}

	private File firstOrNull(File[] files) {
		if(files != null && files.length>0) return files[0];
		return null;
	}

	private String tryExtractTestName(File dir) {
		if(dir.getAbsolutePath().equals(new File(".").getAbsolutePath())) return null;
		else {
			return dir.getParentFile().getName();
		}
	}

	private String tryExtractTestName(File ... files) {
		String result = null;

		if(files != null)
		for(File file: files) {
			if(file == null) continue;
			String filename = file.getName();
			Matcher matcher = matchEither(filename, BUILD_LOG_REGEX, SERVER_LOG_REGEX, TEST_RESULT_REGEX, BUILD_XML_REGEX);
			if(matcher != null) {
				return matcher.group(1);
			}
		}

		return result;
	}

	private static Matcher matchEither(String string, Pattern ... patterns) {
		if(patterns != null)
		for(Pattern p : patterns) {
			Matcher matcher = p.matcher(string);
			if(matcher.matches()) return matcher;
		}
		return null;
	}

}
