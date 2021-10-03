package com.company.basic2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào dãy số : ");
        int so1 = scanner.nextInt();
        int so2, so3 = 0;
        while (so1 > 0) {
            so2 = so1 % 10;
            so1 = so1 / 10;
            so3 += so2;
        }
        System.out.println("Tổng dẫy số vừa nhập : " + so3);
    }
}
