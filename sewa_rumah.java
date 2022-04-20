package com.company.inheritance;

public class sewa_rumah {
    int jenis;
    String nama_penyewa;
    int gol_rumah;
    int tahun_sewa;

    public void isi (int jns, String nama, int gol, int thn) {
        this.jenis = jns;
        this.nama_penyewa = nama;
        this.gol_rumah = gol;
        this.tahun_sewa = thn;
    }

    int hitungHargaSewaPokok(){
        int harga_pokok;
        if (this.gol_rumah == 1){
            harga_pokok = 24000000;
        }else if (this.gol_rumah == 2){
            harga_pokok = 36000000;
        }else if (this.gol_rumah == 3){
            harga_pokok = 48000000;
        } else if (this.gol_rumah == 3){
            harga_pokok = 48000000;
        }else{
            harga_pokok = 72000000;
        }
        return harga_pokok;
    }

    public void printPenyewa(){
        System.out.println("\n Nama Penyewa     : " + this.nama_penyewa);
        System.out.println(" Golongan Rumah     : " + this.gol_rumah);
        System.out.println(" Harga Sewa Pokok   : Rp " + this.hitungHargaSewaPokok());
    }

}
