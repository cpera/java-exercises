package org.launchcode.java.demos.java4python.methods;

import org.jetbrains.annotations.Contract;

/**
 * Created by cpera on 5/8/2017.
 */
public class Max {
    public static void main(String[] args)
    {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 6, 9, 10, 100, 17, 86, 24, 42, 45, 85, 101};

        int maxNum = Max.getMax(numbers);
        System.out.println(maxNum);
    }

    public static int getMax(int[] numbers)
    {
        int temp;
        temp = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if (temp < numbers[i]) {
                temp = numbers[i];
            }
        }
        return temp;
    }

    @Contract(pure = true)
    public static int arrayRead()
    {

        return 0;
    }

}
