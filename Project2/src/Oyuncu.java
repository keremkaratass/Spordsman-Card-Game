//FATMA GÜL YILDIRIM 190201017
//KEREM KARATAŞ 190201076

import java.util.ArrayList;

public class Oyuncu {

    private int oyuncuID;
    private int skor = 0;
    private String oyuncuAdi;
    public ArrayList<Basketbolcu> BasketbolKartListesi = new ArrayList<Basketbolcu>(8);
    public ArrayList<Futbolcu> FutbolKartListesi = new ArrayList<Futbolcu>(8);
    public ArrayList sayi = new ArrayList();

    public ArrayList<Basketbolcu> getBasketbolKartListesi() {
        return BasketbolKartListesi;
    }

    public void setBasketbolKartListesi(ArrayList<Basketbolcu> BasketbolKartListesi) {
        this.BasketbolKartListesi = BasketbolKartListesi;
    }

    public ArrayList<Futbolcu> getFutbolKartListesi() {
        return FutbolKartListesi;
    }

    public void setFutbolKartListesi(ArrayList<Futbolcu> FutbolKartListesi) {
        this.FutbolKartListesi = FutbolKartListesi;
    }

    public ArrayList getSayi() {
        return sayi;
    }

    public void setSayi(ArrayList sayi) {
        this.sayi = sayi;
    }

    public void yazdir1() {
        for (Basketbolcu i : BasketbolKartListesi) {
            System.out.println("Oyuncu Adı:" + i.getSporcuIsim() + " \t Takım adı:" + i.getSporcuTakim() + " \t İkilik Puanı:" + i.getIkilik() + " \t Üçlük Puanı:" + i.getUcluk() + " \t\tSerbest Atış Puanı:"
                    + i.getSerbestAtiş());
        }
    }

    public void yazdir2() {
        for (Futbolcu i : FutbolKartListesi) {
            System.out.println("Oyuncu Adı:" + i.getSporcuIsim() + " \t Takım adı:" + i.getSporcuTakim() + " \t Penaltı Puanı:" + i.getPenaltı() + " \t Serbest Atış Puanı:" + i.getSerbestVurus() + " \t Kaleciyle Karşı Karşıya Puanı:"
                    + +i.getKaleciyleKarşiKarşiya());
        }

    }

    public void FKartSec(ArrayList<Futbolcu> FutbolKartListesi) {

    }

    public void BKartSec(ArrayList<Basketbolcu> BasketbolKartListesi) {
    }

    public int SkorGoster() {
        return this.skor;
    }

    Oyuncu() {

    }

    Oyuncu(int oyuncuID, int skor, String oyuncuAdi) {
        this.oyuncuID = oyuncuID;
        this.skor = skor;
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

}
