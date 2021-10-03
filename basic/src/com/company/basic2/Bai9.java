package com.company.basic2;

public class Bai9 {
    public static void main(String[] args) {
        for (int i = 1000000; i <= 999999999; i++) {
            if (kiemTraDoiXung(i) && checkSo(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean kiemTraDoiXung(int x) {
        int[] arr = new int[9];
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

    private static boolean checkSo(int n) {
        int c = 0;
        while (n > 0) {
            c = n % 10;
            n = n / 10;
            if (c != 0 && c != 6 && c != 8) {
                return false;
            }
        }
        return true;
    }


}
