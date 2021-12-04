/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pengaplikasikan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        Transaksi tr = new Transaksi();
        JenisLaundry jl = new JenisLaundry();
        Client cl = new Client();
        Petugas pt = new Petugas();
        Laporan lp = new Laporan();
        
       System.out.println("Selamat datang di Laundry");
       System.out.println("Ketik 1 untuk menampilkan tabel client");
       System.out.println("Ketik 2 untuk menampilkan tabel jenis laundry");
       System.out.println("Ketik 3 untuk melaundry");
       System.out.println("Ketik 4 untuk menampilkan laporan transaksi");
       System.out.println("Ketik 0 untuk keluar dari program");
       
       int pilih;
       do{
           System.out.print("Ketikkan angka untuk memilih opsi : ");
           pilih = myObj.nextInt();
           if (pilih == 1){
               lp.laporan(cl);
           } else if (pilih == 2){
               lp.laporan(jl);
           } else if (pilih == 3){
               tr.prosesTransaksi(cl, tr, jl);
           } else if (pilih == 4){
              lp.laporan(tr, jl);
              lp.laporan(cl);
              lp.laporan(jl);
           }
       } while (pilih != 0);
    }
}
