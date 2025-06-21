
///////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ThreadDemo5.java
//  Description : Program to demonstrate how to create and start multiple user-defined 
//                threads using Thread class in Java and assign custom thread names.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 21/06/2025
//  Input       : None 
//  Output      : Inside main thread, End of main thread,
//                followed by numbers printed by both threads with their names.
//             
//////////////////////////////////////////////////////////////////////////////////////////


/*
    Start
            

            Step 1: Display "Inside main thread" on the console.

            Step 2: Create two objects of the Demo class which extends Thread.

            Step 3: Set custom thread names using setName() for each thread.

            Step 4: Start both threads using the start() method.
                    -> This will internally invoke the run() method for each thread.

            Step 5: In the run() method of each thread, execute a loop from 1 to 9.
                    -> For each iteration, print the current thread name along with the number.

            Step 6: After starting the threads, print "End of main thread" from main.
    Stop
    */
class Demo extends Thread
{
    public void run()
    {

        int i =  0;
        for(i =1; i <10; i++)
        System.out.println("Inside thread :"+Thread.currentThread().getName()+":"+i);
    }
}
class ThreadDemo5
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
        System.out.println("End of main Thread");
       
    }
}
/* out put 
  
Inside main thraed
End of main Thread
Inside thread :First:1
Inside thread :Second:1
Inside thread :Second:2
Inside thread :Second:3
Inside thread :Second:4
Inside thread :Second:5
Inside thread :Second:6
Inside thread :Second:7
Inside thread :Second:8
Inside thread :Second:9
Inside thread :First:2
Inside thread :First:3
Inside thread :First:4
Inside thread :First:5
Inside thread :First:6
Inside thread :First:7
Inside thread :First:8
Inside thread :First:9
 */