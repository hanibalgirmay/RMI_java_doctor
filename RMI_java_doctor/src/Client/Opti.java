/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import chat.ChatInterface;
import doctor.Login;
import doctor.home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author awet
 */
public class Opti extends javax.swing.JFrame {

    /**
     * Creates new form Opti
     */
    public Opti() {
        initComponents();
        groupButton();
    }
    
    private void groupButton(){
        ButtonGroup bg1 = new ButtonGroup();
        
        bg1.add(radio1);
        bg1.add(radio2);
        bg1.add(radio3);
        radio1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                option.removeAllItems();
                option.addItem("Select sickness");
                option.addItem("headace");
                option.addItem("stomach flu");
                option.addItem("caght");
                option.addItem("fever");
            }
        });
        
        radio2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                option.removeAllItems();
                option.addItem("Select sickness");
                option.addItem("lever");
                option.addItem("diabet");
                option.addItem("eye");
                option.addItem("test");
            }
        });
        radio3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                option.removeAllItems();
                option.addItem("1");
                option.addItem("2");
                option.addItem("3");
                
            }
        });
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        percerscription_area = new javax.swing.JTextArea();
        option = new javax.swing.JComboBox<>();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        percerscription_area.setEditable(false);
        percerscription_area.setColumns(20);
        percerscription_area.setRows(5);
        jScrollPane1.setViewportView(percerscription_area);

        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select sickness", "headace", "stomach flu", "fever", "caught" }));
        option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionActionPerformed(evt);
            }
        });

        radio1.setText("Allergists");

        radio2.setText("Dermatologist");

        radio3.setText("Family physicians");

        jButton1.setText("Doctor>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setText("You can get help quickely here..");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radio1)
                                        .addGap(10, 10, 10)
                                        .addComponent(radio2)
                                        .addGap(10, 10, 10)
                                        .addComponent(radio3)))
                                .addGap(99, 99, 99)))
                        .addGap(0, 29, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio1)
                    .addComponent(radio2)
                    .addComponent(radio3))
                .addGap(18, 18, 18)
                .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Online Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionActionPerformed
        // TODO add your handling code here:
//        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select sickness", "headace","stomachace", "caught", "fever" }));
//        if(radio1.isSelected()){
            try{
                Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
                optionIF i = (optionIF)reg.lookup("option");
    //            System.out.println("enter type of sickness: ");
    //            i.getOptions((String) option.getSelectedItem());
    //            String op;
                System.out.println("enter type of sickness: ");
                if(option.getSelectedItem().equals("headace")){
                    System.out.println(option.getSelectedItem());
    //                JOptionPane.showMessageDialog(null, "option headace clicked successfully");
                    i.getOptions("headace");
                    String b = i.getOptions("headace");
                    percerscription_area.setText(b);


                }
                if(option.getSelectedItem().equals("stomach flu")){
                    System.out.println(option.getSelectedItem());
                    i.getOptions("stomach flu");
                    String b = i.getOptions("stomach flu");
                    percerscription_area.setText(b);
                }
                if(option.getSelectedItem().equals("caught")){
                    System.out.println(option.getSelectedItem());
                    i.getOptions("caught");
                    String b = i.getOptions("caught");
                    percerscription_area.setText(b);
                }
                if(option.getSelectedItem().equals("fever")){
                    System.out.println(option.getSelectedItem());
                    i.getOptions("fever");
                    String b = i.getOptions("fever");
                    percerscription_area.setText(b);
                }
                if(option.getSelectedItem().equals("Select sickness")){
                    System.out.println("------------------------------");
                    percerscription_area.setText("");
                }
            }catch(Exception e){e.printStackTrace();}
//        }
        
        if(radio2.isSelected()){
            try{
                Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
                optionIF i = (optionIF)reg.lookup("option");
    //            System.out.println("enter type of sickness: ");
    //            i.getOptions((String) option.getSelectedItem());
    //            String op;
                System.out.println("enter type of sickness: ");
                if(option.getSelectedItem().equals("lever")){
                    System.out.println(option.getSelectedItem());
    //                JOptionPane.showMessageDialog(null, "option headace clicked successfully");
                    i.getOptions("lever");
                    String b = i.getOptions("lever");
                    percerscription_area.setText(b);


                }
                if(option.getSelectedItem().equals("diabet")){
                    System.out.println(option.getSelectedItem());
                    i.getOptions("diabet");
                    String b = i.getOptions("diabet");
                    percerscription_area.setText(b);
                }
                if(option.getSelectedItem().equals("eye")){
                    System.out.println(option.getSelectedItem());
                    i.getOptions("eye");
                    String b = i.getOptions("eye");
                    percerscription_area.setText(b);
                }
                if(option.getSelectedItem().equals("test")){
                    System.out.println(option.getSelectedItem());
                    i.getOptions("test");
                    String b = i.getOptions("test");
                    percerscription_area.setText(b);
                }
                if(option.getSelectedItem().equals("Select sickness")){
                    System.out.println("------------------------------");
                    percerscription_area.setText("");
                }
            }catch(Exception e){e.printStackTrace();}
        }
        
        if(radio3.isSelected()){
            try{
                Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
                optionIF i = (optionIF)reg.lookup("option");
    //            System.out.println("enter type of sickness: ");
    //            i.getOptions((String) option.getSelectedItem());
    //            String op;
                System.out.println("enter type of sickness: ");
                
                if(option.getSelectedItem().equals("Select sickness")){
                    System.out.println("------------------------------");
                    percerscription_area.setText("");
                }
            }catch(Exception e){e.printStackTrace();}
        }
        


        
        
       
//        if(radio1.getSelectedIcon().equals("Allergists")){            
//            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ashdjhg 1", "oiuuw2", "hansd3", "Iposd" }));
//        }
//        if(radio2.getSelectedIcon().equals("Dermatologist")){
//            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ywayes ", "hanibal", "tessaj", "nono" }));
//        }
    }//GEN-LAST:event_optionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {        
            Registry registry = LocateRegistry.getRegistry("localhost", 3999);
            ChatInterface chat = (ChatInterface)registry.lookup("chat");  //getting a remote reference       
            new Option(chat);  //pass the reference as a parameter 
        } catch (Exception e) {
            System.out.println("error"+e);
        }
//        new Option(chat).setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Opti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> option;
    private javax.swing.JTextArea percerscription_area;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    // End of variables declaration//GEN-END:variables
}
