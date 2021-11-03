package Chap05;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    public Node (int data) {
        this.data = data;
    }
}

public class treeOrder {
    // 전위 순회
    static void preOrder(Node n) {
        if(n != null) {
            System.out.print(n.data + " ");
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    // 중위 순회
    static void inOrder(Node n) {
        if(n != null) {
            inOrder(n.left);
            System.out.print(n.data + " ");
            inOrder(n.right);
        }
    }

    // 후위 순회
    static void postOrder(Node n) {
        if(n != null) {
            postOrder(n.left);
            postOrder(n.right);
            System.out.print(n.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        Node nodes[] = new Node[num + 1];

        for (int i = 1; i <= num; i++) {
            Node node = new Node(i);

            node.left = null;
            node.right = null;
            nodes[i] = node;
        }

        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                nodes[i/2].left = nodes[i];
            } else {
                nodes[i/2].right = nodes[i];
            }
        }

        System.out.println("전위 순회");
        preOrder(nodes[1]);

        System.out.println("\n\n중위 순회");
        inOrder(nodes[1]);

        System.out.println("\n\n후위 순회");
        postOrder(nodes[1]);
    }
}
