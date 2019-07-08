package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ModifyMapTest {

     ModifyMap modifyMap;
    @Before
    public void setUp(){
        System.out.println(" Before");
        modifyMap= new ModifyMap();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        modifyMap=null;

    }

    @Test
    public void givenMapShouldReturnMapOfRepalcedVal2WithVal1(){
        Map<String,String> input=new TreeMap<String, String>();
        input.put("val1","Java");
        input.put("val2","C++");
        Map<String,String> expected=new TreeMap<String, String>();
        expected.put("val1"," ");
        expected.put("val2","Java");
        Map<String,String> result=modifyMap.exchangeKeyValue(input);
        assertEquals(expected,result);
    }
    @Test
    public void givenMapWithMoreThantwoShouldReturnNull(){
        Map<String,String> input=new TreeMap<String, String>();
        input.put("val1","Java");
        input.put("val2","C++");
        input.put("val3","C#");

        Map<String,String> result=modifyMap.exchangeKeyValue(input);
        assertNull("Map Size is More than 2",result);
    }
    @Test
    public void givenMapWithVal1EmptyShouldReturnNull(){
        Map<String,String> input=new TreeMap<String, String>();
        input.put("val1","");
        input.put("val2","C++");
        Map<String,String> result=modifyMap.exchangeKeyValue(input);
        assertNull("Val1 is Empty",result);
    }
}