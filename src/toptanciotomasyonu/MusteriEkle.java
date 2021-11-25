package toptanciotomasyonu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Habib
 */
public class MusteriEkle extends FrameGenel {
private int MusteriMevcut =0;
GenelClass gc;

	static DbConnect db;
    public MusteriEkle() {  
        initComponents();
        
        Guncelledengelen();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMAdSoyad = new javax.swing.JTextField();
        txtMKodu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMTelefon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMCinsiyet = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbMDurum = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaMAdres = new javax.swing.JTextArea();
        btnMKaydet = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Müşteri Ekle");
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ad Soyad");

        txtMAdSoyad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMAdSoyad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMAdSoyad.setBorder(null);
        txtMAdSoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMAdSoyadActionPerformed(evt);
            }
        });

        txtMKodu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMKodu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMKodu.setToolTipText("");
        txtMKodu.setBorder(null);
        txtMKodu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKoduActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Müşteri Kodu");

        txtMTelefon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMTelefon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMTelefon.setBorder(null);
        txtMTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMTelefonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefon");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cinsiyet");

        cmbMCinsiyet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiminiz", "Erkek", "Kadın" }));
        cmbMCinsiyet.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Durum");

        cmbMDurum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Pasif" }));
        cmbMDurum.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Adres");

        txtareaMAdres.setColumns(20);
        txtareaMAdres.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtareaMAdres.setRows(5);
        txtareaMAdres.setBorder(null);
        jScrollPane1.setViewportView(txtareaMAdres);

        btnMKaydet.setBackground(new java.awt.Color(255, 255, 255));
        btnMKaydet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMKaydet.setForeground(new java.awt.Color(28, 14, 83));
        btnMKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Save_48px_4.png"))); // NOI18N
        btnMKaydet.setText("Kaydet");
        btnMKaydet.setBorder(null);
        btnMKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMKaydetActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Add User Male_104px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator7)
                            .addComponent(jSeparator6)
                            .addComponent(txtMTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(txtMKodu)
                            .addComponent(jSeparator4)
                            .addComponent(cmbMCinsiyet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator5)
                            .addComponent(cmbMDurum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(btnMKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbMCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(cmbMDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnMKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMAdSoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMAdSoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMAdSoyadActionPerformed

    private void txtMKoduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKoduActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKoduActionPerformed

    private void txtMTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMTelefonActionPerformed

    private void btnMKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMKaydetActionPerformed
      try {
					if (btnMKaydet.getText()=="Güncelle") {
                                           
						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog (null, "Müşteri Kodu : "+txtMKodu.getText()+" Olan Müşteriyi Gerçekten Güncellemek İstiyormusunuz ?","Warning",dialogButton);
							if(dialogResult == JOptionPane.YES_OPTION)
							{   
								Guncelle(); 
								if(MusteriMevcut==1&&cmbMCinsiyet.getSelectedIndex()!=0)
								{
								FormTemizle();
								setVisible(false); 
								}
								else if(txtMKodu.getText().trim().equals(""))
									JOptionPane.showMessageDialog(null, "Lütfen Müşteri Kodunu Boş Bırakmayınız");
								else if(MusteriMevcut==0)
									JOptionPane.showMessageDialog(null, "Lütfen Güncellenecek Olan Müşteri'nin, Kodunu Var olan  Bir Müşteri Kodu olarak Girin");
								else if(cmbMCinsiyet.getSelectedIndex()==0)
									JOptionPane.showMessageDialog(null, "Lütfen Cinsiyeti Seçiniz");
							}
							else
								JOptionPane.showMessageDialog(null, "Güncelleme İşlemi İptal Edildi");
					}
					else
					MusteriEkle();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    }//GEN-LAST:event_btnMKaydetActionPerformed

    public static void main(String args[]) {
     
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusteriEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

  
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnMKaydet;
    private javax.swing.JComboBox<String> cmbMCinsiyet;
    private javax.swing.JComboBox<String> cmbMDurum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtMAdSoyad;
    private javax.swing.JTextField txtMKodu;
    private javax.swing.JTextField txtMTelefon;
    private javax.swing.JTextArea txtareaMAdres;
    // End of variables declaration//GEN-END:variables

    
    void MusteriEkle()throws SQLException 
	{
		MusteriMevcut=0;
		MusteriMevcutKontrol();
		db=new DbConnect();
		try
		{	
			if(cmbMCinsiyet.getSelectedIndex()!=0)
		{
				if(MusteriMevcut==0){
				String query="insert into Musteri (MusteriKodu,AdSoyad,Telefon,Cinsiyet,MDurum,Adres) values (?,?,?,?,?,?)";
				PreparedStatement komut=db.con.prepareStatement(query);
			    komut.setString(1, txtMKodu.getText());
				komut.setString(2, txtMAdSoyad.getText());
				komut.setString(3, txtMTelefon.getText());
				komut.setObject(4, cmbMCinsiyet.getSelectedItem());
				komut.setObject(5, cmbMDurum.getSelectedItem());
				komut.setString(6, txtareaMAdres.getText());
				komut.executeUpdate();
				JOptionPane.showMessageDialog(null, "Müşteri Başarılı Birşekilde Kaydedildi");
				}
			else
			JOptionPane.showMessageDialog(null, "Bu Müşteri Kodu Başka Bir Müşterimizde Kayıtlıdır. Lütfen Farklı Bir Müşteri Kodu Girin");
		}
		else
			JOptionPane.showMessageDialog(null, "Cinsiyeti Seçiniz");
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
	void Guncelle()throws SQLException 
	{
		MusteriMevcut=0;
		MusteriMevcutKontrol();
		try{
			if (MusteriMevcut==1&&cmbMCinsiyet.getSelectedIndex()!=0&&!(txtMKodu.getText().trim().equals(""))) {
				db=new DbConnect();
				 PreparedStatement komut;
				 	String query="update Musteri  set AdSoyad ='"+txtMAdSoyad.getText()+"', MusteriKodu='"+txtMKodu.getText()+"',Telefon='"+txtMTelefon.getText()+"',MDurum='"+cmbMDurum.getSelectedItem()+"',Cinsiyet='"+cmbMCinsiyet.getSelectedItem()+"',Adres='"+txtareaMAdres.getText()+"' where MusteriKodu ='"+txtMKodu.getText()+"'";
					komut=db.con.prepareStatement(query);
					komut.executeUpdate();
					JOptionPane.showMessageDialog(null, "Müşteri Başarılı Birşekilde Güncellendi");
                                        
			}
			
			
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
	void MusteriMevcutKontrol()
	{		
		try {
			db=new DbConnect();
			String query="select MusteriKodu from Musteri where MusteriKodu='"+txtMKodu.getText().trim()+"'";
			PreparedStatement komut;
			komut = db.con.prepareStatement(query);
			ResultSet rs = komut.executeQuery();
			if(rs.next())
			{
				MusteriMevcut=1;		
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void FormTemizle()
	{
		//txt combobox temizlik
		txtareaMAdres.setText("");
		txtMAdSoyad.setText("");
		txtMKodu.setText("");
		txtMTelefon.setText("");
		cmbMCinsiyet.setSelectedItem("Seçiminiz");
		cmbMDurum.setSelectedItem("Aktif");
		
	}
	void Guncelledengelen()
	{
		txtMAdSoyad.setText(gc.MusteriAdSoyad.toString());
		txtMKodu.setText(gc.MusteriKodu);
		txtMTelefon.setText(gc.MusteriTelefon.toString());
		cmbMCinsiyet.setSelectedItem(gc.MusteriCinsiyet.toString());
		cmbMDurum.setSelectedItem(gc.MusteriDurum.toString());
		txtareaMAdres.setText(gc.MusteriAdres.toString());
	}
    
    
}





