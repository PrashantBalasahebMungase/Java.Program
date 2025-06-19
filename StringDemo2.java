//////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : StringDemo2.java
//  Description : Program to demonstrate how to find length of String and char array.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 19/06/2025
//  Input       : None (Hardcoded strings and array)
//  Output      : Lengths of Strings and character array
//
//////////////////////////////////////////////////////////////////////////////////
/*
        Start

                Step 1: Declare a class named 'StringDemo2'.
                Step 2: Inside the main method, create:
                        - String S1 using literal.
                        - String S2 using 'new' keyword.
                        - char array Arr and initialize it.
                        - String S3 using the character array.
                Step 3: Use .length() method to find length of each String.
                Step 4: Use .length property to find length of character array.
                Step 5: Print all lengths using System.out.println.

        End    
 */

public class StringDemo2
{
    public static void main(String A[])
    {
        String S1 = "Hello";

        String S2 = new String("Hello");

        char Arr[] = { 'H','e','l','l','o'};

        String S3 = new String(Arr);

        System.out.println(S1.length());
        System.out.println(S2.length());
        System.out.println(S3.length());
         System.out.println(Arr.length);
        
    }
    
}
