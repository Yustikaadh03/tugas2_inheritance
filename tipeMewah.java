package com.company.inheritance;

public class tipeMewah extends sewa_rumah{
    int hitungFasilitas(){
        int fasilitas;
        if (this.tahun_sewa >=0 && this.tahun_sewa <=5){
            fasilitas = 800000 * this.tahun_sewa;
        }else {
            fasilitas = 700000 * this.tahun_sewa;
        }
        return fasilitas;
    }

    int hitungFasilitasMewah(){
        int fasilitas_mewah;
        if (this.tahun_sewa < 5) {
            fasilitas_mewah = 2000000;
        }else if (this.tahun_sewa > 5 && this.tahun_sewa <=10){
            fasilitas_mewah = 1900000;
        } else {
            fasilitas_mewah = 1800000;
        }
        return fasilitas_mewah;
    }

    int hitungTotalSewa(){
        int total;
        total = this.hitungHargaSewaPokok() + this.hitungFasilitas() + this.hitungFasilitasMewah();
        return total;
    }

    public void printPenyewa(String rincian){
        System.out.println(" " + rincian);
        System.out.println(" Nama Penyewa           : " + this.nama_penyewa);
        System.out.println(" Golongan Rumah         : " + this.gol_rumah);
        System.out.println(" Harga Pokok            : Rp " + this.hitungHargaSewaPokok());
        System.out.println(" Fasilitas              : Rp " + this.hitungFasilitas());
        System.out.println(" Tambahan Fasilitas     : Rp " + this.hitungFasilitasMewah());
        System.out.println(" Total Harga Sewa       : Rp " + this.hitungTotalSewa());
    }
}
