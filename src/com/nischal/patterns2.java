package com.nischal;

public class patterns2 {
    public static void main(String[] args) {
pattern2(7);
    }
//
//         4 4 4 4 4 4 4
//         4 3 3 3 3 3 4
//         4 3 2 2 2 3 4
//         4 3 2 1 2 3 4
//         4 3 2 2 2 3 4
//         4 3 3 3 3 3 4
//         4 4 4 4 4 4 4
    static void pattern2(int n)
    {
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n; col++) {
                if(row==1||row==n||col==1||col==n)
                {
                    System.out.print((n/2+1)+" ");
                }
                else if(row==2||row==n-1||col==2||col==n-1)
                {
                    System.out.print((n/2)+" ");
                }
                else if(row==3||row==n-2||col==3||col==n-2)
                {
                    System.out.print((n/2-1)+" ");
                }
                else if(row==4||row==n-3||col==4||col==n-3)
                {
                    System.out.print((n/2-2)+" ");
                }
                else{
                    System.out.printf("  ");
                }
            }
            System.out.println();

        }
    }

    //                 1
//                   2 1 2
//                 3 2 1 2 3
//               4 3 2 1 2 3 4
//             5 4 3 2 1 2 3 4 5
    static void pattern1(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int leftSpace = n-row+1; leftSpace >1; leftSpace--) {
                System.out.printf(" ");
            }
            for (int leftNum = row; leftNum >=1; leftNum--) {
                System.out.print(leftNum);
            }
            for (int rightNum = 2; rightNum <=row ; rightNum++) {
                System.out.print(rightNum);
            }
            System.out.println();

        }
    }

}
