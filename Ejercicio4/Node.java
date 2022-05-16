package Ejercicio4;

import java.util.*;

public class Node<T> {

    List<T> data;
    int rootIndex = 0;
    int currentIndex = rootIndex;

    public Node() {
        data = new ArrayList<T>();
    }

    public Node(T data) {
        this();
        this.add(data);
    }

    public void add(T data) {
        this.data.add(data);
    }

    public T getRoot() {
        return data.get(rootIndex);
    }

    public T getNextNode() {
        if (currentIndex < data.size()) {
            return data.get(currentIndex++);
        }
        return null;
    }
}