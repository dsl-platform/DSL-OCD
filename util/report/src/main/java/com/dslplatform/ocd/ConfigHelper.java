package com.dslplatform.ocd;

import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigHelper {
  public static final String ConfigFolder = "DSL-OCD";
  public static final String OcdConfig = "ocd.config";
  public static final String TestConfig = "test.config";

  private final Properties props;

  private static Properties loadPropsFromFile(final String filename) {
    try {
      final InputStream fis = new FileInputStream(filename);
      final Properties props = new Properties();
      props.load(fis);
      return props;
    } catch (Exception ex) {
      throw new RuntimeException("Could not load properties file '" + filename + "'");
    }
  }

  public ConfigHelper() {
    this(
        System.getProperty("user.home") + "/.config/" + ConfigFolder + "/" + OcdConfig,
        System.getProperty("user.home") + "/.config/" + ConfigFolder + "/" + TestConfig
    );
  }

  public ConfigHelper(final String ocdPath, final String testPath) {
    final Properties ocdProps = loadPropsFromFile(ocdPath);
    final Properties testProps = loadPropsFromFile(testPath);

    this.props = new Properties();
    this.props.putAll(ocdProps);
    this.props.putAll(testProps);
  }

  public String get(final String key) {
    return props.getProperty(key);
  }
}
