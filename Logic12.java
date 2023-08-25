package com.logical;
import java.util.Scanner;

public class Logic12
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int n = 5;
            System.out.println("Enter Your name");
            String s = sc.next();
            String[] a = s.split("");
        for(int i=1;i<=n;i++)
        {
            int m = (n + 1) / 2; //for k
            int reverse = n - i + 1; //for k
            for (String character : a)
            {
                switch (character.toUpperCase()) {
                    case "S":
                        for (int j = 1; j <= n; j++)
                        {
                            if (j == 1 && i <= (n / 2) + 1 || i == 1 || i == (n / 2) + 1 || j == n && i > n / 2
                                    || i == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "A":
                        for (int j = 1; j <= n; j++)
                        {
                            if (j == 1 || i == 1 || j == n || i == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "B":
                        for (int j = 1; j <= n; j++)
                        {
                            if (i==1&&j<=n-1||j==1||i==n&&j<=n-1||i==n/2+1&&j<=n-1||j==n&&i%2==0)
                            {
                                System.out.print(" *");
                            }
                            else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "F":
                        for (int j = 1; j <= n; j++)
                        {
                            if (j == 1 || i == 1 || i == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "W":
                        for (int j = 1; j <= n; j++)
                        {
                            if (j == 1 || j == n || i >= (n + 1) / 2 && j == n - i + 1
                                    || i >= (n + 1) / 2 && j == i) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "N":
                        for (int j = 1; j <= n; j++)
                        {
                            if (j == 1 || i == j || j == n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "E":
                        for (int j = 1; j <= n; j++)
                        {
                            if (j == 1 || i == 1 || i == n || i == (n / 2) + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "M":

                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || j == n || i <= (n + 1) / 2 && j == i
                                    || j >= (n + 1) / 2 && j == n - i + 1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "O":

                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || j == n ||i==1||i==n) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "D":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == 1 && j <= n - 1 || j == n && i != 1 && i != n ||
                                    i == n && j <= n - 1)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                        case "U":
                        for (int j = 1; j <= n; j++) {
                            if (j==1||j==n||i==n)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                        case "H":
                        for (int j = 1; j <= n; j++) {
                            if (j==1||j==n||i==3)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                        case "T":
                        for (int j = 1; j <= n; j++) {
                            if (i==1||j==3)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                        case "J":
                        for (int j = 1; j <= n; j++) {
                            if (i==1||j==3||i>=n/2+1&&j==1||i==n&&j<=n/2+1)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                        case "K":
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || i == m && j <= (n) / 2 || i <= m && j == reverse || i >= m && i == j)
                            {
                                System.out.print(" *");
                            } else
                            {
                                System.out.print("  ");
                            }
                        }
                        break;
                        case "I":
                        for (int j = 1; j <= n; j++) {
                            if (i==1||i==n||j==n/2+1)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "R":
                        for (int j = 1; j <= n; j++) {
                            if (j==1|| i==1&&j<=n-1||i==2&&j==n||i==j&&i>=(n/2+1)||i==(n+1)/2&&j<=n-1)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "Y":
                        for (int j = 1; j <= n; j++) {
                            if (j==n-i+1)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "Z":
                        for (int j = 1; j <= n; j++) {
                            if (i==1||i==n||j==n-i+1)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                    case "V":
                        for (int j = 1; j <= 2*n-1; j++) {
                            if (j == i || j == 2 * n - i)
                            {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                        default:
                        System.out.println("No such letter found");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}  