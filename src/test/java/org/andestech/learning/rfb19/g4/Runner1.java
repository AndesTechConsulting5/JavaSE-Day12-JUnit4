package org.andestech.learning.rfb19.g4;

//import org.junit.runners.JUnit4;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;


public class Runner1 {

    public static void main(String[] args)
    {
       Result res = JUnitCore.runClasses(App3Test.class, App2Test.class);
       for (Failure failure: res.getFailures())
       {
           System.out.println(failure.getMessage());
       }


    }
}
