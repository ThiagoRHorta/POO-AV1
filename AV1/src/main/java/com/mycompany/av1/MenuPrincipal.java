package com.mycompany.av1;

import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        panelMenuPrincipal.setVisible(false);
        panelGerenciarUsuarios.setVisible(false);
        panelGerenciarAlunos.setVisible(false);
        panelGerenciarProfessores.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        usuarioLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        inputUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        menuLabel = new javax.swing.JLabel();
        panelMenuPrincipal = new javax.swing.JPanel();
        btnGerenciarUsuarios = new javax.swing.JButton();
        btnGerenciarAlunos = new javax.swing.JButton();
        btnGerenciarProfessores = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        panelGerenciarAlunos = new javax.swing.JPanel();
        btnVoltar1 = new javax.swing.JButton();
        btnAdicionarUsuario1 = new javax.swing.JButton();
        btnRemoverUsuario1 = new javax.swing.JButton();
        panelGerenciarUsuarios = new javax.swing.JPanel();
        btnAdicionarUsuario = new javax.swing.JButton();
        btnRemoverUsuario = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        panelGerenciarProfessores = new javax.swing.JPanel();
        btnAdicionarProfessor = new javax.swing.JButton();
        btnRemoverProfessor = new javax.swing.JButton();
        btnVoltar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        usuarioLabel.setText("Usuario");

        senhaLabel.setText("Senha");

        inputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSenhaActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        menuLabel.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setText("Tela de Login");
        menuLabel.setToolTipText("");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(usuarioLabel)
                                .addGap(11, 11, 11))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(senhaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputUsuario)
                            .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(menuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel)
                .addGap(20, 20, 20)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(34, 34, 34))
        );

        panelMenuPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGerenciarUsuarios.setText("Gerenciar Usuarios");
        btnGerenciarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGerenciarUsuariosMouseClicked(evt);
            }
        });
        btnGerenciarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarUsuariosActionPerformed(evt);
            }
        });

        btnGerenciarAlunos.setText("Gerenciar Alunos");
        btnGerenciarAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGerenciarAlunosMouseClicked(evt);
            }
        });
        btnGerenciarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarAlunosActionPerformed(evt);
            }
        });

        btnGerenciarProfessores.setText("Gerenciar Professores");
        btnGerenciarProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGerenciarProfessoresMouseClicked(evt);
            }
        });
        btnGerenciarProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarProfessoresActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnGerenciarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerenciarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGerenciarProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerenciarAlunos)
                    .addComponent(btnGerenciarUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerenciarProfessores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(31, 31, 31))
        );

        btnVoltar1.setText("Voltar");
        btnVoltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltar1MouseClicked(evt);
            }
        });
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        btnAdicionarUsuario1.setText("Adicionar Aluno");

        btnRemoverUsuario1.setText("Remover Aluno");

        javax.swing.GroupLayout panelGerenciarAlunosLayout = new javax.swing.GroupLayout(panelGerenciarAlunos);
        panelGerenciarAlunos.setLayout(panelGerenciarAlunosLayout);
        panelGerenciarAlunosLayout.setHorizontalGroup(
            panelGerenciarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerenciarAlunosLayout.createSequentialGroup()
                .addGroup(panelGerenciarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGerenciarAlunosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAdicionarUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGerenciarAlunosLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnVoltar1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelGerenciarAlunosLayout.setVerticalGroup(
            panelGerenciarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerenciarAlunosLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(panelGerenciarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarUsuario1)
                    .addComponent(btnRemoverUsuario1))
                .addGap(18, 18, 18)
                .addComponent(btnVoltar1)
                .addGap(58, 58, 58))
        );

        btnAdicionarUsuario.setText("Adicionar Usuário");

        btnRemoverUsuario.setText("Remover Usuário");

        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGerenciarUsuariosLayout = new javax.swing.GroupLayout(panelGerenciarUsuarios);
        panelGerenciarUsuarios.setLayout(panelGerenciarUsuariosLayout);
        panelGerenciarUsuariosLayout.setHorizontalGroup(
            panelGerenciarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerenciarUsuariosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnAdicionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addGroup(panelGerenciarUsuariosLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGerenciarUsuariosLayout.setVerticalGroup(
            panelGerenciarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerenciarUsuariosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelGerenciarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarUsuario)
                    .addComponent(btnRemoverUsuario))
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        btnAdicionarProfessor.setText("Adicionar Professor");

        btnRemoverProfessor.setText("Remover Professor");

        btnVoltar2.setText("Voltar");
        btnVoltar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltar2MouseClicked(evt);
            }
        });
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGerenciarProfessoresLayout = new javax.swing.GroupLayout(panelGerenciarProfessores);
        panelGerenciarProfessores.setLayout(panelGerenciarProfessoresLayout);
        panelGerenciarProfessoresLayout.setHorizontalGroup(
            panelGerenciarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerenciarProfessoresLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnAdicionarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addGroup(panelGerenciarProfessoresLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnVoltar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGerenciarProfessoresLayout.setVerticalGroup(
            panelGerenciarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerenciarProfessoresLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelGerenciarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarProfessor)
                    .addComponent(btnRemoverProfessor))
                .addGap(18, 18, 18)
                .addComponent(btnVoltar2)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelGerenciarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelGerenciarAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelGerenciarProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelGerenciarUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelGerenciarAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelGerenciarProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSenhaActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String usuarioLogin = inputUsuario.getText();
        String usuarioSenha = String.valueOf(inputSenha.getPassword());
        
        Usuario user = Usuario.usuarios.get(usuarioLogin.toLowerCase());
        if(user == null){
            JOptionPane.showMessageDialog(null, "Usuario Inexistente!");
            return;
        }
        
        if(user.getSenha().equals(usuarioSenha)){
            panelMenuPrincipal.setVisible(true);
            panelLogin.setVisible(false); 
            
            return;
        }
        JOptionPane.showMessageDialog(null, "Senha errada!");
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnGerenciarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerenciarUsuariosActionPerformed

    private void btnGerenciarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerenciarAlunosActionPerformed

    private void btnGerenciarProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarProfessoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerenciarProfessoresActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        panelLogin.setVisible(true);
        
        inputUsuario.setText("");
        inputSenha.setText("");
        
        panelMenuPrincipal.setVisible(false);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnGerenciarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerenciarUsuariosMouseClicked
        panelMenuPrincipal.setVisible(false);
        panelGerenciarUsuarios.setVisible(true);
    }//GEN-LAST:event_btnGerenciarUsuariosMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        panelGerenciarUsuarios.setVisible(false);
        panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnVoltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltar1MouseClicked
        panelGerenciarAlunos.setVisible(false);
        panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVoltar1MouseClicked

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnGerenciarAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerenciarAlunosMouseClicked
        panelMenuPrincipal.setVisible(false);
        panelGerenciarAlunos.setVisible(true);
    }//GEN-LAST:event_btnGerenciarAlunosMouseClicked

    private void btnVoltar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltar2MouseClicked
        panelGerenciarProfessores.setVisible(false);
        panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVoltar2MouseClicked

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    private void btnGerenciarProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerenciarProfessoresMouseClicked
        panelMenuPrincipal.setVisible(false);
        panelGerenciarProfessores.setVisible(true);
    }//GEN-LAST:event_btnGerenciarProfessoresMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProfessor;
    private javax.swing.JButton btnAdicionarUsuario;
    private javax.swing.JButton btnAdicionarUsuario1;
    private javax.swing.JButton btnGerenciarAlunos;
    private javax.swing.JButton btnGerenciarProfessores;
    private javax.swing.JButton btnGerenciarUsuarios;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRemoverProfessor;
    private javax.swing.JButton btnRemoverUsuario;
    private javax.swing.JButton btnRemoverUsuario1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JButton btnVoltar2;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel panelGerenciarAlunos;
    private javax.swing.JPanel panelGerenciarProfessores;
    private javax.swing.JPanel panelGerenciarUsuarios;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
