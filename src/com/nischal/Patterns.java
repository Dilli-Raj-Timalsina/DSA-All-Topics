package com.nischal;

public class Patterns {
    public static void main(String[] args) {
        pattern14(4);
    }



//               *
//              * *
//             *   *
//            *     *
//           *       *
//            *     *
//             *   *
//              * *
//               *
    static void pattern14(int n)
    {
        for(int i=1;i<2*n;i++)
        {
            int leftspace=i<=n?i:2*n-i;
            for (int leftS = n; leftS >leftspace ; leftS--) {
                System.out.printf(" ");
            }
            int leftstar=i<=n?i:2*n-i;
            for (int leftStar = 1; leftStar <= leftstar; leftStar++) {
                if(leftStar==1)
                {
                System.out.printf("*");
                }
                else{
                    System.out.printf(" ");
                }
            }
            int rightstar=i<=n?i:2*n-i;
            for (int rightStar = 1; rightStar <= rightstar; rightStar++) {
                if(rightStar!=1&&rightStar==rightstar)
                {
                    System.out.printf("*");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }



//                    *
//                   * *
//                  *   *
//                 *     *
//                *********


    static void pattern13(int n)
    {
        for (int row = 0; row < 5; row++) {
            for (int leftSpace = n-row; leftSpace >0; leftSpace--) {
                System.out.printf(" ");
            }
            for (int leftStar = 0; leftStar < row+1; leftStar++) {
                if(row==n ||leftStar==0)
                {
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }
            }
            for (int rightStar = 0; rightStar <= row; rightStar++) {
                if(row==n||rightStar!=0&&rightStar==row)
                {
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }

            } System.out.println();
        }

    }

//                  * * * * *
//                   * * * *
//                    * * *
//                     * *
//                      *
static  void pattern12(int n)
{
    for (int row = 0; row < n; row++) {
        for (int leftSpace = 0; leftSpace <row+1; leftSpace++) {
            System.out.printf(" ");
        }
        for (int star = n-row; star >0; star--) {
            System.out.printf("* ");

        }
        System.out.println();
    }
}

//               *
//              * *
//             * * *
//            * * * *
//           * * * * *
    static  void pattern11(int n)
    {
        for (int row = 0; row < n; row++) {
            for (int leftSpace = n-row-1; leftSpace >0; leftSpace--) {
                System.out.printf(" ");
            }
            for (int star = 0; star < row+1; star++) {
                System.out.printf("* ");

            }
            System.out.println();
        }
    }
//               *********
//                *******
//                 *****
//                  ***
//                   *
    static void pattern10(int n)
    {
        for (int row = 0; row < n; row++) {
            for (int leftSpace = 0; leftSpace < row+1; leftSpace++) {
                System.out.printf(" ");
            }
            for (int leftStar = n-row; leftStar >0 ; leftStar--) {
                System.out.printf("*");
            }
            for (int rightStar = n-row-1; rightStar >0; rightStar--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

//                      *
//                     ***
//                    *****
//                   *******
//                  *********
    static void pattern9(int n)
    {
        for (int row = 0; row < 5; row++) {
            for (int leftSpace = 0; leftSpace <=n-row-1; leftSpace++) {
                System.out.printf(" ");
            }
            for (int leftStar = 0; leftStar < row+1; leftStar++) {
                System.out.printf("*");
            }
            for (int rightStar = 0; rightStar <row ; rightStar++) {
                System.out.printf("*");
            }
            System.out.println();

        }
    }
//             *****
//              ****
//               ***
//                **
//                 *
    static void pattern8(int n)
    {
        for (int row = 0; row <n ; row++) {
            for (int spaces = 0; spaces <=row; spaces++) {
                System.out.printf(" ");
            }
            for (int col = n-row; col >0; col--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }


//6.          *
//           **
//          ***
//         ****
//        *****
     static void pattern7(int n)
     {
         for(int row=0;row<n;row++)
         {
             int spacesB4C=n-row-1;
             for (int i = 0; i < spacesB4C; i++) {
                 System.out.printf("  ");
             }
           for(int col=0;col<row+1;col++)
           {
               System.out.printf("* ");
           }
             System.out.println();
         }
     }

//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    static void pattern6(int n)
    {
        for(int row=0;row<=2*n;row++)
        {
            int totalColInRow=row<n?row:2*n-row;
            for(int col=0;col<=totalColInRow;col++)
            {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    /*      *
            * *
            * * *
            * * * *
            * * * * * */
    static void pattern1(int n){
        for(int i=1;i<=n;i++)
        {
            for(int col=1;col<=i;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
//            * * * *
//            * * * *
//            * * * *
//            * * * *
    static void pattern2(int n){
        for(int i=1;i<=n;i++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
//           * * * *
//           * * *
//           * *
//           *
    static void pattern3(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int col=1;col<=i;col++)
            {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

//            1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5
    static void pattern4(int n){
        for(int i=1;i<=n;i++)
        {
            for(int col=1;col<=i;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
    static void pattern5(int n){
        for(int i=1;i<=n;i++)
        {
            for(int col=1;col<=i;col++)
            {
                System.out.printf("* ");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--)
        {
            for(int col=1;col<=i;col++)
            {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }


}
