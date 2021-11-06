package Chap05;

// 피보나치 수열

public class dp1 {
    static int[] d = new int[100];

    static int dp(int x) {
        if (x == 1) return 1;
        if (x == 2) return 1;
        if (d[x] != 0) return d[x];     // 계산한 값을 저장 후 반환

        return d[x] = dp(x - 1) + dp(x - 2);
    }

    public static void main(String[] args) {
        System.out.println(dp(30));
    }
}
