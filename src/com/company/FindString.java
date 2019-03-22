package com.company;

import java.util.Scanner;

public class FindString {

    public static void main(String[] args) {

        System.out.println("enter :");
        Scanner s = new Scanner(System.in);
        char st = s.next().charAt(0);
        int str= (int) st;
        if((str>64 && str<91)){
            System.out.println("Capital Letter");
        }
        else if((str>96 && str<123)){
            System.out.println("Lowercase Letter");
        }
        else if((str>31 && str<48) || (str>58 && str<65)||(str>90 && str<97)){
            System.out.println("Special symbol");
        }
        else if((str>47 && str<58)){
            System.out.println("Number");
        }
    }
}
