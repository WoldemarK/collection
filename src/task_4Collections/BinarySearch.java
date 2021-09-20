package task_4Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        Collections.sort(arrayList);

        int index1 = Collections.binarySearch(arrayList, -8);
        System.out.println(index1);

        Employee emp1 = new Employee(100, "Vik", 12345);
        Employee emp2 = new Employee(15, "Kol", 6542);
        Employee emp3 = new Employee(123, "Petr", 8543);
        Employee emp4 = new Employee(17, "Mahsa", 5678);
        Employee emp5 = new Employee(182, "Dima", 123);
        Employee emp6 = new Employee(15, "Bob", 9874);
        Employee emp7 = new Employee(250, "Vik", 1579);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println(employeeList);

        int index2 = Collections.binarySearch(
                employeeList, new Employee(182, "Dima", 123));
        System.out.println(index2);

        int [] array = {-3,8,12,-8,0,5,10,1,150,-30,19};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int index3 = Arrays.binarySearch(array,150);
        System.out.println(index3);

    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        int result = this.id - anotherEmployee.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmployee.name);
        }
        return result;
    }
<<<<<<< HEAD

=======
>>>>>>> origin/master
}