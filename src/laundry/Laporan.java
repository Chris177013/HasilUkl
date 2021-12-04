/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

/**
 *
 * @author User
 */
public class Laporan {
    public void laporan(JenisLaundry jenisLaundry) {
        int x = jenisLaundry.getJmlLaundry();

        System.out.println();
        System.out.println("Tabel Laundry");
        System.out.println();
        System.out.println("Jenis Laundry \tHarga \tDurasi");
        for (int i = 0; i < x; i++) {
            System.out.println(jenisLaundry.getJenisLaundry(i) + "\t"
                    + jenisLaundry.getHarga(i) + "\t" + jenisLaundry.getDurasi(i) + " hari");
        }
    }

    public void laporan(Client client) {
        int x = client.getJmlClient();

        System.out.println();
        System.out.println("Tabel Client");
        System.out.println();
        System.out.println("Nama \tAlamat \tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i) + "\t"
                    + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t"
                    + client.getSaldo(i));
        }
    }

    public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry) {
        int x = transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Jenis Laundry\tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;

            System.out.println(jenisLaundry.getJenisLaundry(transaksi.getIdJenisLaundry(i)) + "\t"
                    + transaksi.getBanyaknya(i) + "\t" + jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i)) + "\t"
                    + jumlah);
        }
        System.out.println("Total Omset = " + total);
    }
}
