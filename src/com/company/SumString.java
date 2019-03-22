package com.company;
import java.util.Scanner;
import java.lang.*;
public class SumString {

    public static void main(String[] args) {
        int sum = 0, ra, b = 0;
        System.out.println("enter :");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] c = str.split(" ");

        for (int i = 0; i < c.length; i++) {
            try {
                ra = Integer.parseInt(c[i]);
                sum = sum + ra;
            } catch (Exception e) {
                b = 1;
                System.out.println("Error");
            }

        }
        if (b == 0)
            System.out.println(sum);
    }
}



