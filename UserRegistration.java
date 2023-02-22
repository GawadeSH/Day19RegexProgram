package com.regex;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration
{
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program: ");

        String firstName, lastName, mail,MobileNumber,password;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name:");
        firstName = s.nextLine();

        Pattern p1 = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher m1 = p1.matcher(firstName);
        if (m1.matches() == true) {
            System.out.println("Valid first name");
        } else {
            System.out.println("Invalid first name");
        }


        System.out.println("Enter last name:");
        lastName = s.nextLine();
        if (lastName.matches("[A-Z][a-z]{3,}") == true) {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid last name");
        }

        System.out.println("Enter e-mail:");
        mail = s.nextLine();
        if(mail.matches("[a-zA-Z0-9]*[.]?[a-zA-Z0-9]+@[a-z]+[.]([a-z]{2,3}[.])?[a-z]{2,3}?") == true)
        {
            System.out.println("Valid e-mail id");
        }
        else
        {
            System.out.println("Invalid e-mail id");
        }


        System.out.println("Enter Mobile Number :");
        MobileNumber = s.nextLine();
        if (MobileNumber.matches("[0-9]{2}[6-9][0-9]{9}") == true)
        {
            System.out.println("Valid Mobile Number");
        }
        else
        {
            System.out.println("Invalid Mobile Number");
        }

        System.out.println("Enter password :");
        password = s.nextLine();

        if (password.matches("(?=.*[a-z])(?=.*[A-Z]).{8}") == true)
        {
            System.out.println("Valid password ");
        }
        else
        {
            System.out.println("Invalid password ");
        }





    }
}



