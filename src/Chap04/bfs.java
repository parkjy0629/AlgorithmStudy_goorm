package Chap04;

import java.util.*;
// 너비 우선 탐색(Breadth First Search)

public class bfs {
    public static void bfs (int v, LinkedList<Integer>[] ll, boolean[] chk) {
        Queue<Integer> q = new LinkedList<Integer>();
        chk[v] = true;
        q.add(v);

        while (q.size() != 0) {
            v = q.poll();
            System.out.print(v + " ");

            Iterator<Integer> it = ll[v].listIterator();

            while (it.hasNext()) {
                int w = it.next();
                if (!chk[w]) {
                    chk[w] = true;
                    q.add(w);
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean chk[] = new boolean[8];                 // 방문 여부 검사 배열
        LinkedList<Integer>[] ll = new LinkedList[8];

        for (int i = 0; i < 8; i++) {
            ll[i] = new LinkedList<Integer>();
        }
        
        // 1과 2 연결
        ll[1].add(2);
        ll[2].add(1);

        // 1과 3 연결
        ll[1].add(3);
        ll[3].add(1);

        // 2와 4 연결
        ll[2].add(4);
        ll[4].add(2);

        // 2와 5 연결
        ll[2].add(5);
        ll[5].add(2);

        // 3과 6 연결
        ll[3].add(6);
        ll[6].add(3);

        // 3과 7 연결
        ll[3].add(7);
        ll[7].add(3);

        for (int i = 1; i < 8; i++) {
            Collections.sort(ll[i]);        // 방문 순서를 위해 오름차순 정렬
        }

        bfs(1, ll, chk);
    }
}
