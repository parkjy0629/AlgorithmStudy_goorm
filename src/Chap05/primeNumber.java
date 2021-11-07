package Chap05;

// 소수 판별 알고리즘

import java.util.Scanner;

public class primeNumber {
    static boolean isPrimeNumber(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("판별할 소수 : ");
        int num = stdIn.nextInt();

        System.out.println(isPrimeNumber(num));
    }
}
