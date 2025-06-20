/*
//////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : finalDemo3.java
//  Description : Demonstrates method overriding using inheritance
//  Author      : Prashant Balasaheb Mungase
//  Date        : 19/06/2025
// Input        : None
// Output       : Prints messages from overridden methods in Hello class
//
//////////////////////////////////////////////////////////////////////////////////

     Start

        Step 1: Define a class named 'Demo'
                - Create two methods: fun() and Gun()
                - Both print messages from Demo class
        Step 2: Define a class named 'Hello' that extends 'Demo'
                - Override fun() method to print message from Hello
                - Override Gun() method to print message from Hello
        Step 3: Define class 'finalDemo3' with main() method
        Step 4: Create object of class Hello
        Step 5: Call fun() and Gun() using Hello class object
        Step 6: methods are overridden, child class versions will execute

     End

*/


class Demo 
{
    public void fun()
    {
        System.out.println("Inside Demo fun");
    }
    public void Gun()
    {
        System.out .println("Inside Demo Gun");
    }

}
class Hello extends Demo
{
    public void fun() // overriding Allowed 
    {
        System.out.println("Inside Hello fun");
    }
        public void Gun() // Allowed
     {
         System.out.println("Inside Hello Gun");
     }
}

class finalDemo3
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
        hobj.fun();

        hobj.Gun();
    }

}

//output is ()