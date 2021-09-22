package task_10_TreeSet;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetTask10 {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 5);
        Student st2 = new Student("Olga", 2);
        Student st3 = new Student("Petr", 4);
        Student st4 = new Student("Den", 3);
        Student st5 = new Student("Bob", 1);

        TreeSet<Student> students = new TreeSet<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

       for (Student student: students){
           System.out.println(student);
       }
        System.out.println("____________________________");

        System.out.println(students.first());
        System.out.println("____________________________");

        System.out.println(students.last());
        System.out.println("____________________________");

        Student st6 = new Student("Vik", 3);
        System.out.println(students.headSet(st6));

        System.out.println("____________________________");
        System.out.println(students.tailSet(st6));


    }
}

class Student implements Comparable<Student> {
    private String name;
    private int count;

    public Student(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return count == student.count && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Student o) {
      return this.getCount() - o.getCount();
    }
}