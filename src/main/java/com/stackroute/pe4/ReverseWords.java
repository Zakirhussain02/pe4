package com.stackroute.pe4;

import java.util.ArrayList;

public class ReverseWords {
    public String[] reverseWords(){

        String arg = " a quick brown fox jumps over the lazy dog";
        String outp ="";
        String[] myArray = arg.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        for(int i=0;i<myArray.length;i++){
            list.add(myArray[i]);
        }
//        System.out.print(list.get(0));
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < list.size(); i++){
            list1.add(new StringBuilder(list.get(i)).reverse().toString());
            outp = outp + ' ' +list1.get(i);

        }
        System.out.print(outp);
        // String reverse = new StringBuffer(string).reverse().toString();
        return null;
    }
    public static void main(String a[]){
        ReverseWords rev = new ReverseWords();
        String[] x = rev.reverseWords();
        //System.out.println(x.toString());
    }
}
