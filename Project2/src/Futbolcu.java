//FATMA GÜL YILDIRIM 190201017
//KEREM KARATAŞ 190201076
public class Futbolcu extends Sporcu {

	private int penaltı;
	private int serbestVurus;
	private int kaleciyleKarşiKarşiya;
	boolean kartKullamıldiMi = false;

	public boolean isKartKullamıldiMi() {
		return kartKullamıldiMi;
	}

	public void setKartKullamıldiMi(boolean kartKullamıldiMi) {
		this.kartKullamıldiMi = kartKullamıldiMi;
	}

	public int getPenaltı() {
		return penaltı;
	}

	public void setPenaltı(int penaltı) {
		this.penaltı = penaltı;
	}

	public int getSerbestVurus() {
		return serbestVurus;
	}

	public void setSerbestVurus(int serbestVurus) {
		this.serbestVurus = serbestVurus;
	}

	public int getKaleciyleKarşiKarşiya() {
		return kaleciyleKarşiKarşiya;
	}

	public void setKaleciyleKarşiKarşiya(int kaleciyleKarşiKarşiya) {
		this.kaleciyleKarşiKarşiya = kaleciyleKarşiKarşiya;
	}

	@Override
	public String sporcuPuaniGoster() {
	return "Kaleciyle Karşı Karşıya:"+this.kaleciyleKarşiKarşiya+"  Penaltı:"+ this.penaltı +"  Serbest Vuruş:"+this.serbestVurus;
	}

	public Futbolcu() {
	}

	public Futbolcu(String sporcuIsim, String sporcuTakim, int penaltı, int serbestVurus, int kaleciyleKarşiKarşiya, boolean kartKullamıldiMi) {
		super(sporcuIsim, sporcuTakim);
		this.penaltı = penaltı;
		this.serbestVurus = serbestVurus;
		this.kaleciyleKarşiKarşiya = kaleciyleKarşiKarşiya;
		this.kartKullamıldiMi = kartKullamıldiMi;
	}

}











