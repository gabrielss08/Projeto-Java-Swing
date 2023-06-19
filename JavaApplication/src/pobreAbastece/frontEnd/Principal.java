/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pobreAbastece.frontEnd;

import javax.swing.JOptionPane;
import pobreAbastece.frontEnd.posto.Posto;
import pobreAbastece.backEnd.entidades.Cliente;
import pobreAbastece.backEnd.entidades.ClienteDAO;
import pobreAbastece.frontEnd.funcionario.Funcionario;

/**
 *
 * @author gabri
 */
public class Principal extends javax.swing.JFrame {
    ClienteDAO clienteD = new ClienteDAO();
    Cliente cliente = new Cliente();
    private String nome;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        botaoSobre = new javax.swing.JButton();
        botaoSite = new javax.swing.JButton();
        botaoPosto = new javax.swing.JButton();
        botaoCarros = new javax.swing.JButton();
        botaoUser = new javax.swing.JButton();
        painelFoto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoSobre.setBackground(new java.awt.Color(255, 255, 0));
        botaoSobre.setText("Sobre");
        botaoSobre.setBorder(null);
        botaoSobre.setBorderPainted(false);
        botaoSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSobreActionPerformed(evt);
            }
        });
        jPanel.add(botaoSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 130, 80));

        botaoSite.setBackground(new java.awt.Color(102, 102, 255));
        botaoSite.setText("Site");
        botaoSite.setBorder(null);
        botaoSite.setBorderPainted(false);
        botaoSite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSiteActionPerformed(evt);
            }
        });
        jPanel.add(botaoSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 130, 70));

        botaoPosto.setBackground(new java.awt.Color(102, 204, 255));
        botaoPosto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pobreAbastece/frontEnd/icons/postoIcon.png"))); // NOI18N
        botaoPosto.setText("Postos");
        botaoPosto.setBorder(null);
        botaoPosto.setBorderPainted(false);
        botaoPosto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPosto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoPosto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoPosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPostoActionPerformed(evt);
            }
        });
        jPanel.add(botaoPosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 330, 160));

        botaoCarros.setBackground(new java.awt.Color(102, 255, 102));
        botaoCarros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pobreAbastece/frontEnd/icons/carroIcon.png"))); // NOI18N
        botaoCarros.setText("Carros");
        botaoCarros.setBorder(null);
        botaoCarros.setBorderPainted(false);
        botaoCarros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCarros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCarros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCarrosActionPerformed(evt);
            }
        });
        jPanel.add(botaoCarros, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 330, 130));

        botaoUser.setBackground(new java.awt.Color(255, 153, 0));
        botaoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pobreAbastece/frontEnd/icons/user.png"))); // NOI18N
        botaoUser.setText("funcionarios");
        botaoUser.setBorder(null);
        botaoUser.setBorderPainted(false);
        botaoUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUserActionPerformed(evt);
            }
        });
        jPanel.add(botaoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 220, 300));

        painelFoto.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pobreAbastece/frontEnd/icons/logoPa.png"))); // NOI18N

        javax.swing.GroupLayout painelFotoLayout = new javax.swing.GroupLayout(painelFoto);
        painelFoto.setLayout(painelFotoLayout);
        painelFotoLayout.setHorizontalGroup(
            painelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelFotoLayout.setVerticalGroup(
            painelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel.add(painelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 130, 130));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pobreAbastece/frontEnd/icons/logo.png"))); // NOI18N
        jPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 310, 120));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pobreAbastece/frontEnd/icons/fundoPagPrincipal.png"))); // NOI18N
        jPanel.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarrosActionPerformed
        JOptionPane.showMessageDialog(this, "A opção carros ainda está em desenvolvimento,"
                + " com ela planejamos o usuário poder acompanhar status do carro como data da troca de oleo entre outros ",
                "Desculpe", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_botaoCarrosActionPerformed

    private void botaoPostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPostoActionPerformed
        Posto frame = new Posto();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoPostoActionPerformed

    private void botaoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUserActionPerformed
        Funcionario user = new Funcionario();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoUserActionPerformed

    private void botaoSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSiteActionPerformed
        JOptionPane.showMessageDialog(this, "Nosso site ainda está em desenvolvimento em breve estará disponivel para o usuário",
                "Desculpe", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_botaoSiteActionPerformed

    private void botaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSobreActionPerformed
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
        
    }//GEN-LAST:event_botaoSobreActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCarros;
    private javax.swing.JButton botaoPosto;
    private javax.swing.JButton botaoSite;
    private javax.swing.JButton botaoSobre;
    private javax.swing.JButton botaoUser;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel painelFoto;
    // End of variables declaration//GEN-END:variables
}
