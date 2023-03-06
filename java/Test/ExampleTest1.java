package Secssion2_2.Test;

import java.util.ArrayList;
import java.util.List;

public class ExampleTest1 {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Duc");
        students.add("Giap");
        students.add("Hung");
        students.add("Bien");
        students.add("Phuc");

        System.out.println(students);

        String beststudent = students.get(0);
        System.out.println("Best Student: " + beststudent);


        students.set(3,"Thien");
        System.out.println("Class" +students);
        System.out.println("Lop Nay Khong Co Hoc Sinh: " + students.isEmpty());
        System.out.println("Tong So HS Cua Lop La: " + students.size());










    }
}
