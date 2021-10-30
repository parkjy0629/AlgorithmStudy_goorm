package Chap04;

import java.util.LinkedList;
import java.util.Queue;
// 큐

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(7);
        q.add(5);
        q.offer(4);
        q.poll();
        q.offer(6);
        q.poll();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll();
        }
    }
}
