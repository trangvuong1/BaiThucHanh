package main;

import Shapes.HinhChuNhat;
import Shapes.Hinhtron;
import Shapes.Hinhtru;
import Shapes.HinhVuong;

public class App54 {
    public static void main(String[] args) {
        // Thử nghiệm với lớp Hình tròn
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.xuatten();
        hinhtron.nhapbankinh();
        hinhtron.tichchuvi();
        hinhtron.tinhdientich();
        hinhtron.inchuvi();
        hinhtron.indientich();

        // Thử nghiệm với lớp Hình trụ
        Hinhtru hinhTru = new Hinhtru();
        hinhTru.xuatten();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inthetich();

        // Thử nghiệm với lớp Hình chữ nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatten();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inchuvi();
        hinhChuNhat.indientich();

        // Thử nghiệm với lớp Hình vuông
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatten();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inchuvi();
        hinhVuong.indientich();
    }
}