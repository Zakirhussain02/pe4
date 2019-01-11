package com.stackroute.pe4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class SortArrayCheck {
    SortArray sortArrays;
    @Before
    public void setUp() throws Exception {
        sortArrays=new SortArray();
    }

    @After
    public void tearDown() throws Exception {
        sortArrays=null;
    }

    //pass case
    @Test
    public void sortArraySuccess()
    {
        String string = "my name id xyz";
        ArrayList<String> expectedValue =new ArrayList<String>();
        expectedValue.add("id");
        expectedValue.add("my");
        expectedValue.add("name");
        expectedValue.add("xyz");
        ArrayList<String> actualValue=new ArrayList<String>();
        actualValue = sortArrays.sortArray(string);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    //fail cases
    public void sortArrayfailure()
    {
        String string = "my name id xyz";
        ArrayList<String> expectedValue =new ArrayList<String>();
        expectedValue.add("id");
        expectedValue.add("my");
        expectedValue.add("name");
        ArrayList<String> actualValue=new ArrayList<String>();
        actualValue = sortArrays.sortArray(string);
        assertNotEquals(expectedValue,actualValue);
    }
    //null case
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(sortArrays.sortArray(null));
    }
}