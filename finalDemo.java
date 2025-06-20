
/*
//////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : finalDemo.java
//  Description : Demonstrates use of final variable and object creation
//  Author      : Prashant Balasaheb Mungase
//  Date        : 20/06/2025
//  Input       : None
//  Output      : Prints "inside Demo"
//
//////////////////////////////////////////////////////////////////////////////////

    Start

            Step 1: Define a class named 'Demo'
            Step 2: define a method 'Display'
            Step 3: Declare a variable 'i' and assign 10
            Step 4: Declare a final variable 'j' and assign 20
            Step 5: Increment 'i' (i++)
            Step 6:  Do not increment 'j' as it is final
            Step 7: Define another class 'finalDemo' with main() method
            Step 8: Create object of Demo class
            Step 9: Print "inside Demo" on the screen
     End       
 */
class Demo

{
    public void Display()
    {
        int i = 10;
        final int j = 20;
        i++;
        //j++;
    }
}

class finalDemo
{
    public static void main (String A[])
    {


        Demo dobj = new Demo();
        System.out.println("inside Demo");

    
    }
}

// output is ( inside Demo)