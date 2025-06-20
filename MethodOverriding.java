

/*
//////////////////////////////////////////////////////////////////////////////////
//
// File Name   : MethodOverriding.java
// Description : Demonstrates method overriding and upcasting in Java
// Author      : Prashant Balasaheb Mungase
// Date        : 19/06/2025
// Input       : None
// Output      : Derived Fun , Base Gun ,  Base Sun                 
//
//////////////////////////////////////////////////////////////////////////////////

     Start
            Step 1: Define a class named Base
                    - Create methods: Fun(), Gun(), and Sun()
                    - Each method prints a message from Base class

            Step 2: Define a class named 'Derived' that extends Base
                    - Override the Fun() method
                    - Add a new method Run()

            Step 3: In the main() method:
                    - Create a reference of type Base and assign it an object of Derived (Upcasting)
                    - Call Fun(), Gun(), and Sun() using the Base reference
                    - Observe that Fun() from Derived executes (because of overriding)
                    - Note: Run() cannot be called using Base reference
     End
*/
class Base 
{
    
public void Fun()
 {System.out.println("Base Fun");}
 public void Gun()
 {System.out.println("Base Gun");}
 public void sun()
 {System.out.println("Base Sun");}

}
class Derived extends Base
{
public void Fun()
{System.out.println("Derived Fun");}
public void Run()
{System.out.println("Derived Run");}
}

class MethodOverriding
{
    public static void main(String A[])
    {
        // Base bobj1 = new Base();              // no casting
        // Derived dobj1 = new Derived();        // no casting
        
        Base bobj2 = new Base();               // Up casting for overridinf
        //Derived dobj2 = new Derived();      // Down castig  Not Allowed 
        
        bobj2.Fun();    // Derived Fun
        bobj2.Gun();   // Base Gun
        bobj2.sun();   // Base Sun
        //bobj2.Run();  //  Error
    }
}