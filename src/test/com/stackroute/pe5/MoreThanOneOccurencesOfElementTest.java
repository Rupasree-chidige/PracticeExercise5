package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoreThanOneOccurencesOfElementTest {
   MoreThanOneOccurencesOfElement moreThanOneOccurencesOfElement;
    @Before
    public void setUp(){
        System.out.println(" Before");
        moreThanOneOccurencesOfElement= new MoreThanOneOccurencesOfElement();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        moreThanOneOccurencesOfElement=null;

    }

    @Test
    public void givenStringShouldReturnTrueOrFalseBasedOnCount(){
        String result=moreThanOneOccurencesOfElement.findIfMoreThanTwo("a,c,b,a,c,d,c");
        assertEquals("a:true b:false c:true d:false",result);
    }
    @Test
    public void givenStringShouldReturnTrueIfTheElementIsMoreThanOne(){
        String result=moreThanOneOccurencesOfElement.findIfMoreThanTwo("string,string,is,is,string");
        assertEquals("string:true is:true",result);
    }
    @Test
    public void givenNullStringShouldReturnNull(){
        String result=moreThanOneOccurencesOfElement.findIfMoreThanTwo(null);
        assertEquals(null ,result);
    }
}