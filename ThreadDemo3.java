///////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ThreadDemo3.java
//  Description : Program to demonstrate how to create and start a user-defined thread 
//                using Runnable interface in Java.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 21/06/2025
//  Input       : None 
//  Output      : Inside main, End of main, Inside thread
//               
//////////////////////////////////////////////////////////////////////////////////////////


/*
    Start
            

             Step 1: Display "Inside main" message on the console.

            Step 2: Create an object of the user-defined class Demo which implements `Runnable`.

            Step 3: Create a Thread object and pass dobj to it as a parameter.

            Step 4: Call the start() method on the Thread object to begin execution of the new thread.
                    -> This internally invokes the run() method of the Demo class.

            Step 5: Display "End of main" on the console.

            Step 6: In the new thread, the run() method executes and displays "Inside thread".

    Stop

    */
class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Inside thread");
    }
}
class ThreadDemo3
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);
        tobj.start();
        System.out.println("End of main");
       
    }
}

/*out put ---> Inside MAin   ENd of Main    Inside Thread */
