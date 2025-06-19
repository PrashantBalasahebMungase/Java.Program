//////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : StringDemo1.java
//  Description : Program to demonstrate different ways of creating String in Java.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 19/06/2025
//  Input       : None 
//  Output      : Displays all strings created using different methods
//
//////////////////////////////////////////////////////////////////////////////////

/*
        Start         
                Step 1: Declare a class named 'StringDemo1'.
                Step 2: Inside the class, define the main method:
                        public static void main(String A[])
                Step 3: Create a String S1 using string literal.
                Step 4: Create a String S2 using 'new' keyword and constructor.
                Step 5: Create a character array and initialize it.
                Step 6: Create a String S3 using character array and constructor.
                Step 7: Display all three strings using System.out.println.
        End        
 */
public class StringDemo1 
{
    public static void main(String A[])
    {
        String S1 = "Hello";

        String S2 = new String("Hello");

        char Arr[] = { 'H','e','l','l','o'};

        String S3 = new String(Arr);

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        
    }
    
}
