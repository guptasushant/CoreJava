package com.logical;

import java.util.*;
import java.util.Scanner;

public class Logic10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=n/2&&j<=n/2||i==j)
                {
                    System.out.print(" *");
                }
                else if(i>n/2&&j>n/2)
                {
                    System.out.print(" #");
                }
                else if(j<=n/2||j==n-i+1)
                {
                    System.out.print(" &");
                } else
                {
                    System.out.print(" %");
                }
            }
            System.out.println();
        }
    }
}
