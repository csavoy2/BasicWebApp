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
        return "";
    }
}
