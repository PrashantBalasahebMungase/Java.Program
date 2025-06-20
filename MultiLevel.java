///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : MultiLevel.java
//  Description : Demonstrates multilevel inheritance in Java
//  Author      : Prashant Balasaheb Mungase
//  Date        : 19/06/2025
//  Input       : None
//  Output      : Inside main , Inside Base Constructor ,Inside Derived Constructor
//              : Inside fun base , Inside Derived Gun ,Inside the Demo
//              : Inside Base Constructor ,  Inside Derived Constructor
//              : Inside Demo Constructor, Inside fun base , Inside Derived Gun,
//              :   Inside Demo Sun
//            
//////////////////////////////////////////////////////////////////////////////////////////////////             
/*
  Start

        Step 1: Create class 'Base'
                - Define constructor and method fun()

        Step 2: Create class 'Derived' extending 'Base'
                - Define constructor and method Gun()

        Step 3: Create class 'Demo' extending 'Derived'
                - Define constructor and method Sun()

        Step 4: In main() method:
                - Create object of Derived -> call fun() and Gun()
                - Create object of Demo -> call fun(), Gun(), and Sun()

 End

  */           

class Base 
{
    public int A,B;
    public Base()
    {
        System.out.println("Inside Base Constructor");
    }
    public void fun()
    {
        System.out.println("Inside fun base");
    }
}

class Derived extends Base   // class Derived :public Base 
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Inside Dirived Constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
    class Demo extends Derived
    {
        public int L,N;
        public Demo()
        {
            System.out.println("Inside DerivedX constructor ");
        }
        public void Sun()
        {
            System.out.println("Inside DerivedX Sun");
        }
    }
}


class MultiLevel
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        Derived dobj = new Derived();
        
        dobj.fun();
        dobj.Gun();

        // System.out.println("Inside the Demo");
        // Demo aobj = new Demo();
        // aobj.fun();
        // aobj.Gun();
        // aobj.Sun();

        

    }

}