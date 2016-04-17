package com.dslplatform.ocd;

public class EntryPoint {
  public static void main(final String[] args) throws Exception {
    if(args.length != 3 && args.length != 4){
        System.out.println();
        System.out.println("Example usage:");
        System.out.println("java -jar ocd-report-generator.jar root site OCD-Tests-Summary.xml [generate-wins-pages]");
    } else {
      runOcdReportGenerator(args[1], args[2], args.length == 4);
      //runSkippedReportGenerator(args[0], args[1]);
    }
  }

  private static void runOcdReportGenerator(
      final String outputDirectory,
      final String inputFile,
      final boolean generateWinsPages) {
    final OcdReportGenerator generator = new OcdReportGenerator(outputDirectory, inputFile, generateWinsPages);
    generator.generate();
  }

  private static void runSkippedReportGenerator(
      final String projectDirectory,
      final String outputDirectory) {
    final SkippedReportGenerator generator = new SkippedReportGenerator(projectDirectory, outputDirectory);
    generator.generate();
  }
}
