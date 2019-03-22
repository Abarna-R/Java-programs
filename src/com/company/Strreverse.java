package com.company;

import java.util.Scanner;
import  java.lang.*;
public class Strreverse {
    public static void main(String[] args) {
        System.out.println("enter :");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] sc = str.toCharArray();
        for(int i=sc.length-1;i>=0;i--){
            System.out.print(sc[i]);
        }
    }
}
