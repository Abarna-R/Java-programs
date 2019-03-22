package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n=0,ab,sum=0,cmp;
        System.out.println("enter :");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        cmp=c;
        while(c>0){
            ab=c%10;
            if(ab%2==0){
                sum=sum+ab;
            }
            n=(n*10 )+ab;
            c=c/10;
        }
        if(cmp==n) {
            if(sum>25)
                System.out.println("Given number is palindrome and the sum  of even digits is greater than 25");
            else
                System.out.println("Given number is palindrome and the sum of even digits  is less than 25");
        }
        else
            System.out.println("Given number is not a palindrome");
    }
}
