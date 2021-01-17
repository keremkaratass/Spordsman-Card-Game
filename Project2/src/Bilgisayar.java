//FATMA GÜL YILDIRIM 190201017
//KEREM KARATAŞ 190201076
import java.util.ArrayList;
import java.util.Random;

public class Bilgisayar extends Oyuncu {

	Random r = new Random();
	Oyuncu oyun = new Oyuncu();

	@Override
	public void FKartSec(ArrayList<Futbolcu> Kart) {
		for (int i = 0; i < 4; i++) {
			this.FutbolKartListesi.add(i,Kart.get(i));

		}
		this.yazdir2();
	}

	@Override
	public void BKartSec(ArrayList<Basketbolcu> Kart) {
		for (int i = 0; i < 4; i++) {

			this.BasketbolKartListesi.add(i,Kart.get(i));

		}
		this.yazdir1();
	}

	public Bilgisayar() {

	}

	public Bilgisayar(int oyuncuID, int skor, String oyuncuAdi) {
		super(oyuncuID, skor, oyuncuAdi);
	}

}





