package com.tugas.pertama;
import java.util.*;
import java.util.Scanner;

public class Makanan {
    public static void main(String[] args){
        System.out.println("PELANGGAN SETIA KEDAI SOMI");
        System.out.println("KLUNGKUNG, BALI");
        System.out.println("SILAHKAN PILIH MAKANAN YANG ANDA INGINKAN");
        System.out.println("NB : HANYA BISA MEMESAN SATU JENIS MAKANAN");
        System.out.println("JIKA INGIN MENU LAIN SILAHKAN ULANGI PROGRAM\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Asin: ");
        Set<String> asin = new LinkedHashSet<String>();
        asin.add("Nasi Goreng");
        asin.add("Mie Goreng");
        asin.add("Mie Kuah");
        asin.add("Bihun Goreng");
        asin.add("Bihun Kuah");
        asin.add("Ayam Sayur");
        asin.add("Ayam Kecap");
        System.out.println("\n==Menu asin Kedai Somi==");
        for (String tampil : asin){
            System.out.println("" + tampil);
        }

        System.out.println("\nManis : ");
        List<String> manis = new LinkedList<String>();
        manis.add("Waffle");
        manis.add("Roti Bakar");
        manis.add("Es Krim Goreng");
        manis.add("Es Krim");
        manis.add("Pisang Goreng");
        manis.add("Crepes");
        manis.add("Piscok");
        manis.add("Banana Oreo");
        System.out.println("\n==Menu msnis Kedai Somi==");
        for( int i=0; i < manis.size(); i++){
            System.out.println(manis.get(i));
        }

        System.out.println("\nLiST MAKANAN : ");
        Map<Integer, String> kode = new LinkedHashMap<Integer, String>();
        kode.put(1, "Nasi Goreng      : Rp.10000 \n");
        kode.put(2, "Mie Goreng       : Rp.8000\n");
        kode.put(3, "Mie Kuah         : Rp.8000\n");
        kode.put(4, "Bihun Goreng     : Rp.15000\n");
        kode.put(5, "Bihun Kuah       : RP.17000\n");
        kode.put(6, "Ayam Sayur       : Rp.21000\n");
        kode.put(7, "Ayam Kecap       : Rp.20000\n");
        kode.put(8, "Waffles          : Rp.11000\n");
        kode.put(9, "Roti Bakar       : Rp.9000\n");
        kode.put(10, "Es Krim Goreng  : Rp.12000\n");
        kode.put(11, "Es Krim         : Rp.11000\n");
        kode.put(12, "Pisang Goreng   : Rp.6000\n");
        kode.put(13, "Crepes          : Rp.8000\n");
        kode.put(14, "Piscok          : Rp.12000\n");
        kode.put(15, "Banana Oreo     : Rp.13000\n");
        for (Map.Entry<Integer, String> map : kode.entrySet()) {
            System.out.println(" "+ map.getKey() + " "+ map.getValue());
        }

        System.out.println("\n___________");
        Scanner sc = new Scanner(System.in);
        System.out.println("MASUKKAN NAMAMU : ");
        String nama = sc.nextLine();

        int harga =0;
        int h1=10000,h2=8000,h3=8000,h4=15000,h5=17000, h6=21000, h7=20000, h8=17000, h9= 9000, h10=12000, h11=11000,
                h12= 6000, h13= 8000, h14=12000, h15=13000;
        String menu;
        {
            System.out.println("MASUKKAN KODE MAKANAN : ");
            int code = sc.nextInt();

            if(code == 1){
                menu = "Nasi Goreng";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h1;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 2){
                menu = "Mie Goreng";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h2;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 3){
                menu = "Mie Kuah";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h3;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 4){
                menu = "Bihun Goreng";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h4;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 5){
                menu = "Bihun Kuah";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h5;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 6){
                menu = "Ayam Sayur";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h6;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 7){
                menu = "Ayam Kecap";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h7;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 8){
                menu = "Waffles";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h8;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 9){
                menu = "Roti Bakar";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h9;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 10){
                menu = "Es Krim Goreng";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h10;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 11){
                menu = "Es Krim";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h11;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 12){
                menu = "Pisang Goreng";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h13;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 13){
                menu = "Crepes";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h13;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 14){
                menu = "Piscok";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h14;
                System.out.println("Dengan harga :"+harga);
            }else if(code == 15){
                menu = "Banana Oreo";
                System.out.println("Menu yang anda pilih adalah :"+menu);
                harga=harga+h15;
                System.out.println("Dengan harga :"+harga);
            }else {
                System.out.println("Kode yang anda pilih tidak ada dalam menu, silahkan coba lagi!");
            }
        }
        System.out.println("MASUKKAN JUMLAH PESANAN ");
        int jumlah = sc.nextInt();
        int total = harga * jumlah ;
        System.out.println("___________");

        System.out.println("\n=============================");
        System.out.println("DETAIL PEMESANAN MAKANAN");
        System.out.println("PELANGGAN    : "+nama);
        System.out.println("JUMLAH       : "+jumlah);
        System.out.println("TOTAL        : "+total);
        System.out.println("TERIMA KASIH TELAH MENGUNJUNGI KEDAI SOMI");
        System.out.println("===============================");
    }
}
