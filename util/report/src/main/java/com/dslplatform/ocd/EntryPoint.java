package com.dslplatform.ocd;

public class EntryPoint {
  public static void main(final String[] args) throws Exception {
    if(args.length != 3 && args.length != 4){
      System.out.println();
      System.out.println("Example usage:");
      System.out.println("java -jar ocd-report-generator.jar root site OCD-Tests-Summary.xml [generate-wins-pages]");
    } else {
      final String projectDirectory = args[0];
      final String siteOutputDirectory = args[1];
      final String aggregatedTestsFilename = args[2];
      final boolean generateWins = args.length == 4;

      runOcdReportGenerator(siteOutputDirectory, aggregatedTestsFilename, generateWins);
      runSkippedReportGenerator(args[0], siteOutputDirectory);
    }
  }

  private static void runOcdReportGenerator(
          final String outputDirectory,
          final String inputFile,
          final boolean generateWinsPages) {

    new OcdReportGenerator(outputDirectory, inputFile, generateWinsPages).generate();
  }

  private static void runSkippedReportGenerator(
          final String projectDirectory,
          final String outputDirectory) {
    new SkippedReportGenerator(projectDirectory, outputDirectory).generate();
  }
}
