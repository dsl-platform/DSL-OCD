package com.dslplatform.ocd;

import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;

import com.dslplatform.ocd.dao.TestsuitesDao;
import com.dslplatform.ocd.generated.Error;
import com.dslplatform.ocd.generated.Failure;
import com.dslplatform.ocd.generated.Testcase;
import com.dslplatform.ocd.generated.Testsuite;
import com.dslplatform.ocd.generated.Testsuites;

public class OcdReportGenerator {

    private final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    private final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

    private final TestsuitesDao testsuitesDao;

    private final String outputDir;

    public OcdReportGenerator(final String inputFilename, final String outputDirectory) throws Exception {
        this.outputDir = outputDirectory.endsWith("/") ? outputDirectory : outputDirectory + "/";
        final Testsuites testsuites = (Testsuites) JAXBContext
                .newInstance("com.dslplatform.ocd.generated")
                .createUnmarshaller()
                .unmarshal(new FileInputStream(inputFilename));
        this.testsuitesDao = new TestsuitesDao(testsuites);
    }

    public void generate() {
        final DomHelper index = indexPage();
        index.writeToFile(this.indexPath());

        for(final Testsuite ts: this.testsuitesDao.getFailedTestsuites()){
            final DomHelper testsuitePage = this.testsuitePage(ts);
            testsuitePage.writeToFile(this.testsuitePath(ts));
            final DomHelper testsuiteStacktracePage = this.stacktracePage(ts);
            testsuiteStacktracePage.writeToFile(this.testSuiteStacktracePath(ts));

            for(final Testcase tc: ts.getTestcase()){
                if(tc.getError().size() > 0 || tc.getFailure().size() > 0){
                    final DomHelper testcasePage = this.testcasePage(ts, tc);
                    testcasePage.writeToFile(this.testcasePath(ts, tc));
                }
            }
        }
    }

    private DomHelper indexPage() {
        final DomHelper dh = new DomHelper(this.documentBuilder.newDocument());
        dh.root(
            dh.element("html"
                ,dh.element("head"
                    ,dh.element("title", dh.text("OCD summary"))
                    ,dh.element("link"
                        , dh.attr("rel", "stylesheet")
                        , dh.href("css/bootstrap.min.css"))
                    ,dh.element("script", dh.attr("src", "js/jquery.min.js"))
                    ,dh.element("script", dh.attr("src", "js/bootstrap.min.js")))
                , dh.element("body"
                    , dh.element("div", dh.attr("class", "container")
                        , dh.element("h1", dh.text("Testsuites summary"))
                        , this.summaryTable(dh)
                        , this.failedTestuitesTable(dh)
                        , this.successfulTestsuitesTable(dh)))));
        return dh;
    }

    private DomHelper testsuitePage(final Testsuite ts){
        final DomHelper dh = new DomHelper(this.documentBuilder.newDocument());
        dh.root(
            dh.element("html"
                ,dh.element("head"
                    ,dh.element("title", dh.text("Testsuite summary"))
                    ,dh.element("link"
                        , dh.attr("rel", "stylesheet")
                        , dh.href("../css/bootstrap.min.css"))
                    ,dh.element("script", dh.attr("src", "../js/jquery.min.js"))
                    ,dh.element("script", dh.attr("src", "../js/bootstrap.min.js")))
                , dh.element("body"
                    , dh.element("div", dh.attr("id", "TestSuiteDetails"), dh.attr("class", "container")
                        , dh.element("h1", dh.text("Test summary for " + ts.getName()))
                        , dh.a(dh.href("../../" + stacktraceLink(ts)), dh.text("(view stacktrace)"))
                        , dh.element("table", dh.attr("class", "table table-striped")
                            , this.testSuiteHeader(dh)
                            , dh.tr(
                                dh.td(dh.text(ts.getName()))
                                , dh.td(dh.text(TestsuitesDao.getSuccessRateAsString(ts)))
                                , dh.td(dh.text(ts.getTests()))
                                , dh.td(dh.text(ts.getFailures()))
                                , dh.td(dh.text(ts.getErrors()))
                                , dh.td(dh.text(ts.getTime())))))
                    , this.failedTestsDiv(dh, ts)
                    , this.successfulTestsDiv(dh, ts)
                    )));

        return dh;
    }

    private DomHelper stacktracePage(final Testsuite ts){
        final DomHelper dh = new DomHelper(this.documentBuilder.newDocument());
        dh.root(
                dh.element("html"
                    ,dh.element("head"
                        ,dh.element("title", dh.text("Testcase summary"))
                        ,dh.element("link"
                            , dh.attr("rel", "stylesheet")
                            , dh.href("../css/bootstrap.min.css"))
                        ,dh.element("script", dh.attr("src", "../js/jquery.min.js"))
                        ,dh.element("script", dh.attr("src", "../js/bootstrap.min.js")))
                    , dh.element("body"
                        , dh.text(ts.getSystemOut())
                        , dh.text(ts.getSystemErr()))));
        return dh;
    }

    private DomHelper testcasePage(final Testsuite ts, final Testcase tc) {
        final DomHelper dh = new DomHelper(this.documentBuilder.newDocument());

        final String status = tc.getError().size() > 0 || tc.getFailure().size() > 0 ? "Failed" : "Success";

        dh.root(
            dh.element("html"
                ,dh.element("head"
                    ,dh.element("title", dh.text("Testcase summary"))
                    ,dh.element("link"
                        , dh.attr("rel", "stylesheet")
                        , dh.href("../../css/bootstrap.min.css"))
                    ,dh.element("script", dh.attr("src", "../../js/jquery.min.js"))
                    ,dh.element("script", dh.attr("src", "../../js/bootstrap.min.js")))
                , dh.element("body"
                    , dh.div(dh.id("testDetails"), dh.attr("class", "container")
                        , dh.h1(dh.text(tc.getName()))
                        , dh.h2(dh.a(dh.target("_blank"), dh.href("../../" + stacktraceLink(ts)), dh.text("(stack trace)")))
                        , dh.table(dh.attr("class", "table table-striped"), dh.style("width: 1500px")
                            , dh.tr(
                                    dh.td(dh.text("Name"))
                                    , dh.td(dh.text("Status"))
                                    , dh.td(dh.text("Time")))
                            , dh.tr(
                                dh.td(dh.text(tc.getName()))
                                , dh.td(dh.text(status))
                                , dh.td(dh.text(tc.getTime()))))
                        , this.errorsDiv(dh, tc)))));


        return dh;
    }

    private Element errorsDiv(final DomHelper dh, final Testcase tc){
        final Element errorsDiv = dh.div();
        for(final Error error: tc.getError())
            errorsDiv.appendChild(this.errorTable(dh, error));
        for(final Failure failure: tc.getFailure())
            errorsDiv.appendChild(this.failureTable(dh, failure));
        return errorsDiv;
    }

    private Element errorTable(final DomHelper dh, final Error e){
        final Element table = dh.table(dh.attr("class", "table"), dh.style("width: 1500px")
                , dh.tr(
                    dh.td(dh.text("Type:")), dh.td(dh.text(e.getType())))
                , dh.tr(
                    dh.td(dh.text("Message:")), dh.td(dh.text(e.getMessage())))
                , dh.tr(
                    dh.td(dh.text("Text:")), dh.td(dh.code(dh.text(e.getContent())))));
        return table;
    }

    private Element failureTable(final DomHelper dh, final Failure f){
        final Element table = dh.table(dh.attr("class", "table"), dh.style("width: 1500px")
                , dh.tr(
                    dh.td(dh.text("Type:")), dh.td(dh.text(f.getType())))
                , dh.tr(
                    dh.td(dh.text("Message:")), dh.td(dh.text(f.getMessage())))
                , dh.tr(
                    dh.td(dh.text("Text:")), dh.td(dh.code(dh.text(f.getContent())))));
        return table;
    }

    private Element summaryTable(final DomHelper dh) {
        final Integer testsuiteCount = testsuitesDao.getTestsuitesCount();
        final Integer tests = testsuitesDao.getTestCount();
        final Integer errors = testsuitesDao.getErrorCount();
        final Integer failures = testsuitesDao.getFailureCount();
        final Double time = testsuitesDao.getTime();
        final Double successRate = testsuitesDao.getSuccessRate();

        final Element table = dh.element("table", dh.attr("class", "table table-striped")
                , dh.element("thead"
                    , dh.tr(
                        dh.th(dh.text("Success rate"))
                        , dh.th(dh.text("Test suites"))
                        , dh.th(dh.text("Tests"))
                        , dh.th(dh.text("Failures"))
                        , dh.th(dh.text("Errors"))
                        , dh.th(dh.text("Time"))))
                , dh.element("tbody"
                    , dh.tr(
                        dh.td(dh.text(String.format("%.2f", successRate)))
                        , dh.td(dh.text(testsuiteCount.toString()))
                        , dh.td(dh.text(tests.toString()))
                        , dh.td(dh.text(failures.toString()))
                        , dh.td(dh.text(errors.toString()))
                        , dh.td(dh.text(time.toString())))));
        return table;
    }

    private Element testSuiteHeader(final DomHelper dh){
        return dh.tr(
                dh.th(dh.text("Name"))
                , dh.th(dh.text("Succ. rate"))
                , dh.th(dh.text("Tests"))
                , dh.th(dh.text("Failures"))
                , dh.th(dh.text("Errors"))
                , dh.th(dh.text("Time")));
    }

    private Element testCaseHeader(final DomHelper dh){
        return dh.tr(
                dh.th(dh.text("Name"))
                , dh.th(dh.text("Status"))
                , dh.th(dh.text("Message"))
                , dh.th(dh.text("Time")));
    }

    private Element testsuiteTableEntry(final DomHelper dh, final Testsuite ts){
        final Integer tests = Integer.parseInt(ts.getTests());
        final Integer failures = Integer.parseInt(ts.getFailures());
        final Integer errors = Integer.parseInt(ts.getErrors());
        final Double successRate = 100 * ((double)(tests - failures - errors)) / tests;
        final Double time = Double.parseDouble(ts.getTime());

        return
        dh.tr(dh.attr("class", (errors > 0 || failures >0)? "danger" : "")
            , dh.td(dh.element("a", dh.href(link(ts)), dh.text(ts.getName())))
            , dh.td(dh.text(String.format("%.2f", successRate)))
            , dh.td(dh.text(tests.toString()))
            , dh.td(dh.text(failures.toString()))
            , dh.td(dh.text(errors.toString()))
            , dh.td(dh.text(time.toString())));
    }

    private Element testcaseTableEntry(final DomHelper dh, final Testsuite ts, final Testcase tc){
        final String status = tc.getError().size() > 0 || tc.getFailure().size() > 0? "Failed" : "Success";
        final String errorMessage;
        if(!tc.getError().isEmpty())
            errorMessage = tc.getError().get(0).getMessage();
        else if(!tc.getFailure().isEmpty())
            errorMessage = tc.getFailure().get(0).getMessage();
        else
            errorMessage = "-";
        final Element row =
            dh.tr(dh.attr("class", tc.getError().size() > 0 || tc.getFailure().size() > 0 ? "danger" : "")
                , dh.td(dh.a( dh.href("../" +this.link(ts, tc)), dh.text(tc.getName()))
                        , dh.br()
                        , dh.a(dh.attr("target", "_blank"), dh.href("../" + this.stacktraceLink(ts, tc)), dh.text("(view stacktrace)")))
                , dh.td(dh.text(status))
                , dh.td(dh.code(dh.text(errorMessage)))
                , dh.td(dh.text(tc.getTime()))
                );
        return row;
    }

    private Element failedTestuitesTable(final DomHelper dh){
        final Element table = dh.element("table", dh.attr("class", "table table-striped")
            , dh.element("caption", dh.text("Failed tests"))
            , this.testSuiteHeader(dh));
        for(final Testsuite ts : this.testsuitesDao.getFailedTestsuites()){
            table.appendChild(this.testsuiteTableEntry(dh, ts));
        }
        return table;
    }

    private Element successfulTestsuitesTable(final DomHelper dh){
        final Element table = dh.element("table", dh.attr("class", "table table-striped")
                , dh.element("caption", dh.text("Successful tests"))
                , this.testSuiteHeader(dh));
        for(final Testsuite ts : this.testsuitesDao.getSuccessfulTestsuites()){
            table.appendChild(this.testsuiteTableEntry(dh, ts));
        }
        return table;
    }

    private Element failedTestsDiv(final DomHelper dh, final Testsuite ts){
        final Element table = dh.table(dh.attr("class", "table table-striped")
                , this.testCaseHeader(dh));
        for(final Testcase tc: this.testsuitesDao.getFailedTestCases(ts)){
            table.appendChild(this.testcaseTableEntry(dh, ts, tc));
        }

        return dh.div(dh.id("testFails"), dh.attr("class", "container"), table);
    }

    private Element successfulTestsDiv(final DomHelper dh, final Testsuite ts){
        final Element table = dh.table(dh.attr("class", "table table-striped")
                , this.testCaseHeader(dh));
        for(final Testcase tc: this.testsuitesDao.getSuccessfulTestCases(ts)){
            table.appendChild(this.testcaseTableEntry(dh, ts, tc));
        }
        return dh.div(dh.id("testWins"), dh.attr("class", "container"), table);
    }

    private String indexPath(){
        return this.outputDir + "index.html";
    }

    private String testsuitePath(final Testsuite ts){
        return this.outputDir + "testsuites/" + ts.hashCode() + ".html";
    }

    private String testSuiteStacktracePath(final Testsuite ts){
        return this.outputDir + "testsuites/" + ts.hashCode() + "_stacktrace.html";
    }

    private static String link(final Testsuite ts) {
        return "testsuites/" + ts.hashCode() + ".html";
    }

    private static String stacktraceLink(final Testsuite ts){
        return "testsuites/" + ts.hashCode() + "_stacktrace.html";
    }

    private String link(final Testsuite ts, final Testcase tc){
        return "testsuites/"+ts.hashCode()+"/"+tc.hashCode()+".html";
    }
    private String stacktraceLink(final Testsuite ts, final Testcase tc){
        return stacktraceLink(ts)+"#"+ts.getName();
    }

    private String testcasePath(final Testsuite ts, final Testcase tc){
        return this.outputDir + "testsuites/" + ts.hashCode() + "/"+tc.hashCode() +".html";
    }

    public static void main(final String[] args) throws Exception {

        if(args.length != 2){
            System.out.println();
            System.out.println("Example usage:");
            System.out.println("java -jar ocd-report-generator.jar OCD-Tests-Summary.xml site");
        } else{
            final String outputDirectory = args[0];
            final String inputFile = args[1];
            new OcdReportGenerator(outputDirectory, inputFile).generate();
        }
    }
}
