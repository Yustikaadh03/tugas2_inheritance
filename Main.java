package com.company;
import java.util.Scanner;

import com.company.inheritance.*;
import com.company.inheritance.tipeBiasa;
import com.company.inheritance.tipeMewah;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n|==========================================================|");
        System.out.print("\n|                PERHITUNGAN SEWA RUMAH                    |");
        System.out.print("\n|==========================================================|");
        System.out.print("\n Golongan Rumah dari No 1-5");
        System.out.print("\n Masukan Jenis Pegawai (1=Biasa / 2=Mewah): ");
        int jenis = input.nextInt();

        if (jenis == 1) {
            System.out.print(" Masukan Nama Penyewa: ");
            String nama = input.next();
            System.out.print(" Masukan Golongan Rumah: ");
            int gol = input.nextInt();
            System.out.print(" Masukan Lama Sewa (tahun): ");
            int thn = input.nextInt();
            System.out.print("\n--------------------------------------------------------");
            System.out.print("\n Ketik 1, jika ingin mengetahui harga pokok sewa ");
            System.out.print("\n Ketik 2, jika ingin mengetahui total harga sewa");
            System.out.print("\n Masukan Pilihan: ");
            int pilihan = input.nextInt();
            System.out.print("\n--------------------------------------------------------");

            tipeBiasa p2 = new tipeBiasa();
            p2.isi(jenis, nama, gol, thn);
            if (pilihan==1){
                p2.printPenyewa();
            }else if (pilihan==2){
                p2.printPenyewa("\n Berikut Rinciannya Harga Sewa");
            }else {
                System.out.print("\n Pilihan salah, Anda keluar dari program");
                System.out.print("\n Silakan ulang penginputan data");
                Main.menu();
            }

        } else if (jenis == 2) {
            System.out.print(" Masukan Nama Penyewa: ");
            String nama = input.next();
            System.out.print(" Masukan Golongan Rumah: ");
            int gol = input.nextInt();
            System.out.print(" Masukan Lama Sewa (tahun): ");
            int thn = input.nextInt();

            System.out.print("\n--------------------------------------------------------");
            System.out.print("\n Ketik 1, jika ingin mengetahui Harga Pokok Sewa ");
            System.out.print("\n Ketik 2, jika ingin mengetahui Harga Sewa");
            System.out.print("\n Masukan Pilihan: ");
            int pilihan = input.nextInt();
            System.out.print("\n--------------------------------------------------------");

            tipeMewah p1 = new tipeMewah();
            p1.isi(jenis, nama, gol, thn);
            if (pilihan==1){
                p1.printPenyewa();
            }else if (pilihan==2){
                p1.printPenyewa("\n Berikut Rinciannya Harga Sewa Tipe Biasa");
            }else {
                System.out.print("\n Pilihan salah, Anda keluar dari program");
                System.out.print("\n Silakan ulang penginputan data");
                Main.menu();
            }

        } else {
            Main.menu();
        }

        System.out.print("\n--------------------------------------------------------");
        System.out.print("\n Ketik 1, untuk mengulang program ");
        System.out.print("\n Ketik 0, untuk keluar dari program");
        System.out.print("\n Masukan Pilihan: ");
        int pil = input.nextInt();

        if (pil==1){
            Main.menu();
        }else {
            System.exit(0);
        }
    }
}
