package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindName {

    private static Pattern ptn =
            Pattern.compile("Harry");
    public static String captureValues(String largeText){
        Matcher mtch = ptn.matcher(largeText);
        return "is Harry here?"+(mtch.find());
    }
}
