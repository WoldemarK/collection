package tasc_6_HashCode1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCode1 {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", "Marli", 4);
        Student student2 = new Student("Vik", "Pare", 1);
        Student student3 = new Student("Liza", "Simpsons", 4);

        Map<Student, Double> map = new HashMap<>();
        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.1);
        map.forEach((a, b) -> System.out.println("" + a + b));
      //  student1.setCourse(7);

        Student student4 = new Student("Liza", "Simpsons", 4);
        boolean result = map.containsKey(student4);
        System.out.println("result = " + result);

        System.out.println(student1 == student4);

        System.out.println(student1.hashCode());

        Student student5 = new Student("Vasy", "Sidorov", 5);

        for (Map.Entry<Student, Double>entry:map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }
}

final class  Student {
    private final String name;
    private final String surname;
    private final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);

    }
}