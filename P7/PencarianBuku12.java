package P7;

public class PencarianBuku12 {
    Buku12 listBk[] = new Buku12[5];
    int idx;

    void tambah (Buku12 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Buku12 m : listBk) {
                m.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi  = j ;
                break;
            }
        }
    return posisi;
    }

    public void tampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }

    }

    public void tampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode Buku   \t : " +x );
            System.out.println("Judul       \t : "+listBk[pos]. judulBuku);
            System.out.println("Tahun Terbit\t : "+listBk[pos]. tahunTerbit);
            System.out.println("Pengarang   \t : "+listBk[pos]. pengarang);
            System.out.println("Stock       \t : "+listBk[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    public Buku12 findBuku(int cari) {
        for (Buku12 buku : listBk) {
            if (buku != null && buku.kodeBuku == cari) {
                return buku;
            } 
        }
         return null;
    }
}

