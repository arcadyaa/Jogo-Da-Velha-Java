import java.util.Random;
import javax.swing.*;

/**
 * @author Matheus Silva
 */
public class JogoDaVelha extends javax.swing.JFrame {

    public JogoDaVelha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt11 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt20 = new javax.swing.JButton();
        bt21 = new javax.swing.JButton();
        bt22 = new javax.swing.JButton();
        bt00 = new javax.swing.JButton();
        bt01 = new javax.swing.JButton();
        bt02 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnZerar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setBounds(new java.awt.Rectangle(102, 102, 102, 102));
        setForeground(java.awt.Color.darkGray);

        bt11.setBackground(new java.awt.Color(102, 102, 102));
        bt11.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });

        bt12.setBackground(new java.awt.Color(102, 102, 102));
        bt12.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });

        bt20.setBackground(new java.awt.Color(102, 102, 102));
        bt20.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        bt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt20ActionPerformed(evt);
            }
        });

        bt21.setBackground(new java.awt.Color(102, 102, 102));
        bt21.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        bt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt21ActionPerformed(evt);
            }
        });

        bt22.setBackground(new java.awt.Color(102, 102, 102));
        bt22.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        bt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt22ActionPerformed(evt);
            }
        });

        bt00.setBackground(new java.awt.Color(102, 102, 102));
        bt00.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        bt00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt00ActionPerformed(evt);
            }
        });

        bt01.setBackground(new java.awt.Color(102, 102, 102));
        bt01.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        bt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt01ActionPerformed(evt);
            }
        });

        bt02.setBackground(new java.awt.Color(102, 102, 102));
        bt02.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        bt02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt02ActionPerformed(evt);
            }
        });

        bt10.setBackground(new java.awt.Color(102, 102, 102));
        bt10.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("X            O");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel3.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel4.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Placar:");

        btnReiniciar.setBackground(new java.awt.Color(153, 153, 153));
        btnReiniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReiniciar.setText("Reiniciar Jogo");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnZerar.setBackground(new java.awt.Color(153, 153, 153));
        btnZerar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZerar.setText("Zerar Placar");
        btnZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZerarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel5.setText("JOGO DA VELHA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("SinglePlayer");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Sobre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt00, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt01, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt02, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2))))
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt00, bt01, bt02, bt10, bt11, bt12, bt20, bt21, bt22});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt00, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt01, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt02, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt00, bt01, bt02, bt10, bt11, bt12, bt20, bt21, bt22});

        setSize(new java.awt.Dimension(592, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        botao = "bt11";
        jogada(bt11);
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        botao = "bt12";
        jogada(bt12);
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt20ActionPerformed
        botao = "bt20";
        jogada(bt20);
    }//GEN-LAST:event_bt20ActionPerformed

    private void bt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt21ActionPerformed
        botao = "bt21";
        jogada(bt21);
    }//GEN-LAST:event_bt21ActionPerformed

    private void bt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt22ActionPerformed
        botao = "bt22";
        jogada(bt22);
    }//GEN-LAST:event_bt22ActionPerformed

    private void bt00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt00ActionPerformed
        botao = "bt00";
        jogada(bt00);
    }//GEN-LAST:event_bt00ActionPerformed

    private void bt01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt01ActionPerformed
        botao = "bt01";
        jogada(bt01);
    }//GEN-LAST:event_bt01ActionPerformed

    private void bt02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt02ActionPerformed
        botao = "bt02";
        jogada(bt02);
    }//GEN-LAST:event_bt02ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        botao = "bt10";
        jogada(bt10);
    }//GEN-LAST:event_bt10ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZerarActionPerformed
        // Aqui zera o placar 
        x=0;
        o=0;
        jLabel3.setText(""+x);
        jLabel4.setText(""+o);
    }//GEN-LAST:event_btnZerarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Feito por Matheus Silva de Araujo");
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variaveis 
    int jogada = 1;
    int quem_ganhou = 0;
    int x = 0, o = 0;
    int vezes = 0;
    Random random;
    int cont_vez = 0;
    String botao;
    boolean resultado_verifica = false;
    
    public void primeira_jogada() {
        random = new Random();
        int num = random.nextInt(4);
        //System.out.println(num);

        if ((num == 0) && (bt00.getText().equals(""))) {
            bt00.setText("O");
            jogada = 1;
        }
        if ((num == 1) && (bt02.getText().equals(""))) {
            bt02.setText("O");
            jogada = 1;
        }
        if ((num == 2) && (bt20.getText().equals(""))) {
            bt20.setText("O");
            jogada = 1;
        }
        if ((num == 3) && (bt22.getText().equals(""))) {
            bt22.setText("O");
            jogada = 1;
        }
    }

    public void jogada(javax.swing.JButton butao) {
        if ((quem_ganhou == 0) && (butao.getText().equals(""))) {
            if (jogada == 1) {
                butao.setText("X");
                jogada = 2;
                resultado_verifica = false;
                vezes++;
                //System.out.println(vezes);

                verifica(bt00, bt01, bt02);
                verifica(bt00, bt10, bt20);
                verifica(bt00, bt11, bt22);
                verifica(bt00, bt01, bt02);
                verifica(bt01, bt11, bt21);
                verifica(bt00, bt01, bt02);
                verifica(bt02, bt12, bt22);
                verifica(bt02, bt11, bt20);
                verifica(bt10, bt11, bt12);
                verifica(bt00, bt10, bt20);
                verifica(bt10, bt11, bt12);
                verifica(bt01, bt11, bt21);
                verifica(bt00, bt11, bt22);
                verifica(bt02, bt11, bt20);
                verifica(bt10, bt11, bt12);
                verifica(bt02, bt12, bt22);
                verifica(bt20, bt21, bt22);
                verifica(bt00, bt10, bt20);
                verifica(bt02, bt11, bt20);
                verifica(bt20, bt21, bt22);
                verifica(bt01, bt11, bt21);
                verifica(bt20, bt21, bt22);
                verifica(bt02, bt12, bt22);
                verifica(bt00, bt11, bt22);
                verifica_velha();
            }

            if (jogada == 2) {

                if (resultado_verifica != true)
                    verifica2(bt00, bt01, bt02);
                if (resultado_verifica != true)
                    verifica2(bt00, bt10, bt20);
                if (resultado_verifica != true)
                    verifica2(bt00, bt11, bt22);
                if (resultado_verifica != true)
                    verifica2(bt01, bt11, bt21);
                if (resultado_verifica != true)
                    verifica2(bt02, bt01, bt00);
                if (resultado_verifica != true)
                    verifica2(bt02, bt12, bt22);
                if (resultado_verifica != true)
                    verifica2(bt02, bt11, bt20);
                if (resultado_verifica != true)
                    verifica2(bt10, bt11, bt12);
                if (resultado_verifica != true)
                    verifica2(bt12, bt11, bt10);
                if (resultado_verifica != true)
                    verifica2(bt20, bt10, bt00);
                if (resultado_verifica != true)
                    verifica2(bt20, bt21, bt22);
                if (resultado_verifica != true)
                    verifica2(bt20, bt11, bt02);
                if (resultado_verifica != true)
                    verifica2(bt21, bt11, bt01);
                if (resultado_verifica != true)
                    verifica2(bt22, bt21, bt20);
                if (resultado_verifica != true)
                    verifica2(bt22, bt12, bt02);
                if (resultado_verifica != true)
                    verifica2(bt22, bt11, bt00);
                if (resultado_verifica != true) //extremos
                    verifica2(bt00, bt22, bt11);
                if (resultado_verifica != true)
                    verifica2(bt02, bt20, bt11);
                if (resultado_verifica != true)
                    verifica2(bt01, bt21, bt11);
                if (resultado_verifica != true)
                    verifica2(bt10, bt12, bt11);
                if (resultado_verifica != true)
                    verifica2(bt00, bt20, bt10);
                if (resultado_verifica != true)
                    verifica2(bt02, bt22, bt12);
                if (resultado_verifica != true)
                    verifica2(bt00, bt02, bt01);
                if (resultado_verifica != true)
                    verifica2(bt20, bt22, bt21);

                if (resultado_verifica != true) {

                    if (botao.equals("bt00"))
                        verifica_vazio(bt11, bt02, bt20, bt22, bt01, bt10, bt12, bt21);
                    
                    if (botao.equals("bt01"))
                        verifica_vazio(bt00, bt02, bt21, bt11, bt20, bt22, bt10, bt12);

                    if (botao.equals("bt02"))
                        verifica_vazio(bt11, bt00, bt22, bt20, bt01, bt12, bt10, bt21);

                    if (botao.equals("bt10"))
                        verifica_vazio(bt20, bt22, bt02, bt11, bt12, bt00, bt21, bt01);

                    if (botao.equals("bt11"))
                        verifica_vazio(bt00, bt20, bt02, bt22, bt01, bt10, bt12, bt21);

                    if (botao.equals("bt12"))
                        verifica_vazio(bt02, bt20, bt00, bt10, bt11, bt22, bt21, bt01);

                    if (botao.equals("bt20"))
                        verifica_vazio(bt11, bt00, bt22, bt02, bt10, bt21, bt01, bt12);

                    if (botao.equals("bt21"))
                        verifica_vazio(bt20, bt00, bt02, bt11, bt01, bt22, bt10, bt12);

                    if (botao.equals("bt22"))
                        verifica_vazio(bt11, bt02, bt20, bt00, bt21, bt12, bt01, bt10);

                }

                vezes++;
                //System.out.println(vezes);

                verifica(bt00, bt01, bt02);
                verifica(bt00, bt10, bt20);
                verifica(bt00, bt11, bt22);
                verifica(bt00, bt01, bt02);
                verifica(bt01, bt11, bt21);
                verifica(bt00, bt01, bt02);
                verifica(bt02, bt12, bt22);
                verifica(bt02, bt11, bt20);
                verifica(bt10, bt11, bt12);
                verifica(bt00, bt10, bt20);
                verifica(bt10, bt11, bt12);
                verifica(bt01, bt11, bt21);
                verifica(bt00, bt11, bt22);
                verifica(bt02, bt11, bt20);
                verifica(bt10, bt11, bt12);
                verifica(bt02, bt12, bt22);
                verifica(bt20, bt21, bt22);
                verifica(bt00, bt10, bt20);
                verifica(bt02, bt11, bt20);
                verifica(bt20, bt21, bt22);
                verifica(bt01, bt11, bt21);
                verifica(bt20, bt21, bt22);
                verifica(bt02, bt12, bt22);
                verifica(bt00, bt11, bt22);
                verifica_velha();
            }

        }
    }

    public void desabilita_todos(boolean b) {
        bt00.setEnabled(b);
        bt01.setEnabled(b);
        bt02.setEnabled(b);
        bt10.setEnabled(b);
        bt11.setEnabled(b);
        bt12.setEnabled(b);
        bt20.setEnabled(b);
        bt21.setEnabled(b);
        bt22.setEnabled(b);
    }

    public void reiniciar() {
        bt00.setText("");
        bt01.setText("");
        bt02.setText("");
        bt10.setText("");
        bt11.setText("");
        bt12.setText("");
        bt20.setText("");
        bt21.setText("");
        bt22.setText("");
        quem_ganhou = 0;
        vezes = 0;
        jogada = 1;
        desabilita_todos(true);
        resultado_verifica = false;
        primeira_jogada();
    }

    public void verifica(javax.swing.JButton bt1, javax.swing.JButton bt2, javax.swing.JButton bt3) {
        String xis = "Aproveitou bem a chance em, não se preocupe, isso não irá acontecer novamente! ";
        String bola = "Desista, ele é muito forte para você! ";

        if ((bt1.getText().equals(bt2.getText())) && (bt2.getText().equals(bt3.getText()))) {

            if (bt1.getText().equals("X")) {
                x++;
                jLabel3.setText("" + x);
                quem_ganhou = 1;
                desabilita_todos(false);

                Object[] opcoes = { "Reiniciar" };
                int result = JOptionPane.showOptionDialog(null,
                        "<html><h2>Vencedor: " + bt1.getText() + "</h2><h3>" + xis + "</h3></html>", "Resultado",
                        JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

                if (result == JOptionPane.YES_OPTION)
                    reiniciar();

            } else if (bt1.getText().equals("O")) {
                o++;
                jLabel4.setText("" + o);
                quem_ganhou = 1;
                desabilita_todos(false);

                Object[] opcoes = {"Reiniciar" };
                int result = JOptionPane.showOptionDialog(null,
                        "<html><h2>Vencedor: " + bt1.getText() + "</h2><h3>" + bola + "</h3></html>", "Resultado",
                        JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

                if (result == JOptionPane.YES_OPTION)
                    reiniciar();
            }
        } 
    }
    
    public void verifica_velha() {
        if ((vezes == 8)&&(quem_ganhou != 1)) {
            desabilita_todos(false);

            Object[] opcoes = {"Reiniciar" };
            int result = JOptionPane.showOptionDialog(null,
                    "<html><h2>Deu velha!</h2><h3>Desista, você não pode fazer melhor que isso ;( </h3></html>", "Resultado",
                    JOptionPane.YES_NO_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcoes, opcoes[0]);

            if (result == JOptionPane.YES_OPTION) {
                reiniciar();
            }
        }
    }

    public void verifica2(javax.swing.JButton bto1, javax.swing.JButton bto2, javax.swing.JButton bto3) {

        if ((bto1.getText().equals(bto2.getText())) && ((bto1.getText().equals("X")) || (bto1.getText().equals("O")))) {
            if (bto3.getText().equals("")) {
                bto3.setText("O");
                jogada = 1;
                resultado_verifica = true;
            } else {
                resultado_verifica = false;
            }
        } else {
            resultado_verifica = false;
        }
    }

    public void verifica_vazio(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7, javax.swing.JButton b8) {

        if (b1.getText().equals("")) {
            b1.setText("O");
            jogada = 1;
        } else if (b2.getText().equals("")) {
            b2.setText("O");
            jogada = 1;
        } else if (b3.getText().equals("")) {
            b3.setText("O");
            jogada = 1;
        } else if (b4.getText().equals("")) {
            b4.setText("O");
            jogada = 1;
        } else if (b5.getText().equals("")) {
            b5.setText("O");
            jogada = 1;
        } else if (b6.getText().equals("")) {
            b6.setText("O");
            jogada = 1;
        } else if (b7.getText().equals("")) {
            b7.setText("O");
            jogada = 1;
        } else if (b8.getText().equals("")) {
            b8.setText("O");
            jogada = 1;
        }
    }
                  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt00;
    private javax.swing.JButton bt01;
    private javax.swing.JButton bt02;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt20;
    private javax.swing.JButton bt21;
    private javax.swing.JButton bt22;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnZerar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
