package BackTraking;

public class MazePb1 {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
//        System.out.println(maze2("",3,3));
//        System.out.println(mazeWithDignol("",3,3));
        mazeWithDignol("",3,3);
    }
    static  int maze(int r,int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
        int left=maze(r-1,c);
        int right=maze(r,c-1);
        return left+right;
    }
    static  int maze2(String p,int r,int c)
    {
        int left=0;
        int right=0;
        String pp=p;
        if(r==1&&c==1)
        {
            System.out.println(p);
            return 1;
        }
        if(r>1)
        {
           left=maze2(pp+"D",r-1,c);
        }
        if(c>1)
        {
           right=maze2(pp+"R",r,c-1);
        }
           return left+right;
    }
    static  void mazeWithDignol(String p,int r,int c)
    {
        if(r==1&&c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
          mazeWithDignol(p+"D",r-1,c);
        }
        if(r>1&&c>1)
        {
          mazeWithDignol(p+"C",r-1,c-1);
        }
        if(c>1)
        {
           mazeWithDignol(p+"R",r,c-1);
        }

    }
}
