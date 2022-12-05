package BackTraking;

public class MazeWithObstacle {
    public static void main(String[] args) {
    boolean[][] river={{true,true,true},{true,false,true},{true,true,true}};
    maze("",river,3,3);
    }
    static void maze(String p,boolean[][] river,int r,int c)
    {
        if(r==1&&c==1)
        {
            System.out.println(p);
            return;
        }
        if(!river[r-1][c-1])
        {
            return;
        }
        if(r>1)
        {
            maze(p+"D",river,r-1,c);
        }
        if(c>1)
        {
            maze(p+"R",river,r,c-1);
        }
    }
}
