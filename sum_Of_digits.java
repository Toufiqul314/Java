package javaapplication1;

import java.util.Scanner;

public class sum_Of_digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0, m;
        System.out.print("input n :");
        n = input.nextInt();
        while (n > 0) {
            m = n % 10;
            sum = sum + m;
            n = n / 10;
        }
        System.out.println("the sum of digits :" + sum);
    }

}
