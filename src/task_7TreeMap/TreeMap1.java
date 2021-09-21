package task_7TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        Student st1 = new Student("Nik", "Nulad", 3);
        Student st2 = new Student("Den", "Gok", 2);
        Student st3 = new Student("Lev", "Faro", 6);
        Student st4 = new Student("Jon", "Vik", 7);
        Student st5 = new Student("Allen", "Mira", 2);
        Student st6 = new Student("Bob", "Marli", 3);
        Student st7 = new Student("Liza", "Simpson", 1);

        TreeMap<Student, Double> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        treeMap.put(st1, 1.1);
        treeMap.put(st2, 4.2);
        treeMap.put(st3, 8.3);
        treeMap.put(st4, 1.4);
        treeMap.put(st5, 1.5);
        treeMap.put(st6, 1.6);
        treeMap.put(st7, 1.7);

        System.out.println("------------------------------------------|");
        for (Map.Entry<Student, Double> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(treeMap.get(1.1));
        System.out.println("------------------------------------------|");
        treeMap.remove(1.1);
        treeMap.forEach((a, b) -> System.out.println(a + " : " + b));
        System.out.println("------------------------------------------|");
        System.out.println(treeMap.descendingMap());
        System.out.println("------------------------------------------|");
        //  System.out.println(treeMap.headMap(4.1));


    }
}

 class Student {
    private String name;
    private String surName;
    private int course;

    public Student(String name, String surName, int course) {
        this.name = name;
        this.surName = surName;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, course);
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getCourse() {
        return course;
    }
}