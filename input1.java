
//////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : input1.java
//  Description : Program to accept two integers from user and display their addition.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 19/06/2025
//  Input       : Two integers from user
//  Output      : Integer result 
//
 //////////////////////////////////////////////////////////////////////////////////
 /*     
        Start 
                    
                    Step 1: Declare a class named 'input1'.
                    Step 2: Inside the class, define the main method:
                            public static void main(String A[])
                    Step 3: Declare three integer variables: no1, no2, ans.
                    Step 4: Create Scanner object to accept input from user.
                    Step 5: Prompt user to enter the first number and store it in no1.
                    Step 6: Prompt user to enter the second number and store it in no2.
                    Step 7: Perform addition and store the result in 'ans'.
                    Step 8: Display the result using System.out.println.
        End
  */

import java.util.* ;


class iput1
{
    public static void main(String A[])

    {
        int no1 = 0;
        int no2 = 0;
        int ans = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the First number :");
        no1 = Sobj.nextInt();

        System.out.println("Enter the second value :");
        no2 = Sobj.nextInt();

        ans = no1 + no2 ;

        System.out.println("Addition is :"+ans);

        
    }
}
