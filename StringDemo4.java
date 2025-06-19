//////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : StringDemo4.java
//  Description : Program to demonstrate difference between == and equals() in Strings.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 19/06/2025
//  Input       : None
//  Output      : Result of == and equals() comparison
//
//////////////////////////////////////////////////////////////////////////////////
/*
    Start
                Step 1: Declare a class named 'StringDemo4'

                Step 2: Inside main method, create two Strings:
                        - S1 using string literal.
                        - S2 using 'new' keyword.

                Step 3: Compare S1 and S2 using '==' operator and print result.
                
                Step 4: Compare S1 and S2 using equals() method and print result.
               
    End
 */

public class StringDemo4
{
    public static void main(String A[])
    {
        String S1 = "Hello";

        String S2 = new String("Hello");

        if(S1 == S2)
        {
            System.out.println("Strings are using ==:");
        }
        else
        {
            System.out.println("Strings are not using  == :");
        }
        
        if(S1.equals(S2))
        {
           System.out.println("Strings are equal using equals method :");
        }
        else
        {
            System.out.println("Strings are not equals :");
        } 
        
        
    }
    
}
