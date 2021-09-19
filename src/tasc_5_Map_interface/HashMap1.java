package tasc_5_Map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "Loki");
        map.put(3444, "Bart");
        map.put(34546, "Roma");
        map.put(234221, "Liza");

        System.out.println(map);

        System.out.println(map.get(10007));

        map.remove(1000);
        System.out.println(map);

        map.forEach((a, b) -> System.out.println("KEY " + a + " Znak " + b));

        System.out.println(map.containsKey(3444));
        System.out.println(map.containsValue("Roma"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.entrySet());

    }
}
