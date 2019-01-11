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
//        public static void main(String[] a){
//        String y = "She sells seashells by the seashore";
//        MultipleOccurOfWord x = new MultipleOccurOfWord();
//        String m = x.multipleOccurOfword(y);
//    }
}
