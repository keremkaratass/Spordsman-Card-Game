//FATMA GÜL YILDIRIM 190201017
//KEREM KARATAŞ 190201076
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Test extends javax.swing.JFrame {

	Oyuncu oyun = new Oyuncu();
	Kullanici insan = new Kullanici();
	Bilgisayar pc = new Bilgisayar();
	int x = 4;
	int y;
	int b = 4;//bilgisayar kartı(basketbol) için random sayıyı oluştururken kullandık.
	int c = 4;//bilgisayar kartı(futbol) için random sayıyı oluştururken kullandık.
	int pozisyon;
	int bsay = 0;//futbol-basket-futbolbasket sırasını korumak için
	int fsay = 0;//futbol-basket-futbolbasket sırasını korumak için
	int fsayi = 0;//eğer futbol kartları bittiyse ve elimizde basket kartları varsa veya tam tersi için tıklama özelliği sağlar
	int bsayi = 0;//eğer futbol kartları bittiyse ve elimizde basket kartları varsa veya tam tersi için tıklama özelliği sağlar
	int cik = 0;//tüm kartların kullanıldığına ve oyundan çıkmamız gerektiğine karar verir
	int a;
	Random r = new Random();//random islemleri için

	public Test() {
		initComponents();
		//bilgisayarın basketbol kartları için kullanılan bir indisteki numarayı siliyor ve random sayıda tekrarı önlüyor
		oyun.sayi.add(0);
		oyun.sayi.add(1);
		oyun.sayi.add(2);
		oyun.sayi.add(3);
		//bilgisayarın futbol kartları için kullanılan bir indisteki numarayı siliyor ve random sayıda tekrarı önlüyor
		pc.sayi.add(0, 0);
		pc.sayi.add(1, 1);
		pc.sayi.add(2, 2);
		pc.sayi.add(3, 3);
//kartlarımızı oluşturduk özelliklerini verdik
		oyun.BasketbolKartListesi.add(0, new Basketbolcu("Carmelo", "Hawks", 90, 101, 57, false));
		oyun.BasketbolKartListesi.add(1, new Basketbolcu("Blake", "Bulls", 67, 105, 85, false));
		oyun.BasketbolKartListesi.add(2, new Basketbolcu("Kevin", "Nuggets", 75, 92, 55, false));
		oyun.BasketbolKartListesi.add(3, new Basketbolcu("Tracy", "Rockets", 69, 92, 80, false));
		oyun.BasketbolKartListesi.add(4, new Basketbolcu("Dirk", "Heat", 69, 90, 85, false));
		oyun.BasketbolKartListesi.add(5, new Basketbolcu("Kobe", "Suns", 90, 101, 57, false));
		oyun.BasketbolKartListesi.add(6, new Basketbolcu("James", "Jazz", 67, 89, 80, false));
		oyun.BasketbolKartListesi.add(7, new Basketbolcu("Anthony", "Magic", 69, 92, 85, false));

		oyun.FutbolKartListesi.add(0, new Futbolcu("Henry", "Barcelona", 95, 90, 90, false));
		oyun.FutbolKartListesi.add(1, new Futbolcu("Baggio", "PSG", 69, 87, 70, false));
		oyun.FutbolKartListesi.add(2, new Futbolcu("Best", "Liverpool", 93, 85, 70, false));
		oyun.FutbolKartListesi.add(3, new Futbolcu("Cannavaro", "Chelsea", 95, 57, 90, false));
		oyun.FutbolKartListesi.add(4, new Futbolcu("Eusebio", "Milan", 80, 77, 85, false));
		oyun.FutbolKartListesi.add(5, new Futbolcu("Maradona", "Arsenal", 77, 71, 100, false));
		oyun.FutbolKartListesi.add(6, new Futbolcu("Pele", "Juventus", 69, 87, 100, false));
		oyun.FutbolKartListesi.add(7, new Futbolcu("Cruyff", "Man", 95, 90, 95, false));
//kontrol amaçlı konsol ekranına da yazdırıyoruz
		System.out.println("******");
		oyun.yazdir1();
		oyun.yazdir2();
		System.out.println("******");
		insan.BKartSec(oyun.BasketbolKartListesi);
		insan.FKartSec(oyun.FutbolKartListesi);
		System.out.println("**************");
		System.out.println("**************");
		pc.BKartSec(oyun.BasketbolKartListesi);
		pc.FKartSec(oyun.FutbolKartListesi);
		System.out.println("**************");
//ilk başta bazı panelleri görünmez yaptık ki kullanıcıdan ad bilgisini almak için
		jPanel_bilgisayar.setVisible(false);
		jPanel_insan.setVisible(false);
		jPanel_skor.setVisible(false);
		jPanel_degerler.setVisible(false);

	}
//tasarım kodları

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel_insan = new javax.swing.JPanel();
		jButtonif2 = new javax.swing.JButton();
		jButtonif3 = new javax.swing.JButton();
		jButtonif4 = new javax.swing.JButton();
		jButtonib1 = new javax.swing.JButton();
		jButtonif1 = new javax.swing.JButton();
		jButtonib2 = new javax.swing.JButton();
		jButtonib3 = new javax.swing.JButton();
		jButtonib4 = new javax.swing.JButton();
		jPanel_bilgisayar = new javax.swing.JPanel();
		jButtonbf2 = new javax.swing.JButton();
		jButtonbf3 = new javax.swing.JButton();
		jButtonbf4 = new javax.swing.JButton();
		jButtonbb1 = new javax.swing.JButton();
		jButtonbf1 = new javax.swing.JButton();
		jButtonbb2 = new javax.swing.JButton();
		jButtonbb3 = new javax.swing.JButton();
		jButtonbb4 = new javax.swing.JButton();
		jPanel_skor = new javax.swing.JPanel();
		jLabel_isim = new javax.swing.JLabel();
		jLabel_bilgisayar = new javax.swing.JLabel();
		jTextField_isim = new javax.swing.JTextField();
		jTextField_bilgisayar = new javax.swing.JTextField();
		jPanel_giris = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField_giris_adi = new javax.swing.JTextField();
		jButton_basla = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jPanel_degerler = new javax.swing.JPanel();
		jLabel_insan = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField_pc_ozellik = new javax.swing.JTextField();
		jTextField_insan_ozellik = new javax.swing.JTextField();
		jLabel_pozisyon = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jPanel6 = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 204));

		jPanel_insan.setBackground(new java.awt.Color(0, 0, 0));
		jPanel_insan.setPreferredSize(new java.awt.Dimension(1400, 250));

		jButtonif2.setPreferredSize(new java.awt.Dimension(170, 200));
		jButtonif2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonif2ActionPerformed(evt);
			}
		});

		jButtonif3.setPreferredSize(new java.awt.Dimension(170, 200));
		jButtonif3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonif3ActionPerformed(evt);
			}
		});

		jButtonif4.setPreferredSize(new java.awt.Dimension(170, 200));
		jButtonif4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonif4ActionPerformed(evt);
			}
		});

		jButtonib1.setPreferredSize(new java.awt.Dimension(170, 200));
		jButtonib1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonib1ActionPerformed(evt);
			}
		});

		jButtonif1.setPreferredSize(new java.awt.Dimension(170, 190));
		jButtonif1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonif1ActionPerformed(evt);
			}
		});

		jButtonib2.setPreferredSize(new java.awt.Dimension(170, 200));
		jButtonib2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonib2ActionPerformed(evt);
			}
		});

		jButtonib3.setPreferredSize(new java.awt.Dimension(170, 200));
		jButtonib3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonib3ActionPerformed(evt);
			}
		});

		jButtonib4.setPreferredSize(new java.awt.Dimension(170, 200));
		jButtonib4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonib4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel_insanLayout = new javax.swing.GroupLayout(jPanel_insan);
		jPanel_insan.setLayout(jPanel_insanLayout);
		jPanel_insanLayout.setHorizontalGroup(
			jPanel_insanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_insanLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jButtonif1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonif2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonif3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonif4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonib1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonib2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonib3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonib4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel_insanLayout.setVerticalGroup(
			jPanel_insanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_insanLayout.createSequentialGroup()
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(jPanel_insanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jButtonif1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonif2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonif3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonif4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonib1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonib2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonib3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonib4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(24, 24, 24))
		);

		jPanel_bilgisayar.setBackground(new java.awt.Color(0, 0, 0));
		jPanel_bilgisayar.setPreferredSize(new java.awt.Dimension(1400, 250));

		jButtonbf2.setPreferredSize(new java.awt.Dimension(170, 200));

		jButtonbf3.setPreferredSize(new java.awt.Dimension(170, 200));

		jButtonbf4.setPreferredSize(new java.awt.Dimension(170, 200));

		jButtonbb1.setPreferredSize(new java.awt.Dimension(170, 200));

		jButtonbf1.setPreferredSize(new java.awt.Dimension(170, 190));

		jButtonbb2.setPreferredSize(new java.awt.Dimension(170, 200));

		jButtonbb3.setPreferredSize(new java.awt.Dimension(170, 200));

		jButtonbb4.setPreferredSize(new java.awt.Dimension(170, 200));

		javax.swing.GroupLayout jPanel_bilgisayarLayout = new javax.swing.GroupLayout(jPanel_bilgisayar);
		jPanel_bilgisayar.setLayout(jPanel_bilgisayarLayout);
		jPanel_bilgisayarLayout.setHorizontalGroup(
			jPanel_bilgisayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_bilgisayarLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jButtonbf1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonbf2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonbf3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonbf4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonbb1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonbb2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonbb3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(jButtonbb4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel_bilgisayarLayout.setVerticalGroup(
			jPanel_bilgisayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_bilgisayarLayout.createSequentialGroup()
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(jPanel_bilgisayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jButtonbf1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonbf2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonbf3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonbf4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonbb1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonbb2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonbb3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonbb4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(24, 24, 24))
		);

		jPanel_skor.setBackground(new java.awt.Color(255, 255, 153));
		jPanel_skor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SKOR TABLOSU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 51, 0))); // NOI18N

		jLabel_isim.setBackground(new java.awt.Color(255, 255, 255));
		jLabel_isim.setText("jLabel2");
		jLabel_isim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

		jLabel_bilgisayar.setBackground(new java.awt.Color(255, 255, 255));
		jLabel_bilgisayar.setText("Bilgisayar");
		jLabel_bilgisayar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
		jLabel_bilgisayar.setPreferredSize(new java.awt.Dimension(50, 20));

		jTextField_isim.setBackground(new java.awt.Color(255, 255, 102));
		jTextField_isim.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
		jTextField_isim.setText("0");
		jTextField_isim.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "skor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria Math", 0, 14))); // NOI18N
		jTextField_isim.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jTextField_isim.setEnabled(false);
		jTextField_isim.setPreferredSize(new java.awt.Dimension(60, 30));

		jTextField_bilgisayar.setBackground(new java.awt.Color(255, 255, 102));
		jTextField_bilgisayar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
		jTextField_bilgisayar.setText("0");
		jTextField_bilgisayar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "skor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria Math", 0, 14))); // NOI18N
		jTextField_bilgisayar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jTextField_bilgisayar.setEnabled(false);
		jTextField_bilgisayar.setPreferredSize(new java.awt.Dimension(60, 30));

		javax.swing.GroupLayout jPanel_skorLayout = new javax.swing.GroupLayout(jPanel_skor);
		jPanel_skor.setLayout(jPanel_skorLayout);
		jPanel_skorLayout.setHorizontalGroup(
			jPanel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_skorLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel_bilgisayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel_skorLayout.createSequentialGroup()
							.addComponent(jLabel_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGap(0, 4, Short.MAX_VALUE))
						.addComponent(jTextField_isim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jTextField_bilgisayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel_skorLayout.setVerticalGroup(
			jPanel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_skorLayout.createSequentialGroup()
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jLabel_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(jTextField_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(jLabel_bilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(jTextField_bilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(95, 95, 95))
		);

		jPanel_giris.setBackground(new java.awt.Color(51, 255, 255));

		jLabel1.setText("Adınız:");

		jButton_basla.setText("Oyuna Başla");
		jButton_basla.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_baslaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel_girisLayout = new javax.swing.GroupLayout(jPanel_giris);
		jPanel_giris.setLayout(jPanel_girisLayout);
		jPanel_girisLayout.setHorizontalGroup(
			jPanel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_girisLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(37, 37, 37)
					.addComponent(jTextField_giris_adi, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(jButton_basla)
					.addGap(25, 25, 25))
		);
		jPanel_girisLayout.setVerticalGroup(
			jPanel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_girisLayout.createSequentialGroup()
					.addGap(33, 33, 33)
					.addGroup(jPanel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jTextField_giris_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton_basla)
						.addComponent(jLabel1))
					.addContainerGap(20, Short.MAX_VALUE))
		);

		jPanel4.setBackground(new java.awt.Color(255, 255, 204));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
			jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 57, Short.MAX_VALUE)
		);
		jPanel4Layout.setVerticalGroup(
			jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE)
		);

		jPanel_degerler.setBackground(new java.awt.Color(255, 153, 255));

		jLabel3.setText("Bilgisayar");

		jTextField_pc_ozellik.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jTextField_pc_ozellik.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jTextField_pc_ozellik.setEnabled(false);

		jTextField_insan_ozellik.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jTextField_insan_ozellik.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jTextField_insan_ozellik.setEnabled(false);

		javax.swing.GroupLayout jPanel_degerlerLayout = new javax.swing.GroupLayout(jPanel_degerler);
		jPanel_degerler.setLayout(jPanel_degerlerLayout);
		jPanel_degerlerLayout.setHorizontalGroup(
			jPanel_degerlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_degerlerLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel_degerlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel_insan, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(jPanel_degerlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(jTextField_insan_ozellik, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
						.addComponent(jTextField_pc_ozellik))
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addComponent(jLabel_pozisyon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(44, 44, 44))
		);
		jPanel_degerlerLayout.setVerticalGroup(
			jPanel_degerlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel_degerlerLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel_insan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_degerlerLayout.createSequentialGroup()
					.addGap(14, 14, 14)
					.addComponent(jTextField_insan_ozellik, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(jTextField_pc_ozellik, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(38, 38, 38))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_degerlerLayout.createSequentialGroup()
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jLabel_pozisyon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(52, 52, 52))
		);

		jPanel5.setBackground(new java.awt.Color(255, 255, 204));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(
			jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
		);
		jPanel5Layout.setVerticalGroup(
			jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
		);

		jPanel6.setBackground(new java.awt.Color(255, 255, 204));

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(
			jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
		);
		jPanel6Layout.setVerticalGroup(
			jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 37, Short.MAX_VALUE)
		);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(227, 227, 227)
									.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(164, 164, 164)
									.addComponent(jPanel_degerler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
									.addComponent(jPanel_skor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addComponent(jPanel_insan, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jPanel_bilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(jPanel_giris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
					.addGap(30, 30, 30))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
					.addComponent(jPanel_bilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel_giris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(143, 143, 143)
							.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(148, 148, 148)
									.addComponent(jPanel_degerler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jPanel_skor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
							.addGap(18, 18, 18)
							.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jPanel_insan, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
		);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		pack();
	}// </editor-fold>                        

	private void jButton_baslaActionPerformed(java.awt.event.ActionEvent evt) {
		//bazı banellerin görünürlüğünü açtık bazılarını da kapattık
		jPanel_bilgisayar.setVisible(true);
		jPanel_insan.setVisible(true);
		jPanel_giris.setVisible(false);
		jPanel_skor.setVisible(true);
		jPanel_degerler.setVisible(true);
		insan.setOyuncuAdi(jTextField_giris_adi.getText());
		insan.setOyuncuID(0);
		pc.setOyuncuAdi("Bilgisayar");
		pc.setOyuncuID(1);
		jLabel_isim.setText(insan.getOyuncuAdi());//skor tablosundaki label a oyuncu adı yazdırıyor
		jLabel_insan.setText(insan.getOyuncuAdi());//kart özelliklerinin olduğu yere oyuncu adını yazıyor
		//ilk giriş ekranı olarak tüm kartların arka kapağı için resim ekledik
		jButtonbb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
		jButtonbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
		jButtonbb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
		jButtonbb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
		jButtonib1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
		jButtonib2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
		jButtonib3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
		jButtonib4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
		jButtonbf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
		jButtonbf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
		jButtonbf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
		jButtonbf4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
		jButtonif1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
		jButtonif2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
		jButtonif3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
		jButtonif4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
	}

	private void jButtonib4ActionPerformed(java.awt.event.ActionEvent evt) {
		//baştaki if şartı sıra basketçideyken futbolcuyuyu veya tam tersini seçmemizi engelliyor
		if (((fsay - 1) == bsay) || fsayi == 4) {
			bsay++;
			String ozellik = "";
			ozellik += insan.BasketbolKartListesi.get(3).sporcuPuaniGoster();
			jTextField_insan_ozellik.setText(ozellik);
			if (insan.BasketbolKartListesi.get(3).kartKullamıldiMi == false) {
				String adinsan = insan.BasketbolKartListesi.get(3).getSporcuIsim() + ".jpg";
				System.out.println("---" + adinsan + "--");

				jButtonib4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adinsan)));
//bilgisayar için 0-4 arası random sayı aldık ve o indisteki kart la insanın 4.basketbol kartı kapışacak
				a = r.nextInt(b);
				y = (int) oyun.sayi.get(a);

				String adbilgisayar = pc.BasketbolKartListesi.get(y).getSporcuIsim() + ".jpg";
				System.out.println("---" + adbilgisayar + "--");

				if (y == 0) {
					jButtonbb1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(0).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 1) {
					jButtonbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(1).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 2) {
					jButtonbb3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(2).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 3) {
					jButtonbb4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(3).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				pozisyon = Test.pozisyonBilgisi();
				if (cik == 7) {
					jLabel_pozisyon.setText(" ");
					if (insan.BasketbolKartListesi.get(3).getIkilik() > pc.BasketbolKartListesi.get(y).getIkilik()) {
						insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(3).getIkilik() < pc.BasketbolKartListesi.get(y).getIkilik()) {
						insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(3).getSerbestAtiş() > pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
						insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(3).getSerbestAtiş() < pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
						insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(3).getUcluk() > pc.BasketbolKartListesi.get(y).getUcluk()) {
						insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(3).getUcluk() < pc.BasketbolKartListesi.get(y).getUcluk()) {
						insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else {
						insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;

					}
				} else {
					jLabel_pozisyon.setText(Integer.toString(pozisyon + 1));
					if (pozisyon == 0) {
						if (insan.BasketbolKartListesi.get(3).getIkilik() > pc.BasketbolKartListesi.get(y).getIkilik()) {
							insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(3).getIkilik() < pc.BasketbolKartListesi.get(y).getIkilik()) {
							insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 1) {
						if (insan.BasketbolKartListesi.get(3).getSerbestAtiş() > pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
							insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(3).getSerbestAtiş() < pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
							insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 2) {
						if (insan.BasketbolKartListesi.get(3).getUcluk() > pc.BasketbolKartListesi.get(y).getUcluk()) {
							insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(3).getUcluk() < pc.BasketbolKartListesi.get(y).getUcluk()) {
							insan.BasketbolKartListesi.get(3).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					}
				}
				jTextField_isim.setText(Integer.toString(insan.getSkor()));
				jTextField_bilgisayar.setText(Integer.toString(pc.getSkor()));
			}
		}
		//threadlar ile belli bir süre beklemeyi sağladım.
		Thread t1 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(3).kartKullamıldiMi == true) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					jButtonib4.setVisible(false);
					//eğer kartlar karşılaştığında berabere kalmassa bilgisayarın kullanılan kart indisini siliyoruz.Böylece o kartı bir daha kullanmıyoruz.
					b--;
					oyun.sayi.remove(a);
					cik++;
					bsayi++;
//cik 8 e eşit olduğunda oyun bitti mesajı getirtiyoruz.
					if (cik == 8) {
						String text = "";
						if (pc.getSkor() > insan.getSkor()) {
							text += pc.getOyuncuAdi();
						} else if (pc.getSkor() < insan.getSkor()) {
							text += insan.getOyuncuAdi();
						} else if (pc.getSkor() == insan.getSkor()) {
							text += "yok.Oyun berabere bitti";
						}

						JOptionPane.showMessageDialog(jPanel1, "Oyun Bitti");
						JOptionPane.showMessageDialog(jPanel1,"Puanlar\n"+insan.getOyuncuAdi()+":"+insan.SkorGoster()+"\nBilgisayar:"+pc.SkorGoster() );
						JOptionPane.showMessageDialog(jPanel1, "Kazanan " + text);
					}
				}
			}

		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(3).kartKullamıldiMi == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					//random sayıya göre  bilgisayarın kullanılan indisteki kartı silinir
					if (y == 0) {
						jButtonbb1.setVisible(false);

					}
					if (y == 1) {
						jButtonbb2.setVisible(false);

					}
					if (y == 2) {
						jButtonbb3.setVisible(false);

					}
					if (y == 3) {
						jButtonbb4.setVisible(false);

					}

				}

			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(3).kartKullamıldiMi == false) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}

					jButtonbb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonib4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
				}
			}

		};
		t3.start();
	}

	private void jButtonib3ActionPerformed(java.awt.event.ActionEvent evt) {
		if (((fsay - 1) == bsay) || fsayi == 4) {
			bsay++;

			String ozellik = "";
			ozellik += insan.BasketbolKartListesi.get(2).sporcuPuaniGoster();
			jTextField_insan_ozellik.setText(ozellik);
			if (insan.BasketbolKartListesi.get(2).kartKullamıldiMi == false) {
				String adinsan = insan.BasketbolKartListesi.get(2).getSporcuIsim() + ".jpg";
				System.out.println("---" + adinsan + "--");

				jButtonib3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adinsan)));

				a = r.nextInt(b);
				y = (int) oyun.sayi.get(a);

				String adbilgisayar = pc.BasketbolKartListesi.get(y).getSporcuIsim() + ".jpg";
				System.out.println("---" + adbilgisayar + "--");

				if (y == 0) {
					jButtonbb1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(0).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 1) {
					jButtonbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(1).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 2) {
					jButtonbb3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(2).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 3) {
					jButtonbb4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(3).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				pozisyon = Test.pozisyonBilgisi();
				if (cik == 7) {
					jLabel_pozisyon.setText(" ");
					if (insan.BasketbolKartListesi.get(2).getIkilik() > pc.BasketbolKartListesi.get(y).getIkilik()) {
						insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(2).getIkilik() < pc.BasketbolKartListesi.get(y).getIkilik()) {
						insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(2).getSerbestAtiş() > pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
						insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(2).getSerbestAtiş() < pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
						insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(2).getUcluk() > pc.BasketbolKartListesi.get(y).getUcluk()) {
						insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(2).getUcluk() < pc.BasketbolKartListesi.get(y).getUcluk()) {
						insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else {
						insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
					}
				} else {
					jLabel_pozisyon.setText(Integer.toString(pozisyon + 1));
					if (pozisyon == 0) {
						if (insan.BasketbolKartListesi.get(2).getIkilik() > pc.BasketbolKartListesi.get(y).getIkilik()) {
							insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(2).getIkilik() < pc.BasketbolKartListesi.get(y).getIkilik()) {
							insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 1) {
						if (insan.BasketbolKartListesi.get(2).getSerbestAtiş() > pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
							insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(2).getSerbestAtiş() < pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
							insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 2) {
						if (insan.BasketbolKartListesi.get(2).getUcluk() > pc.BasketbolKartListesi.get(y).getUcluk()) {
							insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(2).getUcluk() < pc.BasketbolKartListesi.get(y).getUcluk()) {
							insan.BasketbolKartListesi.get(2).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					}
				}
				jTextField_isim.setText(Integer.toString(insan.getSkor()));
				jTextField_bilgisayar.setText(Integer.toString(pc.getSkor()));
			}
		}
		Thread t1 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(2).kartKullamıldiMi == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					jButtonib3.setVisible(false);
					cik++;
					bsayi++;
					b--;
					oyun.sayi.remove(a);
					if (cik == 8) {
						String text = "";
						if (pc.getSkor() > insan.getSkor()) {
							text += pc.getOyuncuAdi();
						} else if (pc.getSkor() < insan.getSkor()) {
							text += insan.getOyuncuAdi();
						} else if (pc.getSkor() == insan.getSkor()) {
							text += "yok.Oyun berabere bitti";
						}

						JOptionPane.showMessageDialog(jPanel1, "Oyun Bitti");
							JOptionPane.showMessageDialog(jPanel1,"Puanlar\n"+insan.getOyuncuAdi()+":"+insan.SkorGoster()+"\nBilgisayar:"+pc.SkorGoster() );
						JOptionPane.showMessageDialog(jPanel1, "Kazanan " + text);
					}
				}
			}

		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(2).kartKullamıldiMi == true) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					if (y == 0) {
						jButtonbb1.setVisible(false);

					}
					if (y == 1) {
						jButtonbb2.setVisible(false);

					}
					if (y == 2) {
						jButtonbb3.setVisible(false);

					}
					if (y == 3) {
						jButtonbb4.setVisible(false);

					}
				}

			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(2).kartKullamıldiMi == false) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}

					jButtonbb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonib3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
				}
			}

		};
		t3.start();
	}

	private void jButtonib2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (((fsay - 1) == bsay) || fsayi == 4) {
			bsay++;

			String ozellik = "";
			ozellik += insan.BasketbolKartListesi.get(1).sporcuPuaniGoster();
			jTextField_insan_ozellik.setText(ozellik);
			if (insan.BasketbolKartListesi.get(1).kartKullamıldiMi == false) {
				String adinsan = insan.BasketbolKartListesi.get(1).getSporcuIsim() + ".jpg";
				System.out.println("---" + adinsan + "--");

				jButtonib2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adinsan)));

				a = r.nextInt(b);
				y = (int) oyun.sayi.get(a);

				String adbilgisayar = pc.BasketbolKartListesi.get(y).getSporcuIsim() + ".jpg";
				System.out.println("---" + adbilgisayar + "--");

				if (y == 0) {
					jButtonbb1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(0).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 1) {
					jButtonbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(1).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 2) {
					jButtonbb3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(2).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 3) {
					jButtonbb4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(3).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				pozisyon = Test.pozisyonBilgisi();
				if (cik == 7) {
					jLabel_pozisyon.setText(" ");
					if (insan.BasketbolKartListesi.get(1).getIkilik() > pc.BasketbolKartListesi.get(y).getIkilik()) {
						insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(1).getIkilik() < pc.BasketbolKartListesi.get(y).getIkilik()) {
						insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(1).getSerbestAtiş() > pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
						insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(1).getSerbestAtiş() < pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
						insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(1).getUcluk() > pc.BasketbolKartListesi.get(y).getUcluk()) {
						insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(1).getUcluk() < pc.BasketbolKartListesi.get(y).getUcluk()) {
						insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else {
						insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;

					}
				} else {
					jLabel_pozisyon.setText(Integer.toString(pozisyon + 1));
					if (pozisyon == 0) {
						if (insan.BasketbolKartListesi.get(1).getIkilik() > pc.BasketbolKartListesi.get(y).getIkilik()) {
							insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(1).getIkilik() < pc.BasketbolKartListesi.get(y).getIkilik()) {
							insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 1) {
						if (insan.BasketbolKartListesi.get(1).getSerbestAtiş() > pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
							insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(1).getSerbestAtiş() < pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
							insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 2) {
						if (insan.BasketbolKartListesi.get(1).getUcluk() > pc.BasketbolKartListesi.get(y).getUcluk()) {
							insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(1).getUcluk() < pc.BasketbolKartListesi.get(y).getUcluk()) {
							insan.BasketbolKartListesi.get(1).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					}
				}
				jTextField_isim.setText(Integer.toString(insan.getSkor()));
				jTextField_bilgisayar.setText(Integer.toString(pc.getSkor()));
			}
		}
		Thread t1 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(1).kartKullamıldiMi == true) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					jButtonib2.setVisible(false);
					cik++;
					bsayi++;
					b--;
					oyun.sayi.remove(a);
					if (cik == 8) {
						String text = "";
						if (pc.getSkor() > insan.getSkor()) {
							text += pc.getOyuncuAdi();
						} else if (pc.getSkor() < insan.getSkor()) {
							text += insan.getOyuncuAdi();
						} else if (pc.getSkor() == insan.getSkor()) {
							text += "yok.Oyun berabere bitti";
						}

						JOptionPane.showMessageDialog(jPanel1, "Oyun Bitti");
							JOptionPane.showMessageDialog(jPanel1,"Puanlar\n"+insan.getOyuncuAdi()+":"+insan.SkorGoster()+"\nBilgisayar:"+pc.SkorGoster() );
						JOptionPane.showMessageDialog(jPanel1, "Kazanan " + text);
					}
				}
			}

		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(1).kartKullamıldiMi == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					if (y == 0) {
						jButtonbb1.setVisible(false);

					}
					if (y == 1) {
						jButtonbb2.setVisible(false);

					}
					if (y == 2) {
						jButtonbb3.setVisible(false);

					}
					if (y == 3) {
						jButtonbb4.setVisible(false);

					}

				}

			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(1).kartKullamıldiMi == false) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}

					jButtonbb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonib2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
				}
			}

		};
		t3.start();
	}

	private void jButtonif1ActionPerformed(java.awt.event.ActionEvent evt) {

		if ((fsay == bsay) || bsayi == 4) {
			fsay++;
			String ozellik = "";
			ozellik += insan.FutbolKartListesi.get(0).sporcuPuaniGoster();
			jTextField_insan_ozellik.setText(ozellik);
			if (insan.FutbolKartListesi.get(0).kartKullamıldiMi == false) {
				String adinsan = insan.FutbolKartListesi.get(0).getSporcuIsim() + ".jpg";
				System.out.println("---" + adinsan + "--");
				jButtonif1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adinsan)));
				//Bilgisayar için 0-4 arası random bir sayı alınır.O indisteki kartla kapışılır.
				a = r.nextInt(c);
				y = (int) pc.sayi.get(a);
				String adbilgisayar = pc.FutbolKartListesi.get(y).getSporcuIsim() + ".jpg";
				System.out.println("---" + adbilgisayar + "--");
				if (y == 0) {
					jButtonbf1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(0).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 1) {
					jButtonbf2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(1).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 2) {
					jButtonbf3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(2).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 3) {
					jButtonbf4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(3).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				pozisyon = Test.pozisyonBilgisi();
				
				if (cik == 7) {
					jLabel_pozisyon.setText(" ");
					if (insan.FutbolKartListesi.get(0).getKaleciyleKarşiKarşiya() > pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {

						insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(0).getKaleciyleKarşiKarşiya() < pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
						insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(0).getPenaltı() > pc.FutbolKartListesi.get(y).getPenaltı()) {
						insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(0).getPenaltı() < pc.FutbolKartListesi.get(y).getPenaltı()) {
						insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(0).getSerbestVurus() > pc.FutbolKartListesi.get(y).getSerbestVurus()) {
						insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(0).getSerbestVurus() < pc.FutbolKartListesi.get(y).getSerbestVurus()) {
						insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else {
						insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
					}
				} else {
					jLabel_pozisyon.setText(Integer.toString(pozisyon + 1));
					if (pozisyon == 0) {
						if (insan.FutbolKartListesi.get(0).getKaleciyleKarşiKarşiya() > pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {

							insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(0).getKaleciyleKarşiKarşiya() < pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
							insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 1) {
						if (insan.FutbolKartListesi.get(0).getPenaltı() > pc.FutbolKartListesi.get(y).getPenaltı()) {
							insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(0).getPenaltı() < pc.FutbolKartListesi.get(y).getPenaltı()) {
							insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 2) {
						if (insan.FutbolKartListesi.get(0).getSerbestVurus() > pc.FutbolKartListesi.get(y).getSerbestVurus()) {
							insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(0).getSerbestVurus() < pc.FutbolKartListesi.get(y).getSerbestVurus()) {
							insan.FutbolKartListesi.get(0).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					}
				}
				jTextField_isim.setText(Integer.toString(insan.getSkor()));
				jTextField_bilgisayar.setText(Integer.toString(pc.getSkor()));
			}
		}
		Thread t1 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(0).kartKullamıldiMi == true) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					jButtonif1.setVisible(false);
					cik++;
					fsayi++;
					//kullanılan indisteki sayı siliniyor.
					c--;
					pc.sayi.remove(a);
					if (cik == 8) {
						String text = "";
						if (pc.getSkor() > insan.getSkor()) {
							text += pc.getOyuncuAdi();
						} else if (pc.getSkor() < insan.getSkor()) {
							text += insan.getOyuncuAdi();
						} else if (pc.getSkor() == insan.getSkor()) {
							text += "yok.Oyun berabere bitti";
						}

						JOptionPane.showMessageDialog(jPanel1, "Oyun Bitti");
							JOptionPane.showMessageDialog(jPanel1,"Puanlar\n"+insan.getOyuncuAdi()+":"+insan.SkorGoster()+"\nBilgisayar:"+pc.SkorGoster() );
						JOptionPane.showMessageDialog(jPanel1, "Kazanan " + text);
					}
				}
			}

		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(0).kartKullamıldiMi == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					if (y == 0) {
						jButtonbf1.setVisible(false);

					}
					if (y == 1) {
						jButtonbf2.setVisible(false);

					}
					if (y == 2) {
						jButtonbf3.setVisible(false);

					}
					if (y == 3) {
						jButtonbf4.setVisible(false);
					}

				}

			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(0).kartKullamıldiMi == false) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}

					jButtonbf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonif1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
				}
			}
		};
		t3.start();
	}

	private void jButtonib1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (((fsay - 1) == bsay) || fsayi == 4) {
			bsay++;
			String ozellik = "";
			ozellik += insan.BasketbolKartListesi.get(0).sporcuPuaniGoster();
			jTextField_insan_ozellik.setText(ozellik);
			if (insan.BasketbolKartListesi.get(0).kartKullamıldiMi == false) {
				String adinsan = insan.BasketbolKartListesi.get(0).getSporcuIsim() + ".jpg";
				System.out.println("---" + adinsan + "--");

				jButtonib1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adinsan)));
				a = r.nextInt(b);
				y = (int) oyun.sayi.get(a);

				String adbilgisayar = pc.BasketbolKartListesi.get(y).getSporcuIsim() + ".jpg";
				System.out.println("---" + adbilgisayar + "--");
				if (y == 0) {
					jButtonbb1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(0).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 1) {
					jButtonbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(1).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 2) {
					jButtonbb3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(2).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 3) {
					jButtonbb4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.BasketbolKartListesi.get(3).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				pozisyon = Test.pozisyonBilgisi();
				
				if (cik == 7) {
					jLabel_pozisyon.setText(" ");
					if (insan.BasketbolKartListesi.get(0).getIkilik() > pc.BasketbolKartListesi.get(y).getIkilik()) {
						insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(0).getIkilik() < pc.BasketbolKartListesi.get(y).getIkilik()) {
						insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(0).getSerbestAtiş() > pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
						insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(0).getSerbestAtiş() < pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
						insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(0).getUcluk() > pc.BasketbolKartListesi.get(y).getUcluk()) {
						insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.BasketbolKartListesi.get(0).getUcluk() < pc.BasketbolKartListesi.get(y).getUcluk()) {
						insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else {
						insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;

					}
				} else {
					jLabel_pozisyon.setText(Integer.toString(pozisyon + 1));
					if (pozisyon == 0) {
						if (insan.BasketbolKartListesi.get(0).getIkilik() > pc.BasketbolKartListesi.get(y).getIkilik()) {
							insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(0).getIkilik() < pc.BasketbolKartListesi.get(y).getIkilik()) {
							insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 1) {
						if (insan.BasketbolKartListesi.get(0).getSerbestAtiş() > pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
							insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(0).getSerbestAtiş() < pc.BasketbolKartListesi.get(y).getSerbestAtiş()) {
							insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 2) {
						if (insan.BasketbolKartListesi.get(0).getUcluk() > pc.BasketbolKartListesi.get(y).getUcluk()) {
							insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.BasketbolKartListesi.get(0).getUcluk() < pc.BasketbolKartListesi.get(y).getUcluk()) {
							insan.BasketbolKartListesi.get(0).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					}

				}
				jTextField_isim.setText(Integer.toString(insan.getSkor()));
				jTextField_bilgisayar.setText(Integer.toString(pc.getSkor()));
			}
		}
		Thread t1 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(0).kartKullamıldiMi == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					jButtonib1.setVisible(false);
					cik++;
					bsayi++;
					b--;
					oyun.sayi.remove(a);
					if (cik == 8) {
						String text = "";
						if (pc.getSkor() > insan.getSkor()) {
							text += pc.getOyuncuAdi();
						} else if (pc.getSkor() < insan.getSkor()) {
							text += insan.getOyuncuAdi();
						} else if (pc.getSkor() == insan.getSkor()) {
							text += "yok.Oyun berabere bitti";
						}

						JOptionPane.showMessageDialog(jPanel1, "Oyun Bitti");
							JOptionPane.showMessageDialog(jPanel1,"Puanlar\n"+insan.getOyuncuAdi()+":"+insan.SkorGoster()+"\nBilgisayar:"+pc.SkorGoster() );
						JOptionPane.showMessageDialog(jPanel1, "Kazanan " + text);
					}
				}
			}

		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(0).kartKullamıldiMi == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					if (y == 0) {
						jButtonbb1.setVisible(false);

					}
					if (y == 1) {
						jButtonbb2.setVisible(false);

					}
					if (y == 2) {
						jButtonbb3.setVisible(false);

					}
					if (y == 3) {
						jButtonbb4.setVisible(false);

					}

				}

			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				if (insan.BasketbolKartListesi.get(0).kartKullamıldiMi == false) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}

					jButtonbb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonbb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
					jButtonib1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/basketbol.png")));
				}
			}

		};
		t3.start();
	}

	private void jButtonif4ActionPerformed(java.awt.event.ActionEvent evt) {
		if ((fsay == bsay) || bsayi == 4) {
			fsay++;

			String ozellik = "";
			ozellik += insan.FutbolKartListesi.get(3).sporcuPuaniGoster();
			jTextField_insan_ozellik.setText(ozellik);
			if (insan.FutbolKartListesi.get(3).kartKullamıldiMi == false) {
				String adinsan = insan.FutbolKartListesi.get(3).getSporcuIsim() + ".jpg";
				System.out.println("---" + adinsan + "--");

				jButtonif4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adinsan)));

				a = r.nextInt(c);
				y = (int) pc.sayi.get(a);

				String adbilgisayar = pc.FutbolKartListesi.get(y).getSporcuIsim() + ".jpg";
				System.out.println("---" + adbilgisayar + "--");

				if (y == 0) {
					jButtonbf1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(0).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 1) {
					jButtonbf2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(1).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 2) {
					jButtonbf3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(2).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 3) {
					jButtonbf4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(3).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				pozisyon = Test.pozisyonBilgisi();
				
				if (cik == 7) {
					jLabel_pozisyon.setText(" ");
					if (insan.FutbolKartListesi.get(3).getKaleciyleKarşiKarşiya() > pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {

						insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(3).getKaleciyleKarşiKarşiya() < pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
						insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(3).getPenaltı() > pc.FutbolKartListesi.get(y).getPenaltı()) {
						insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(3).getPenaltı() < pc.FutbolKartListesi.get(y).getPenaltı()) {
						insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(3).getSerbestVurus() > pc.FutbolKartListesi.get(y).getSerbestVurus()) {
						insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(3).getSerbestVurus() < pc.FutbolKartListesi.get(y).getSerbestVurus()) {
						insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else {
						insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
					}
				} else {
					jLabel_pozisyon.setText(Integer.toString(pozisyon + 1));
					if (pozisyon == 0) {
						if (insan.FutbolKartListesi.get(3).getKaleciyleKarşiKarşiya() > pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
							insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(3).getKaleciyleKarşiKarşiya() < pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
							insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 1) {
						if (insan.FutbolKartListesi.get(3).getPenaltı() > pc.FutbolKartListesi.get(y).getPenaltı()) {
							insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(3).getPenaltı() < pc.FutbolKartListesi.get(y).getPenaltı()) {
							insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 2) {
						if (insan.FutbolKartListesi.get(3).getSerbestVurus() > pc.FutbolKartListesi.get(y).getSerbestVurus()) {
							insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(3).getSerbestVurus() < pc.FutbolKartListesi.get(y).getSerbestVurus()) {
							insan.FutbolKartListesi.get(3).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					}
				}
				jTextField_isim.setText(Integer.toString(insan.getSkor()));
				jTextField_bilgisayar.setText(Integer.toString(pc.getSkor()));
			}
		}
		Thread t1 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(3).kartKullamıldiMi == true) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					jButtonif4.setVisible(false);
					cik++;
					fsayi++;
					c--;
					pc.sayi.remove(a);
					if (cik == 8) {
						String text = "";
						if (pc.getSkor() > insan.getSkor()) {
							text += pc.getOyuncuAdi();
						} else if (pc.getSkor() < insan.getSkor()) {
							text += insan.getOyuncuAdi();
						} else if (pc.getSkor() == insan.getSkor()) {
							text += "yok.Oyun berabere bitti";
						}

						JOptionPane.showMessageDialog(jPanel1, "Oyun Bitti");
							JOptionPane.showMessageDialog(jPanel1,"Puanlar\n"+insan.getOyuncuAdi()+":"+insan.SkorGoster()+"\nBilgisayar:"+pc.SkorGoster() );
						JOptionPane.showMessageDialog(jPanel1, "Kazanan " + text);
					}
				}
			}

		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(3).kartKullamıldiMi == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					if (y == 0) {
						jButtonbf1.setVisible(false);

					}
					if (y == 1) {
						jButtonbf2.setVisible(false);

					}
					if (y == 2) {
						jButtonbf3.setVisible(false);

					}
					if (y == 3) {
						jButtonbf4.setVisible(false);

					}

				}

			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(3).kartKullamıldiMi == false) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}

					jButtonbf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonif4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
				}
			}
		};
		t3.start();
	}

	private void jButtonif3ActionPerformed(java.awt.event.ActionEvent evt) {
		if ((fsay == bsay) || bsayi == 4) {
			fsay++;
			String ozellik = "";
			ozellik += insan.FutbolKartListesi.get(2).sporcuPuaniGoster();
			jTextField_insan_ozellik.setText(ozellik);
			if (insan.FutbolKartListesi.get(2).kartKullamıldiMi == false) {
				String adinsan = insan.FutbolKartListesi.get(2).getSporcuIsim() + ".jpg";
				System.out.println("---" + adinsan + "--");

				jButtonif3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adinsan)));

				a = r.nextInt(c);
				y = (int) pc.sayi.get(a);

				String adbilgisayar = pc.FutbolKartListesi.get(y).getSporcuIsim() + ".jpg";
				System.out.println("---" + adbilgisayar + "--");

				if (y == 0) {
					jButtonbf1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(0).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 1) {
					jButtonbf2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(1).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 2) {
					jButtonbf3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(2).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 3) {
					jButtonbf4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(3).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				pozisyon = Test.pozisyonBilgisi();
				
				if (cik == 7) {
					jLabel_pozisyon.setText(" ");
					if (insan.FutbolKartListesi.get(2).getKaleciyleKarşiKarşiya() > pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {

						insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(2).getKaleciyleKarşiKarşiya() < pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
						insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(2).getPenaltı() > pc.FutbolKartListesi.get(y).getPenaltı()) {
						insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(2).getPenaltı() < pc.FutbolKartListesi.get(y).getPenaltı()) {
						insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(2).getSerbestVurus() > pc.FutbolKartListesi.get(y).getSerbestVurus()) {
						insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(2).getSerbestVurus() < pc.FutbolKartListesi.get(y).getSerbestVurus()) {
						insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else {
						insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
					}
				} else {
					jLabel_pozisyon.setText(Integer.toString(pozisyon + 1));
					if (pozisyon == 0) {
						if (insan.FutbolKartListesi.get(2).getKaleciyleKarşiKarşiya() > pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
							insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(2).getKaleciyleKarşiKarşiya() < pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
							insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 1) {
						if (insan.FutbolKartListesi.get(2).getPenaltı() > pc.FutbolKartListesi.get(y).getPenaltı()) {
							insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(2).getPenaltı() < pc.FutbolKartListesi.get(y).getPenaltı()) {
							insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 2) {
						if (insan.FutbolKartListesi.get(2).getSerbestVurus() > pc.FutbolKartListesi.get(y).getSerbestVurus()) {
							insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(2).getSerbestVurus() < pc.FutbolKartListesi.get(y).getSerbestVurus()) {
							insan.FutbolKartListesi.get(2).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					}
				}
				jTextField_isim.setText(Integer.toString(insan.getSkor()));
				jTextField_bilgisayar.setText(Integer.toString(pc.getSkor()));
			}
		}
		Thread t1 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(2).kartKullamıldiMi == true) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					jButtonif3.setVisible(false);
					cik++;
					fsayi++;
					c--;
					pc.sayi.remove(a);
					if (cik == 8) {
						String text = "";
						if (pc.getSkor() > insan.getSkor()) {
							text += pc.getOyuncuAdi();
						} else if (pc.getSkor() < insan.getSkor()) {
							text += insan.getOyuncuAdi();
						} else if (pc.getSkor() == insan.getSkor()) {
							text += "yok.Oyun berabere bitti";
						}

						JOptionPane.showMessageDialog(jPanel1, "Oyun Bitti");
							JOptionPane.showMessageDialog(jPanel1,"Puanlar\n"+insan.getOyuncuAdi()+":"+insan.SkorGoster()+"\nBilgisayar:"+pc.SkorGoster() );
						JOptionPane.showMessageDialog(jPanel1, "Kazanan " + text);
					}
				}
			}

		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(2).kartKullamıldiMi == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					if (y == 0) {
						jButtonbf1.setVisible(false);

					}
					if (y == 1) {
						jButtonbf2.setVisible(false);

					}
					if (y == 2) {
						jButtonbf3.setVisible(false);

					}
					if (y == 3) {
						jButtonbf4.setVisible(false);

					}

				}

			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(2).kartKullamıldiMi == false) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}

					jButtonbf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonif3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
				}
			}
		};
		t3.start();
	}

	private void jButtonif2ActionPerformed(java.awt.event.ActionEvent evt) {
		if ((fsay == bsay) || bsayi == 4) {
			fsay++;
			String ozellik = "";
			ozellik += insan.FutbolKartListesi.get(1).sporcuPuaniGoster();
			jTextField_insan_ozellik.setText(ozellik);
			if (insan.FutbolKartListesi.get(1).kartKullamıldiMi == false) {
				String adinsan = insan.FutbolKartListesi.get(1).getSporcuIsim() + ".jpg";
				System.out.println("---" + adinsan + "--");

				jButtonif2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adinsan)));

				a = r.nextInt(c);
				y = (int) pc.sayi.get(a);

				String adbilgisayar = pc.FutbolKartListesi.get(y).getSporcuIsim() + ".jpg";
				System.out.println("---" + adbilgisayar + "--");

				if (y == 0) {
					jButtonbf1.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(0).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 1) {
					jButtonbf2.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(1).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 2) {
					jButtonbf3.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(2).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				if (y == 3) {
					jButtonbf4.setIcon(new javax.swing.ImageIcon(getClass().getResource(adbilgisayar)));
					ozellik = "";
					ozellik += pc.FutbolKartListesi.get(3).sporcuPuaniGoster();
					jTextField_pc_ozellik.setText(ozellik);
				}
				pozisyon = Test.pozisyonBilgisi();
				
				if (cik == 7) {
					jLabel_pozisyon.setText(" ");
					if (insan.FutbolKartListesi.get(1).getKaleciyleKarşiKarşiya() > pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {

						insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(1).getKaleciyleKarşiKarşiya() < pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
						insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(1).getPenaltı() > pc.FutbolKartListesi.get(y).getPenaltı()) {
						insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(1).getPenaltı() < pc.FutbolKartListesi.get(y).getPenaltı()) {
						insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(1).getSerbestVurus() > pc.FutbolKartListesi.get(y).getSerbestVurus()) {
						insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
						insan.setSkor(insan.getSkor() + 10);
					} else if (insan.FutbolKartListesi.get(1).getSerbestVurus() < pc.FutbolKartListesi.get(y).getSerbestVurus()) {
						insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
						pc.setSkor(pc.getSkor() + 10);
					} else {
						insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
					}
				} else {
					jLabel_pozisyon.setText(Integer.toString(pozisyon + 1));
					if (pozisyon == 0) {
						if (insan.FutbolKartListesi.get(1).getKaleciyleKarşiKarşiya() > pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
							insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(1).getKaleciyleKarşiKarşiya() < pc.FutbolKartListesi.get(y).getKaleciyleKarşiKarşiya()) {
							insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					}
					if (pozisyon == 1) {
						if (insan.FutbolKartListesi.get(1).getPenaltı() > pc.FutbolKartListesi.get(y).getPenaltı()) {
							insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(1).getPenaltı() < pc.FutbolKartListesi.get(y).getPenaltı()) {
							insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					} else if (pozisyon == 2) {
						if (insan.FutbolKartListesi.get(1).getSerbestVurus() > pc.FutbolKartListesi.get(y).getSerbestVurus()) {
							insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
							insan.setSkor(insan.getSkor() + 10);
						} else if (insan.FutbolKartListesi.get(1).getSerbestVurus() < pc.FutbolKartListesi.get(y).getSerbestVurus()) {
							insan.FutbolKartListesi.get(1).kartKullamıldiMi = true;
							pc.setSkor(pc.getSkor() + 10);
						}
					}
				}
				jTextField_isim.setText(Integer.toString(insan.getSkor()));
				jTextField_bilgisayar.setText(Integer.toString(pc.getSkor()));
			}
		}
		Thread t1 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(1).kartKullamıldiMi == true) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					jButtonif2.setVisible(false);
					cik++;
					fsayi++;
					c--;
					pc.sayi.remove(a);
					if (cik == 8) {
						String text = "";
						if (pc.getSkor() > insan.getSkor()) {
							text += pc.getOyuncuAdi();
						} else if (pc.getSkor() < insan.getSkor()) {
							text += insan.getOyuncuAdi();
						} else if (pc.getSkor() == insan.getSkor()) {
							text += "yok.Oyun berabere bitti";
						}

						JOptionPane.showMessageDialog(jPanel1, "Oyun Bitti");
							JOptionPane.showMessageDialog(jPanel1,"Puanlar\n"+insan.getOyuncuAdi()+":"+insan.SkorGoster()+"\nBilgisayar:"+pc.SkorGoster() );
						JOptionPane.showMessageDialog(jPanel1, "Kazanan " + text);
					}
				}
			}

		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(1).kartKullamıldiMi == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}
					if (y == 0) {
						jButtonbf1.setVisible(false);

					}
					if (y == 1) {
						jButtonbf2.setVisible(false);

					}
					if (y == 2) {
						jButtonbf3.setVisible(false);

					}
					if (y == 3) {
						jButtonbf4.setVisible(false);

					}

				}

			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				if (insan.FutbolKartListesi.get(1).kartKullamıldiMi == false) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
					}

					jButtonbf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonbf4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
					jButtonif2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/futbol.png")));
				}
			}
		};
		t3.start();
	}

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Test().setVisible(true);
			}
		});

	}

	public static int pozisyonBilgisi() {
		Random r = new Random();
		int a;
		a = r.nextInt(3);
		return a;
	}

	// Variables declaration - do not modify                     
	private javax.swing.JButton jButton_basla;
	private javax.swing.JButton jButtonbb1;
	private javax.swing.JButton jButtonbb2;
	private javax.swing.JButton jButtonbb3;
	private javax.swing.JButton jButtonbb4;
	private javax.swing.JButton jButtonbf1;
	private javax.swing.JButton jButtonbf2;
	private javax.swing.JButton jButtonbf3;
	private javax.swing.JButton jButtonbf4;
	private javax.swing.JButton jButtonib1;
	private javax.swing.JButton jButtonib2;
	private javax.swing.JButton jButtonib3;
	private javax.swing.JButton jButtonib4;
	private javax.swing.JButton jButtonif1;
	private javax.swing.JButton jButtonif2;
	private javax.swing.JButton jButtonif3;
	private javax.swing.JButton jButtonif4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel_bilgisayar;
	private javax.swing.JLabel jLabel_insan;
	private javax.swing.JLabel jLabel_isim;
	private javax.swing.JLabel jLabel_pozisyon;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel_bilgisayar;
	private javax.swing.JPanel jPanel_degerler;
	private javax.swing.JPanel jPanel_giris;
	private javax.swing.JPanel jPanel_insan;
	private javax.swing.JPanel jPanel_skor;
	private javax.swing.JTextField jTextField_bilgisayar;
	private javax.swing.JTextField jTextField_giris_adi;
	private javax.swing.JTextField jTextField_insan_ozellik;
	private javax.swing.JTextField jTextField_isim;
	private javax.swing.JTextField jTextField_pc_ozellik;
	// End of variables declaration                   
}







