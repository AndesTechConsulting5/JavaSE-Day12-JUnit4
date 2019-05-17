package org.andestech.learning.rfb19.g4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;



/**
 * Unit test for simple App.
 */

public class App2Test
{

    @Before
    public void beforeMeth(){
        System.out.println("+++ meth");

    }

    @After
    public void afterMeth(){
        System.out.println("--- meth");

    }

    @Test
    public void testCase03()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Test
    public void testCase04()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertEquals("AA","BB");

    }

    @Test
    @Category(ISlowTests.class)
    public void testCase05()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }
}
