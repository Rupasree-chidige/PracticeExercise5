package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListOperationsTest {

    ArrayListOperations arrayListOperations;
    @Before
    public void setUp(){
        arrayListOperations=new ArrayListOperations();

    }
    @After
    public void tearDown()
    {
        arrayListOperations=null;
    }
    @Test
    public void givenIndexAndReplaceElementShouldReturnReplacedAndClearedList()
    { List<String> expected=new ArrayList<>();
      List<String> actual= arrayListOperations.updateAndClearArrayList(0,"Kiwi");
       assertEquals(expected,actual);

    }
    @Test
    public void givenIndexAndNullElementShouldReturnReplacedAndClearedList()
    { List<String> expected=new ArrayList<>();
        List<String> actual= arrayListOperations.updateAndClearArrayList(0,null);
        assertEquals(expected,actual);

    }
    @Test
    public void givenNegativeIndexAndReplaceElementShouldReturnNull()
    { List<String> expected=new ArrayList<>();
        List<String> actual= arrayListOperations.updateAndClearArrayList(-1,"kiwi");
        assertNull("index cannot be negative",actual);

    }
    @Test
    public void givenIndexGreaterThanBoundAndReplaceElementShouldReturnNull()
    { List<String> expected=new ArrayList<>();
        List<String> actual= arrayListOperations.updateAndClearArrayList(4,"kiwi");
        assertNull("Index more than list size",actual);

    }


}