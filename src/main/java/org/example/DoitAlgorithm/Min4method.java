package org.example.DoitAlgorithm;

import java.util.Scanner;

public class Min4method {

    static int min4(int a, int b, int c,int d){
        int min = a; //최소값
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;

        System.out.println("네 값의 최소값을 구하는 min4메서드 ");
        System.out.print("a의 값은 = " ); a = sc.nextInt();
        System.out.print("b의 값은 = " ); b = sc.nextInt();
        System.out.print("c의 값은 = " ); c = sc.nextInt();
        System.out.print("d의 값은 = " ); d = sc.nextInt();

        int min = min4(a,b,c,d);

        System.out.println("최소값은 = " +min );


    }


}
