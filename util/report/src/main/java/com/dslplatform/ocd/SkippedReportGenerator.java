package com.dslplatform.ocd;

import java.io.*;
import org.apache.tools.ant.*;

public class SkippedReportGenerator {
  private static final String[] TestGroups = new String[] { "aggregates", "snowflakes", "values" };
  private static final FilenameFilter TestResultFilter = new FilenameFilter() {
    @Override
    public boolean accept(final File dir, final String name) {
      return name.startsWith("TEST") && name.endsWith(".xml");
    }
  };
  
  private final File rootFolder;
  private final File outFolder;
  
  private static boolean isTestSkipped(final File projectFolder) {
    final File[] testReports = projectFolder.listFiles(TestResultFilter);
    return testReports.length != 1;
  }
  
  public SkippedReportGenerator(final String rootDir, final String outDir) {
    this.rootFolder = new File(rootDir);
    this.outFolder = new File(outDir + "/skippedsuites");
    this.outFolder.mkdirs();
  }
  
  public void generate() {
    for (final String groupDir : TestGroups) {
      generateGroup(new File(this.rootFolder + "/" + groupDir));
    }
  }
  
  private void generateGroup(final File groupFolder) {
    if (groupFolder.exists()) {
      final File[] testFolders = groupFolder.listFiles();
      for (final File testFolder : testFolders) {
        final File projectFolder = new File(testFolder + "/java_project");
        if (isTestSkipped(projectFolder)) {
          generateTest(projectFolder);
        }
      }
    }
  }
  
  private void generateTest(final File projectFolder) {
    final File buildFile = new File(projectFolder, "build.xml");
    final ByteArrayOutputStream logStream = new ByteArrayOutputStream();
    final DefaultLogger logger = getStreamLogger(logStream);
    final Project ant = new Project();
    ant.setUserProperty("ant.file", buildFile.getAbsolutePath());
    ant.addBuildListener(logger);
    ant.fireBuildStarted();
    ant.init();
    final ProjectHelper antHelper = ProjectHelper.getProjectHelper();
    ant.addReference("ant.projectHelper", antHelper);
    antHelper.parse(ant, buildFile);
    try {
      ant.executeTarget("all");
    } catch (Exception e) {
    }
    ant.fireBuildFinished(null);
    
    //final String fullName = ant.getProperties().get("testName").toString();
    final String shortName = ant.getProperties().get("ProjectNameCamel").toString();
    final File logFile = new File(this.outFolder, "/" + shortName + ".txt");
    
    try (final OutputStream fos = new FileOutputStream(logFile)) {
      logStream.writeTo(fos);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  private static DefaultLogger getStreamLogger(final OutputStream os) {
    final PrintStream ps = new PrintStream(os);
    DefaultLogger logger = new DefaultLogger();
    logger.setErrorPrintStream(ps);
    logger.setOutputPrintStream(ps);
    logger.setMessageOutputLevel(Project.MSG_INFO);
    return logger;
}
}
