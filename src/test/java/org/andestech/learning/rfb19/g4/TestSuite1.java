package org.andestech.learning.rfb19.g4;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({App2Test.class, AppTest.class})
public class TestSuite1 {

    @BeforeClass
    public static void beforeMeth(){
        System.out.println("+++ CLASS");

    }

    @AfterClass
    public static void afterMeth(){
        System.out.println("--- CLASS");

    }

}
