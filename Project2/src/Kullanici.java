//FATMA GÜL YILDIRIM 190201017
//KEREM KARATAŞ 190201076
import java.util.ArrayList;
import java.util.Random;

public class Kullanici extends Oyuncu {

	@Override
	public void FKartSec(ArrayList<Futbolcu> Kart) {
		Random r = new Random();
		Oyuncu oyun = new Oyuncu();
		int b = 8;
		for (int i = 0; i < 4; i++) {
			int a = r.nextInt(b);
			this.FutbolKartListesi.add(Kart.get(a));
			Kart.remove(a);
			b--;
		}
		this.yazdir2();
	}

	@Override
	public void BKartSec(ArrayList<Basketbolcu> Kart) {
		Random r = new Random();
		Oyuncu oyun = new Oyuncu();
		int a, b = 8;
		for (int i = 0; i < 4; i++) {
			a = r.nextInt(b);
			this.BasketbolKartListesi.add(Kart.get(a));
			Kart.remove(a);
			b--;
		}
		this.yazdir1();
	}

	public Kullanici() {
	}

	public Kullanici(int oyuncuID, int skor, String oyuncuAdi) {
		super(oyuncuID, skor, oyuncuAdi);
	}

}





