package Chap02;
// 버블 정렬

public class prac02 {
    public static void main(String[] args) {
        int i, j;           // 반복문 변수
        int temp;
        int[] array = new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        System.out.println("변경전");
        for (i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("변경후");
        for (i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
