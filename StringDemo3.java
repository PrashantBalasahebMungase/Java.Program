///////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : StringDemo3.java
//  Description : Program to demonstrate hashCode() method on String objects.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 19/06/2025
//  Input       : None (Hardcoded strings)
//  Output      : Integer hash code values of strings
//
//////////////////////////////////////////////////////////////////////////////////

/*
        Start 

                Step 1: Declare a class named 'StringDemo3'.
                Step 2: Inside main method, create:
                        - S1 using string literal.
                        - S2 using new keyword.
                        - char array Arr.
                        - S3 using character array.
                Step 3: Call hashCode
        End
 */

public class StringDemo3
{
    public static void main(String A[])
    {
        String S1 = "Hello";

        String S2 = new String("Hello");

        char Arr[] = { 'H','e','l','l','o'};

        String S3 = new String(Arr);

        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());
        System.out.println(S3.hashCode());
        
    }
    
}
