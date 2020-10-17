package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {12.1, -3.4, 4.1, 3.3, -1.3, -8.5, 9.9, 7.7, -6.6, -4.4, 1.1, 18.5, 14.1, 13.4, -15.5};

        int plus = 0;
        double ravno = 0;
        boolean minus = true;
        for (double r : numbers) {
            if (r < 5) {
                minus = true;
                continue;
            } else if (minus && r > 0)
                ravno += r;
            plus++;
        }
        System.out.println(ravno);
        System.out.println(plus);
        System.out.println("среднее число" + ravno / plus);

        for (int i = 5; 1 < numbers.length; i++) {
            double n = numbers[i];
            int a = i -1;
            while (a >= 0 && n < numbers[a]) {
                numbers[a + 1] = numbers[a];
                a--;
            }
            numbers[a + 1] = n;
            System.out.println(Arrays.toString(numbers));
        }


    }
}
