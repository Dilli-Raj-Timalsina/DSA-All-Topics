package StringRecursionQuestion;

public class RemoveEdge {
    public static void main(String[] args) {
        String str="saiamfreeas";
        String ans="";
//        System.out.println(removeEnd(str,ans,0));
        System.out.println(removeEndWithOutPassingInArgument(str,0));
    }
    static String removeEnd(String str,String ans,int index)
    {
        if(index==str.length())
        {
            return ans;
        }
       else if(str.charAt(index)!='a')
        {
            ans=ans+str.charAt(index);
          return  removeEnd(str,ans,index+1);
        }
        else{
          return removeEnd(str,ans,index+1);
        }
    }
    static String removeEndWithOutPassingInArgument(String str,int index)
    {
        String ans="";
        String ansFromAbove="";
        if(index==str.length())
        {
            return ans;
        }
        else if(str.charAt(index)!='a')
        {
            ans=ans+str.charAt(index);
            ansFromAbove= ans+ removeEndWithOutPassingInArgument(str,index+1);
            return ansFromAbove;
        }
        else{
            return removeEndWithOutPassingInArgument(str,index+1);
        }
    }
}
