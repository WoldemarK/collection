package task2_LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Vik", 1);
        Student st3 = new Student("Jon", 4);
        Student st4 = new Student("Kol", 2);
        Student st5 = new Student("Bob ", 5);

        LinkedList<Student>studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);

        for (Student student: studentLinkedList){
            System.out.println(student);
        }



    }
}

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name ='" + name + '\'' +
                ", course =" + course +
                '}';
    }
}