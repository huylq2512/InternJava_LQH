package com.company.basic2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Số thứ nhất : ");
        int soThuNhat = scanner.nextInt();
        System.out.print("Số thứ hai : ");
        int soThuHai = scanner.nextInt();
        System.out.println("Ước chung lớn nhất của 2 số " + soThuNhat + " Và " + soThuHai + " là : " + uocChunglonNhat(soThuNhat, soThuHai));
        System.out.println("Bội chung nhỏ nhất của 2 số " + soThuNhat + " Và " + soThuHai + " là : " + boiChungNhoNhat(soThuNhat, soThuHai));

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

    public static int boiChungNhoNhat(int soThuNhat, int soThuHai ) {
        int temp = (soThuNhat > soThuHai) ? soThuNhat : soThuHai;
        while(true) {
            if( temp % soThuNhat == 0 && temp % soThuHai == 0 ) {;
                break;
            }
            ++temp;
        }
        return temp;
    }
}
