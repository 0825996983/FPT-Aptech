package session4;

import java.util.Scanner;

public class TestNumbericOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loaicay = "";
        System.out.printf("Nhap Loai Cay Ban Thich: ");
        loaicay = scanner.nextLine();


        switch (loaicay) {
                case "tao":
                    System.out.println("Cay lau nam");
                    break;
                case "dao":
                    System.out.println("Cay lau nam");
                    break;
                case "chuoi":
                    System.out.println("Cay ngan ngay");
                    break;
            default:
                System.out.println("chua xac dinh");


        }
    }
}
