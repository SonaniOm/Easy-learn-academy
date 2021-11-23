package com.company;

import java.util.Scanner;

public class area_of_circle {
        public static void p(String message)
        {
            System.out.println(message);
        }
        public static  void main(String inputs[])
        {
            double radius,area;

            Scanner input = new Scanner(System.in);

            p("Enter The Radius:");
            radius = input.nextDouble();

            area=3.14 * radius * radius;
            p("Area of Circle:" + area);
        }
}
