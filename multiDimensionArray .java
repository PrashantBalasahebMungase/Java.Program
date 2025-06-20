
///////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : multiDimensionArray.java
//  Description : Demonstrates the use of length property in 1D and 2D arrays
//  Author      : Prashant Balasaheb Mungase
//  Date        : 19/06/2025
//  Input       : None
//  Output      : 4, 3, 4, 3
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
class multiDimensionArray
{
public static void main(String A[])

    {
        int Arr[] = new int [4];

        int Brr[] [] = new int[3] [4];

        System.out.println(Arr.length);    //4
        System.out.println(Brr.length);     //3
        System.out.println(Brr[0].length);  // 4
        System.out.println(Brr[1].length);  // 4
    }



}
