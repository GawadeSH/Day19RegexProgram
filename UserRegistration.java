package com.regex;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to User Registration Program: ");

        String firstName;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name:");
        firstName=s.nextLine();

        Pattern p1 = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher m1 = p1.matcher(firstName);
        if(m1.matches() == true)
        {
            System.out.println("Valid name");
        }
        else
        {
            System.out.println("Invalid name");
        }
    }

}
