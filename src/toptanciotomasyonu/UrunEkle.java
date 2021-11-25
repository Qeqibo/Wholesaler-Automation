
package toptanciotomasyonu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UrunEkle extends FrameGenel {
private int UrunMevcut=0;
	static DbConnect db;
	GenelClass gc;
 
    public UrunEkle() {
      
        initComponents();
        Guncelledengelen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnkaydet = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbUDurum = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSatisFiyat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAlisFiyat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUKodu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtUAdi = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Urun Ekle");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(564, 491));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(564, 491));

        btnkaydet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnkaydet.setForeground(new java.awt.Color(28, 14, 83));
        btnkaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Save_48px_4.png"))); // NOI18N
        btnkaydet.setText("Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Urun Durum");

        cmbUDurum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbUDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Pasif" }));
        cmbUDurum.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Satis Fiyati");

        txtSatisFiyat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSatisFiyat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSatisFiyat.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alis Fiyati");

        txtAlisFiyat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAlisFiyat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAlisFiyat.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Urun Kodu");

        txtUKodu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUKodu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUKodu.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Urun Adi");

        txtUAdi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUAdi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUAdi.setToolTipText("Ürün Adı Giriniz");
        txtUAdi.setBorder(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Add Rule_100px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbUDurum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(txtSatisFiyat)
                    .addComponent(txtAlisFiyat)
                    .addComponent(txtUKodu)
                    .addComponent(jSeparator1)
                    .addComponent(txtUAdi)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUKodu, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtAlisFiyat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtSatisFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cmbUDurum, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
       
        try {
					if (btnkaydet.getText()=="Güncelle") {
						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog (null, "Ürün Kodu : "+txtUKodu.getText()+" Olan Ürünü Gerçekten Güncellemek İstiyormusunuz ?","Warning",dialogButton);
							if(dialogResult == JOptionPane.YES_OPTION)
							{   
								Guncelle(); 
								if(UrunMevcut==1)
								{
								FormTemizle();
								setVisible(false);
								}
								else if(txtUKodu.getText().trim().equals(""))
									JOptionPane.showMessageDialog(null, "Lütfen Ürün Kodunu Boş Bırakmayınız");
								else if(UrunMevcut==0)
									JOptionPane.showMessageDialog(null, "Lütfen Güncellenecek Olan Ürünün, Kodunu Var olan  Bir Ürün Kodu olarak Girin");
							}
							else
								JOptionPane.showMessageDialog(null, "Güncelleme İşlemi İptal Edildi");
					}
					else
					{FormTemizle();
					UrunEkle();}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        
    }//GEN-LAST:event_btnkaydetActionPerformed

  void UrunEkle()throws SQLException 
	{
		db=new DbConnect();
		try
		{
			UrunMevcut=0;
			UrunMevcutKontrol();
			if(UrunMevcut==0)
			{
                            
				String query="insert into Urun (UKodu,UAdi,AlisFiyati,SatisFiyati,UDurum) values (?,?,?,?,?)";
				PreparedStatement komut = db.con.prepareStatement(query);
			    komut.setString(1, txtUKodu.getText());
				komut.setString(2, txtUAdi.getText());
				komut.setString(3, txtAlisFiyat.getText());
				komut.setObject(4, txtSatisFiyat.getText());
				komut.setObject(5, cmbUDurum.getSelectedItem());
				komut.executeUpdate();
				JOptionPane.showMessageDialog(null, "Ürün Başarılı Birşekilde Kaydedildi");
			}
			else
				JOptionPane.showMessageDialog(null, "Mevcut Olan Bir Ürün Kodu Girdiniz! Lütfen Farklı Bir Ürün Kodu Giriniz");	
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
	}

	void Guncelle()throws SQLException 
	{
		UrunMevcut=0;
		UrunMevcutKontrol();
		try{
			if (UrunMevcut==1&&!(txtUKodu.getText().trim().equals(""))) {
				db=new DbConnect();
				 PreparedStatement komut;
				 	String query="update Urun  set UKodu ='"+txtUKodu.getText()+"', UAdi='"+txtUAdi.getText()+"',AlisFiyati='"+txtAlisFiyat.getText()+"',UDurum='"+cmbUDurum.getSelectedItem()+"',SatisFiyati='"+txtSatisFiyat.getText()+"' where UKodu ='"+txtUKodu.getText()+"'";
					komut=db.con.prepareStatement(query);
					komut.executeUpdate();
					JOptionPane.showMessageDialog(null, "Ürün Başarılı Birşekilde Güncellendi");
			}
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
	void UrunMevcutKontrol()
	{		
		try {
			db=new DbConnect();
			String query2="select UrunID,UKodu from Urun where UKodu='"+txtUKodu.getText().trim()+"'";
			PreparedStatement komut2;
			komut2 = db.con.prepareStatement(query2);
			ResultSet rs = komut2.executeQuery();
			if(rs.next())
			{
				
			UrunMevcut=1;
						
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void FormTemizle()
	{
		//txt combobox temizlik
		txtAlisFiyat.setText("");
		txtSatisFiyat.setText("");
		txtUAdi.setText("");
		txtUKodu.setText("");
		cmbUDurum.setSelectedItem("Aktif");
		
		
	}
	void Guncelledengelen()
	{
		txtUAdi.setText(gc.UrunAdi.toString());
		txtUKodu.setText(gc.UrunKodu);
		txtAlisFiyat.setText(gc.AlisFiyati);
		txtSatisFiyat.setText(gc.SatisFiyati);
		cmbUDurum.setSelectedItem(gc.UrunDurum);
		
	}
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnkaydet;
    private javax.swing.JComboBox<String> cmbUDurum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtAlisFiyat;
    private javax.swing.JTextField txtSatisFiyat;
    private javax.swing.JTextField txtUAdi;
    private javax.swing.JTextField txtUKodu;
    // End of variables declaration//GEN-END:variables
}
