package com.bridgelabz.Junit;

import java.util.Scanner;
public class Binary {
    static void toBinary(){
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its binary form");
        int n = sc.nextInt();
        int b=0;
        while(n!=0){
            a[b] = n%2;
            n=n/2;
            b++;
        }
        for (int i=b-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
        toBinary();
    }
}
