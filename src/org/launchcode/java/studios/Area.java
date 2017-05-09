package org.launchcode.java.studios;

import java.util.Scanner;


/**
 * Created by cpera on 5/8/2017.
 */
public class Area {
    public static void main(String[] args)
    {
        double radius = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        //radius  = in.nextDouble();
        String str = in.nextLine();
        try {
            radius = Double.parseDouble(str);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage() + " not a valid input for radius" );
            return;
        }
        while (radius < 0)
        {
            System.out.println("Radius should not be a negative number. Please enter a valid radius:");
            radius = in.nextDouble();
        }

        System.out.println("Area of the Circle with radius " + radius + " is: " + Area.areaOfCircle(radius));

        /*if (radius < 0)
        {
            System.out.println("Radius should not be a negative number. Please enter a valid radius:");
        }
        else
        {
            System.out.println("Area of the Circle with radius " + radius + " is: " + Area.areaOfCircle(radius));
        } */
    }
    public static double areaOfCircle(double radius)
    {
        double area;
        area = Math.PI * radius * radius;
        return area;
    }
}
