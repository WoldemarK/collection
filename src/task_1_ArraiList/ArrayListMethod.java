package task_1_ArraiList;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Vik");
        arrayList1.add("Den");
        arrayList1.add("Bob");
        arrayList1.add("Bob");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");

        arrayList1.addAll(0, arrayList2);
        System.out.println(arrayList1);

        //arrayList1.clear();
        // System.out.println(arrayList1);

        int index = arrayList1.indexOf("Bob");
        System.out.println(index);

        int index1 = arrayList1.lastIndexOf("Bob");
        System.out.println(index1);

        System.out.println(arrayList1.isEmpty());

        System.out.println(arrayList1.contains("Bob"));

        System.out.println(arrayList1.toString());

    }
}
