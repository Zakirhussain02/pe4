/*
 Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry

 */
package com.stackroute.pe4;

public class ReplacingChar {
    public String replaceChar(String str) {
        if (str == null || str.equals(" ")) {
            return null;
        } else {
            String string = str.toLowerCase();
            string = string.replace("d", "f");
            string = string.replace("i", "t");
            return string;
        }
    }
    public static void main(String a[]){
        String m = "daily dry";
        ReplacingChar z = new ReplacingChar();
        String x = z.replaceChar(m);
        System.out.println(x);
    }
}
