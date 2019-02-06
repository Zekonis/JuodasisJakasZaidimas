
package juodasisjakas;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Ekranas extends javax.swing.JFrame {

    DefaultListModel ZaidejoLangas = new DefaultListModel();
    DefaultListModel KrupjeLnagas = new DefaultListModel();
    
    int ZaidejoKortuSuma = 0;
    int KrupjeKortuSuma = 0;
    
    int ZaidejoKortosVerte = 0;
    int KrupjeKortosVerte = 0;
    
    int ZaidejoTaskai = 0;
    int KrupjeTaskai = 0;
    int y = 0;
    public Ekranas() {
        initComponents();
    }

    
     private void PridedaZaidejoLentele(String name)
    {
        jList1.setModel(ZaidejoLangas );
        ZaidejoLangas.addElement(name);
    }
     
      private void PridedaKrupjeLentele(String name)
    {
        jList2.setModel(KrupjeLnagas);
        KrupjeLnagas.addElement(name);
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        Traukti = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        Krupje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ZaidejoSuma = new javax.swing.JTextField();
        KrupjeSuma = new javax.swing.JTextField();
        ZaidejoRezultatas = new javax.swing.JTextField();
        KrupjeRezultatas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Traukti.setText("Traukti");
        Traukti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrauktiActionPerformed(evt);
            }
        });

        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pasiduoti");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        Krupje.setText("Krupje");

        jLabel2.setText("Zaidejas");

        ZaidejoRezultatas.setText("0");

        KrupjeRezultatas.setText("0");
        KrupjeRezultatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrupjeRezultatasActionPerformed(evt);
            }
        });

        jLabel3.setText("Zaidejo rezultatas");

        jLabel4.setText("Krupje rezultatas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZaidejoRezultatas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ZaidejoSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Traukti)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Krupje, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KrupjeSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(KrupjeRezultatas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KrupjeSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(KrupjeRezultatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Krupje)
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ZaidejoSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(ZaidejoRezultatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(Traukti))
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrauktiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrauktiActionPerformed
      
        
       
      ZaidejoKortuSuma= ZaidejoKortuSumosSkaiciavimas(ZaidejoKortosVerte,ZaidejoKortuSuma);
      ZaidejoSumosTikrinimas(ZaidejoKortuSuma);
        
        
    }//GEN-LAST:event_TrauktiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       
        
       KrupjeKortuSuma = KrupjeKortuSkaiciavimas(ZaidejoKortuSuma,KrupjeKortuSuma);
       restartas();
         
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void KrupjeRezultatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrupjeRezultatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KrupjeRezultatasActionPerformed

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Ekranas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ekranas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ekranas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ekranas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ekranas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Krupje;
    private javax.swing.JTextField KrupjeRezultatas;
    private javax.swing.JTextField KrupjeSuma;
    private javax.swing.JButton Traukti;
    private javax.swing.JTextField ZaidejoRezultatas;
    private javax.swing.JTextField ZaidejoSuma;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   

   

    private int Daugiau(int ZaidejoKortuSuma ) {
         
          
         JOptionPane.showMessageDialog(null, "Suma virsijo 21 jus pralaimejote");  
         ZaidejoLangas.clear();
         ZaidejoSuma.setText(String.valueOf(0));
         ZaidejoKortuSuma  = 0;
         
         
         
         
        
             KrupjeTaskai++;
             KrupjeRezultatas.setText(String.valueOf(KrupjeTaskai));

      
         
         return ZaidejoKortuSuma ;
    }

    private int  KrupjeKortuSkaiciavimas(int ZaidejoKortuSuma , int KrupjeKortuSuma) {
          
            while(KrupjeKortuSuma<17)
          {
                
            KrupjeKortosVerte = Skaiciavimas.KortuTraukimas();
           
           
             String Korta2 = "" + KrupjeKortosVerte;
             KrupjeKortuSuma+=KrupjeKortosVerte;
          
             KrupjeSuma.setText(String.valueOf(KrupjeKortuSuma ));
             PridedaKrupjeLentele(Korta2);
             
           }
            
            System.out.print(ZaidejoKortuSuma + " " + KrupjeKortuSuma);
        if(KrupjeKortuSuma<21){
        tikrinimas( ZaidejoKortuSuma,  KrupjeKortuSuma);
        }
        else{
             JOptionPane.showMessageDialog(null, "Jus laimejote ");
              ZaidejoTaskai++;
              ZaidejoRezultatas.setText(String.valueOf( ZaidejoTaskai));
        }
         
        
        
       
       return KrupjeKortuSuma;
    }

    
    
    
    private int ZaidejoKortuSumosSkaiciavimas(int ZaidejoKortosVerte, int ZaidejoKortuSuma ) {
        
         ZaidejoKortosVerte = Skaiciavimas.KortuTraukimas();
        ZaidejoKortuSuma +=ZaidejoKortosVerte;
        String Korta = "" + ZaidejoKortosVerte;
        ZaidejoSuma.setText(String.valueOf(ZaidejoKortuSuma ));
        PridedaZaidejoLentele(Korta);
        
        if( ZaidejoKortuSuma >21){
            
           ZaidejoKortuSuma = Daugiau(ZaidejoKortuSuma );
        }
        
        
        return ZaidejoKortuSuma ;
    }

    private void ZaidejoSumosTikrinimas(int ZaidejoKortuSuma) {
        
        if(ZaidejoKortuSuma >21){
            ZaidejoKortuSuma=0;
            KrupjeRezultatas.setText(String.valueOf(KrupjeTaskai));
            
        }
    }

    private void tikrinimas(int ZaidejoKortuSuma, int KrupjeKortuSuma) {
        if(ZaidejoKortuSuma>KrupjeKortuSuma){
           ZaidejoTaskai++;
             ZaidejoRezultatas.setText(String.valueOf( ZaidejoTaskai));
             JOptionPane.showMessageDialog(null, "Sveikiname Laimejote ");  
        }
         if(ZaidejoKortuSuma<KrupjeKortuSuma){
           KrupjeTaskai++;
             KrupjeRezultatas.setText(String.valueOf( KrupjeTaskai));
             JOptionPane.showMessageDialog(null, "Laimejo Krupje"); 
        }
    }

    private void restartas() {
        ZaidejoKortuSuma = 0;
         KrupjeKortuSuma = 0;
        KrupjeSuma.setText(String.valueOf(0));
       ZaidejoSuma.setText(String.valueOf(0));
        KrupjeLnagas.clear();
        ZaidejoLangas.clear();
    }
    
    
    }

