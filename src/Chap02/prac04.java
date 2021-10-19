package Chap02;

public class prac04 {
    static int number = 10;
    static int[] data = new int[] {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

    public static void quickSort(int[] data, int start, int end) {
        if (start >= end) {
            return;
        }

        int key = start;        // 첫번째 원소
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j) {        // 엇갈릴 때까지 반복
            while (i <= end && data[key] >= data[i]) {    // 키 값보다 큰 값을 만날 때까지 이동
                i++;
            }
            while (j > start && data[j] >= data[key]) {  // 키 값보다 작은 값을 만날 때까지 이동
                j--;
            }
            if (i > j) {    // 엇갈린 상태면 키 값과 교체
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else {        // 엇갈리지 않았다면 i와 j를 교체
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);
    }

    public static void main(String[] args) {
        quickSort(data, 0, number - 1);

        for (int i = 0; i < number; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
