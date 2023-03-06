package Secssion2_2.Test;

import java.util.ArrayList;
import java.util.List;

public class ExampleTest2 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Duc");
        students.add("Giap");
        students.add("Hung");
        students.add("Bien");
        students.add("Phuc");

        students.remove(1);
        System.out.println("After remove(4): " + students);
        students.remove("Hung");
        System.out.println("After remove(Hung):  " + students);
        students.removeIf(n -> (n.charAt(1) == 'i'));
        System.out.println("After removeIf('T'): " + students);
        students.removeAll(students);
        System.out.println("After removeAll: " + students);
    }
}
