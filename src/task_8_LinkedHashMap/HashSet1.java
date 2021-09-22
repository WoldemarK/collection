package task_8_LinkedHashMap;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        HashSet<Integer> integers = new HashSet<>(hashSet1);
        integers.retainAll(hashSet2);
        System.out.println(integers);

        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);


    }
}
