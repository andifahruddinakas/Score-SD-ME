package ScoreSd;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Score_SD extends javax.swing.JFrame {
    String Player_1, Player_2, Player_3;
    int NP_1=0, NP_2=0, NP_3=0;
    int Benar=+100, Salah=-25, Lempar=+75, UndoMerah=0, UndoKuning=0, UndoBiru=0;
    
    public Score_SD() {
        initComponents();
        frame1.setVisible(true);
        frame2.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Utama = new javax.swing.JPanel();
        frame1 = new javax.swing.JPanel();
        p2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        masuk = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        frame2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nilai1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nilai2 = new javax.swing.JLabel();
        p11 = new javax.swing.JTextField();
        p22 = new javax.swing.JTextField();
        p33 = new javax.swing.JTextField();
        nilai3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Utama.setLayout(new java.awt.CardLayout());

        frame1.setLayout(null);

        p2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        p2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        frame1.add(p2);
        p2.setBounds(440, 500, 280, 50);

        jLabel6.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pemain 1");
        frame1.add(jLabel6);
        jLabel6.setBounds(440, 460, 280, 40);

        jLabel5.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pemain 1");
        frame1.add(jLabel5);
        jLabel5.setBounds(80, 460, 280, 40);

        p1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        frame1.add(p1);
        p1.setBounds(80, 500, 280, 50);

        jLabel4.setToolTipText("Keluar");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        frame1.add(jLabel4);
        jLabel4.setBounds(10, 10, 130, 90);

        p3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        p3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3));
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        frame1.add(p3);
        p3.setBounds(800, 500, 280, 50);

        jLabel7.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pemain 1");
        frame1.add(jLabel7);
        jLabel7.setBounds(800, 460, 280, 40);

        masuk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/start0.png"))); // NOI18N
        masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masukMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                masukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                masukMouseExited(evt);
            }
        });
        frame1.add(masuk);
        masuk.setBounds(440, 550, 280, 140);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/WalpaperScore.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        frame1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1179, 730);

        Utama.add(frame1, "card3");

        frame2.setLayout(null);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        frame2.add(jLabel3);
        jLabel3.setBounds(10, 10, 140, 90);

        nilai1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        nilai1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nilai1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/merah.png"))); // NOI18N
        nilai1.setText("0");
        nilai1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        frame2.add(nilai1);
        nilai1.setBounds(160, 460, 130, 110);

        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/merah.png"))); // NOI18N
        jLabel8.setText("0");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 189, 140));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/merahbenar0.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 134, 59, 64));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/merahlempar0.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 134, 59, 64));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/merahsalah0.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 134, 59, 64));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/kuning.png"))); // NOI18N
        jLabel12.setText("0");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 189, 140));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/kuningbenar0.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 134, 59, 64));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/kuninglempar0.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 134, 59, 64));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/kuningsalah0.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 134, 59, 64));

        jLabel16.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/biru.png"))); // NOI18N
        jLabel16.setText("0");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 0, 189, 140));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/birubenar0.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 134, 59, 64));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/birulempar0.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 134, 59, 64));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/birusalah0.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 134, 59, 64));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/back.jpg"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 220));

        jToolBar1.add(jPanel1);

        frame2.add(jToolBar1);
        jToolBar1.setBounds(190, 230, 640, 220);

        nilai2.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        nilai2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/kuning.png"))); // NOI18N
        nilai2.setText("0");
        nilai2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        frame2.add(nilai2);
        nilai2.setBounds(510, 450, 130, 130);

        p11.setEditable(false);
        p11.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        p11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        frame2.add(p11);
        p11.setBounds(110, 570, 240, 50);

        p22.setEditable(false);
        p22.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        p22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        frame2.add(p22);
        p22.setBounds(460, 570, 240, 50);

        p33.setEditable(false);
        p33.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        p33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3));
        frame2.add(p33);
        p33.setBounds(810, 570, 240, 50);

        nilai3.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        nilai3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/biru.png"))); // NOI18N
        nilai3.setText("0");
        nilai3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        frame2.add(nilai3);
        nilai3.setBounds(870, 460, 128, 110);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/WalpaperScore.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        frame2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1179, 815);

        Utama.add(frame2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Utama, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Utama, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            keluar();
        } catch (SQLException ex) {
            Logger.getLogger(Score_SD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        try {
            keluar();
        } catch (SQLException ex) {
            Logger.getLogger(Score_SD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void masukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukMouseEntered
        masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/start1.png")));
    }//GEN-LAST:event_masukMouseEntered

    private void masukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukMouseExited
        masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScoreSd/Icon/start0.png")));        
    }//GEN-LAST:event_masukMouseExited

    private void masukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukMouseClicked
        Player_1 = p1.getText();
        Player_2 = p2.getText();
        Player_3 = p3.getText();
        
        if(Player_1.equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Nama Peserta 1");
            p1.requestFocus();
        }else if(Player_2.equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Nama Peserta 2");
            p2.requestFocus();
        }else if(Player_3.equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Nama Peserta 3");
            p3.requestFocus();
        }else {
            frame1.setVisible(false);
            frame2.setVisible(true);
            p11.setText(Player_1);
            p22.setText(Player_2);
            p33.setText(Player_3);
        }
    }//GEN-LAST:event_masukMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        NP_1=Benar+NP_1;
        UndoMerah=-Benar;
        jLabel8.setText(""+NP_1);
        nilai1.setText(""+NP_1);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        NP_1=Lempar+NP_1;
        UndoMerah=-Lempar;
        jLabel8.setText(""+NP_1); 
        nilai1.setText(""+NP_1);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        NP_1=Salah+NP_1;
        UndoMerah=-Salah;
        jLabel8.setText(""+NP_1); 
        nilai1.setText(""+NP_1);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        NP_2=Benar+NP_2;
        UndoKuning=-Benar;
        jLabel12.setText(""+NP_2); 
        nilai2.setText(""+NP_2);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        NP_2=Lempar+NP_2;
        UndoKuning=-Lempar;
        jLabel12.setText(""+NP_2);
        nilai2.setText(""+NP_2);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        NP_2=Salah+NP_2;
        UndoKuning=-Salah;
        jLabel12.setText(""+NP_2);  
        nilai2.setText(""+NP_2);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        NP_3=Benar+NP_3;
        UndoBiru=-Benar;
        jLabel16.setText(""+NP_3); 
        nilai3.setText(""+NP_3);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        NP_3=Lempar+NP_3;
        UndoBiru=-Lempar;
        jLabel16.setText(""+NP_3);  
        nilai3.setText(""+NP_3);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        NP_3=Salah+NP_3;
        UndoBiru=-Salah;
        jLabel16.setText(""+NP_3);
        nilai3.setText(""+NP_3);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        NP_1=NP_1+UndoMerah; 
        UndoMerah=0;
        jLabel8.setText(""+NP_1);
        nilai1.setText(""+NP_1);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        NP_2=NP_2+UndoKuning; 
        UndoKuning=0;
        jLabel12.setText(""+NP_2);
        nilai2.setText(""+NP_2);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        NP_3=NP_3+UndoBiru; 
        UndoBiru=0;
        jLabel16.setText(""+NP_3);
        nilai3.setText(""+NP_3);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3ActionPerformed

    public static void main(String args[]) throws SQLException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Score_SD().setVisible(true);
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){}
    }
    
    public static void keluar() throws SQLException{
        String ObjButtons[] = {"  Ya  ","  Tidak  "};
        int pi = JOptionPane.showOptionDialog(null,
        "Anda yakin akan keluar?", "Peringatan",
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,
        ObjButtons,ObjButtons[1]);
        if(pi==0){
            System.exit(0);
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Utama;
    private javax.swing.JPanel frame1;
    private javax.swing.JPanel frame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel masuk;
    public static javax.swing.JLabel nilai1;
    public static javax.swing.JLabel nilai2;
    public static javax.swing.JLabel nilai3;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p11;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p22;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p33;
    // End of variables declaration//GEN-END:variables
}
