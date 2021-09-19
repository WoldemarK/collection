package task_3_ListIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listerator1 {
    public static void main(String[] args) {
        String s = "madam";

        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverstlistIterator = list.listIterator(list.size());

        boolean isPalindrome = true;
        while (iterator.hasNext() && reverstlistIterator.hasPrevious()){
            if (iterator.next() != reverstlistIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("NOT Palindrome");
        }
    }
}
