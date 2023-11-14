package org.example.DoitAlgorithm;

import java.util.Scanner;

public class Max4method {

    static int max4(int a, int b, int c,int d){
        int max = a; //최대값
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;

        System.out.println("네 값의 최대값을 구하는 max4메서드 ");
        System.out.print("a의 값은 = " ); a = sc.nextInt();
        System.out.print("b의 값은 = " ); b = sc.nextInt();
        System.out.print("c의 값은 = " ); c = sc.nextInt();
        System.out.print("d의 값은 = " ); d = sc.nextInt();

        int max = max4(a,b,c,d);

        System.out.println("최대값은 = " +max );


    }


}
