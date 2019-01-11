package com.stackroute.pe4;

public class OccuranceOfString
{
    public String occuranceOfChar(String charac,String input) //checking for occurence of a char in string
    {
        if(input==null)
        {
            return null;
        }else {
            String charecter = charac.toLowerCase();
            String inputString = input.toLowerCase();
            int result = 0;
            try {
                if (charecter.length() == 1 && charecter.matches("\\w+")) { //checking if it is character ot not
                    result = inputString.length() - inputString.replace(charecter, "").length();
                    return Integer.toString(result);
                } else {
                    return "Enter a Character";
                }
            } catch (Exception e) {
// System.out.println("Enter other character");
            }
            return "Wrong Input! Enter character";
        }
    }
    public static void main(String args[]){
        OccuranceOfString m = new OccuranceOfString();
        String x = m.occuranceOfChar("0","java java java java");
        System.out.println(x);
    }
}