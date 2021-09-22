package task_9_set;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("Bob");
        strings.add("Oleg");
        strings.add("Vik");
        strings.add("Tom");
        strings.add("Tom");
        strings.add(null);
        strings.remove("Bob");

       for (String s : strings){
           System.out.println(s);
       }
        System.out.println(strings.size());
    }
}
