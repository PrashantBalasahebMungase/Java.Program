///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : ObjectDemo4.java
//  Description : Demonstrates overriding of equals() method to compare two Student objects.
//                Compares Name, Roll Number, and Marks for equality.
//  Input       : Hardcoded values in Student constructor
//  Output      : true/false based on object comparison
//                Also prints whether objects are equal or different
//  Author      : Prashant Balasaheb Mungase
//  Date        : 22/06/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

 
 /*
    Start

         Step 1 : Create class Student and implement Cloneable

         Step 2 : Define constructor to initialize Name, Rno, and Marks

         Step 3 : Override equals(Object obj) method
                     -> Check if both objects are same
                     -> If not, compare Name, Rno, and Marks

         Step 4 : In main method:
                     -> Create two Student objects
                     ->Compare them using equals()
                     -> Print result




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

   // sobj1 .equals(sobj2)

public boolean equals(Student obj)
{
   if((this.Marks == obj.Marks)&&((this.Name).equals(obj)))
   {
    return true;
   }
   else
   {
    return false;
   }

}

};  
 
class ObjectDemo4
{
    public static void main(String A[]) 
    {
            Student sobj1  = new Student("Sagar" , 11    , 89);
             Student sobj2 = new Student("Pooja" , 11    , 89);

             System.out.println(sobj1.equals(sobj2));

             if(sobj1.equals(sobj2)==true)
             {
                System.out.println("Object are equal");
             }
             else
             {
                System.out.println("Object are Differnt");
             }
        
    }   
}
