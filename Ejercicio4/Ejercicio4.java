package Ejercicio4;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("==============Ejercicio 4 primera parte==============");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.addAll(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(numbers);
        numbers.remove(9);
        System.out.println("10 removed (index 9)");
        System.out.println(numbers);
        System.out.print("Verifying if contains the Integers 1, 2, 3: ");
        System.out.println(numbers.containsAll(Arrays.asList(1, 2, 3)));
        numbers.set(0, 10);
        System.out.println("10 added in index 0 and remplaced 1");
        System.out.println(numbers);
        numbers.clear();
        System.out.println("List cleared");
        System.out.println(numbers);
        System.out.println();

        System.out.println("==============Ejercicio 4 segunda parte==============");
        Node<String> node = new Node<String>("A");
        node.add("B");
        node.add("C");
        System.out.println(node.getRoot());
        System.out.println(node.getNextNode());
        System.out.println(node.getNextNode());
        System.out.println(node.getNextNode());
        node.add("D");
        System.out.println(node.getNextNode());// last one
        System.out.println(node.getNextNode());// null because there is not a next node
    }
}
