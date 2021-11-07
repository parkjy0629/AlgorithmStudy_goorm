package Chap05;

// 에라토스테네스의 체

public class primeNumberSieve {
    static int[] a = new int[100001];
    static int num = 100000;

    static void primeNumberSieve() {
        for (int i = 2; i <= num; i++) {
            a[i] = i;
        }

        for (int i = 2; i <= num; i++) {
            if (a[i] == 0) continue;

            for (int j = i + i; j <= num; j+=i) {
                a[j] = 0;
            }
        }

        for (int i = 2; i <= num; i++) {
            if (a[i] != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        primeNumberSieve();
    }
}
