/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GroupProject;

/**
 *
 * @author dianaevtimova
 */
public class Difficulty extends javax.swing.JFrame {

    /**
     * Creates new form Difficulty
     */
    public Difficulty() {
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

        panel = new javax.swing.JPanel();
        titel = new javax.swing.JLabel();
        beginner_button = new javax.swing.JButton();
        intermediate_button = new javax.swing.JButton();
        advanced_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose the Difficulty");
        setPreferredSize(new java.awt.Dimension(800, 500));

        panel.setBackground(new java.awt.Color(255, 204, 153));
        panel.setForeground(new java.awt.Color(255, 204, 153));
        panel.setPreferredSize(new java.awt.Dimension(800, 500));

        titel.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        titel.setForeground(new java.awt.Color(50, 91, 110));
        titel.setText("Choose the difficulty");

        beginner_button.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        beginner_button.setForeground(new java.awt.Color(50, 91, 110));
        beginner_button.setText("Begginer");
        beginner_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginner_buttonActionPerformed(evt);
            }
        });

        intermediate_button.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        intermediate_button.setForeground(new java.awt.Color(50, 91, 110));
        intermediate_button.setText("Intermediate");
        intermediate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intermediate_buttonActionPerformed(evt);
            }
        });

        advanced_button.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        advanced_button.setForeground(new java.awt.Color(50, 91, 110));
        advanced_button.setText("Advanced");
        advanced_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advanced_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(beginner_button, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(intermediate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(advanced_button, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 218, Short.MAX_VALUE)
                .addComponent(titel)
                .addGap(203, 203, 203))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(titel)
                .addGap(36, 36, 36)
                .addComponent(beginner_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(intermediate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(advanced_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beginner_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginner_buttonActionPerformed
        // TODO add your handling code here:
        Question QuestionFrame = new Question();
        QuestionFrame.setVisible(true);
        QuestionFrame.pack();
         
        //Let the frame be displayed in the center
        QuestionFrame.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_beginner_buttonActionPerformed

    private void intermediate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intermediate_buttonActionPerformed
        Question QuestionFrame = new Question();
        QuestionFrame.setVisible(true);
        QuestionFrame.pack();
         
        //Let the frame be displayed in the center
        QuestionFrame.setLocationRelativeTo(null);
        
        this.dispose();        
    }//GEN-LAST:event_intermediate_buttonActionPerformed

    private void advanced_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advanced_buttonActionPerformed
        Question QuestionFrame = new Question();
        QuestionFrame.setVisible(true);
        QuestionFrame.pack();
         
        //Let the frame be displayed in the center
        QuestionFrame.setLocationRelativeTo(null);
        
        this.dispose();        
    }//GEN-LAST:event_advanced_buttonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton advanced_button;
    private javax.swing.JButton beginner_button;
    private javax.swing.JButton intermediate_button;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
