package Chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class prac04 {
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
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Arrays.sort(a, cp);

        for (int i = 0; i < n; i ++) {
            // 동일 단어 패스
            if (i > 0 && a[i].equals(a[i - 1])) {
                continue;
            } else {
                System.out.println(a[i]);
            }
        }
    }
}
