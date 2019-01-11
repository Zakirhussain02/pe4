package com.company;

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        String arg = "my name id xyz";
        String[] myArray = arg.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<myArray.length;i++){
            list.add(myArray[i]);
        }
        Collections.sort(list);
        System.out.print(list);
    }
}