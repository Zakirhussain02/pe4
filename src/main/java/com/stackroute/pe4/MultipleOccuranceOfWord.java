/*
. Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
 Input : She sells seashells by the seashore
 Given word: se
 Output :
        Found at: 4 - 6
        Found at: 10 - 12
       Found at: 27 - 29

 */

package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccuranceOfWord {
    public String multipleOccurOfword(String str){
        Pattern ptn = Pattern.compile("se");
        Matcher mtch = ptn.matcher(str);

        while (mtch.find()) {
            System.out.println("Found at "+ mtch.start() +" - "+ (mtch.end()-1));
        }
        return null;
    }
}
