package com.company.basic2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số nguyên cần tách : ");
        int n = new Scanner(System.in).nextInt();
        tachSo(n);
    }

    public static void tachSo(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(" " + i);
                n = n / i;
            }
        }
    }
}
