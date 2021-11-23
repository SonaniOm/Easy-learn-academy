package com.company;

import java.util.Scanner;

public class area_of_trinangel {
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String inputs[])
    {
        float width,height,area;
        Scanner input = new Scanner(System.in);

        p("Enter Width:");
        width = input.nextFloat();

        p("Enter Height:");
        height = input.nextFloat();

        area = (width*height)/2;

        p("Area:"+area);

    }
}
