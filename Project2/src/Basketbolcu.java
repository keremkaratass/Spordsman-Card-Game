//FATMA GÜL YILDIRIM 190201017
//KEREM KARATAŞ 190201076
public class Basketbolcu extends Sporcu {

	private int ucluk;
	private int ikilik;
	private int serbestAtiş;
	boolean kartKullamıldiMi = false;

	public boolean isKartKullamıldiMi() {
		return kartKullamıldiMi;
	}

	public void setKartKullamıldiMi(boolean kartKullamıldiMi) {
		this.kartKullamıldiMi = kartKullamıldiMi;
	}

	@Override
	public String sporcuPuaniGoster() {

		return "İkilik:" + this.ikilik + "  Serbest Atış:" + this.serbestAtiş + "  Üçlük:" + this.ucluk;
	}

	public Basketbolcu() {
	}

	public Basketbolcu(String sporcuIsim, String sporcuTakim, int ucluk, int ikilik, int serbestAtiş, boolean kartKullamıldiMi) {
		super(sporcuIsim, sporcuTakim);
		this.ucluk = ucluk;
		this.ikilik = ikilik;
		this.serbestAtiş = serbestAtiş;
		this.kartKullamıldiMi = false;
	}

	public int getUcluk() {
		return ucluk;
	}

	public void setUcluk(int ucluk) {
		this.ucluk = ucluk;
	}

	public int getIkilik() {
		return ikilik;
	}

	public void setIkilik(int ikilik) {
		this.ikilik = ikilik;
	}

	public int getSerbestAtiş() {
		return serbestAtiş;
	}

	public void setSerbestAtiş(int serbestAtiş) {
		this.serbestAtiş = serbestAtiş;
	}

}












