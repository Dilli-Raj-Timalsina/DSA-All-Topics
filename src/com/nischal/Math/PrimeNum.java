package com.nischal.Math;

public class PrimeNum {
    public static void main(String[] args) {
     int n=20;
        for (int i = 1; i < n; i++) {
           isPrime(i);
        }
    }
    public static boolean isPrime(int  n)
    {
        if(n<=1)
        {
            return false;
        }
       int c=2;


        while(c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;

        }
        System.out.println(n);
        return true;
    }
}
