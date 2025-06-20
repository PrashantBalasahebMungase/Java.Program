

/*
//////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : finalDemo2.java
//  Description : Demonstrates use of 'final' variable and object creation in Java
//  Author      : Prashant Balasaheb Mungase
//  Date        : 20/06/2025
//  Input       : None
//  Output      : Prints values of variables i and j
//
//////////////////////////////////////////////////////////////////////////////////

Algorithm:

    Start

        Step 1: Define a class named 'Demo'
        Step 2: Declare variable 'i' and final variable 'j'
        Step 3: Initialize both in the constructor
        Step 4: Define method 'Display' to print values of i and j
        Step 5: Define another class 'finalDemo2' with main() method
        Step 6: Create object of Demo class
        Step 7: Increment 'i' using object (dobj.i++)
        Step 8: Do not modify 'j' as it is final (would cause error)
        Step 9: Call Display() method to print values

    End
*/

class Demo

{
    public int i;
    public  final int j;

    Demo() // Demo(): j(20) c++ (constructor)
        {
            i = 10 ;
            j = 20;
        }
    public void Display()
    {
    //public final int j;not allowed
    System.out.println  ("i = "+i);  //Allowed
    System.out.println ("j = "+j);  // final characteristic 
    }

}


class finalDemo2
{
    public static void main (String A[])
    {


        Demo dobj = new Demo();
        dobj.i++;

       // dobj.j++;      Error
       dobj .Display();
       
    }
}

//output is  11;
//          20;