
///////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name    : ThreadDemo7.java
//  Description  : Demonstrates creating multiple threads using Thread class,
//                 using join() to wait for their completion,
//                 and handling exceptions with Thread.sleep().
//  Author       : Prashant Balasaheb Mungase
//  Date         : 21/06/2025
//  Input        : None 
//
//////////////////////////////////////////////////////////////////////////////////////////


/*
    Start
            

            Step 1: Display "Inside main thread" on the console.

            Step 2: Create two objects of the Demo class which extends Thread.

            Step 3: Set custom thread names using setName() for each thread.

            Step 4: Start both threads using the start() method.

            Step 5: In the run() method:
                     Loop from 1 to 9.
                     Print current thread name and loop counter.
                     Use Thread.sleep(1000) to pause for 1 second.
                     Use try-catch to handle InterruptedException.

            Step 6: Use join() to wait for both threads to finish.

            Step 7: Print "End of main Thread" after both threads complete
    Stop
    */
class Demo extends Thread
{
    public void run()  
    {

        int i =  0;
        try
        {
        for(i =1; i <10; i++)
        System.out.println("Inside thread :"+Thread.currentThread().getName()+":"+i);
        Thread.sleep(1000);
        }
        catch(Exception dobj)
        {

        }
    }
}
class ThreadDemo7
{
    public static void main(String A[])  throws Exception
    {
        System.out.println("Inside main thraed");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        
        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();
        dobj1.join();
        dobj2.join();
        System.out.println("End of main Thread");
       
    }
}

/*  By using Exception Handling

output
Inside main thraed
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
End of main Thread


*/ 