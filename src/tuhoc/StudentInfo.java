package tuhoc;



import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        String hoten = "";
        float diemtb;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoten = scanner.nextLine();

        System.out.print("Nhap diem TB: ");
        diemtb = scanner.nextFloat();

        System.out.printf("%s %.2f diem",hoten, diemtb);
    }
}

