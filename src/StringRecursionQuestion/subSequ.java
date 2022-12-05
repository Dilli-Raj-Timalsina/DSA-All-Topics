package StringRecursionQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class subSequ {
    public static void main(String[] args) {
      String p="";
      String up="abc";
//      subseq(p,up);
      ArrayList ans=subseq(p,up);
        System.out.println(ans);
    }
    static ArrayList<String> subseq(String p, String up)
    {
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
    ArrayList<String> listFromAboveCalls= subseq(p+ch,up.substring(1));
        ArrayList<String> listFromAboveCalls2=   subseq(p,up.substring(1));
        list.addAll(listFromAboveCalls);
        list.addAll(listFromAboveCalls2);
         return list;
    }
}
