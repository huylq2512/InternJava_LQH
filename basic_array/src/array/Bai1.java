package array;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Phần tử số thứ " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        int b = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[n - i - 1]);
            if (arr[i] != arr[n - i - 1]) {
                b = 1;
            }
        }
        if (b == 0) {
            System.out.println("Mảng đối xứng");
        } else {
            System.out.println("Mảng k đối xứng");
        }
    }

}
