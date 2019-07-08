package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortASetTest {

    SortASet sortASet;
    @Before
    public void setUp(){
        System.out.println(" Before");
        sortASet= new SortASet();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        sortASet=null;

    }

    @Test
    public void givenStringShouldReturnSortedsetOfStrings(){
        String result=sortASet.sort("Harry Alice Olive Bluto Eugene");
        assertEquals("[Alice, Bluto, Eugene, Harry, Olive]",result);
    }
    @Test
    public void givenStringShouldReturnSortedStrings(){
        String result=sortASet.sort("java core concepts");
        assertEquals("[concepts, core, java]",result);
    }
    @Test
    public void givenNullStringShouldReturnNull(){
        String result=sortASet.sort(null);
        assertEquals(null ,result);
    }

}