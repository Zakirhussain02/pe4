package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindName {

    private static Pattern ptn =
            Pattern.compile("Harry");
    public static String captureValues(String largeText){
        Matcher mtch = ptn.matcher(largeText);
        return "is Harry here?"+(mtch.find());
    }

    public static void main(String a[]){
        String str = "this is Harry";
        System.out.println(captureValues(str));
    }
}