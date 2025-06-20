

///////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : multidimenstionX.java
//  Description : Demonstrates jagged arrays using 2D array in Java
//  Author      : Prashant Balasaheb Mungase
//  Date        : 19/06/2025
//  Input       : None
//  Output      : 4 , 5 ,4 ,5 ,2
//
/////////////////////////////////////////////////////////////////////////////////////
/*
    Start

            Step 1: Declare a 1D array 'Arr' of size 5
            Step 2: Declare a 2D regular array 'Brr' with 3 rows and 4 columns
            Step 3: Declare a jagged array 'Crr' with 4 rows
            Step 4: Assign different column sizes to each row of Crr
                    - Row 0 -> 5 elements
                    - Row 1 -> 4 elements
                    - Row 2 -> 5 elements
                    - Row 3 -> 2 elements
            Step 5: Print total number of rows (Crr.length)
            Step 6: Print length of each row (Crr[i].length)

    End

 */
class multidimenstionX
{

    public static void main(String A[])
    {

        int Arr[] = new int [5];

        int Brr[] [] = new int [3][4];

            int Crr[][]= new int[4][];
            Crr [0] = new  int [5];
            Crr [1]= new int [4];
            Crr [2] = new int [5];
            Crr[3] = new int [2];

            System .out.println(Crr.length);
            System .out.println(Crr[0].length);
            System .out.println(Crr[1].length);
            System .out.println(Crr[2].length);
            System .out.println(Crr[3].length);
    }
}