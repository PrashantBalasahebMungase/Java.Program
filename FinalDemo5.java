
/*
//////////////////////////////////////////////////////////////////////////////////
//
// File Name   : finalDemo5.java
// Description : Demonstrates use of 'final' class and object composition in Java
// Author      : Prashant Balasaheb Mungase
// Date        : 19/06/2025
// Input       : None
// Output      : 11,21, Inside Fun             
//
//////////////////////////////////////////////////////////////////////////////////

     Start

            Step 1: Create a final class 'Demo'
                    - Declare integer variable i
                    - Define method Fun() to print a message
            Step 2: Create another class 'Hello'
                    - Contain a reference to Demo class (composition)
                    - Declare variable j
                    - In constructor, create object of Demo class
            Step 3: Create class 'FinalDemo5' with main() method
            Step 4: Create object of Hello class
            Step 5: Print value of j
            Step 6: Print value of i using dobj
            Step 7: Call Fun() method using dobj

     End
*/
final class Demo
{
    public int i = 11;
    public void Fun()
    {
        System.out.println("Inside Fun");

    }

}
class Hello 
{
    public Demo dobj;
    public int j = 21;
    Hello()
    {
        dobj = new Demo();
    }
}
class FinalDemo5
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
        System.out.println(hobj.j);
        System.out.println(hobj.dobj.i);
        hobj.dobj.Fun();

    }
}