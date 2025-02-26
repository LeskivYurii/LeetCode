package org.example.easy._25_2_2025;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

    }
}

class MyStack {

    List<Integer> queue = new ArrayList<>();
    List<Integer> queue2 = new ArrayList<>();

    public MyStack() {

    }

    public void push(int x) {
        queue.addFirst(x);
    }

    public int pop() {
        return queue.removeLast();
    }

    public int top() {
        return queue.getLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
