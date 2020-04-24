package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter Second number : ");
        double SecondNumber = scanner.nextDouble();

        System.out.println("Enter operation : + , - , *, / ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double answer = 0;

        switch (operator) {
            case '+':
                answer = firstNumber + SecondNumber;
                break;

            case '-':
                answer = firstNumber - SecondNumber;
                break;

            case '*':
                answer = firstNumber * SecondNumber;
                break;

            case '/':
                answer = firstNumber / SecondNumber;
                break;

            default:
                System.out.println("Wrong Operator Entered ! ! ");
        }
        System.out.println(firstNumber +" " + operator + SecondNumber+ ": "+ answer) ;
    }
}

