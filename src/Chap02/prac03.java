package Chap02;
// 삽입 정렬

public class prac03 {
    public static void main(String[] args) {
        int i, j;
        int temp;
        int[] array = new int[] {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        System.out.println("변경전");
        for (i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (i = 1; i < 10; i++) {
            j = i;

            while (array[j] < array[j - 1] && j >= 0) {
                temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;

                j--;
            }
        }

        System.out.println("변경후");
        for (i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
