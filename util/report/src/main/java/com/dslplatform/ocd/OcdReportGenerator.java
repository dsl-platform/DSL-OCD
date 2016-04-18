package com.dslplatform.ocd;

import java.io.FileInputStream;

import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

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

    private static final String FAILED_CSS_CLASS = "danger";
    private static final String WIN_CSS_CLASS = "";

    private final DocumentBuilderFactory documentBuilderFactory;
    private final DocumentBuilder documentBuilder;
    private final TestsuitesDao testsuitesDao;
    private final String outputDir;
    private final boolean generateWins;
    private final ConfigHelper configHelper;

    public OcdReportGenerator(final String siteOutputDirectory, final String aggregatedTestsFilename) {
        this(siteOutputDirectory, aggregatedTestsFilename, false);
    }

    public OcdReportGenerator(final String siteOutputDirectory, final String aggregatedTestsFilename, final boolean generateWins) {
        try {
            this.documentBuilderFactory = DocumentBuilderFactory.newInstance();
            this.documentBuilder = this.documentBuilderFactory.newDocumentBuilder();
            this.outputDir = siteOutputDirectory.endsWith("/") ? siteOutputDirectory : siteOutputDirectory + "/";
            final Testsuites testsuites = (Testsuites) JAXBContext
                    .newInstance("com.dslplatform.ocd.generated")
                    .createUnmarshaller()
                    .unmarshal(new FileInputStream(aggregatedTestsFilename));
            this.generateWins = generateWins;
            this.configHelper = new ConfigHelper();
            this.testsuitesDao = new TestsuitesDao(testsuites);

        } catch(final Exception e){
            throw new RuntimeException(e);
        }
    }

    public void generate() {
        this.indexPage().writeToFile(this.indexPath(), false);

        final List<Testsuite> fails = this.testsuitesDao.getFailedTestsuites();
        for(final Testsuite ts: fails) this.generate(ts);

        if(this.generateWins){
            final List<Testsuite> wins = this.testsuitesDao.getSuccessfulTestsuites();
            for(final Testsuite ts: wins) this.generate(ts);
        }
    }

    private void generate(final Testsuite ts){
        final DomHelper testsuitePage = this.testsuitePage(ts);
        testsuitePage.writeToFile(this.testsuitePath(ts), false);
        final DomHelper testsuiteStacktracePage = this.stacktracePage(ts);
        testsuiteStacktracePage.writeToFile(this.testSuiteStacktracePath(ts), true);

        for(final Testcase tc: ts.getTestcase()){
            this.generate(ts, tc);
        }
    }

    private void generate(final Testsuite ts, final Testcase tc){
        if(tc.getError().size()>0 || tc.getFailure().size()>0 || this.generateWins) {
            final DomHelper testcasePage = this.testcasePage(ts, tc);
            testcasePage.writeToFile(this.testcasePath(ts, tc), false);
        }
    }

    private DomHelper indexPage() {
        final DomHelper dh = new DomHelper(this.documentBuilder.newDocument());
        dh.root(
            dh.html(
                dh.head(
                    dh.title("Testusites summary")
                    ,dh.link(
                        dh.rel("stylesheet")
                        , dh.href("css/bootstrap.min.css"))
                    ,dh.script(dh.src("js/jquery.min.js"))
                    ,dh.script(dh.src("js/bootstrap.min.js")))
                , dh.body(
                    dh.div_container(
                        dh.h1("Testsuites summary")
                        , this.settingsTable(dh)
                        , this.summaryTable(dh)
                        , this.failedTestuitesTable(dh)
                        , this.successfulTestsuitesTable(dh)))));
        return dh;
    }

    private DomHelper testsuitePage(final Testsuite ts){
        final DomHelper dh = new DomHelper(this.documentBuilder.newDocument());
        dh.root(
            dh.html(
                dh.head(
                    dh.title("Testsuite summary")
                    ,dh.link(dh.rel("stylesheet")
                        , dh.href("../css/bootstrap.min.css"))
                    ,dh.script(dh.src("../js/jquery.min.js"))
                    ,dh.script(dh.src("../js/bootstrap.min.js")))
                , dh.body(
                    dh.div_container(
                        dh.h1("Test summary for " + ts.getName() + "["+ts.getTimestamp()+"]")
                        , dh.a(dh.href("../" + stacktraceLink(ts)), "(view stacktrace)")
                        , dh.table_striped(
                            this.testSuiteHeader(dh)
                            , dh.table_row(ts.getName()
                                    , TestsuitesDao.getSuccessRateAsString(ts)
                                    , ts.getTests()
                                    , ts.getFailures()
                                    , ts.getErrors()
                                    , ts.getTime())))
                    , this.failedTestsDiv(dh, ts)
                    , this.successfulTestsDiv(dh, ts))));

        return dh;
    }

    private DomHelper stacktracePage(final Testsuite ts){
        final DomHelper dh = new DomHelper(this.documentBuilder.newDocument());
        dh.root(
                dh.html(dh.head()
                    , dh.body(
                        ts.getSystemOut()
                        , ts.getSystemErr())));
        return dh;
    }

    private DomHelper testcasePage(final Testsuite ts, final Testcase tc) {
        final DomHelper dh = new DomHelper(this.documentBuilder.newDocument());

        final String name = tc.getName();
        final String status = tc.getError().size() > 0 || tc.getFailure().size() > 0 ? "Failed" : "Success";
        final String time = tc.getTime();

        dh.root(
            dh.html(
                dh.head(
                    dh.title("Testcase summary")
                    ,dh.link(
                        dh.rel("stylesheet")
                        , dh.href("../../css/bootstrap.min.css"))
                    ,dh.script(dh.src("../../js/jquery.min.js"))
                    ,dh.script(dh.src("../../js/bootstrap.min.js")))
                , dh.body(
                    dh.div_container(
                        dh.h1(tc.getName())
                        , dh.h2(dh.a(dh.target("_blank"), dh.href("../../" + stacktraceLink(ts)), "(stack trace)"))
                        , dh.table_striped(dh.style("width: 1500px")
                            , dh.table_header_row("Name", "Status", "Time")
                            , dh.table_row(name, status, time))
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
        final Element table = dh.table_error(
                dh.table_row("Type:", e.getType())
                , dh.table_row("Message:", e.getMessage())
                , dh.table_row("Text:", dh.code(e.getContent())));
        return table;
    }

    private Element failureTable(final DomHelper dh, final Failure e){
        final Element table = dh.table_error(
                dh.table_row("Type:", e.getType())
                , dh.table_row("Message:", e.getMessage())
                , dh.table_row("Text:", dh.code(e.getContent())));
        return table;
    }

    private Element settingsTable(final DomHelper dh) {
        final Map<String, String> items = new LinkedHashMap<String, String>();
        items.put("Revenj", this.configHelper.get("targetRevenj"));
        items.put("Database", this.configHelper.get("targetDatabase"));
        items.put("Server settings", this.configHelper.get("serverSettings"));
        items.put("Client settings", this.configHelper.get("clientSettings"));
        final Element table = dh.dl(items);
        return table;
    }

    private Element summaryTable(final DomHelper dh) {
        final Integer testsuiteCount = testsuitesDao.getTestsuitesCount();
        final Integer tests = testsuitesDao.getTestCount();
        final Integer errors = testsuitesDao.getErrorCount();
        final Integer failures = testsuitesDao.getFailureCount();
        final Double time = testsuitesDao.getTime();
        final Double successRate = testsuitesDao.getSuccessRate();

        final Element table = dh.table_striped(
                dh.thead(dh.table_header_row("Success rate", "Test suites", "Tests", "Failures", "Errors", "Time"))
                , dh.tbody(
                    dh.table_row(String.format("%.2f", successRate)
                            , testsuiteCount
                            , tests
                            , failures
                            , errors
                            , time)));
        return table;
    }

    private Element testSuiteHeader(final DomHelper dh){
        return dh.table_header_row(
                "Name"
                , "Succ. rate"
                , "Tests"
                , "Failures"
                , "Errors"
                , "Time");
    }

    private Element testCaseHeader(final DomHelper dh){
        return dh.table_header_row(
                "Name"
                , "Status"
                , "Message"
                , "Time");
    }

    private Element testsuiteTableEntry(final DomHelper dh, final Testsuite ts){
        final Integer tests = Integer.parseInt(ts.getTests());
        final Integer failures = Integer.parseInt(ts.getFailures());
        final Integer errors = Integer.parseInt(ts.getErrors());
        final Double successRate = 100 * ((double)(tests - failures - errors)) / tests;
        final Double time = Double.parseDouble(ts.getTime());
        final boolean failed = failures >0 || errors > 0;

        final Object tsEntry;
        if(failed || this.generateWins){
            tsEntry = dh.a(dh.href(link(ts)), ts.getName());
        }
        else {
            tsEntry = ts.getName();
        }

        return
        dh.table_row(
            dh.attr("class", failed ? FAILED_CSS_CLASS : WIN_CSS_CLASS)
            , tsEntry
            , String.format("%.2f", successRate)
            , tests
            , failures
            , errors
            , time);
    }

    private Element testcaseTableEntry(final DomHelper dh, final Testsuite ts, final Testcase tc){
        final boolean failed = tc.getError().size() > 0 || tc.getFailure().size() > 0;
        final String status = failed ? "Failed" : "Success";
        String errorMessage;
        if(!tc.getError().isEmpty())
            errorMessage = tc.getError().get(0).getMessage();
        else if(!tc.getFailure().isEmpty())
            errorMessage = tc.getFailure().get(0).getMessage();
        else
            errorMessage = "-";

        if(errorMessage==null) errorMessage = "-";

        final Element row =
            dh.table_row(dh.attr("class", failed ? FAILED_CSS_CLASS : WIN_CSS_CLASS)
                , dh.td(failed || this.generateWins ? dh.a( dh.href("../" +this.link(ts, tc)), tc.getName()) : tc.getName()
                        , dh.br()
                        , failed || this.generateWins ? dh.a(dh.target("_blank"), dh.href("../" + this.stacktraceLink(ts, tc)), "(view stacktrace)") : dh.a())
                , status
                , dh.code(errorMessage)
                , tc.getTime()
                );
        return row;
    }

    private Element failedTestuitesTable(final DomHelper dh){
        final Element table = dh.table_striped(
            dh.caption("Failed tests")
            , this.testSuiteHeader(dh));
        for(final Testsuite ts : this.testsuitesDao.getFailedTestsuites()){
            table.appendChild(this.testsuiteTableEntry(dh, ts));
        }
        return table;
    }

    private Element successfulTestsuitesTable(final DomHelper dh){
        final Element table = dh.table_striped(
                dh.caption("Successful tests")
                , this.testSuiteHeader(dh));
        for(final Testsuite ts : this.testsuitesDao.getSuccessfulTestsuites()){
            table.appendChild(this.testsuiteTableEntry(dh, ts));
        }
        return table;
    }

    private Element failedTestsDiv(final DomHelper dh, final Testsuite ts){
        final Element table = dh.table_striped(this.testCaseHeader(dh));
        for(final Testcase tc: this.testsuitesDao.getFailedTestCases(ts)){
            table.appendChild(this.testcaseTableEntry(dh, ts, tc));
        }

        return dh.div_container(table);
    }

    private Element successfulTestsDiv(final DomHelper dh, final Testsuite ts){
        final Element table = dh.table_striped(this.testCaseHeader(dh));
        for(final Testcase tc: this.testsuitesDao.getSuccessfulTestCases(ts)){
            table.appendChild(this.testcaseTableEntry(dh, ts, tc));
        }
        return dh.div_container(table);
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
        return stacktraceLink(ts)+"#"+tc.getClassname() + "." + tc.getName();
    }

    private String testcasePath(final Testsuite ts, final Testcase tc){
        return this.outputDir + "testsuites/" + ts.hashCode() + "/" + tc.hashCode() +".html";
    }
}
