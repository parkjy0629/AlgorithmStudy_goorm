package Chap05;

// 다익스트라 알고리즘

public class dijkstra {
    static int num = 6;
    static int INF = 1000000000;        // 무한을 표현하기 위함

    // 전체 그래프 초기화
    static int[][] a = {
        {0, 2, 5, 1, INF, INF},
        {2, 0, 3, 2, INF, INF},
        {5, 3, 0, 3, 1, 5},
        {1, 2, 3, 0, 1, INF},
        {INF, INF, 1, 1, 0, 2},
        {INF, INF, 5, INF, 2, 0}
    };

    static Boolean[] visit = new Boolean[6];        // 방문 노드
    static int[] d = new int[6];                    // 최단 거리

    // 가장 최소 거리를 가지는 정점 반환
    static int getSmallIndex() {
        int min = INF;
        int index = 0;

        for (int i = 0; i < num; i++) {
            if (d[i] < min && !visit[i]) {
                min = d[i];
                index = i;
            }
        }

        return index;
    }

    // 다익스트라 수행하는 함수
    static void dijkstra(int start) {
        for (int i = 0; i < num; i++) {
            d[i] = a[start][i];
        }

        visit[start] = true;

        for (int i = 0; i < num - 2; i++) {
            int current = getSmallIndex();
            visit[current] = true;

            for (int j = 0; j < 6; j++) {
                if (!visit[j]) {
                    if (d[current] + a[current][j] < d[j]) {
                        d[j] = d[current] + a[current][j];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // 방문 노드 초기화
        for (int i = 0; i < visit.length; i++) {
            visit[i] = false;
        }

        dijkstra(0);

        for (int i = 0; i < num; i++) {
            System.out.print(d[i] + " ");
        }
    }
}
