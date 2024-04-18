package P8;
import java.util.Scanner;
public class Utama12 {
    public static void main(String[] args) {
    Gudang12 gudang = new Gudang12(7);
    Scanner sc12 = new Scanner(System.in);

    while (true) {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah barang");
        System.out.println("2. Ambil barang");
        System.out.println("3. Tampilkan tumpukan barang");
        System.out.println("4. Keluar");
        System.out.print("Pilih operasi: ");
        int pilihan = sc12.nextInt();
        sc12.nextLine();
        
        switch (pilihan) {
        case 1:
            System.out.print( "Masukkan kode barang: ");
            int kode = sc12.nextInt();
            sc12.nextLine();
            System.out.print("Masukkan nama barang: ");
            String nama = sc12.nextLine();
            System.out.print("Masukkan nama kategori: ");
            String kategori = sc12.nextLine();
            Barang12 barangBaru = new Barang12(kode, nama, kategori);
            gudang. tambahBarang(barangBaru);
            break;
        case 2:
            gudang.ambilBarang();
            break;
        case 3:
            gudang. tampilkanBarang();
            break;
        case 4:
            break;
        default:
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }
    }
    
}