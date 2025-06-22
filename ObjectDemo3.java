 
 /*
    Start

        Step 1 : Create class Student and implement Cloneable

        Step 2 : Define constructor to initialize Name, Rno, Marks

        Step 3 : Override equals(Object obj) method
                -> If both references are same, return true
                -> If obj is null or not Student, return false
                -> Typecast to Student and compare fields

        Step 4 : In main:
            -> Create two Student objects with different values
            -> Compare them using equals()
            -> Print result

6. Stop


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
        this.Rno = A ;
        this.Marks = B;
   }

   // sobj1 .equals(sobj2)

public boolean equals(Student obj)
{
    System.out.println("this.Name" +this.Name);
    System.out.println( "obj.Name"  +this.Name);


    return true;
}

};  
 
class ObjectDemo3
{
    public static void main(String A[]) 
    {
            Student sobj1  = new Student("Sagar" , 11    , 89);
             Student sobj2 = new Student("Pooja" , 11    , 89);

             System.out.println(sobj1.equals(sobj2));

        
    }   
}
