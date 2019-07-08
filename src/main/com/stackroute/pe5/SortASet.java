package com.stackroute.pe5;

import java.util.*;

public class SortASet implements Comparator<String>{
    public int compare(String string1, String string2) {
        return string1.compareTo(string2);
    }

    public String sort(String input)  {
        if (input != null) {
            String[] strings = input.split(" ");
            Set<String> set = new HashSet<>();
            for (int i = 0; i < strings.length; i++) {
                set.add(strings[i]);
            }
            List<String> list=new ArrayList<>();
            list.addAll(set);
            Collections.sort(list,new SortASet());
            return list.toString().trim();
        }
        return null;
    }

}
