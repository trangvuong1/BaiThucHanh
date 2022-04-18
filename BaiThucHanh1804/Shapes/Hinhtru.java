package Shapes;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {

    public float chieuCao;

    // Constructor
    public Hinhtru() {
        ten = "Hình Trụ";
    }

    public void nhapChieuCao() {
        nhapbankinh();

        System.out.println("Chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhdientich();
        thetich = thetich * chieuCao;
    }
}