package Basics;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Himanshu";
        System.out.println("Hello " + name);

        System.out.println(name.length());

        //to find the length of string-------------
        int length =name.length();
        System.out.println("Length of string is :"+length);

        //print in lower case--------------------
        String lc=name.toLowerCase();
        System.out.println("lower case:"+lc);

        //print in upper case-------------
        String uc=name.toUpperCase();
        System.out.println("upper case:"+uc);

        String NonTrimmedString="   Himanshu Haldkar   ";
        System.out.println(NonTrimmedString);
        System.out.println(NonTrimmedString.trim());

        //print a string at a specific index------------
        System.out.println(name.substring(3));

        //print string with start and end index--------------
        System.out.println(name.substring(3,7));

        // replace the string---------------
        System.out.println(name.replace('i','u'));
//        System.out.println(name.replace('shu','oop');

        //to check start with----------
        System.out.println(name.startsWith("him"));
        System.out.println(name.startsWith("Him"));

        //checks end with-------------
        System.out.println(name.endsWith("shu"));
        System.out.println(name.endsWith("u"));

        //to get a char at specific index--------------
        System.out.println(name.charAt(5));

        //the get the index of a char-------------
        System.out.println(name.indexOf('u'));

        //to get another same char ----------------
        String name2 ="himanshushu";
        System.out.println(name2.indexOf('s',6));
        System.out.println(name2.lastIndexOf('u'));
        System.out.println(name2.lastIndexOf('h',8));

        //to check the string-----------------
        System.out.println(name.equals(name2));
    } 
}
