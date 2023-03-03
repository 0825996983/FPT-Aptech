package session4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StabucksCoffee {
    public static void main(String[] args) {
        System.out.println("Menu Do Uong");
        System.out.println("Cappuccino");
        System.out.println("Caffe Latte");
        System.out.println("Espresso");
        String size = "";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nNhập đồ uống bạn yêu cầu: ");
        String douong = scanner.nextLine();
        int giatiensize,tongtien,soluong;


        switch (douong) {
            case "Cappuccino":
            case "Caffe Latte":
                System.out.println("Đồ bạn chọn có Size S, M, L ");
                System.out.printf("\nNhập Size: ");
                size = scanner.nextLine();
                switch (size) {
                    case "S":
                        giatiensize = 60000;
                        break;
                    case "M":
                        giatiensize = 70000;
                        break;
                    case "L":
                        giatiensize = 80000;
                        break;
                    default:
                        System.out.println("Không có size này vui lòng chọn lại.");
                        return;
                }
                break;
            case "Espresso":
                System.out.println("Đồ bạn chọn có Size S, M ");
                System.out.printf("\nNhập Size: ");
                size = scanner.nextLine();
                switch (size) {
                    case "S":
                        giatiensize = 40000;
                        break;
                    case "M":
                        giatiensize = 55000;
                        break;
                    default:
                        System.out.println("Không có size này vui lòng chọn lại.");
                        return;
                }
                break;
            default:
                System.out.println("Vui lòng chọn lại quán không có loại nước bạn yêu cầu.");
                return;
            }

        System.out.printf("Nhập số lượng:");
        soluong = scanner.nextInt();

        tongtien = (giatiensize * soluong);
        System.out.print("Tổng tiền  " +douong +" Size "+ size + " cần thanh toán là: " +tongtien );
    }
}
