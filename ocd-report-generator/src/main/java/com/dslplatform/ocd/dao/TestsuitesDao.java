package com.dslplatform.ocd.dao;

import java.util.ArrayList;
import java.util.List;

import com.dslplatform.ocd.generated.Testcase;
import com.dslplatform.ocd.generated.Testsuite;
import com.dslplatform.ocd.generated.Testsuites;

public class TestsuitesDao {

    public final Testsuites testsuites;
    public TestsuitesDao(final Testsuites testsuites){
        this.testsuites = testsuites;
    }

    public static String getSuccessRateAsString(final Testsuite ts) {
        final Integer tests = Integer.parseInt(ts.getTests());
        final Integer failures = Integer.parseInt(ts.getFailures());
        final Integer errors = Integer.parseInt(ts.getErrors());
        final Double successRate = 100 * ((double)(tests - failures - errors)) / tests;
        return String.format("%.2f", successRate);
    }

    public Double getSuccessRate(){
        return 100 * ((double)(this.getTestCount() - this.getFailureCount() - this.getErrorCount())) / this.getTestCount();

    }

    public List<Testsuite> getSuccessfulTestsuites(){
        final List<Testsuite> testsuites = new ArrayList<Testsuite>();
        for(final Testsuite ts : this.testsuites.getTestsuite()){
            final int errors = Integer.parseInt(ts.getErrors());
            final int failures = Integer.parseInt(ts.getFailures());
            if(errors == 0 && failures == 0)
                testsuites.add(ts);
        }
        return testsuites;
    }

    public List<Testsuite> getFailedTestsuites(){
        final List<Testsuite> testsuites = new ArrayList<Testsuite>();
        for(final Testsuite ts : this.testsuites.getTestsuite()){
            final int errors = Integer.parseInt(ts.getErrors());
            final int failures = Integer.parseInt(ts.getFailures());
            if(errors > 0 || failures > 0)
                testsuites.add(ts);
        }
        return testsuites;
    }

    public List<Testcase> getSuccessfulTestCases(final Testsuite ts){
        final List<Testcase> tcs = new ArrayList<Testcase>();
        for(final Testcase tc: ts.getTestcase()) {
            if (tc.getError().size() == 0 && tc.getFailure().size() == 0){
                tcs.add(tc);
            }
        }
        return tcs;
    }

    public List<Testcase> getFailedTestCases(final Testsuite ts){
        final List<Testcase> tcs = new ArrayList<Testcase>();
        for(final Testcase tc: ts.getTestcase()) {
            if (tc.getError().size() > 0 || tc.getFailure().size() > 0){
                tcs.add(tc);
            }
        }
        return tcs;
    }

    public int getTestsuitesCount(){
        return this.testsuites.getTestsuite().size();
    }

    public int getTestCount(){
        int sum=0;
        for(final Testsuite testsuite: this.testsuites.getTestsuite()){
            final int tests = Integer.parseInt(testsuite.getTests());
            sum += tests;
        }
        return sum;
    }

    public int getErrorCount(){
        int sum=0;
        for(final Testsuite testsuite: this.testsuites.getTestsuite()){
            final int errors = Integer.parseInt(testsuite.getErrors());
            sum += errors;
        }

        return sum;
    }

    public int getFailureCount(){
        int sum=0;
        for(final Testsuite testsuite: this.testsuites.getTestsuite()){
            final int failures = Integer.parseInt(testsuite.getFailures());
            sum += failures;
        }
        return sum;
    }

    public Double getTime(){
        Double sum = Double.valueOf(0);
        for(final Testsuite testsuite: this.testsuites.getTestsuite()){
            final Double time = Double.parseDouble(testsuite.getTime());
            sum += time;
        }
        return sum;
    }
}
