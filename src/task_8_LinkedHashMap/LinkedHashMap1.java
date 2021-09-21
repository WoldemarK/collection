package task_8_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Objects;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        Student st1 = new Student("Nik", "Nutella", 3);

        Student st2 = new Student("Den", "Gok", 2);
        Student st3 = new Student("Lev", "Faro", 6);
        Student st4 = new Student("Jon", "Vik", 7);

        LinkedHashMap<Double, Student> linkedHashMap =
                new LinkedHashMap<>(16,0.75F,false);
        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(6.8, st2);
        linkedHashMap.put(7.2, st3);
        linkedHashMap.put(3.8, st4);

        linkedHashMap.forEach((a, b) -> System.out.println(a + " : " + b));


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
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surName, student.surName);
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