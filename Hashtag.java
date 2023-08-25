package com.objects;
public class Hashtag
{
    public static void main(String args[])
    { int n=5;
        for(int i=1;i<=n*n;i++)
        {
            if(i==1||i==5||i==21||i==25||i==13)
            {
                System.out.print(" #");
            }else if(i==2||i==3||i==4||i==6||i==10||i==11||i==15||i==16||i==20||i==22||i==23||i==24)
            {
                System.out.print(" *");
            }
            else
            {
                System.out.print("  ");
            }
            if(i%n==0)
            {
                System.out.println();
            }
        }
    }
}