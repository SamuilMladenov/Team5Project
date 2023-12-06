/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GroupProject;

/**
 *
 * @author dianaevtimova
 */
public class Result extends javax.swing.JFrame {
    public int correctCount = 0; //change it
    public int incorrectCount = 0;
    /**
     * Creates new form Result
     */
    public Result() {
        initComponents();
        customProgressBar();
    }
    
    private void customProgressBar(){
        progressBar = new javax.swing.JProgressBar(0, correctCount + incorrectCount);
         progressBar.setValue(correctCount); 
        progressBar.setStringPainted(true);
        progressBar.setBounds(50, 300, 700, 30);
        panel.add(progressBar);
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
        correct = new javax.swing.JLabel();
        incorrect = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        panel.setBackground(new java.awt.Color(255, 204, 153));
        panel.setPreferredSize(new java.awt.Dimension(800, 500));

        titel.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        titel.setForeground(new java.awt.Color(50, 91, 110));
        titel.setText("Quiz Results");

        correct.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        correct.setForeground(new java.awt.Color(50, 91, 110));
        correct.setText("Correct Answers:");

        incorrect.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        incorrect.setForeground(new java.awt.Color(50, 91, 110));
        incorrect.setText("Incorrect Answers:");

        progressBar.setBackground(new java.awt.Color(255, 153, 153));
        progressBar.setForeground(new java.awt.Color(153, 255, 51));
        progressBar.setMaximumSize(new java.awt.Dimension(200, 300));
        progressBar.setMinimumSize(new java.awt.Dimension(200, 300));
        progressBar.setPreferredSize(new java.awt.Dimension(200, 300));
        progressBar.setSize(new java.awt.Dimension(200, 300));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(titel))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(incorrect)
                            .addComponent(correct)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(titel)
                .addGap(55, 55, 55)
                .addComponent(correct)
                .addGap(50, 50, 50)
                .addComponent(incorrect)
                .addGap(70, 70, 70)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correct;
    private javax.swing.JLabel incorrect;
    private javax.swing.JPanel panel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
