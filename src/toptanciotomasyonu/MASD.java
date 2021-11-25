package toptanciotomasyonu;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MASD extends FrameGenel {

    	static DbConnect db;
	private int SutunSayisi;
	GenelClass gc;
    public MASD() {
        initComponents();
        Musterilistele();       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtMadSoyad = new javax.swing.JTextField();
        txtMKodu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSil = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        MTablo = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Müşteri Ara Sil Düzenle");
        setPreferredSize(new java.awt.Dimension(597, 434));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        txtMadSoyad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMadSoyad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMadSoyad.setBorder(null);
        txtMadSoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMadSoyadActionPerformed(evt);
            }
        });
        txtMadSoyad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMadSoyadKeyReleased(evt);
            }
        });

        txtMKodu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMKodu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMKodu.setBorder(null);
        txtMKodu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMKoduKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Müşteri Kodu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Müşteri Ad Soyad");

        btnSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSil.setText("Sil");
        btnSil.setEnabled(false);
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        MTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        MTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MTabloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MTabloMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(MTablo);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Search_52px.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Delete_52px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toptanciotomasyonu/icon/Available Updates_52px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMadSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(186, 186, 186)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtMadSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSil)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
       try {
					Sil();
				} 

				 catch (SQLException e) {
					// TODO Auto-generated catch block
					 JOptionPane.showMessageDialog(null,e);
					 e.printStackTrace();
				}
    }//GEN-LAST:event_btnSilActionPerformed

    private void txtMadSoyadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMadSoyadKeyReleased
        Musterilistele();
        AraclarPasif();
    }//GEN-LAST:event_txtMadSoyadKeyReleased

    private void txtMKoduKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKoduKeyReleased
        Musterilistele();
        AraclarPasif();
    }//GEN-LAST:event_txtMKoduKeyReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       AraclarPasif();
    }//GEN-LAST:event_formMouseClicked

    private void MTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MTabloMouseClicked
        TablodanModeledAktarma();
	AraclarAktif();
    }//GEN-LAST:event_MTabloMouseClicked

    private void MTabloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MTabloMousePressed
        MTablo =(JTable) evt.getSource();
		        Point p = evt.getPoint();
		        int row = MTablo.rowAtPoint(p);
		        if (evt.getClickCount() == 2) {
		        TablodanModeledAktarma();
				MusteriEkle  me= new MusteriEkle();
				me.btnMKaydet.setText("Güncelle");
				me.setTitle("Müşteri Güncelle");
				me.setVisible(true);
				if(me.isVisible()==false)
				Musterilistele();
                        }
    }//GEN-LAST:event_MTabloMousePressed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
     
    }//GEN-LAST:event_formPropertyChange

    private void txtMadSoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMadSoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMadSoyadActionPerformed

  public  void Musterilistele()
	{
		try{
		db=new DbConnect();
		   
		 	//String query="select MusteriKodu as Müşteri_Kodu,AdSoyad as Ad_Soyad,Telefon,Cinsiyet,Adres,MDurum from Musteri where MusteriKodu like isnull(?,MusteriKodu)+'%' and AdSoyad like ?+'%' ";
		 	//PreparedStatement komut=db.con.prepareStatement(query);
		 	CallableStatement callableStatement = null;
		String getDBUSERByUserIdSql = "{call MusteriListele(?,?)}";
		callableStatement = db.con.prepareCall(getDBUSERByUserIdSql);
		 	if(txtMKodu.getText().trim().equals(""))
			callableStatement.setString(1, null);
		 	
		 	callableStatement.setString(1, txtMKodu.getText());
		 	callableStatement.setString(2, txtMadSoyad.getText());
			ResultSet rs=callableStatement.executeQuery();
			SutunSayisi=rs.getMetaData().getColumnCount();	
			/*
			 
			Statement stmt=connection.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    ResultSet rs=stmt.executeQuery("select * from BankAccount");
   
    
    while(rs.next()){
      int accountNum=rs.getInt("AccountNumber");
      float amount=rs.getInt("Amount");      
      System.out.println(accountNum+" : "+amount);        
      if(accountNum==345){
         if(rs.previous()){      
           int accountNumPrevious=rs.getInt("AccountNumber");  
           System.out.println("Account before 345 : "+accountNumPrevious);
           break;
         }
      }
    }    
    if(rs.first()){
      int accountNumFirst=rs.getInt("AccountNumber");
      System.out.println("First Account : "+accountNumFirst);      
    }
    if(rs.last()){
      int accountNumLast=rs.getInt("AccountNumber");
      System.out.println("Last Account : "+accountNumLast);      
    }  
    if(rs.absolute(4)){
      int accountNum4=rs.getInt("AccountNumber");
      System.out.println("4th Account : "+accountNum4);      
    }      
			 
			*/


				DefaultTableModel table2=new DefaultTableModel();	
		
				for(int i=1;i<=SutunSayisi;i++)			   
	            table2.addColumn(rs.getMetaData().getColumnName(i));
		   while(rs.next()){
	              Object[] row=new Object[SutunSayisi];
	               for(int i=1;i<=SutunSayisi;i++)
	                  row[i-1]=rs.getObject(i);
	              table2.addRow(row);
	              MTablo.setModel(table2);
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
		int row = MTablo.getSelectedRow();
		String MKodu=MTablo.getModel().getValueAt(row, 0).toString();
	 	String query="select MusteriID,MusteriKodu,AdSoyad,Telefon,Cinsiyet,Adres,MDurum from Musteri where MusteriKodu='"+MKodu+"'";
		PreparedStatement komut=db.con.prepareStatement(query);
		ResultSet rs=komut.executeQuery();	
		   while(rs.next()){
			     gc.MusteriID=rs.getInt("MusteriID");
			     gc.MusteriKodu=rs.getString("MusteriKodu");
			     gc.MusteriAdSoyad=rs.getString("AdSoyad");
			     gc.MusteriTelefon=rs.getString("Telefon");
			     gc.MusteriCinsiyet=rs.getString("Cinsiyet");
			     gc.MusteriAdres=rs.getString("Adres");
			     gc.MusteriDurum=rs.getString("MDurum");      
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
			int dialogResult = JOptionPane.showConfirmDialog (null, "Müşteri Kodu: '"+gc.MusteriKodu+"' olan Müşteriyi Gerçekten Silmek İstiyormusunz ?","Warning",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION)
				{
					db=new DbConnect();
					PreparedStatement komut;
				 	String query="delete Musteri  where MusteriID =?";
					komut=db.con.prepareStatement(query);
					komut.setInt(1, gc.MusteriID);
					komut.executeUpdate();
					JOptionPane.showMessageDialog(null, "Müşteri Başarılı Bir şekilde Silindi");
					Musterilistele();
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
		txtMKodu.setText("");
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
            java.util.logging.Logger.getLogger(MASD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MASD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MASD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MASD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MTablo;
    private javax.swing.JButton btnSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txtMKodu;
    private javax.swing.JTextField txtMadSoyad;
    // End of variables declaration//GEN-END:variables

    
    
}
