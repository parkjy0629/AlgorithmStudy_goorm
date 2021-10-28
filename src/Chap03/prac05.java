package Chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class prac05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("단어 개수 : ");
        int n = Integer.parseInt(br.readLine());
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = br.readLine();
        }

        Comparator<String> cp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 1. 길이가 짧은 것이 우선 정렬
                if (o1.length() != o2.length()) {
                    return o1.length() < o2.length() ? -1 : 1;
                } else if (o1.length() == o2.length()) {    // 2. 길이가 같으면 숫자합이 작은 것이 먼저
                    int o1Sum = 0;
                    int o2Sum = 0;

                    for (char ch : o1.toCharArray()) {
                        if (ch >= 'A')
                            continue;
                        o1Sum += ch - '0';
                    }
                    for (char ch : o2.toCharArray()) {
                        if (ch >= 'A')
                            continue;
                        o2Sum += ch - '0';
                    }

                    if (o1Sum < o2Sum)
                        return -1;
                    if (o1Sum > o2Sum)
                        return 1;
                }

                // 3. 사전순으로 비교
                for (int i = 0; i < o1.length(); i++) {
                    if (o1.charAt(i) < o2.charAt(i))
                        return -1;
                    if (o1.charAt(i) > o2.charAt(i))
                        return 1;
                }

                return 0;
            }
        };

        Arrays.sort(a, cp);

        for (int i = 0; i < n; i ++) {
            System.out.println(a[i]);
        }
    }
}
