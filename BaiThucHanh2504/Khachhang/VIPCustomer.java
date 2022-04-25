package Khachhang;

import java.util.Scanner;

import Sinhvien.Person;

public class VIPCustomer extends Person {
    public String hovaten;
    public float sotiendamua;

    private void nhap() {
        System.out.println("nhập hovaten = ");
        Scanner scanner = new Scanner(System.in);
        hovaten = scanner.nextLine();
        System.out.println("nhập sotiendamua = ");
        sotiendamua = scanner.nextFloat();
    }
}