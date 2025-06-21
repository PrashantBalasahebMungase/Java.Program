//////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ThreadDemo2.java
//  Description : Program to demonstrate how to create and start a user-defined thread in Java.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 21/06/2025
//  Input       : None 
//  Output      : Inside main  ,  End of main  ,Inside thread
//               

//////////////////////////////////////////////////////////////////////////////////


/*
    Start
            

            Step 1: Display "Inside main" message on the console.

            Step 2: Create an object of the user-defined thread class Demo.

            Step 3: Call the start() method on that object to begin execution of the new thread.
                    -> This internally calls the run() method of the Demo class.

            Step 4: Display "End of main" on the console.

            Step 5: In the new thread, the run() method executes and displays "Inside thread".

    Stop

    */
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside threa");
    }
}
class ThreadDemo2
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        Demo dobj = new Demo();
        dobj.start();
        System.out.println("End of main");
       
    }
}
/*
 * output 
 * 
Inside main
End of main
Inside threa
 */