package com.logical;

import java.util.Scanner;

public class Logic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only odd number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==n/2+1||j==n/2+1||j==1&&i<=(n+1)/2||j==n&&i>=(n+1)/2||i==n&&j<=(n+1)/2||i==1&&j>=(n+1)/2)
                {
                    System.out.print(" *");
                }else
                {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
