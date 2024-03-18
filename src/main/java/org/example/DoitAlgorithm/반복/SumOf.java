package org.example.DoitAlgorithm.반복;

import java.util.Scanner;

public class SumOf {

    static int sumof(int a, int b) {
        int max;
        int min;

        if (a > b) {
            max = a; min = b;
        } else {
            max = b; min = a;
        }

        int sum = 0;
        for (int i = min; i <=max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("a의 값 : "); int a = sc.nextInt();
        System.out.print("b의 값 : "); int b = sc.nextInt();

        System.out.println("정수 a,b를 포함한 사이값 총합은 = " +sumof(a,b) + "입니다.");
    }
}
