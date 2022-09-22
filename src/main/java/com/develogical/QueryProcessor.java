package com.develogical;


public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as one of the greatest " +
                    "writers in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("justforfun")) {
            return "This query is just for fun!" +
                    "I want to test if this is still working" +
                    "this line isnt really necessary anymore";
        }
        else if (query.toLowerCase().contains("what is your name")) {
            return "cara";
        }
        else if (query.toLowerCase().contains("plus")) {
            int number1 = Integer.parseInt(query.substring(7, query.indexOf("plus")));
            int number2 = Integer.parseInt(query.substring(query.indexOf("plus")+5, query.length()-1));
            return Integer.toString(number1+number2);
        }
        else if (query.toLowerCase().contains("multiplied")) {
            int number1 = Integer.parseInt(query.substring(7, query.indexOf("multiplied")));
            int number2 = Integer.parseInt(query.substring(query.indexOf("by")+3, query.length()-1));
            return Integer.toString(number1*number2);
        }
        return "";
    }
}
