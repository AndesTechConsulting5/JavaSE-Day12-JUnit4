package org.andestech.learning.rfb19.g4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testCase01()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Test
    public void testCase02()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }
}
