//////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ThreadDemo1.java
//  Description : Program to demonstrate how to get current thread name in Java.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 21/06/2025
//  Input       : None 
//  Output      : Inside main
//                       Name of Cuurent Thread is main
//
//////////////////////////////////////////////////////////////////////////////////


/*
    Start

            Step 1 : Display "Inside main" message on the console.

            Step 2 : Get the reference to the current thread using Thread.currentThread() method.

            Step 3 : Extract the name of the current thread using .getName() method.

            Step 4 : Display the name of the current thread with a proper message.

    Stop
 */
class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside main");

        String name = Thread.currentThread().getName();
        System.out.println(" Name of Cuurent Thread is "+name);
    }
}
/* output
 * Inside main
 Name of Cuurent Thread is main
 */