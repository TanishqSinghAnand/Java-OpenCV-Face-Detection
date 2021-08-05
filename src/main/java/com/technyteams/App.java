package com.technyteams;

import java.util.*;

public class App {

    static Scanner sc = new Scanner(System.in);

    static double check(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static void main(String[] args) {
        System.out.println("Enter 1st num");
        double num1 = sc.nextDouble();
        System.out.println("Enter 2nd number");
        double num2 = sc.nextDouble();
        String greater = "";
        double greater_num = check(num1,num2);
        if (num1 == greater_num)
        greater = "Number 1";
        else if (num2 == greater_num)
        greater = "Number 2";

        System.out.println("Num 1 = " + num1 + " Num 2 = " + num2 + " And greter is " + greater_num + " Thus " + greater + " is grater" );
    }
}
