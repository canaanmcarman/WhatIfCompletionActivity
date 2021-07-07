import java.util.Scanner;
public class WhatIfCompletion {
    public static void main(String[] args)
    {
        int num1, num2, sum, avg, product;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        avg = (num1 + num2) / 2;

        if (sum > 200)
            System.out.printf("Sum: %d*, product: %d, avg: %d \n", sum, product, avg);
        else
            System.out.printf("Sum: %d, product: %d, avg: %d \n", sum, product, avg);
    }

}
