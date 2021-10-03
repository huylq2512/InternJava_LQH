package com.company.basic2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào N : ");
        int soNhap = scanner.nextInt();
        int evenNumber = 0;
        int odd = 0;

        for (int i = 0; i <= soNhap; i++) {
            if (i % 2 == 0) {
                evenNumber += i;
            } else {
                odd += i;
            }
        }
        if (evenNumber == 0) {
            System.out.println("Không có tổng của số chẵn");
        } else {
            System.out.println("Tổng của N số chẵn là : " + evenNumber);
        }
        if (odd == 0) {
            System.out.println("Không có tổng của số lẻ");
        } else {
            System.out.println("Tổng của N số lẻ là : " + odd);
        }
        //Bài 1 ý b
        double sum = 0;
        for (double i = 1; i <= soNhap; i++) {
                sum= sum + (1/i);
        }
        System.out.println("Tổng của số vừa nhập vào là :  " + sum);
    }
}
