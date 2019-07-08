package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    MainTest mainTest;
    @Before
    public void setUp(){
        System.out.println(" Before");
        mainTest= new MainTest();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        mainTest=null;

    }
    @Test
    public void givenStudentsListShouldReturnSortedListOfStudents(){
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Rupa", 22, 59);
        Student s2 = new Student("Rupa", 22, 22);
        Student s3 = new Student("Pannu", 21, 18);
        Student s4 = new Student("Prannu", 25, 49);
        Student s5 = new Student("Swetha", 28, 49);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        List<Student> result= mainTest.sortstudent(students);
        assertEquals(students,result);
    }

}