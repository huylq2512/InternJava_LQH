package com.company.basic2;

public class Bai10 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 10000000; i++) {
            if (soNT(i)) {
                System.out.println(i);
            }
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

    private static boolean checkNumber(int n) {
        int temp;
        while(n>0){
            temp = n%10;
            if(!soNT(temp)){
                return false;
            }
            n/=10;
        }
        return true;
    }

}
