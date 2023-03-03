package session6;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nNhập id: ");
        int id = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("\nNhập Name: ");
        String name = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("\nNhập Email:");
        String email = scanner2.nextLine();

        Student t1 = new Student(id, name, email);
        System.out.println(t1);






    }

}
