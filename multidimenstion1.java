

///////////////////////////////////////////////////////////////////////////////////////
//
// File Name   : multidimenstion1.java
// Description : Demonstrates the use of length property in Jagged and normal arrays
// Author      : Prashant Balasaheb Mungase
// Date        : 19/06/2025
// Input       : None
// Output      : 4 ,5 , 4 , 2 ,1 3, 5
//              
///////////////////////////////////////////////////////////////////////////////////////

/*
 Start

        Step 1: Declare a 1D array Arr of size 4
        Step 2: Declare a 2D array Brr with 3 rows and 4 columns
        Step 3: Print Arr.length -> gives size of 1D array (4)
        Step 4: Print Brr.length -> gives number of rows in 2D array (3)
        Step 5: Print Brr[0].length -> gives number of columns in first row (4)
        Step 6: Print Brr[1].length -> gives number of columns in second row (4)

End

 */
class multidimenstion1
{

    public static void main(String A[])
    {

        int Arr [] = new int [5];
        int Brr[] []= new int [3][];
        int Crr[][] = new int [4][] ;
            Crr[0] = new int [5];
            Crr[1] = new int [4];
            Crr[2] = new int [2];
            Crr[3] = new int [1];

            

           

            System.out.println("Enter --> :"+Crr.length);
            System.out.println( "Enter first --> "+Crr[0].length);
            System.out.println("Enter Second --> :"+Crr[1].length);
            System.out.println("Enter Third --> :"+Crr[2].length);
            System.out.println("Enter fourth -->:"+Crr[3].length);

            System.out.println("ENTER 1 -->:"+Brr.length);

            System.out.println( "ENTER 2 -->:"+Arr.length);
            


    }
}