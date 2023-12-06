/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GroupProject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dianaevtimova
 */
public class Question extends javax.swing.JFrame {
    
    private int count;
    private static final int MAX = 10;
    private int rightAnswers;
    private int wrongAnswers;
    private JButton option1;
    private JButton option2;
    private JButton option3;
    private JButton option4;
    private String correctAnswer;

    /**
     * Creates new form Question
     */
    public Question(int rightAnswers, int wrongAnswers, int count) {
        if (count >= MAX) {
            dispose();
        }
        initComponents();

        setExtendedState(Frame.MAXIMIZED_BOTH);
        setResizable(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //CodeSide = new javax.swing.JPanel();
        AnswerSide = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        option1 = new javax.swing.JButton();
        option2 = new javax.swing.JButton();
        option3 = new javax.swing.JButton();
        option4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setTitle("Question");
        setAutoRequestFocus(false);

        setLayout(new BorderLayout());

        QuestionAnswer currentQuestion = QuestionData.getRandomQuestion();

        correctAnswer = currentQuestion.getrAnswer();

        ArrayList<String> answers = new ArrayList<String>();
        answers.add(currentQuestion.getrAnswer());
        answers.add(currentQuestion.getwAnswer1());
        answers.add(currentQuestion.getwAnswer2());
        answers.add(currentQuestion.getwAnswer3());

        Collections.shuffle(answers);

        JLabel questionImage = new JLabel();
        questionImage.setIcon(resizeImageIcon(currentQuestion.getImgPath()));
        add(questionImage, BorderLayout.WEST);
        //CodeSide.add(questionImage);

        //getContentPane().add(CodeSide);

        AnswerSide.setBackground(new java.awt.Color(255, 204, 153));
        AnswerSide.setPreferredSize(new java.awt.Dimension(400, 500));

        title.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(50, 91, 110));
        title.setText("Question");

        question.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        question.setForeground(new java.awt.Color(50, 91, 110));
        question.setText(currentQuestion.getqText());

        type.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(50, 91, 110));
        type.setText("Select the correct option:");

        option1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        option1.setText(answers.get(0));

        option2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        option2.setText(answers.get(1));

        option3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        option3.setText(answers.get(2));

        option4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        option4.setText(answers.get(3));

        option1.addActionListener(e -> handleAnswer(option1));
        option2.addActionListener(e -> handleAnswer(option2));
        option3.addActionListener(e -> handleAnswer(option3));
        option4.addActionListener(e -> handleAnswer(option4));

        javax.swing.GroupLayout AnswerSideLayout = new javax.swing.GroupLayout(AnswerSide);
        AnswerSide.setLayout(AnswerSideLayout);
        AnswerSideLayout.setHorizontalGroup(
                AnswerSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AnswerSideLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(type)
                                .addGap(18, 18, 18)
                                .addGroup(AnswerSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(option1)
                                        .addComponent(option2)
                                        .addComponent(option3)
                                        .addComponent(option4))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(AnswerSideLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(question)
                                .addContainerGap(28, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerSideLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(AnswerSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerSideLayout.createSequentialGroup()
                                                .addGap(143, 143, 143))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerSideLayout.createSequentialGroup()
                                                .addComponent(title)
                                                .addGap(115, 115, 115))))
        );
        AnswerSideLayout.setVerticalGroup(
                AnswerSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AnswerSideLayout.createSequentialGroup()
                                .addContainerGap(119, Short.MAX_VALUE)
                                .addComponent(title)
                                .addGap(18, 18, 18)
                                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(AnswerSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(type)
                                        .addComponent(option1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(option2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(option3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(option4)
                                .addGap(18, 18, 18)
                                .addGap(147, 147, 147))
        );

        getContentPane().add(AnswerSide);
        AnswerSide.setBounds(400, 0, 408, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ImageIcon resizeImageIcon(String imagePath) {
        ImageIcon originalIcon = new ImageIcon(imagePath);
        Image originalImage = originalIcon.getImage();

        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();

        double widthScale = (double) 600 / originalWidth;
        double heightScale = (double) 600 / originalHeight;
        double scale = Math.min(widthScale, heightScale);

        int newWidth = (int) (originalWidth * scale);
        int newHeight = (int) (originalHeight * scale);

        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    private void handleAnswer(JButton selectedButton) {
        if (selectedButton.getText().equals(correctAnswer)) {
            dispose();
            Question newQuestion = new Question(rightAnswers++, wrongAnswers, count++);
            newQuestion.setVisible(true);
        } else {
            dispose();
            Question newQuestion = new Question(rightAnswers, wrongAnswers++, count++);
            newQuestion.setVisible(true);
        }
    }


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
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question(0, 0, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AnswerSide;
    private javax.swing.JPanel CodeSide;
    private javax.swing.JTextField answer;
    private javax.swing.JTextArea code;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel question;
    private javax.swing.JLabel title;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
