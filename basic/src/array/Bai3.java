package array;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số độ dài của mảng ");
        int n = scanner.nextInt();
        int count;
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            arr2[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr2[j] != 0 && arr[i] == arr[j]) {
                    count++;
                    arr2[j] = 0;
                }
            }
            if (arr2[i] != 0) {
                arr2[i] = count;
            }
        }
        int max = arr2[0];
        for (int i = 0; i < n; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        System.out.println("so lan xuat hien la " + max + ", cac phan tu ");
        for (int i = 0; i < n; i++) {
            if (arr2[i] == max) {
                System.out.print(arr[i] + " ");
            }
        }
    }


}
