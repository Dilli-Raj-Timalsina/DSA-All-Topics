package StringRecursionQuestion;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        comb1("","12");
        System.out.println(comb("","12"));
    }
    static void comb1(String p,String up)
    {
        if(up.length()==0)
        {
            System.out.println(p);
            return ;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3; i++) {
            char ch= (char) ('a'+i);
          comb1(p+ch,up.substring(1));
        }

    }


    static ArrayList<String> comb(String p,String up)
    {
        ArrayList<String> list=new ArrayList<>();
        if(up.length()==0)
        {
           list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> ansFromAbovecalls=new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3; i++) {
            char ch= (char) ('a'+i);
           ansFromAbovecalls=comb(p+ch,up.substring(1));
           list.addAll(ansFromAbovecalls);
        }
        return list;
    }
}
