package DyanamicProgramming.Matrix_Chain_Multiplication;

public class Bolparenthesis {
    public static void main(String[] args) {
        String s="T&F^T|F&T";
        System.out.println( solve(s,0,s.length()-1,true));
    }
    public static int solve(String s,int i,int j,boolean isTrue)
    {
        if(i>j)
        {
            return 0;
        }
        if(i==j)
        {
            if(isTrue){
                if(s.charAt(i)=='T') return 1;
                else return 0;
            }
            else{
                if(s.charAt(i)=='F') return 1;
                else return 0;
            }
        }
        int ans=0;
        for (int k = i+1; k <=j-1; k+=2) {
            int LT=solve(s,i,k-1,true);
            int LF=solve(s,i,k-1,false);
            int RT=solve(s,k+1,j,true);
            int RF=solve(s,k+1,j,false);

           if(s.charAt(k)=='&')
           {
              if(isTrue)
              {
                  ans=ans+LT*RT;
              }
              else{
                  ans=ans+LT*RF+RT*LF+LF*RF;
              }
           } else if (s.charAt(k)=='|') {
               if(isTrue)
               {
                   ans=ans+LT*RT+LT*RF+RT*LF;
               }
               else{
                   ans=ans+LF*RF;
               }
           }
           else {
               if(isTrue)
               {
                   ans=ans+LT*RF+RT*LF;
               }
               else{
                   ans=ans+LF*RF+RT*LT;
               }
           }
        }
        return ans;
    }
}
