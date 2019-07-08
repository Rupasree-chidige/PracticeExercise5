package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurencesOfString {

    public String count(String input) {
        if (input != null) {
            String[] strings=input.split("[-*,*_*@* *?*]+");
            List<String> list= Arrays.asList(strings);
            StringBuilder result=new StringBuilder(list.size());
            Map<String, Integer> hashMap = new HashMap<String, Integer>();

            for (String i : list) {
                Integer j = hashMap.get(i);
                hashMap.put(i, (j == null) ? 1 : j + 1);
            }
            for (Map.Entry<String, Integer> val : hashMap.entrySet()) {
                result.append (val.getKey() + ":" + val.getValue()+" ");
            }
            return result.toString().trim();
        }
        return null;
    }
}
