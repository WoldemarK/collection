package task_1_ArraiList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("A");
        StringBuilder st2 = new StringBuilder("B");
        StringBuilder st3 = new StringBuilder("C");
        StringBuilder st4 = new StringBuilder("D ");

        StringBuilder[] array = {st1, st2, st3, st4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

        array[0].append("!!!");
        array[0] = new StringBuilder("F");
        System.out.println(list);


    }
}
