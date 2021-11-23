package com.company;

import java.util.Scanner;

public class fahrenheit_to_celsius {
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String inputs[])
    {
        float f,c;

        Scanner input = new Scanner(System.in);

        p("Enter Fahrenheit Value:");
        f = input.nextFloat();

        c = ((f-32)*5)/9;

        p("Temperature in celsius:" + c);
    }
}
