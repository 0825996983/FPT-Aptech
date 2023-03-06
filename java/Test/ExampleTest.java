package Secssion2_2.Test;

import java.util.ArrayList;
import java.util.List;

public class ExampleTest {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Duc");
        students.add("Giap");
        students.add("Hung");
        students.add("Bien");
        students.add("Phuc");

        System.out.println(students);

        students.add(1,"Quang");
        System.out.println(students);

        List<String> ClassStudent = new ArrayList<>(students);

        List<String> nextstudents = new ArrayList<>();
        nextstudents.add("Toan");
        nextstudents.add("Hoang");

        ClassStudent.addAll(nextstudents);
        System.out.println(ClassStudent);



    }
}
