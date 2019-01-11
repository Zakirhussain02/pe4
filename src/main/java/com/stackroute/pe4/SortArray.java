package com.stackroute.pe4;

import java.util.*;

public class SortArray {
    public ArrayList<String> sortArray(String string) {

        String[] myArray = string.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<myArray.length;i++){
            list.add(myArray[i]);
        }
        Collections.sort(list);
        return list;
    }
}