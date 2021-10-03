package array;

import java.util.Scanner;

import static java.lang.Math.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Số X: ");
        int x = scanner.nextInt();
        nhapMang(a, n);
        N(a, n, x);
    }

    private static void nhapMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số thứ " + i + " : ");
            a[i] = new Scanner(System.in).nextInt();
        }
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

    private static void N(int[] a, int n, int x) {
        int soNT2 = 0;
        int dem = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (soNT(a[i]) && Math.abs(a[i] - x) < dem) {
                dem = Math.abs(a[i] - x);
                soNT2 = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (soNT2 == a[i]) {
                System.out.println(i);
            }
        }
    }
}
