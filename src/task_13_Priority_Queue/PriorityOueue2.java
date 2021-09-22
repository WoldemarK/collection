package task_13_Priority_Queue;

import java.util.PriorityQueue;

public class PriorityOueue2 {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", 5);
        Student student2 = new Student("Nik", 4);
        Student student3 = new Student("Tom", 2);
        Student student4 = new Student("Liza", 1);
        Student student5 = new Student("Bek", 3);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);
        priorityQueue.add(student5);

        for (Student s : priorityQueue) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------");

        System.out.println(priorityQueue.poll() + " poll");
        System.out.println(priorityQueue.poll() + " poll");
        System.out.println(priorityQueue.poll() + " poll");
        System.out.println(priorityQueue.poll() + " poll");
        System.out.println(priorityQueue.poll() + " poll");
    }

}

class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}