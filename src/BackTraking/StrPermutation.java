package BackTraking;

public class StrPermutation {
    public static void main(String[] args) {
  permutation("ABC",0,2);
    }
    static void permutation(String str,int left,int right)
    {
        if(left==right)
        {
            System.out.println(str);
            return;
        }
        for (int swapIndex = left; swapIndex <=right ; swapIndex++) {
          String s=  swap(str,left,swapIndex);
          permutation(s,left+1,right);

        }
    }

    static String swap(String str, int l, int i) {

        char[] chrArray=str.toCharArray();
        char temp=chrArray[l];
        chrArray[l]=chrArray[i];
        chrArray[i]=temp;
        return String.valueOf(chrArray);
    }
}
