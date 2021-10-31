package Chap04;

// 합집합 찾기

public class unionFind {
    // 부모 노드를 찾는 함수
    static int getParent (int parent[], int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = getParent(parent, parent[x]);
    }

    // 두 부모 노드를 합치는 함수
    static void unionParent (int parent[], int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);

        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    // 같은 부모를 가지는지 확인
    static boolean findParent(int parent[], int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);

        if (a == b) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] parent = new int[11];

        for (int i = 0; i < 11; i++) {
            parent[i] = i;
        }

        unionParent(parent, 1, 2);
        unionParent(parent, 2, 3);
        unionParent(parent, 3, 4);
        unionParent(parent, 5, 6);
        unionParent(parent, 6, 7);
        unionParent(parent, 7, 8);

        System.out.println("unionParent(1, 5) 실행 전");
        System.out.println("1과 5는 연결되어 있나요? " + findParent(parent, 1, 5));
//        unionParent(parent, 1, 5);        true
//        unionParent(parent, 2, 4);        false
        unionParent(parent, 2, 8);
        System.out.println("unionParent(2, 8) 실행 후");
        System.out.println("1과 5는 연결되어 있나요? " + findParent(parent, 1, 5));

    }
}
