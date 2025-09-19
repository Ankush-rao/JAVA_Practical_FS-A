package Practical_1;

import java.util.Scanner;
public class MinutesToYMD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        long minutes = sc.nextLong();
        final long MINUTES_PER_DAY = 24 * 60;
        final long MINUTES_PER_YEAR = 365 * MINUTES_PER_DAY; 
        final long MINUTES_PER_MONTH = 30 * MINUTES_PER_DAY; 

        long years = minutes / MINUTES_PER_YEAR;
        long rem = minutes % MINUTES_PER_YEAR;
        long months = rem / MINUTES_PER_MONTH;
        rem = rem % MINUTES_PER_MONTH;
        long days = rem / MINUTES_PER_DAY;

        System.out.printf("Equivalent (yy-mm-dd): %d-%02d-%02d%n", years, months, days);
        sc.close();
    }
}
