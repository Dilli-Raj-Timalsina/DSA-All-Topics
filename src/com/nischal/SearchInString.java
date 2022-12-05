package com.nischal;

public class SearchInString {
    public static void main(String[] args) {
     String str="Nischal";
     char target='p';
        System.out.println(searchIfCharPresent(str,target));
    }
    static boolean searchIfCharPresent(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
