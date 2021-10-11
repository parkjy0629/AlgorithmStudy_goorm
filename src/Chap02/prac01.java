package Chap02;

public class prac01 {
    public static void main(String[] args) {
        int i, j;       // 반복문
        int min;        // 최소값
        int index = 0;      // 위치
        int temp;       // 위치 변경을 위한 변수
        int[] array = new int[] {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        System.out.println("변경전");
        for (i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (i = 0; i < 10; i++) {
            min = 9999;

            for (j = i; j < 10; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }

            // swapping
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        System.out.println("변경후");
        for (i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}