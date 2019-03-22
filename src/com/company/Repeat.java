package com.company;
import java.lang.*;
import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string:");
    String str = s.nextLine();
    char[] g = str.toCharArray();
        System.out.println("Enter repetition number:");
    int sc= s.nextInt();
        System.out.print(str);
        for(int i=0;i<sc;i++){
        for(int j=g.length-sc;j<g.length;j++){
            System.out.print(g[j]);
        }}
}
}

