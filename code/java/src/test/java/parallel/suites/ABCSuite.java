package parallel.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import parallel.ParallelSuite;
import parallel.suites.tests.TestArrBool;
import parallel.suites.tests.TestListBool;
import parallel.suites.tests.TestOneBool;
import parallel.suites.tests.TestOptBool;

@RunWith(ParallelSuite.class)
@SuiteClasses({TestOneBool.class, TestOptBool.class , TestArrBool.class, TestListBool.class}) //, TestB.class, TestC.class})
public class ABCSuite {


}
