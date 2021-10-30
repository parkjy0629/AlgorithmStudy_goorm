package Chap04;

import java.util.Stack;
// 스택

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(7);
        s.push(5);
        s.push(4);
        s.pop();
        s.push(6);
        s.pop();

        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
