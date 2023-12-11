package org.example.DoitAlgorithm.ex01;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println("a보다 큰 값을 입력하세요!");
        } else {
            int result = b - a;
            System.out.println("b - a 는" +result +"입니다.");
        }
    }
}
