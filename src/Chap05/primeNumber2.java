package Chap05;

// 제곱근까지만 약수 여부 검증

import java.util.Scanner;

public class primeNumber2 {
    static Boolean isPrimeNumber(int x) {
        int end = (int)Math.sqrt(x);

        for (int i = 2; i <= end; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("판별할 숫자 : ");
        int num = stdIn.nextInt();

        System.out.println(isPrimeNumber(num));
    }
}
