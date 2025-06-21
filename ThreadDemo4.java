///////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ThreadDemo4.java
//  Description : Program to demonstrate how to create and start multiple user-defined 
//                threads using Thread class in Java and assign custom thread names.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 21/06/2025
//  Input       : None 
//  Output      : Inside main, End of main, Inside thread
//               
//////////////////////////////////////////////////////////////////////////////////////////


/*
    Start
            

            Step 1: Display "Inside main thread" on the console.

            Step 2: Create two objects of the class Demo which extends Thread

            Step 3: Set custom names for the threads using setName() method.

            Step 4: Start both threads using the start() method.
                    -> This will internally call the run() method for both threads.

            Step 5: In each thread, display "Inside thread: <thread name>" using Thread.currentThread().getName()

    Stop

    */
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside thread :"+Thread.currentThread().getName());
    }
}
class ThreadDemo4
{
    public static void main(String A[])
    {
        System.out.println("Inside main thraed");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        
        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();
       
    }
}
/*
    output 
    
Inside main thraed
Inside thread :First
Inside thread :Second
 */