package BackTraking;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
   int[][] chess=new int[n][n];
   printQueen(chess,"",0);
    }

     static void printQueen(int[][] chess,String asf,int row) {
        if(row==chess.length)
        {
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess.length; j++) {
                    System.out.print(chess[i][j]);
                    System.out.print(" ");
                }
                System.out.println();

            }
            System.out.println(asf);
            return;
        }

         for (int col = 0; col <chess.length ; col++) {
             if(isSafe(chess,row,col))
             {
             chess[row][col]=1;
             printQueen(chess,asf+row+"-"+col+" ,",row+1);
             chess[row][col]=0;
             }
         }

    }
    static boolean isSafe(int[][] chess,int row,int col)
    {
        for (int i = row-1,j=col; i>=0; i--) {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        for (int i = row-1,j=col+1; i>=0&&j< chess.length; i--,j++) {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        for (int i = row-1,j=col-1; i>=0&&j>= 0; i--,j--) {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }

}
