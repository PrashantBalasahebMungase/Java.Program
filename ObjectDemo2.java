 
 ////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ObjectDemo2.java
//  Description : Demonstrates cloning of an object using Cloneable interface and clone() method.
//  Input       : Hardcoded values in constructor
//  Output      : Displays original and cloned object data, hashcodes, and class name.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 22/06/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
     Start

        Step 1 : Create class Student and implement Cloneable interface

        Step 2 : Add data members: Name, Rno, Marks

        Step 3 : Create a constructor to initialize these members

        Step 4 : Define clone() method using super.clone()

        Step 5 :In main method:
            -> Create Student object sobj
            -> Clone sobj to create sobjx
            -> Display details of sobj and sobjx
            -> Print hashCodes and class name

     Stop

 */
 class Student implements Cloneable

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
   public Object clone() throws CloneNotSupportedException
   {
        return super.clone();
   }
}   
 
 class ObjectDemo2
{
    public static void main(String A[]) throws Exception
    {
            Student sobj = new Student("Sagar" , 11    , 89);

            Student sobjx = (Student)sobj.clone();
            System.out.println(sobj.Name+"\t"+sobj.Rno+"\t" +sobj.Marks);
            System.out.println(sobjx.Name+"\t"+sobj.Rno+"\t" +sobj.Marks);

            System.out.println(sobj.hashCode());
             System.out.println(sobjx.hashCode());

             System.out.println(sobj.getClass());
             



    }    
}
