package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class checkReplacingChar {

    ReplacingChar replacingchar;
    @Before
    public void setUp()
    {
        replacingchar =new ReplacingChar();
    }
    @After
    public void tearDown()
    {
        replacingchar =null;
    }

    String inputString="daily dry";

    @Test
    public void testReplacingSuccess()
    {
        String expectedValue="fatly fry",actualValue;
        actualValue= replacingchar.replaceChar(inputString);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testReplacingFailure()
    {
        String expectedValue="datly fry",actualValue;
        actualValue= replacingchar.replaceChar(inputString);
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testReplacingNullCondition()
    {
        String expectedValue=null,actualValue;
        actualValue= replacingchar.replaceChar(null);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testReplacingEmptyString()
    {
        String expectedValue=null,actualValue;
        actualValue= replacingchar.replaceChar(" ");
        assertEquals(expectedValue,actualValue);
    }


}