package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceOfStringCheck {


    OccuranceOfString occuranceOfString;
    @Before
    public void setUp()
    {
        occuranceOfString=new OccuranceOfString();
    }
    @After
    public void tearDown()
    {
        occuranceOfString=null;
    }
    String inputString="java count occurences of java";
    String inputChar="j";

    @Test
    public void testOccuranceOfCharSuccess()
    {
        String expectedValue="2",actualValue;
        actualValue=occuranceOfString.occuranceOfChar(inputChar,inputString);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testOccuranceOfCharFailure()
    {
        String expectedValue="1",actualValue;
        actualValue=occuranceOfString.occuranceOfChar(inputChar,inputString);
        assertNotEquals(expectedValue,actualValue);
    }

    String inputCharone="@";

    @Test
    public void testOccuranceOfCharForSpecialCharInput()
    {
        String expectedValue="Enter a Character",actualValue;
        actualValue=occuranceOfString.occuranceOfChar(inputCharone,inputString);
        assertEquals(expectedValue,actualValue);
    }

    String inputCharTwo=" ";

    @Test
    public void testOccuranceOfCharrForEmptyCharInput()
    {
        String expectedValue="Enter a Character",actualValue;
        actualValue=occuranceOfString.occuranceOfChar(inputCharTwo,inputString);
        assertEquals(expectedValue,actualValue);
    }

    String inputStringTwo=" ";

    @Test
    public void testOccuranceOfCharForEmptyString()
    {
        String expectedValue="Enter a Character",actualValue;
        actualValue=occuranceOfString.occuranceOfChar(inputCharTwo,inputStringTwo);
        assertEquals(expectedValue,actualValue);
    }




}