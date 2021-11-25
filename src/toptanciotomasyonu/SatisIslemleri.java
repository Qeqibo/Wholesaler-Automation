package toptanciotomasyonu;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author Habib
 */
public class SatisIslemleri extends FrameGenel {
    static DbConnect db;
    GenelClass gc;
     DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd");
    public SatisIslemleri() {
        initComponents();
        MusteriComboBoxDoldur();
        this.setLocationRelativeTo(null);//Formun Ortada Açılmasını Sağlar
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        dateislemtarihi = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        btnIslemGerceklestir = new javax.swing.JButton();
        cmbMusteriAdi = new javax.swing.JComboBox<>();
        PanelDetay = new javax.swing.JPanel();
        txtUrunFiyat = new javax.swing.JTextField();
        cmbUrunAdi = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        IslemTuru = new javax.swing.JLabel();
        txtislemTuru = new javax.swing.JTextField();
        IslemTuru1 = new javax.swing.JLabel();
        txturunadedi = new javax.swing.JTextField();
        txtToplamFiyat = new javax.swing.JTextField();
        ToplamFiyat = new javax.swing.JLabel();
        IslemTuru2 = new javax.swing.JLabel();
        txturunstokAdedi = new javax.swing.JTextField();
        UrunFiyatAd = new javax.swing.JLabel();
        btnKayit = new javax.swing.JButton();
        txtmid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbIslemTuru = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Satış İşlemleri");
        setBackground(new java.awt.Color(51, 204, 255));
        setIconImage(null);
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateislemtarihi.setFormats(dateFormat);
        dateislemtarihi.setBackground(new java.awt.Color(255, 255, 255));
        dateislemtarihi.setForeground(new java.awt.Color(0, 0, 0));
        dateislemtarihi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateislemtarihiMouseExited(evt);
            }
        });
        dateislemtarihi.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                dateislemtarihiCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                dateislemtarihiİnputMethodTextChanged(evt);
            }
        });
        dateislemtarihi.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                dateislemtarihiVetoableChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("(id)");

        btnIslemGerceklestir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/satisIslemi.png"))); // NOI18N
        btnIslemGerceklestir.setText("Islemi  Gerçeklestir");
        btnIslemGerceklestir.setBorder(null);
        btnIslemGerceklestir.setEnabled(false);
        btnIslemGerceklestir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIslemGerceklestir.setIconTextGap(3);
        btnIslemGerceklestir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIslemGerceklestirActionPerformed(evt);
            }
        });

        cmbMusteriAdi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbMusteriAdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz" }));
        cmbMusteriAdi.setBorder(null);
        cmbMusteriAdi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMusteriAdiİtemStateChanged(evt);
            }
        });

        PanelDetay.setBackground(new java.awt.Color(255, 0, 102));
        PanelDetay.setToolTipText("");

        txtUrunFiyat.setEnabled(false);

        cmbUrunAdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz" }));
        cmbUrunAdi.setEnabled(false);
        cmbUrunAdi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUrunAdiİtemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Urun Adi");

        IslemTuru.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        IslemTuru.setForeground(new java.awt.Color(255, 255, 255));
        IslemTuru.setText("IslemTuru");

        txtislemTuru.setEnabled(false);

        IslemTuru1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        IslemTuru1.setForeground(new java.awt.Color(255, 255, 255));
        IslemTuru1.setText("Urun Adedi");

        txturunadedi.setEnabled(false);
        txturunadedi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txturunadediKeyReleased(evt);
            }
        });

        txtToplamFiyat.setEnabled(false);

        ToplamFiyat.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        ToplamFiyat.setForeground(new java.awt.Color(255, 255, 255));
        ToplamFiyat.setText("Toplam Fiyat");

        IslemTuru2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        IslemTuru2.setForeground(new java.awt.Color(255, 255, 255));
        IslemTuru2.setText("Stok Adedi");

        txturunstokAdedi.setEnabled(false);

        UrunFiyatAd.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        UrunFiyatAd.setForeground(new java.awt.Color(255, 255, 255));
        UrunFiyatAd.setText("Urun --- Fiyat");

        javax.swing.GroupLayout PanelDetayLayout = new javax.swing.GroupLayout(PanelDetay);
        PanelDetay.setLayout(PanelDetayLayout);
        PanelDetayLayout.setHorizontalGroup(
            PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txturunstokAdedi, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(IslemTuru2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetayLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtUrunFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(PanelDetayLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UrunFiyatAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtislemTuru, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IslemTuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txturunadedi, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(IslemTuru1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtToplamFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToplamFiyat))
                .addContainerGap())
        );
        PanelDetayLayout.setVerticalGroup(
            PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDetayLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDetayLayout.createSequentialGroup()
                        .addGroup(PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IslemTuru2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IslemTuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ToplamFiyat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IslemTuru1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UrunFiyatAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDetayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txturunstokAdedi)
                            .addComponent(txtUrunFiyat)
                            .addComponent(txtislemTuru)
                            .addComponent(txturunadedi)
                            .addComponent(txtToplamFiyat))))
                .addGap(32, 32, 32))
        );

        btnKayit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKayit.setForeground(new java.awt.Color(0, 102, 255));
        btnKayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Save_48px_4.png"))); // NOI18N
        btnKayit.setText("Kayit");
        btnKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitActionPerformed(evt);
            }
        });

        txtmid.setForeground(new java.awt.Color(255, 255, 255));
        txtmid.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtmid.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Islem Tarihi");

        cmbIslemTuru.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbIslemTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Giris", "Cikis" }));
        cmbIslemTuru.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Islem Turu");

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Müşteri Adi ");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Money Bag_104px.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Barcode Scanner 2_104px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator1)
                        .addComponent(cmbMusteriAdi, 0, 132, Short.MAX_VALUE)
                        .addComponent(cmbIslemTuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateislemtarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(235, 235, 235)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelDetay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(314, 314, 314)
                            .addComponent(txtmid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnIslemGerceklestir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbMusteriAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbIslemTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateislemtarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(128, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                            .addComponent(PanelDetay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(btnIslemGerceklestir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIslemGerceklestirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIslemGerceklestirActionPerformed
        try {
            if (!(txturunadedi.getText().trim().equals(""))&&(txturunadedi.getText()=="0")) {
               
                if (gc.urunkontrol==true) 
                {
                    StokAdediKontrol();
                    if (txtislemTuru.getText().equals("Giris")) {
                        StokBakiyeGuncelle(); JOptionPane.showMessageDialog(null, "Stok Bakiye Güncelle Giris Çalıştı"); 
                        Ekle();FormTemizle();
                        
                    }
                    else{//Cikis İse
                    if(!((Integer.parseInt(txturunadedi.getText())>(Integer.parseInt(txturunstokAdedi.getText())))))
                    {  StokBakiyeGuncelle(); JOptionPane.showMessageDialog(null, "Stok Bakiye Güncelle Cikis Çalıştı");  Ekle();FormTemizle();}
                    else
                        JOptionPane.showMessageDialog(null, "Girilen Ürün Adedi Stok Adedinden Küçük Olmalıdır");
                    }
                }
                else
                {StokBakiyeEkle(); JOptionPane.showMessageDialog(null, "Ekle Çalıştı(Yani Stoğa Yeni Ürün Eklendi)");  Ekle();FormTemizle();}
            }
            else
                JOptionPane.showMessageDialog(null, "Lütfen Satış Yapılacak Ürün Adedinizi Giriniz");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnIslemGerceklestirActionPerformed

    private void btnKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitActionPerformed
        if (!(cmbMusteriAdi.getSelectedItem().equals("Seçiniz"))&&!(cmbIslemTuru.getSelectedItem().equals("Seçiniz"))&&!(sysDate.format(dateislemtarihi.getDate()).toString().equals(""))) {
            Aktif();
            Pasif();
        UrunComboBoxDoldur(); 
        }
        else
            JOptionPane.showMessageDialog(null, "Lütfen Boş Alan Bırakmayınız");  
    }//GEN-LAST:event_btnKayitActionPerformed
    private void cmbMusteriAdiİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMusteriAdiİtemStateChanged
         try {
		PreparedStatement komut;
		db=new DbConnect();
		String query="select MusteriID from Musteri where AdSoyad=('"+cmbMusteriAdi.getSelectedItem()+"')";
		komut=db.con.prepareStatement(query);
		ResultSet rs=komut.executeQuery();
		if (rs.next()) 
                 {
		   txtmid.setText(rs.getString("MusteriID"));
                   gc.MusteriID=Integer.parseInt(rs.getString("MusteriID"));
		 }
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
    }//GEN-LAST:event_cmbMusteriAdiİtemStateChanged

    private void cmbUrunAdiİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUrunAdiİtemStateChanged
       try {
		PreparedStatement komut;
		db=new DbConnect();
		String query="select u.UrunID,u.AlisFiyati,u.SatisFiyati,u.UDurum,sb.GMiktari,sb.CMiktari from Urun u left join StokBakiye sb on  u.UrunID =sb.UrunID where UAdi=('"+cmbUrunAdi.getSelectedItem()+"')";
		komut=db.con.prepareStatement(query);
		ResultSet rs=komut.executeQuery();
		if (rs.next()) {
                    gc.UrunStokAdedi=rs.getInt("GMiktari")-rs.getInt("CMiktari");
                    if (cmbIslemTuru.getSelectedItem()=="Giris") {
                        txtUrunFiyat.setText(rs.getString("AlisFiyati"));
                        txturunstokAdedi.setText(""+gc.UrunStokAdedi+"");
                         btnIslemGerceklestir.setEnabled(true);
                         txturunadedi.setEnabled(true);
                         gc.UrunID =Integer.parseInt(rs.getString("UrunID"));

                    }
                    else if(cmbIslemTuru.getSelectedItem().equals("Cikis"))
                    {txtUrunFiyat.setText(rs.getString("SatisFiyati"));
                    txturunstokAdedi.setText(""+gc.UrunStokAdedi+"");
                    }
                    btnIslemGerceklestir.setEnabled(true);
                     txturunadedi.setEnabled(true);
                   
			}
                else{
                    txtUrunFiyat.setText("");
                    txtToplamFiyat.setText("");
                    txturunstokAdedi.setText("");
                    btnIslemGerceklestir.setEnabled(false);
                     txturunadedi.setEnabled(false);
                     
                }
                gc.urunkontrol=false;
                UrunKontrol();
               // JOptionPane.showMessageDialog(null, rando);
                
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
    }//GEN-LAST:event_cmbUrunAdiİtemStateChanged

    private void txturunadediKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txturunadediKeyReleased
     int a=  Integer.parseInt(txtUrunFiyat.getText());
     int b=  Integer.parseInt(txturunadedi.getText()); 
     txtToplamFiyat.setText(""+a*b+"");
  
    }//GEN-LAST:event_txturunadediKeyReleased

    private void dateislemtarihiVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_dateislemtarihiVetoableChange
       
    }//GEN-LAST:event_dateislemtarihiVetoableChange

    private void dateislemtarihiİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dateislemtarihiİnputMethodTextChanged
 
    }//GEN-LAST:event_dateislemtarihiİnputMethodTextChanged

    private void dateislemtarihiCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dateislemtarihiCaretPositionChanged
 
    }//GEN-LAST:event_dateislemtarihiCaretPositionChanged

    private void dateislemtarihiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateislemtarihiMouseExited
       
    }//GEN-LAST:event_dateislemtarihiMouseExited

   
    
   public void Aktif()
    {
    cmbUrunAdi.setEnabled(true);
    txturunadedi.setEnabled(true);
    
    
    }
   public void Pasif()
    {
    cmbMusteriAdi.setEnabled(false);
    cmbIslemTuru.setEnabled(false);
    dateislemtarihi.setEnabled(false);
    btnKayit.setEnabled(false);
    txtislemTuru.setText(cmbIslemTuru.getSelectedItem().toString());
        if (cmbIslemTuru.getSelectedItem()=="Giris"){ 
         UrunFiyatAd.setText("Urun Alis Fiyat");
        }
        else
            UrunFiyatAd.setText("Urun Satis Fiyat");
        
    }
   public void FormTemizle()
    {
    cmbUrunAdi.setSelectedItem("Seçiniz");
    txturunadedi.setText("");
    
    
    }
   void MusteriComboBoxDoldur()
	{	
	try {
		PreparedStatement komut;
		db=new DbConnect();
		String query="select AdSoyad,MusteriID from Musteri";
		komut=db.con.prepareStatement(query);
		ResultSet rs=komut.executeQuery();
		while (rs.next()) {
			cmbMusteriAdi.addItem(rs.getString("AdSoyad"));
			}
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
	}
   void UrunComboBoxDoldur()
	{	
	try {
            db=new DbConnect();
            if (cmbIslemTuru.getSelectedItem().equals("Cikis")) 
            {
                PreparedStatement komut;
		String query="select u.UrunID,u.UAdi,u.AlisFiyati,u.SatisFiyati,u.UDurum,sb.GMiktari,sb.CMiktari from Urun u left join StokBakiye sb on  u.UrunID =sb.UrunID  where sb.GMiktari>sb.CMiktari and sb.GMiktari>0";
		komut=db.con.prepareStatement(query);
		ResultSet rs=komut.executeQuery();
		while (rs.next()) {
			cmbUrunAdi.addItem(rs.getString("UAdi"));
			}
            }
            else{
		PreparedStatement komut;
		String query="select UrunID,UAdi,AlisFiyati,SatisFiyati,UDurum from Urun";
		komut=db.con.prepareStatement(query);
		ResultSet rs=komut.executeQuery();
		while (rs.next()) {
			cmbUrunAdi.addItem(rs.getString("UAdi"));
			}}
	   }
	   catch (SQLException e) {
			
		}
	}
   void Ekle()throws SQLException 
	{
	try{
	    db=new DbConnect();
            String query="insert into HareketMaster (IslemTuru,IslemTarihi) values (?,?)";
            PreparedStatement komut=db.con.prepareStatement(query);
            komut.setString(1, txtislemTuru.getText());
            komut.setString(2, sysDate.format(dateislemtarihi.getDate()).toString());
            komut.executeUpdate();
            String query2="select ID from HareketMaster where IslemTarihi=(?)";
            komut=db.con.prepareStatement(query2);
            komut.setString(1,  sysDate.format(dateislemtarihi.getDate()).toString());
            ResultSet rs=komut.executeQuery();
        if (rs.next()){
            String query3="{call StokHareketEkle(?,?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement callableStatement = db.con.prepareCall(query3);
            callableStatement.setInt(1, rs.getInt("ID"));
            callableStatement.setInt(2, gc.MusteriID);
            callableStatement.setInt(3, gc.UrunID);
            callableStatement.setString(4, cmbUrunAdi.getSelectedItem().toString());
            callableStatement.setString(5, txturunadedi.getText());
            callableStatement.setInt(6, Integer.parseInt(txtUrunFiyat.getText()));
            callableStatement.setInt(7, Integer.parseInt(txtToplamFiyat.getText()));
            callableStatement.setString(8, cmbIslemTuru.getSelectedItem().toString());
            callableStatement.setInt(9, gc.PersonelID);
            callableStatement.setString(10, gc.PersonelAd);
            
            callableStatement.setString(11, sysDate.format(dateislemtarihi.getDate()).toString());                        
        if(callableStatement.executeUpdate()>0)
            JOptionPane.showMessageDialog(null, "Satış İşlemi Başarılı Bir Şekilde Gerçekleştirildi");
        else
            JOptionPane.showMessageDialog(null, "Bilinmeyen Bir Hata Meyadana Geldi");                         
                      }    
	}
	catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "\\Tablo Ekleme Hatası// "+e.toString());
	}
	}
   void StokBakiyeEkle()//Urun Kontrol de Çıkan sonuç ile Ürün var ama Stokta Mevcut Değil ise Bu Metod İle var olan ürünün Stok Girişini Yapıyoruz
   {
       try {
           db =new DbConnect();
           String query ="insert into StokBakiye (UrunID,GMiktari,CMiktari) values(?,?,?)";
           PreparedStatement komut =db.con.prepareCall(query);
           komut.setInt(1, gc.UrunID);//Combobox ta Değişen ItemState changed metodu ile anlık urun ıdsi gc.urunıd ye gönderiliyor burdan onu kullanabiliyoruz
           komut.setInt(2, Integer.parseInt(txturunadedi.getText()));//Alınan Ürün Adedidini Giriş Miktarı Olacağı için GMiktari ye gönderiyoruz.
           komut.setInt(3, 0);//Çıkış miktarı bu metodla ilgisi olmadığı için CMiktari  sadece 0 değer gönderiyoruz.(ekle komutu stok miktarı olmayan bir ürün olduğu için çıkış miktari yazılması o anlık olmaz)
           komut.executeUpdate();
           JOptionPane.showMessageDialog(null, "Ürün Stoğa Eklendi");  
       } catch (Exception e) {
       }
   }
   void StokBakiyeGuncelle()//Urun Stokta Var ise islem Türü ne Bağlı Stok Miktarında Giriş Çıkış İşlemlerinin Yapıldığı Metod
   {
       try {
            db =new DbConnect();
           if (txtislemTuru.getText().equals("Giris")) { 
           String query ="update StokBakiye  set GMiktari=(?) where UrunID="+gc.UrunID+" ";
           PreparedStatement komut =db.con.prepareCall(query);
           komut.setInt(1, Integer.parseInt(txturunadedi.getText())+gc.GMiktari);//Var Olan Stok Giriş Miktarının Üzerine Textboxtaki Urun Adedi İlave Edildi
           komut.executeUpdate();
           JOptionPane.showMessageDialog(null, "Ürün Stok Adedi Artarak Güncellendi");
           }
           else
           {
           String query ="update StokBakiye  set CMiktari=(?) where UrunID="+gc.UrunID+" ";
           PreparedStatement komut =db.con.prepareCall(query);
           komut.setInt(1, Integer.parseInt(txturunadedi.getText())+gc.CMiktari);//Var Olan Stok Çıkış Miktarının Üzerine Textboxtaki Urun Adedi İlave Edildi
           komut.executeUpdate();
           JOptionPane.showMessageDialog(null, "Ürün Stok Adedi Azalarak Güncellendi");
           } 
       } catch (Exception e) {
       }
   }
   void StokAdediKontrol()
   {
      try {
           db=new DbConnect();
            PreparedStatement komut;
	    String query="select GMiktari,CMiktari from StokBakiye where UrunID="+gc.UrunID+"";
	    komut=db.con.prepareStatement(query);
	    ResultSet rs=komut.executeQuery();
	    if (rs.next()) 
            {
		gc.GMiktari=rs.getInt("GMiktari");
                gc.CMiktari=rs.getInt("CMiktari");
	    }
       } catch (Exception e) {
       }
  
   }
    void UrunKontrol()//Ürün Var İse Var Olan Ürün Stok Bakiye Güncelle Metodu Çalıştı, Yok ise Stok Bakiye Ekle Metodu Çalıştı
   {
       try {
           db=new DbConnect();
            PreparedStatement komut;
	    String query="select UrunID from StokBakiye where UrunID="+gc.UrunID+"";
	    komut=db.con.prepareStatement(query);
	    ResultSet rs=komut.executeQuery();
	    if (rs.next()) 
            {
		gc.urunkontrol=true;
	    }
       } catch (Exception e) {
       }
  
   } 
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IslemTuru;
    private javax.swing.JLabel IslemTuru1;
    private javax.swing.JLabel IslemTuru2;
    private javax.swing.JPanel PanelDetay;
    private javax.swing.JLabel ToplamFiyat;
    private javax.swing.JLabel UrunFiyatAd;
    private javax.swing.JButton btnIslemGerceklestir;
    private javax.swing.JButton btnKayit;
    private javax.swing.JComboBox<String> cmbIslemTuru;
    private javax.swing.JComboBox<String> cmbMusteriAdi;
    private javax.swing.JComboBox<String> cmbUrunAdi;
    private org.jdesktop.swingx.JXDatePicker dateislemtarihi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtToplamFiyat;
    private javax.swing.JTextField txtUrunFiyat;
    private javax.swing.JTextField txtislemTuru;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txturunadedi;
    private javax.swing.JTextField txturunstokAdedi;
    // End of variables declaration//GEN-END:variables
}
