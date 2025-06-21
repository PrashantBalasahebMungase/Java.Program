

///////////////////////////////////////////////////////////////////////////////////////////
//
//   File Name    : ThreadDemo9.java
//   Description  : Demonstrates how to get and set priority of a thread in Java.
//   Author       : Prashant Balasaheb Mungase
//   Date         : 21/06/2025
//   Input        : None 
//   Output       : Current priority is :5
//                  Current priority is :10
//////////////////////////////////////////////////////////////////////////////////////////


/*
    Start
            

            Step 1 : Create an object of the Demo class (which extends Thread).

            Step 2 : Get the current priority of the thread using getPriority().

            Step 3 : Display the current priority.

            Step 4 : Set a new priority using setPriority(10) — which is the maximum valid priority.

            Step 5 : Display the updated priority using getPriority().


    Stop

 */
class Demo extends Thread 
{
    public void run()
    {

    }   
}

public class ThreadDemo9 
{
    public static void main(String A[])
    {
        Demo obj = new Demo();

        System.out.println("Current priority is :"+obj.getPriority());
        obj.setPriority(10);
        System.out.println("Current priority is :"+obj.getPriority());
    }
}
