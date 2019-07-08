package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoreThanOneOccurencesOfElement {
    public String findIfMoreThanTwo(String input){

        if (input != null) {
            String[] strings=input.split(",");
            List<String> list= Arrays.asList(strings);
            StringBuilder result=new StringBuilder(list.size());
            Map<String, Integer> hashMap = new HashMap<String, Integer>();

            for (String i : list) {
                Integer j = hashMap.get(i);
                hashMap.put(i, (j == null) ? 1 : j + 1);
            }
            for (Map.Entry<String, Integer> val : hashMap.entrySet()) {
                if(val.getValue()>=2)
                    result.append (val.getKey() +":true ");
                else
                    result.append (val.getKey() +":false ");
            }
            return result.toString().trim();
        }
        return null;

    }
}
