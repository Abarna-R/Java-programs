package com.company;

import java.util.Scanner;

public class iteration {
    public static void main(String[] args) {
        System.out.println("enter :");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        for(int i=1;i<=c;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        }
    }
}
