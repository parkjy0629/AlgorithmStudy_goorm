package Chap05;

// 2 x n 타일링2 - 11727

import java.util.Scanner;

public class dp3 {
    static int[] d = new int [1001];

    static int dp(int x) {
        if (x == 1) return 1;
        if (x == 2) return 3;

        if (d[x] != 0) {
            return d[x];
        }

        return d[x] = (dp(x - 1) + 2 * dp(x - 2)) % 10007;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        System.out.println(dp(n));
    }
}
