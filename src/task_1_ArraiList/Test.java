package task_1_ArraiList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<Car>();
        carArrayList.add(new Car("black", "Tayta", 2018));
        carArrayList.add(new Car("white", "Mazda", 2021));
        carArrayList.add(new Car("red", "Audi", 2019));

        Collections.sort(carArrayList);
        System.out.println(carArrayList);

        Collections.sort(carArrayList, new AgeTest());
        System.out.println(carArrayList);
    }
}

class Car implements Comparable<Car> {
    private String colour;
    private String model;
    private int year;

    public Car(String colour, String model, int year) {
        this.colour = colour;
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        if (this.year == o.year){
            return 0;
        }else if (this.year > o.year){
            return -1;
        }else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
class AgeTest implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
       return o1.getYear() - o2.getYear();
    }
}