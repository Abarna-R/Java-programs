package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("enter :");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        if((c%2!=0) && (c>19 && c<31))
        {
            System.out.println("Tom");
        }
        else if((c%2==0) && (c>19 && c<31))
        {
            System.out.println("Jerry");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
