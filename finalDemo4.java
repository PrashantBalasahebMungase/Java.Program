/*
//////////////////////////////////////////////////////////////////////////////////
//
//  File Name    : finalDemo4.java
//  Description  : Demonstrates use of 'final' class in Java
//  Author       : Prashant Balasaheb Mungase
//  Date         : 19/06/2025     : 19/06/2025
//  Input        : None
//  Output       : Compilation Error (if inheritance is attempted)
//
//////////////////////////////////////////////////////////////////////////////////

     Start

            Step 1: Define a final class named 'Demo'
                    - Final classes cannot be inherited
            Step 2: Try to create a class 'Hello' that extends 'Demo'
                    - This should give a compile-time error
            Step 3: Define class 'finalDemo4' with main() method
            Step 4: Program will not compile because a final class cannot be extended

     End
*/
final class Demo 
{
    

}
class Hello extends Demo
{

}

class finalDemo4
{
    public static void main(String A[])
    {
       
    }

}