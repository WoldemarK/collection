package task_1_ArraiList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Vik");
        arrayList1.add("Den");
        arrayList1.add("Bob");
        arrayList1.add("Kol");
        arrayList1.add("Lena");

        System.out.println(arrayList1);

        List<String> myList = arrayList1.subList(1, 5);
        System.out.println(myList);

        Object[] array = arrayList1.toArray();
        System.out.println(array);

        String[] array2 = arrayList1.toArray(new String[5]);
        for (String s : array2) System.out.println(s);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Bob");
        arrayList2.add("Igori");

        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);

        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);


    }
}
