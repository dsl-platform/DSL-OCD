package com.dslplatform.ocd;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

	public static String fileContentsAsString(String filename) {
		try {
			byte[] bytes = Files.readAllBytes(Paths.get(filename));
			return new String(bytes, StandardCharsets.UTF_8);
		} catch (Exception e) {
			return null;
		}
	}

	public static Integer parseInt(String s) {
		try {
			return Integer.parseInt(s);
		} catch(Exception e) {
			return 0;
		}
	}

	public static Double parseDouble(String s) {
		try {
			return Double.parseDouble(s);
		} catch(Exception e) {
			return 0.0;
		}
	}

}
