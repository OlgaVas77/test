package ru.geekbrains.java.lesson_online.lesson1.lesson_1.lesson_2;

import java.util.Arrays;

public class lesson2 {

    public static void main (String[] args) {
        int[] ar0 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(ar0));
        change(ar0);
        System.out.println(Arrays.toString(ar0));
    }
    private static void change(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
    }
}
