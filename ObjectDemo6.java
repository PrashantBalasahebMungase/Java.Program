 
 ///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ObjectDemo6.java
//  Description : Demonstrates overriding of toString() method to display object content.
//  Input       : Hardcoded values in Student constructor
//  Output      : Object details in readable string format
//  Author      : Prashant Balasaheb Mungase
//  Date        : 22/06/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 Start

            Step 1 : Create class Student and implement Cloneable

            Step 2 : Define constructor to initialize Name, Rno, and Marks

            Step 3 : Override toString() method to return formatted object info

            Step 4 : In main method:
                    -> Create a Student object
                    -> Call toString() method and print object details

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
        this.Name = str;
        this.Rno =  A;
        this.Marks = B;
   }


};  
 
class ObjectDemo6
{
    public static void main(String A[]) 
    {
            Student sobj1  = new Student("Sagar" , 11    , 89);
            System.out.println(sobj1.toString());
            
    }


}
