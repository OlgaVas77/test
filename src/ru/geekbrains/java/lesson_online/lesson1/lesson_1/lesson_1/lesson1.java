package ru.geekbrains.java.lesson_online.lesson1.lesson_1.lesson_1;

import com.sun.prism.shader.Solid_LinearGradient_PAD_AlphaTest_Loader;

public class lesson1 {
    //Задание 1:
    public static void main (String[] args) {
        int a = 1;
        int b = 1;
        int c = 3;
        int d = 2;
        float x = a * (b + (c / d));
        System.out.println(x);
    }

    //Задание 2:
    public static void example2() {
            int a = 7;
            int b = 8;
            int c = a + b;
            if (c >= 10 && c <= 20) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

    //Задание 3:
    public static void example3() {
        int a = 0;
        if (a >= 0) {
            System.out.println("a положительное");
        } else {
            System.out.println("a отрицательное");
        }
    }

    //Задание 4:
    public static void example4() {
        String name = "Olga";
        System.out.println("Привет " +name+ " !");
    }
}


