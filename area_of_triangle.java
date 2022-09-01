package javaapplication1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class area_of_triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        double s;
        System.out.print("input a :");
        a = input.nextInt();
        System.out.print("input b :");
        b = input.nextInt();
        System.out.print("input c :");
        c = input.nextInt();
        s = (a + b + c) / 2;
        System.out.println("area of triangle :" + sqrt((s) * (s - a) * (s - b) * (s - c)));
    }
}
