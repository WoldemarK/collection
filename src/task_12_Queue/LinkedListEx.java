package task_12_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String > queue = new LinkedList<>();
        queue.add("Vik");
        queue.add("Tom");
        queue.add("Den");
        queue.add("Bob");
        System.out.println(queue);
        System.out.println("_____________________________");

        System.out.println(queue.remove());
        System.out.println("_____________________________");

        System.out.println(queue);
        System.out.println("_____________________________");

        System.out.println(queue.element());
        System.out.println("_____________________________");


    }
}
