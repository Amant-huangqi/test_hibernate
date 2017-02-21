package com.lps.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCards.class, TestCitys.class, TestHibernate.class })
public class AllTests {

}
