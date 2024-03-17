package org.example.DoitAlgorithm.반복;

import java.util.Scanner;

public class SumGauss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = sc.nextInt();

        int sum = (1 + n)*5;

        System.out.println("총 합은 = " +sum);
    }
}
