package Homework6;

import java.util.Scanner;

//    Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) System.out.println(year + " - високосный год.");
        else System.out.println(year + " - не високосный год.");
    }
    public static boolean isLeapYear(int year) {
        // Год високосный, если он делится на 4
        // Но не делится на 100, если только не делится на 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
