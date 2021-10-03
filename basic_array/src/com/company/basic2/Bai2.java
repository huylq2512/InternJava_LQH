package com.company.basic2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập vào N để tìm ước số : ");
        int n = scanner.nextInt();
        int dem = 0;
        if (n > 0) {
            System.out.print("Các ước số của N lần lượt là : ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    dem++;
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
            System.out.println("Có tổng " + dem + " số");
        } else {
            System.out.println("Vui lòng nhập số là số nguyên dương");
        }

    }
}
