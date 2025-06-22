
////////////////////////////////////////////////////////////////////////////
//
//  File Name   : SuperDemo.java
//  Description : Demonstrates use of super keyword in Java
//  Author      : Prashant Balasaheb Mungase
//  Date        : 22/06/2025
//  Input       : No user input (values are hardcoded)
//              :  Base: 11, 21 | Derived: 51, 101
//  Output      :  Inside Constructor , Inside Base fun
//                Inside Derived fun ,  Value of X is :51
//                Value of X is :11
//                
////////////////////////////////////////////////////////////////////////////
/*
    Start

            Step 1: Create class Base with variables X, Y and constructor
            Step 2: Define fun() method in Base

            Step 3: Create class Derived which extends Base
                    -> Declare X, Y in Derived
                    -> In Derived constructor, call super(11, 21)
                    -> Initialize Derived class X, Y with 51, 101

            Step 4: Override fun() method in Derived
                    -> Call super.fun()
                    -> Print both Derived and Base class X using super.X

            Step 5: In main method
                    -> Create object of Derived
                    -> Call fun() method

    Stop

 */
class Base 
{
    public int X,Y;
    public Base(int a,int b)
    {
        this.X = a;
        this . Y = b;
    }
    public void fun()
    {
        
        System.out.println("Inside Base fun");
    }
}
  class Derived extends Base
{
    public int X,Y;
    public Derived()
    {
        super(11,21);  // Super 1
        this .X = 51;
        this .Y = 101;
    }
    public void fun()

    {
            super.fun();  // ues 2
            System.out.println("Inside Derived fun");
            System.out.println("Value of X is :"+X);
            System.out.println("Value of X is :"+super.X); // use 3
    }
}
class SuperDemo
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

          dobj.fun();
        

    }
}



