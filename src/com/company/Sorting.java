package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int cmp,a=0,sum=0;
        System.out.println("enter :");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        cmp=c;
        while (c > 0) {
             c=c/10;
             a++;
        }
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
           arr[i]=cmp%10;
           if(arr[i]%2==0)
           {
               sum=sum+arr[i];
           }
           cmp=cmp/10;
        }
        Arrays.sort(arr);
        for(int j=a-1;j>=0;j--){
        System.out.print(arr[j]);
        }
        if(sum>15){
            System.out.println(" ");
            System.out.println("true");

        }else{
            System.out.println(" ");
            System.out.println("false");
        }
    }
}
