package com.company.inheritance;

public class tipeBiasa extends sewa_rumah {
    int hitungFasilitas(){
        int fasilitas;
        if (this.tahun_sewa >=1 && this.tahun_sewa <=5){
            fasilitas = 500000 * this.tahun_sewa;
        }else {
            fasilitas = 400000 * this.tahun_sewa;
        }
        return fasilitas;
    }

    int hitungTotalSewa(){
        int total;
        total = this.hitungHargaSewaPokok() + this.hitungFasilitas();
        return total;
    }

    public void printPenyewa(String rincian){
        System.out.println(" " + rincian);
        System.out.println(" Nama Penyewa           : " + this.nama_penyewa);
        System.out.println(" Golongan Rumah         : " + this.gol_rumah);
        System.out.println(" Harga Pokok            : Rp " + this.hitungHargaSewaPokok());
        System.out.println(" Fasilitas              : Rp " + this.hitungFasilitas());
        System.out.println(" Total Sewa             : Rp " + this.hitungTotalSewa());
    }

}
