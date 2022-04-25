package Khachhang;

import java.util.Scanner;

import Sinhvien.Person;

public class Customer extends Person {
    public int solanmuahang;

    private void nhap() {
        System.out.println("nhập số lần mua hàng = ");
        Scanner scanner = new Scanner(System.in);
        solanmuahang = scanner.nextInt();
    }

}