package com.company;

import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {
        int b = 0;
        System.out.println("enter :");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] g = str.toCharArray();

        for (int i = 0; i < g.length; i++) {

            int ra = (int) g[i];
            if ((ra > 64 && ra < 91) || (ra > 96 && ra < 123)) {
                if (g[i] == 'a' || g[i] == 'e' || g[i] == 'i' || g[i] == 'o' || g[i] == 'u' || g[i] == 'A' || g[i] == 'E' || g[i] == 'I' || g[i] == 'O' || g[i] == 'U') {
                    System.out.print("vowel ");
                } else {
                    System.out.print("consonant ");
                }
            } else
                System.out.println("Error");
        }

    }
}
