 ////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ObjectDemo1.java
//  Description : Demonstrates object creation, garbage collection and use of finalize() method.
//  Input       : None
//  Output      : Constructor message and finalize method message 
//  Author      : Prashant Balasaheb Mungase
//  Date        : 22/06/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////
 
/*
    Start

    
          Step 1 : Create a class named Student with:
                  -> Name (String)
                  -> Rno (int)
                  -> Marks (int)

          Step 2 : Define a constructor to initialize Name, Rno, and Marks.
                  -> Print "Inside Constructor"

          Step 3 : Define a finalize() method to print "Inside Finalize Method"

          Step 4 : In main method:
                -> Create object of Student using constructor
                -> Assign object to null
                -> Call System.gc() to request garbage collection

          Step 5 : JVM may call finalize() before destroying object

        
              

    Stop

 */

 class Student

{
   public String Name ;
   public int Rno;
   public int Marks;
   
   public Student (String str , int A, int B)

   {
    System.out.println("Inside Constructor");
        this .Name = str;
        this.Rno = A ;
        this.Marks = B;

   }
     protected void finalize()
   {
        System.out.println("Inside Finalize Method");
   }
}   
 
 class ObjectDemo1
{
    public static void main(String A[])
    {
            Student sobj = new Student("Sagar", 011,9);
            sobj = null;
            System.gc();
    }    
}
