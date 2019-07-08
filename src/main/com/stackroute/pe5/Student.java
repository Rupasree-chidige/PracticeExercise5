package com.stackroute.pe5;

import java.util.*;

public class Student {
    private String name;
    private int age;
    private int id;

     Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;


    }
}

class StudentSorter implements Comparator<Student> {

        private List<Comparator<Student>> listComparators;

        @SafeVarargs
        public StudentSorter(Comparator<Student>... comparators) {
            this.listComparators = Arrays.asList(comparators);
        }

        @Override
        public int compare(Student s1, Student s2) {
            for (Comparator<Student> comparator : listComparators) {
                int result = comparator.compare(s1, s2);
                if (result != 0) {
                    return result;
                }
            }
            return 0;
        }
    }

class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s2.getAge() - s1.getAge();
    }
}
class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
class StudentIdComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getId()-s2.getId();
    }
}

class MainTest{
    public  List<Student> sortstudent(List<Student> students) {

       Collections.sort(students, new StudentSorter(
                new StudentAgeComparator(),
                new StudentNameComparator(),
                new StudentIdComparator()));
       return students;

    }

}