package P2.penjualanBuku;


public class Buku12 {

    String judul, pengarang;
    int halaman, stok, harga;

    
    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual (int jml){
        if (stok > 0 && jml <= stok) {
            stok -= jml;
            if (stok == 0) {
                System.out.println("stok buku habis");
            }
        }else {
            System.out.println("\nStok buku habis");
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

      
}