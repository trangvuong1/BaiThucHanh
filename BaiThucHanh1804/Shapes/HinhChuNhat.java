
package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {

    public float dai;
    public float rong;

    // Constructor
    public HinhChuNhat() {
        ten = "Hình Chữ Nhật";
    }

    public void nhapChieuDai() {
        System.out.println("Chiều dài = ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.println("Chiều rộng = ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuvi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        dientich = dai * rong;
    }

}