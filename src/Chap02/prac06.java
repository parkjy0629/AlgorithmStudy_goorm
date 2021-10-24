package Chap02;
// 퀵 정렬

import java.util.Scanner;

public class prac06 {
    static int number;
    static int[] data = new int[1000001];

    static void quickSort(int data[], int start, int end) {
        if (start >= end) {
            return;
        }

        int key = start;
        int i = start + 1;
        int j = end;
        int temp;

        while (data[i] <= data[key]) {
            i++;
        }
        while (data[j] >= data[key] && j > start) {
            j--;
        }

        if (i > j) {                // 엇갈렸을 경우
            temp = data[j];
            data[j] = data[key];
            data[key] = temp;
        } else {                    // 엇갈리지 않았을 경우
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }

        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("number : ");
        number = stdIn.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print("data[" + i + "] : ");
            data[i] = stdIn.nextInt();
        }

        System.out.println("정렬 전");
        for (int i = 0; i < number; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        quickSort(data, 0, number - 1);

        System.out.println("정렬 후");
        for (int i = 0; i < number; i++) {
            System.out.print(data[i] + " ");
        }
    }
}