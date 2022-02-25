package com.company;

import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Toplam = " + sum);

    }
}
