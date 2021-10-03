package com.company.basic2;


public class Bai7 {
    public static void main(String[] args) {
        for (int i = 100001; i <= 999999; i += 2) {
            if (checkLe(i) && soNT(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkLe(int n) {
        int a;
        while (n > 0) {
            a = n % 10;
            if (a % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean soNT(int n) {
        int canBac2 = (int) Math.sqrt(n);
        for (int i = 2; i <= canBac2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
