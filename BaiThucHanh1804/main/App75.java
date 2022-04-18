package main;
import Slide75.HinhChuNhat;
import Slide75.Hinhhoc;
import Slide75.Hinhtron;


public class App75 {
    
    public static void main(String[] args) {

        Hinhhoc hinhhoc = new Hinhhoc();
        Hinhtron hinhtron1 = new Hinhtron();
        Hinhtron hinhtron2 = new Hinhtron();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();

        System.out.println("Có tất cả " + Hinhhoc.dem + " hình trong ứng dụng trên ");
    }
}
