package com.arrays;

public class Mixedarray{
    public static void main(String[] args) {
        Object[] mixedArray = new Object[5];
        mixedArray[0]="sushant";
        mixedArray[1]=true;
        mixedArray[2]=22.5;
        mixedArray[3]=10;
        mixedArray[4]=new int[]{1,2,3};
        for(int i = 0; i <= mixedArray.length-1; i++)
        {
            System.out.println(mixedArray[i]);
        }
        for (int a:(int[])mixedArray[4]) {
            System.out.println(a);
        }
    }
}