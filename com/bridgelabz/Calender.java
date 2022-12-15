package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */

public class Calender {
    /**
     * print the calendar
     */
    public static String monthName(int month) {
        /**
         * This method return the month name
         */
        String monthName = null;
        switch (month) {
            case 1:
                monthName = "January";
                break;

            case 2:
                monthName = "February";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    public static void monthTittle(int year, int month) {
        /**
         * This method print the year and month
         */
        System.out.println(monthName(month) + " --> " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static boolean isLeapYearOrNot(int year) {
        /**
         * This method returns the year is leaf year or not
         */
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static int numberOfDaysInMonth(int year, int month) {
        /**
         * This method return days in month
         */
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            if (isLeapYearOrNot(year) == true) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    public static int totalNumberOfDays(int year, int month) {
        /**
         * calculate total days of 1800 year to input year and month
         */
        int total = 0;
        for (int i = 1800; i < year; i++) {
            if (isLeapYearOrNot(i) == true) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            total += numberOfDaysInMonth(year, i);
        }
        return total;
    }

    public static int startDay(int year, int month) {
        /**
         * check the weeks days
         */
        int startDay = 3;//1800 year start day is wednesday before days are 3
        int totalNumberOfDays = totalNumberOfDays(year, month);
        return (startDay + totalNumberOfDays) % 7;
    }

    public static void monthBody(int year, int month) {
        /**
         * Print the days in month
         */
        int startDay = startDay(year, month);
        int monthDays = numberOfDaysInMonth(year, month);
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= monthDays; i++) {
            if (i < 10) {
                System.out.print("   " + i);
            } else {
                System.out.print("  " + i);
            }
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void printMonth(int year, int month) {
        /**
         * call the monthTittle and monthBody methods
         */
        monthTittle(year, month);
        monthBody(year, month);
    }

    public static void main(String[] args) {
        /**
         * Take input month and year from console
         * print the month calendar
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = input.nextInt();
        System.out.print("Enter month : ");
        int month = input.nextInt();
        if (month < 1 || month > 12 || year < 1000) {
            System.out.println("Enter wrong details");
        } else {
            printMonth(year, month);
        }
    }

}
