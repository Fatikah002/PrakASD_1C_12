package P3.ArrayBalok;

public class Balok12 {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public Balok12(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public Balok12(int sisi){
        panjang = 25;
        lebar = 30;
        tinggi = 69;
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}