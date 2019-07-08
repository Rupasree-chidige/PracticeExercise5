package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

    public List<String> updateAndClearArrayList(int index, String replace)
    {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        if((index>=0)&&(index<list.size())){
            list.set(index, replace);
            list.removeAll(list);
            return list;
        }
        else{
            return null;
        }
    }
}
