package com.company;

import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int a=0,c;
        Random r = new Random();
        int ab = r.nextInt(50);
        System.out.println("enter :");
        Scanner s = new Scanner(System.in);
        while (a==0) {
              c = s.nextInt();
            if (c == ab) {
                System.out.println("Guessed correctly");
                a=1;
            } else if (c < ab) {
                System.out.println("Lower!");
            }
        else if(c>ab){
        System.out.println("Higher");
        }
        }
    }
}


