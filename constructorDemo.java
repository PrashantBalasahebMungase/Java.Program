///////////////////////////////////////////////////////////////////////////////////////////
//
// File Name    : constructorDemo.java
// Description  : Demonstrates constructor overloading and use of finalize() with GC.
// Author       : Prashant Balasaheb Mungase
// Date         : 21/06/2025
// Input        : None
//
///////////////////////////////////////////////////////////////////////////////////////////


/*
 Start

            Step 1. Define a class `Demo` with two integer instance variables i and j.

            Step 2. Define a default constructor:
                    -> Set i = 10, j = 0
                    -> Print message from default constructor

            Step 3. Define a parameterized constructor:
                    -> Set i = a, j = b
                    -> Print message from parameterized constructor

            Step 4. Override the finalize() method to print message when object is garbage collected.

            Step 5. In main():
                ->Create obj1 using default constructor.
                ->Create obj2 using parameterized constructor.

                -> Print obj1.i and obj2.j

                -> Set obj1 and obj2 to null (mark for GC)

                ->Call System.gc() to request garbage collection
                
Stop

 */

class Demo
{
    public int i,j;

     public Demo()
    {
        System.out.println("Inside  defuolt Constructor");
        this.i = 10;
        this.j = 0;
    }
    public Demo(int a,int b)
    {
        System.out.println("Inside parametries Constructor");
        this.i = a;
        this.j = b;
    }

     protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}

class constructorDemo
{
        public static void main(String Arr[])
    {
    Demo obj1 =  new Demo();
    Demo obj2 =  new Demo(11,20);

    System.out.println("value of i is :"+obj1.i);
    System.out.println("value of j is : "+obj2.j);

    obj1 = null;
    obj2 = null;

   
      System.gc();
    }
}