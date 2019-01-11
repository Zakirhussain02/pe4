package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNameCheck {

    FindName findName;

    @Before
    public void setUp() throws Exception {
        findName=new FindName();
    }

    @After
    public void tearDown() throws Exception {
    }
    //pass case
    @Test
    public void findNameCheckSuccess(){
        String largeText = "this is Harry";
        String expectedValue = "is Harry here?"+"true";
        String actualValue=findName.captureValues(largeText);
        assertEquals(expectedValue,actualValue);
    }

    //failure case
    @Test
    public void findNameCheckFailure(){
        String largeText = "this is Harry";
        String expectedValue = "is Harry here?"+"false";
        String actualValue=findName.captureValues(largeText);
        assertNotEquals(expectedValue,actualValue);
    }


    //null case
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(findName.captureValues(null));
    }
}