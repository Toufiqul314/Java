package javaapplication1;

import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("input n :");
        n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
