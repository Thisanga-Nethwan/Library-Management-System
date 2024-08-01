/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system.View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import library.management.system.db.DBConnection;
/**
 *
 * @author acer
 */
public class Category extends javax.swing.JFrame {

   Connection connection=null;
   PreparedStatement pst=null;
    public Category() {
        initComponents();
        connection=DBConnection.connect();
    }

    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Category = new javax.swing.JLabel();
        categorynamelbl = new javax.swing.JLabel();
        categoryidtxt = new javax.swing.JTextField();
        categoryidlbl = new javax.swing.JLabel();
        descriptiontxt = new javax.swing.JTextField();
        descriptionlbl1 = new javax.swing.JLabel();
        cinsertbtn = new javax.swing.JButton();
        ccancelbtn = new javax.swing.JButton();
        categorynametxt = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\nCategories");
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Category.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Category.setText("CATEGORIES");

        categorynamelbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categorynamelbl.setText("Category Name");

        categoryidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryidtxtActionPerformed(evt);
            }
        });

        categoryidlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoryidlbl.setText("CategoryID");

        descriptionlbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descriptionlbl1.setText(" Description");

        cinsertbtn.setText("Insert");
        cinsertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinsertbtnActionPerformed(evt);
            }
        });

        ccancelbtn.setText("Cancel");
        ccancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccancelbtnActionPerformed(evt);
            }
        });

        categorynametxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horror", "Fantacy", "Mystery", "Fiction", "ShortStory", "Novel", "Other" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categorynamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categorynametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ccancelbtn)
                .addGap(105, 105, 105)
                .addComponent(cinsertbtn)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(categorynametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categorynamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addComponent(descriptiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinsertbtn)
                    .addComponent(ccancelbtn))
                .addGap(38, 38, 38))
        );

        setSize(new java.awt.Dimension(475, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cinsertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinsertbtnActionPerformed
       String CategoryID;
       String Categoryname;
       String Description;
       
       CategoryID=categoryidtxt.getText();
       Categoryname=categorynametxt.getSelectedItem().toString();
       Description=descriptiontxt.getText();
       
        try {
         String   sql="INSERT INTO categories (id,name,description) VALUES ('"+CategoryID+"','"+Categoryname+"','"+Description+"')";
         pst=connection.prepareStatement(sql);
         pst.execute();
         
         JOptionPane.showMessageDialog(null,"Inserted Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);     
        }
        Book b1=new Book();
        b1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cinsertbtnActionPerformed

    private void categoryidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryidtxtActionPerformed

    private void ccancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccancelbtnActionPerformed
   System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ccancelbtnActionPerformed

     public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                new Category().setVisible(true);
            }
        });
     }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Category;
    private javax.swing.JLabel categoryidlbl;
    private javax.swing.JTextField categoryidtxt;
    private javax.swing.JLabel categorynamelbl;
    private javax.swing.JComboBox<String> categorynametxt;
    private javax.swing.JButton ccancelbtn;
    private javax.swing.JButton cinsertbtn;
    private javax.swing.JLabel descriptionlbl1;
    private javax.swing.JTextField descriptiontxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}