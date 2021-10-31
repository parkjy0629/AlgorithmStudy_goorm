package Chap04;

// 깊이 우선 탐색(Depth First Search)

import java.util.Collections;
import java.util.LinkedList;
public class dfs {
    static boolean chk[] = new boolean[8];        // 방문 처리 여부 배열
    static LinkedList<Integer>[] ll = new LinkedList[8];

    public static void dfs(int x) {
        if (chk[x]) {
            return;
        }

        chk[x] = true;
        System.out.print(x + " ");

        for (int i = 0; i < ll[x].size(); i++) {
            int y = ll[x].get(i);
            dfs(y);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            ll[i] = new LinkedList<Integer>();
        }

        // 1과 2 연결
        ll[1].add(2);
        ll[2].add(1);

        // 1과 3 연결
        ll[1].add(3);
        ll[3].add(1);

        // 2와 3 연결
        ll[2].add(3);
        ll[3].add(2);

        // 2와 4 연결
        ll[2].add(4);
        ll[4].add(2);

        // 2와 5 연결
        ll[2].add(5);
        ll[5].add(2);

        // 4와 5 연결
        ll[4].add(5);
        ll[5].add(4);

        // 3과 6 연결
        ll[3].add(6);
        ll[6].add(3);

        // 3과 7 연결
        ll[3].add(7);
        ll[7].add(3);

        // 6과 7 연결
        ll[6].add(7);
        ll[7].add(6);

        for (int i = 1; i < 8; i++) {
            Collections.sort(ll[i]);        // 방문 순서를 위해 오름차순 정렬
        }

        dfs(1);
    }
}
