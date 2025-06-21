
///////////////////////////////////////////////////////////////////////////////////////////
//
// File Name    : ThreadDemo8.java
// Description  : Demonstrates multithreading with shared BankAccount object,
//                where multiple customers attempt to withdraw money concurrently.
// Author       : Prashant Balasaheb Mungase
// Date         : 21/06/2025
// Input        : None 
//
//////////////////////////////////////////////////////////////////////////////////////////


/*
    Start

            Step 1: Display "Inside main thread" on the console.

            Step 2: Create a shared object of BankAccount with initial balance of 1000.

            Step 3: Create two Customer threads (cobj1 and cobj2) and pass the same BankAccount object to both.

            Step 4: Set custom names for the threads (e.g., "Sagar" and "Sumit").

            Step 5 Start both threads using the start() method.
                    -> This will execute the run() method in each Customer thread.

            Step 6: In the run() method of each Customer:
                    -> Call the Withdraw(500) method on the shared BankAccount object.

            Step 7: In the Withdraw() method of BankAccount:
                    -> Check if requested amount (500) is less than or equal to balance.
                    -> If yes:
                    -> Print success message with thread name.
                    -> Deduct amount from balance.
            Step 8: Else:
                    -> Print failure message due to insufficient balance.

            Step 9: Use join() to wait for both threads to finish their execution.

            Step 10: Display "End of Banking Application" from the main thread.

Stop

    */

class BankAccount
{
    private int Balance = 1000;

    public void Withdraw(int Ammount)
    {
        if (Ammount <= Balance)
        {
            System.out.println(Thread.currentThread().getName()+"Suucecfully Withraw the Ammount");
            Balance = Balance - Ammount ;
        }
    
        else
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class Custemor extends Thread
{
    
    
    public BankAccount bobj ;
    public Custemor (BankAccount obj,String Name)
    {
        super(Name);
        this.bobj = bobj;

    }
    public void run()
    {
        bobj.Withdraw(500);
    }

} 
    class ThreadDemo8
    {
    public static void main(String A[]) throws InterruptedException
        {
            BankAccount obj = new  BankAccount();

            Custemor cobj1 = new Custemor (obj ,"Sager");
        Custemor  cobj2 = new Custemor (obj,"Sumit");

            cobj1.start();
            cobj2.start();

            cobj1.join();
            cobj2.join();
            System.out.println("End of Banking Application");
        }
    }
   
