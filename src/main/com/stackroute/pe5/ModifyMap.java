package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModifyMap {
    public Map<String, String> exchangeKeyValue(Map<String, String> input) {
        if(input.size()==2) {
            String val1 = null;
            String key1 = null;
            for (Map.Entry<String, String> item : input.entrySet()) {
                key1 = item.getKey();
                val1 = item.getValue();
                break;
            }
            if(!val1.isEmpty()) {
                for (Map.Entry<String, String> item : input.entrySet()) {
                    if (item.getKey().equals(key1))
                        item.setValue(" ");
                    else
                        item.setValue(val1);

                }
                return input;
            }else return null;
        }
        return null;

    }
}
