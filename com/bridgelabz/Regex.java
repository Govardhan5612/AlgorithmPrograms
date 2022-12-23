package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Govardhan Reddy
 */
public class Regex {
    public void userDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = input.next();
        boolean firstNameStatus = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
        System.out.print("Enter full name : ");
        String fullName = input.next();
        boolean fullNameStatus = Pattern.compile("[A-Z]{1}[a-z]{2,}[A-Z]{1}[a-z]{2,}").matcher(fullName).matches();
        System.out.print("Enter you mobile number (91-78XXXXXXXX) ; ");
        String mobileNumber = input.next();
        boolean mobileNumberStatus = Pattern.compile("[0-9]{2}[-]{1}[7-9]{1}[0-9]{9}").matcher(mobileNumber).matches();

        System.out.print("Enter Date (XX/XX/XXXX) : ");
        String date = input.next();
        boolean dateStatus = Pattern.compile("[0-31]{2}[/]{1}[0-12]{2}[/]{1}[1000-2022]{4}").matcher(date).matches();
        if (firstNameStatus == true && fullNameStatus == true && mobileNumberStatus == true && dateStatus == true) {
            System.out.println("Hello " + firstName + ", We have your full\n" +
                    "name as " + fullName + " in our system. your contact number is " + mobileNumber + ".\n" +
                    "Please,let us know in case of any clarification Thank you BridgeLabz " + date + ".");
        } else {
            System.out.println("Details of first name is " + firstNameStatus);
            System.out.println("Details of full name is " + fullNameStatus);
            System.out.println("Details of mobile number is " + mobileNumberStatus);
            System.out.println("Details of date is " + dateStatus);
        }
    }

    public static void main(String[] args) {
        Regex regex = new Regex();
        regex.userDetails();
    }
}
