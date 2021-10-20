package Chap02;

import java.util.Scanner;

// 단순 정렬하기 -> (선택 정렬)
public class prac05 {
    public static void main(String[] args) {
        int[] array = new int[1001];
        int num = 0;
        int min = 0;
        int idx = 0;
        int temp = 0;

        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 크기 입력 : ");
        num = stdIn.nextInt();

        for (int i = 0; i < num; i++) {
            array[i] = stdIn.nextInt();
        }

        System.out.println("입력 받은 배열");
        for (int i = 0; i < num; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        for (int i = 0; i < num; i++) {
            min = 1001;

            for (int j = i; j < num; j++) {
                if (min > array[j]) {
                    min = array[j];
                    idx = j;
                }
            }

            temp = array[i];
            array[i] = array[idx];
            array[idx] = temp;
        }

        System.out.println("정렬 후 배열");
        for (int i = 0; i < num; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
