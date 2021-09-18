package task_1_ArraiList;

import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.8);
        Student student2 = new Student("Kolay", 'm', 20, 4, 4.5);
        Student student3 = new Student("Eva", 'f', 19, 1, 9.1);
        Student student4 = new Student("Petr", 'm', 23, 3, 1.8);
        Student student5 = new Student("Nika", 'f', 26, 5, 5.7);
        Student student6 = new Student("Nika", 'f', 26, 5, 5.7);

        ArrayList<Student> studentArrays = new ArrayList<>();
        studentArrays.add(student1);
        studentArrays.add(student2);
        studentArrays.add(student3);
        studentArrays.add(student4);
        studentArrays.add(student5);
        studentArrays.add(student6);

        System.out.println(studentArrays);

        studentArrays.remove(5);
        System.out.println(studentArrays);

        System.out.println("_______________________________________");

        Collections.sort(studentArrays, new AgeComparator());
        System.out.println("Сортировка по возрасту " + studentArrays);

        Collections.sort(studentArrays, new AvgGradeComparator());
        System.out.println("Сортировка по avgGrade " + studentArrays);

        Collections.sort(studentArrays, new NameComparator());
        System.out.println("Сортировка по имени " + studentArrays);



    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//       return this.age - o.age;
//    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getAge() - student2.getAge();
    }
}

class AvgGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAvgGrade() == student2.getAvgGrade()) {
            return 0;
        } else if (student1.getAvgGrade() < student2.getAvgGrade()) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
