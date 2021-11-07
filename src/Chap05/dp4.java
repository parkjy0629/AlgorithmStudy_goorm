package Chap05;

import java.util.Scanner;

// 타일 채우기 - 2133

public class dp4 {
    static int[] d = new int[1001];

    static int dp(int x) {
        if (x == 0) return 1;
        if (x == 1) return 0;
        if (x == 2) return 3;
        if (d[x] != 0) return d[x];

        int result = 3 * dp(x - 2);
        for (int i = 4; i <= x; i+=2) {
            result += 2 * dp(x - i);
        }
//        for (int i = 3; i <= x; i++) {
//            if (i % 2 == 0) {
//                result += 2 * dp(x - i);
//            }
//        }
        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        System.out.println(dp(n));
    }
}