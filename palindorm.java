package javaapplication1;

import java.util.Scanner;

public class palindorm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0, r, temp;
        System.out.print("input n :");
        n = input.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp+" is palindrome.");
        } else {
            System.out.println(temp+" not palindrome.");
        }
    }

}
