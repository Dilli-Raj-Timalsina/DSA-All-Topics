package com.nischal;

public class Compound {
    public static void main(String[] args) {
        System.out.println(comp(6000));
    }
    static int comp(int n)
    {
        int savingSum=n;
        int totalSum=n;
        for (int i = 1; i <=20; i++) {
            int current=savingSum;
            savingSum=savingSum+savingSum*10/100;
            totalSum=savingSum+totalSum;

        }
        return totalSum;
    }
}
