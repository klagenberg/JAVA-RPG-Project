package GUI;

import Domain.Controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fairlyn
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
    Controller controller = Controller.getInstance();
    int action;

    public void Action() {
        action = controller.getGUIAction();
        switch (action) {
            case (1):
                jFrameFight.setVisible(true);
                jTextAreaStatus.setText(controller.getResult());
                break;
            case (2): //in combat
            //unused?
            case (3): // explore the area
                jFrameExplore.setVisible(true);
                jTextAreaExplore.setText(controller.getResult());
                break;
            case (4):
                break;
            case (5):
                //at camp
                jFrameCamp.setVisible(true);
                break;
            default:
                break;
        }
        System.out.println("action: " + action);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameFight = new javax.swing.JFrame();
        jLabelhealth = new javax.swing.JLabel();
        jLabelEnemy = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStatus = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jFrameExplore = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaExplore = new javax.swing.JTextArea();
        jButtonexplore1 = new javax.swing.JButton();
        jButtonExplore2 = new javax.swing.JButton();
        jButtonExplore3 = new javax.swing.JButton();
        jButtonExploreHome = new javax.swing.JButton();
        JframePlayer = new javax.swing.JFrame();
        jFrameCamp = new javax.swing.JFrame();
        jButtonCampRest = new javax.swing.JButton();
        jButtonCampFollowers = new javax.swing.JButton();
        jButtonCampEquipment = new javax.swing.JButton();
        jButtonCampExplore = new javax.swing.JButton();
        jButtonNewGame = new javax.swing.JButton();

        jFrameFight.setBounds(new java.awt.Rectangle(200, 0, 350, 350));

        jLabelhealth.setText("Name");

        jLabelEnemy.setText("Enemy");

        jTextAreaStatus.setColumns(20);
        jTextAreaStatus.setLineWrap(true);
        jTextAreaStatus.setRows(5);
        jTextAreaStatus.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaStatus);

        jButton1.setText("attack");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameFightLayout = new javax.swing.GroupLayout(jFrameFight.getContentPane());
        jFrameFight.getContentPane().setLayout(jFrameFightLayout);
        jFrameFightLayout.setHorizontalGroup(
            jFrameFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameFightLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jFrameFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jFrameFightLayout.createSequentialGroup()
                            .addComponent(jLabelhealth)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEnemy))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jFrameFightLayout.setVerticalGroup(
            jFrameFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameFightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameFightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelhealth)
                    .addComponent(jLabelEnemy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jFrameExplore.setBounds(new java.awt.Rectangle(200, 0, 350, 350));

        jTextAreaExplore.setColumns(20);
        jTextAreaExplore.setRows(5);
        jScrollPane2.setViewportView(jTextAreaExplore);

        jButtonexplore1.setText("jButton2");
        jButtonexplore1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexplore1ActionPerformed(evt);
            }
        });

        jButtonExplore2.setText("jButton3");
        jButtonExplore2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExplore2ActionPerformed(evt);
            }
        });

        jButtonExplore3.setText("jButton4");
        jButtonExplore3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExplore3ActionPerformed(evt);
            }
        });

        jButtonExploreHome.setText("return to camp");
        jButtonExploreHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExploreHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameExploreLayout = new javax.swing.GroupLayout(jFrameExplore.getContentPane());
        jFrameExplore.getContentPane().setLayout(jFrameExploreLayout);
        jFrameExploreLayout.setHorizontalGroup(
            jFrameExploreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameExploreLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jFrameExploreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonExploreHome)
                    .addGroup(jFrameExploreLayout.createSequentialGroup()
                        .addComponent(jButtonexplore1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExplore2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExplore3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jFrameExploreLayout.setVerticalGroup(
            jFrameExploreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameExploreLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jFrameExploreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonexplore1)
                    .addComponent(jButtonExplore2)
                    .addComponent(jButtonExplore3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExploreHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JframePlayerLayout = new javax.swing.GroupLayout(JframePlayer.getContentPane());
        JframePlayer.getContentPane().setLayout(JframePlayerLayout);
        JframePlayerLayout.setHorizontalGroup(
            JframePlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JframePlayerLayout.setVerticalGroup(
            JframePlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButtonCampRest.setText("rest");
        jButtonCampRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCampRestActionPerformed(evt);
            }
        });

        jButtonCampFollowers.setText("Followers");

        jButtonCampEquipment.setText("equipment");

        jButtonCampExplore.setText("Explore");
        jButtonCampExplore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCampExploreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameCampLayout = new javax.swing.GroupLayout(jFrameCamp.getContentPane());
        jFrameCamp.getContentPane().setLayout(jFrameCampLayout);
        jFrameCampLayout.setHorizontalGroup(
            jFrameCampLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameCampLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jFrameCampLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCampExplore)
                    .addGroup(jFrameCampLayout.createSequentialGroup()
                        .addComponent(jButtonCampRest)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonCampFollowers)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonCampEquipment)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jFrameCampLayout.setVerticalGroup(
            jFrameCampLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameCampLayout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(jFrameCampLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCampRest)
                    .addComponent(jButtonCampFollowers)
                    .addComponent(jButtonCampEquipment))
                .addGap(18, 18, 18)
                .addComponent(jButtonCampExplore)
                .addGap(26, 26, 26))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNewGame.setText("new game");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jButtonNewGame)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jButtonNewGame)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        controller.createPlayer();
        controller.Action();
        action = controller.getGUIAction();
        Action();
    }//GEN-LAST:event_jButtonNewGameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.Action();
        jTextAreaStatus.setText("");
        jTextAreaStatus.append(controller.getPlayerMessage());
        jTextAreaStatus.append("you have" + controller.getHealth() + "out of a max of" + controller.getfullHealth());
        jTextAreaStatus.append(controller.getEnemyMessage());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonexplore1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexplore1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonexplore1ActionPerformed

    private void jButtonExplore2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExplore2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExplore2ActionPerformed

    private void jButtonExplore3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExplore3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExplore3ActionPerformed

    private void jButtonCampRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCampRestActionPerformed
        controller.restNight();
    }//GEN-LAST:event_jButtonCampRestActionPerformed

    private void jButtonExploreHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExploreHomeActionPerformed
        jFrameExplore.setVisible(false);
        action = 5;
        controller.setAction(5);
        controller.Action();
        Action();
    }//GEN-LAST:event_jButtonExploreHomeActionPerformed

    private void jButtonCampExploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCampExploreActionPerformed
        jFrameCamp.setVisible(false);
        controller.setAction(3);
        controller.Action();
        Action();
    }//GEN-LAST:event_jButtonCampExploreActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame JframePlayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCampEquipment;
    private javax.swing.JButton jButtonCampExplore;
    private javax.swing.JButton jButtonCampFollowers;
    private javax.swing.JButton jButtonCampRest;
    private javax.swing.JButton jButtonExplore2;
    private javax.swing.JButton jButtonExplore3;
    private javax.swing.JButton jButtonExploreHome;
    private javax.swing.JButton jButtonNewGame;
    private javax.swing.JButton jButtonexplore1;
    private javax.swing.JFrame jFrameCamp;
    private javax.swing.JFrame jFrameExplore;
    private javax.swing.JFrame jFrameFight;
    private javax.swing.JLabel jLabelEnemy;
    private javax.swing.JLabel jLabelhealth;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaExplore;
    private javax.swing.JTextArea jTextAreaStatus;
    // End of variables declaration//GEN-END:variables
}
