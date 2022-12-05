package BackTraking;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        int[][] chess = new int[n][n];
        way(chess, 0,0,0);
    }

    static void way(int[][] chess, int row,int col, int totalKnight) {
        if (totalKnight == chess.length) {
            //Do Something And Return
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess.length; j++) {
                    System.out.print(chess[i][j]);
                    System.out.print(" ");
                }
                System.out.println();

            }
            System.out.println("*************************");
            return;
        }
        if(row== chess.length&&totalKnight!= chess.length)
        {
            return;
        }

            if (isSafe(chess, row, col)&&col< chess.length) {
                chess[row][col] = 1;
                way(chess, row,col+1, totalKnight + 1);
                chess[row][col] = 0;
            }
         way(chess, row + 1,0, totalKnight);
    }

    static boolean isSafe(int[][] chess, int row, int col) {
       if(isValid(chess,row-2,col-1))
       {
        if (chess[row - 2][col - 1] == 1) {
            return false;
        }}
        if(isValid(chess,row-2,col+1))
        {
        if (chess[row - 2][col + 1] == 1) {
            return false;
        }}
        if(isValid(chess,row-1,col-2))
        {
        if (chess[row - 1][col - 2] == 1) {
            return false;
        }}
        if(isValid(chess,row-1,col+2))
        {
        if (chess[row - 1][col + 2] == 1) {
            return false;
        }}
        return true;
    }

 static boolean isValid(int[][] chess, int row, int col) {
        if(row>=0&&row< chess.length&&col>=0&&col< chess.length)
        {
            return true;
        }
        return false;
    }
}