package toptanciotomasyonu;

import java.awt.Point;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Habib
 */
public class UASD extends FrameGenel {

    	static DbConnect db;
	private int SutunSayisi;
	GenelClass gc;
    public UASD() {
        
        initComponents();
        Urunlistele();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        UTablo = new javax.swing.JTable();
        txtUadi = new javax.swing.JTextField();
        txtUKodu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSil = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(597, 434));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(597, 434));

        UTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UTabloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UTabloMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(UTablo);

        txtUadi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUadi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUadi.setBorder(null);
        txtUadi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUadiKeyReleased(evt);
            }
        });

        txtUKodu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUKodu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUKodu.setBorder(null);
        txtUKodu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUKoduKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ürün Kodu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ürün Adı");

        btnSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSil.setText("Sil");
        btnSil.setEnabled(false);
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Delete_52px.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Search Property_52px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Available Updates_52px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jSeparator1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUadi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtUadi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnSil)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UTabloMouseClicked
        TablodanModeledAktarma();
        AraclarAktif();
    }//GEN-LAST:event_UTabloMouseClicked

    private void UTabloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UTabloMousePressed
UTablo =(JTable) evt.getSource();
		        Point p = evt.getPoint();
		        int row = UTablo.rowAtPoint(p);
		        if (evt.getClickCount() == 2) {
		        TablodanModeledAktarma();
				UrunEkle  ue= new UrunEkle();
				ue.btnkaydet.setText("Güncelle");
				ue.setTitle("Müşteri Güncelle");
				ue.setVisible(true);
				if(ue.isVisible()==false)
				Urunlistele();
                        }      
        
    }//GEN-LAST:event_UTabloMousePressed

    private void txtUadiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUadiKeyReleased
        Urunlistele();
        AraclarPasif();
    }//GEN-LAST:event_txtUadiKeyReleased

    private void txtUKoduKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUKoduKeyReleased
        Urunlistele();
        AraclarPasif();
    }//GEN-LAST:event_txtUKoduKeyReleased

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        try {
            Sil();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSilActionPerformed
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
      AraclarPasif();       
    }//GEN-LAST:event_formMouseClicked
    void Urunlistele()
	{
		try{
		db=new DbConnect();
		 	String query="select  UKodu as [Urun Kodu],UAdi as [Urun Adi], AlisFiyati ,SatisFiyati ,UDurum from Urun where UKodu like isnull(?,UKodu)+'%' and UAdi like ?+'%'";
		 	PreparedStatement komut=db.con.prepareStatement(query);
			if(txtUKodu.getText().trim().equals(""))
				komut.setString(1, null);
			 	
			 	komut.setString(1, txtUKodu.getText());
			 	komut.setString(2, txtUadi.getText());
			ResultSet rs=komut.executeQuery();
			SutunSayisi=rs.getMetaData().getColumnCount();	
				DefaultTableModel table2=new DefaultTableModel();	
		
				for(int i=1;i<=SutunSayisi;i++)			   
	            table2.addColumn(rs.getMetaData().getColumnName(i));
		   while(rs.next()){
	              Object[] row=new Object[SutunSayisi];
	               for(int i=1;i<=SutunSayisi;i++)
	                  row[i-1]=rs.getObject(i);
	              table2.addRow(row);
	              UTablo.setModel(table2);
		   }
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
		   
		   
	}
	void TablodanModeledAktarma()
	{
		try{
		db=new DbConnect();
		gc = new GenelClass();
		int row = UTablo.getSelectedRow();
		String UKodu=UTablo.getModel().getValueAt(row, 0).toString();
	 	String query="select UrunID,UKodu,UAdi,AlisFiyati,SatisFiyati,UDurum from Urun where UKodu='"+UKodu+"'";
		PreparedStatement komut=db.con.prepareStatement(query);
		ResultSet rs=komut.executeQuery();	
		   while(rs.next()){
			     gc.UrunID=rs.getInt("UrunID");
			     gc.UrunAdi=rs.getString("UAdi");
			     gc.UrunKodu=rs.getString("UKodu");
			     gc.AlisFiyati=rs.getString("AlisFiyati");
			     gc.SatisFiyati=rs.getString("SatisFiyati");
			     gc.UrunDurum=rs.getString("UDurum");      
		   }
		}
		catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	void  AraclarAktif()
	{
		
		btnSil.setEnabled(true);
	}
	void  AraclarPasif()
	{
		
		btnSil.setEnabled(false);
	}
	void Sil()throws SQLException
	{
		try{
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog (null, "Urun Kodu: '"+gc.UrunKodu+"' olan Ürünü Gerçekten Silmek İstiyormusunz ?","Warning",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION)
				{
					db=new DbConnect();
					PreparedStatement komut;
				 	String query="delete Urun  where UrunID =?";
					komut=db.con.prepareStatement(query);
					komut.setInt(1, gc.UrunID);
					komut.executeUpdate();
					JOptionPane.showMessageDialog(null, "Ürün Başarılı Bir şekilde Silindi");
					Urunlistele();
					AraclarPasif();FormTemizle();
				}	
				else
					JOptionPane.showMessageDialog(null, "Silme İşlemi İptal Edildi");
					
				
		}
		catch (SQLException e) {
			// TODO: handle exception
		}	 
	} 
	void FormTemizle()
	{
		txtUKodu.setText("");
	}	 
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
            java.util.logging.Logger.getLogger(UASD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UASD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UASD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UASD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UTablo;
    private javax.swing.JButton btnSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField txtUKodu;
    private javax.swing.JTextField txtUadi;
    // End of variables declaration//GEN-END:variables
}
