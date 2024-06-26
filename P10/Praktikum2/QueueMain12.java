package P10.Praktikum2;

import java.util.Scanner;

public class QueueMain12 {

    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah= sc12.nextInt();

        Queue12 antri = new Queue12(jumlah);
        int pilih;
        do {
            menu();
            pilih = sc12.nextInt();
            sc12.nextLine();
            switch (pilih) {
                case 1:
                System.out.print ("No Rekening: ");
                String norek = sc12.nextLine();
                System.out.print("Nama: ");
                String nama = sc12.nextLine();
                System.out.print ("Alamat: ");
                String alamat = sc12.nextLine();
                System.out.print ("Umur: ");
                int umur = sc12.nextInt ();
                System.out.print("Saldo: ");
                double saldo = sc12.nextDouble();
                Nasabah12 nb = new Nasabah12 (norek, nama, alamat, umur, saldo);
                sc12.nextLine();
                antri.Enqueue(nb) ;
                break;

                case 2:
                Nasabah12 data = antri.Dequeue();
                if (!"".equals (data.norek) && !"". equals (data.nama) && !"".equals (data.alamat)
                && data.umur != 0 && data.saldo != 0) {
                System. out.println ("Antrian yang keluar: " + data.norek + " " + data.nama + " "
                + data.alamat + " " + data.umur + " " + data.saldo); 
                break;
                }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;

                case 5:
                    antri.peekRear();
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5  );
    }
}
