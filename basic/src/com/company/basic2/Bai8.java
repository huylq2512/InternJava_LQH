package com.company.basic2;

import java.sql.Array;

public class Bai8 {
    public static void main(String[] args) {
        System.out.println("Những số đối xứng có 6 chữ số : ");
        for (int i = 100000; i < 999999; i++) {
            if (kiemTraDoiXung(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean kiemTraDoiXung(int x) {
        int[] arr = new int[6];
        int count = 0;
        while (x > 0) {
            arr[count] = x % 10;
            x = x / 10;
            count++;
        }
        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            int i1 = arr.length - 1 - i;
            if (arr[i] != arr[i1]) {
                return false;
            }
        }
        return true;
    }
}
