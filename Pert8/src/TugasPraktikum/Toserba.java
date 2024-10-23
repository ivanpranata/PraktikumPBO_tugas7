package TugasPraktikum;

import java.util.Scanner;

public class Toserba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};


        System.out.print("Masukkan Jumlah Item Barang: ");
        int jumlahItem = scanner.nextInt();

 
        String[] kodeBeli = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];

   
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBeli[i] = scanner.next();
            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = scanner.nextInt();

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equalsIgnoreCase(kodeBarang[j])) {
                    jumlahBayar[i] = hargaBarang[j] * jumlahBeli[i];
                    break;
                }
            }
        }

 
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");

        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
           
            String nama = "";
            int harga = 0;
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equalsIgnoreCase(kodeBarang[j])) {
                    nama = namaBarang[j];
                    harga = hargaBarang[j];
                    break;
                }
            }

        
            System.out.printf("%-4d%-13s%-12s%-7d%-12d%-12d\n", (i + 1), kodeBeli[i], nama, harga, jumlahBeli[i], jumlahBayar[i]);

        
            totalBayar += jumlahBayar[i];
        }

        System.out.println("==============================================================");
        System.out.println("Total Bayar: " + totalBayar);
        scanner.close();
    }
}