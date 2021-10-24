package Chap03;

import java.util.Arrays;
import java.util.Collections;

// sort 함수 사용

public class arraySort {
    static boolean compare (int a, int b) {
        return a < b;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 4, 2, 3, 6, 8, 10};
        Integer[] arr2 = {1, 5, 7, 9, 4, 2, 3, 6, 8, 10};

        System.out.println("정렬 전");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("정렬 후 [오름차순]");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("정렬 후 [내림차순]");
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }
}
