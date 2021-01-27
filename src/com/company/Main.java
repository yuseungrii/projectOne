package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int A = 0;
        int B = 0;
        Scanner scan = new Scanner(System.in);

        A = scan.nextInt();
        B = scan.nextInt();

        String bStr = Integer.toString(B);

        System.out.println(A * Integer.parseInt(bStr.substring(2, 3)));
        System.out.println(A * Integer.parseInt(bStr.substring(1, 2)));
        System.out.println(A * Integer.parseInt(bStr.substring(0, 1)));
        System.out.println(A * B);

        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);

    }
}

