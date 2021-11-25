package toptanciotomasyonu;

public class ToptanciForm extends javax.swing.JFrame {

    
    public ToptanciForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cikis = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        musteriekle = new javax.swing.JMenuItem();
        MASD = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        UrunEkle = new javax.swing.JMenuItem();
        UASD = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        personelekle = new javax.swing.JMenuItem();
        PASD = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setExtendedState(MAXIMIZED_BOTH);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jButton1.setText("-Satış İşlemleri-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jMenu1.setText("Dosya");

        Cikis.setText("Cikis");
        jMenu1.add(Cikis);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Musteri");

        musteriekle.setText("Musteri Ekle");
        musteriekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriekleActionPerformed(evt);
            }
        });
        jMenu2.add(musteriekle);

        MASD.setText("Musteri Ara / Sil / Düzenle");
        MASD.setToolTipText("");
        MASD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASDActionPerformed(evt);
            }
        });
        jMenu2.add(MASD);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Urun");

        UrunEkle.setText("Urun Ekle");
        UrunEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunEkleActionPerformed(evt);
            }
        });
        jMenu3.add(UrunEkle);

        UASD.setText("Urun Ara / Sil / Düzenle");
        UASD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UASDActionPerformed(evt);
            }
        });
        jMenu3.add(UASD);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Personel");

        personelekle.setText("Personel Ekle");
        personelekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelekleActionPerformed(evt);
            }
        });
        jMenu4.add(personelekle);

        PASD.setText("Personel Ara / Sil / Düzenle");
        PASD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASDActionPerformed(evt);
            }
        });
        jMenu4.add(PASD);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void musteriekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriekleActionPerformed
        MusteriEkle ME = new MusteriEkle();
	ME.setVisible(true);
    }//GEN-LAST:event_musteriekleActionPerformed

    private void personelekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelekleActionPerformed
       // PersonelEkle pe = new PersonelEkle();
				//pe.setVisible(true);
    }//GEN-LAST:event_personelekleActionPerformed

    private void MASDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASDActionPerformed
        MASD masd= new MASD();
	masd.setVisible(true);
    }//GEN-LAST:event_MASDActionPerformed

    private void UrunEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunEkleActionPerformed
       UrunEkle ue = new UrunEkle();
       ue.setVisible(true);
    }//GEN-LAST:event_UrunEkleActionPerformed

    private void UASDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UASDActionPerformed
      UASD uasd = new UASD();
       uasd.setVisible(true);
    }//GEN-LAST:event_UASDActionPerformed

    private void PASDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASDActionPerformed
     //  PASD pasd = new PASD();
     //   pasd.setVisible(true);
    }//GEN-LAST:event_PASDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       SatisIslemleri si = new SatisIslemleri();
       si.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(ToptanciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToptanciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToptanciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToptanciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToptanciForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cikis;
    private javax.swing.JMenuItem MASD;
    private javax.swing.JMenuItem PASD;
    private javax.swing.JMenuItem UASD;
    private javax.swing.JMenuItem UrunEkle;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem musteriekle;
    private javax.swing.JMenuItem personelekle;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
