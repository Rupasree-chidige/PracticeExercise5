package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurencesOfStringTest {

    CountOccurencesOfString countOccurencesOfString;
    @Before
    public void setUp(){
        System.out.println(" Before");
        countOccurencesOfString= new CountOccurencesOfString();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        countOccurencesOfString=null;

    }

    @Test
    public void givenStringShouldReturnCountOfOccurancesOfAllElements(){
        String result=countOccurencesOfString.count("one one -one___two,,three,one @three*one?two");
        assertEquals("one:5 two:2 three:2",result);
    }
    @Test
    public void givenStringShouldReturnCountOfOccurences(){
        String result=countOccurencesOfString.count("word , word@is?is-word");
        assertEquals("is:2 word:3",result);
    }
    @Test
    public void givenNullStringShouldReturnNull(){
        String result=countOccurencesOfString.count(null);
        assertNull("Given null" ,result);
    }

}