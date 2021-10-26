package Chap03;

public class heapSort {
    static int num = 9;
    static int[] heap = new int[] {7, 6, 5, 8, 3, 5, 9, 1, 6};

    public static void main(String[] args) {
        // 전체 트리 구조를 최대 힙 구조로 변경
        for (int i = 0; i < num; i++) {
            int c = i;

            do {
                int root = (c - 1) / 2;

                if (heap[root] < heap[c]) {
                    int temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }

                c = root;
            } while (c != 0);
        }

        // 크기를 줄여가며 반복적으로 힙 구성
        for (int i = num - 1; i >= 0; i--) {
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;

            int root = 0;
            int c = 1;

            do {
                c = 2 * root + 1;

                // 자식 중에 더 큰 값 찾기
                if (c < i - 1 && heap[c] < heap[c + 1]) {
                    c++;
                }

                // 루트보다 자식이 더 크다면 교환
                if (c < i && heap[root] < heap[c]) {
                    int temp2 = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp2;
                }
                root = c;
            } while (c < i);
        }

        for (int i = 0; i < num; i++) {
            System.out.print(heap[i] + " ");
        }
    }
}
