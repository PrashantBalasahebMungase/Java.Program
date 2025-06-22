 
 ///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ObjectDemo7.java
//  Description : Demonstrates overriding of toString() method to display object data.
//  Input       : Hardcoded values in Student constructor
//  Output      : Prints student details using toString()
//  Author      : Prashant Balasaheb Mungase
//  Date        : 22/06/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    Start

            Step 1: Create class Student and implement Cloneable
            Step 2: Define constructor to initialize Name, Rno, Marks
            Step 3: Override toString() method to return tab-separated values
            Step 4: In main method:
                    -> Create Student object
                    -> Print object using toString()
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
    public String toString()
    {
        return this.Name+"\t"+this.Rno+ "\t"+this.Marks;
    }

};  
 
class ObjectDemo7
{
    public static void main(String A[]) 
    {
            Student sobj1  = new Student("Sagar" , 11 , 89);
            System.out.println(sobj1.toString());
            
    }


}
