package com.company.basic2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập A : ");
        int a = scanner.nextInt();
        System.out.print("nhập B : ");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            for (int j = a + 1; j <= b; j++) {
                if (uocChunglonNhat(i, j) == 1) {
                    System.out.println(i + " và " + j);
                }
            }
        }
    }

    public static int uocChunglonNhat(int soThuNhat, int soThuHai) {
        if (soThuNhat == 0 || soThuHai == 0) {
            return soThuNhat + soThuHai;
        }
        while (soThuNhat != soThuHai) {
            if (soThuNhat > soThuHai) {
                soThuNhat -= soThuHai;
            } else {
                soThuHai -= soThuNhat;
            }
        }
        return soThuNhat;
    }
}
