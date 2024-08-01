/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system.View;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import library.management.system.db.DBConnection;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
public class Book extends javax.swing.JFrame {

   Connection connection=null; 
PreparedStatement pst=null;
ResultSet rs=null;
    public Book()  {
        initComponents();
        connection=DBConnection.connect();
        tableload();
    }
    public void tableload(){
            try {
                String sql="SELECT id AS ID,title AS Title,author AS Author,isbn AS ISBN,category_id AS CategoryID  FROM books";
                pst=connection.prepareStatement(sql);
                rs=pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
}
    public void tabledata(){
        int r=table1.getSelectedRow();
        String BookID=table1.getValueAt(r,0).toString();
        String BookTitle=table1.getValueAt(r,1).toString();
        String Author=table1.getValueAt(r,2).toString();
        String Isbn=table1.getValueAt(r,3).toString();
        String CategoryID=table1.getValueAt(r,4).toString();
        
        BookIDtxt.setText(BookID);
        BookTitletxt.setText(BookTitle);
        Authortxt.setText(Author);
        Isbntxt.setText(Isbn);
        CategoryIDtxt.setText(CategoryID);

    }
    
     public void update(){
    String ID=BookIDtxt.getText();
    String Title=BookTitletxt.getText();
    String Author=Authortxt.getText();
    String Isbn=Isbntxt.getText();
    String CategoryID=CategoryIDtxt.getText();
    
         try {
             String sql="UPDATE books SET  id='"+ID+"',title='"+Title+"',author='"+Author+"',isbn='"+Isbn+"',category_id='"+CategoryID+"'WHERE id='"+ID+"'";
              pst=connection.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null,"Succsesfully Updated");
         } catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
}
     public void clear(){
         BookIDtxt.setText("");
         BookTitletxt.setText("");
         Authortxt.setText("");
         Isbntxt.setText("");
         CategoryIDtxt.setText("");
         
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookIDlbl = new javax.swing.JLabel();
        Authorlbl = new javax.swing.JLabel();
        BookTitlelbl = new javax.swing.JLabel();
        BookIDtxt = new javax.swing.JTextField();
        Isbnlbl = new javax.swing.JLabel();
        BookTitletxt = new javax.swing.JTextField();
        Authortxt = new javax.swing.JTextField();
        Isbntxt = new javax.swing.JTextField();
        CategoryIDlbl = new javax.swing.JLabel();
        CategoryIDtxt = new javax.swing.JTextField();
        Bookslbl = new javax.swing.JLabel();
        Insertbtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BookIDlbl.setText("BookID");

        Authorlbl.setText("Author");

        BookTitlelbl.setText("BookTitle");

        Isbnlbl.setText("Isbn");

        CategoryIDlbl.setText("CategoryID");

        CategoryIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryIDtxtActionPerformed(evt);
            }
        });

        Bookslbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Bookslbl.setText("                    BOOKS");

        Insertbtn.setText("Insert");
        Insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertbtnActionPerformed(evt);
            }
        });

        Updatebtn.setText("Update");
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Clearbtn.setText("Clear");
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });

        Exitbtn.setText("Exit");
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "BookID", "BookTitle", "Author", "Isbn", "CategoryID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jButton1.setText("Borrowing");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(Bookslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Isbnlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Isbntxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BookTitlelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookTitletxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Authorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Authortxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BookIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CategoryIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Clearbtn)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Updatebtn)
                                            .addComponent(CategoryIDtxt))))))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Deletebtn)
                                .addComponent(Insertbtn))
                            .addComponent(Exitbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bookslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookTitlelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookTitletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Authorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Authortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Isbnlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Isbntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Insertbtn)
                            .addComponent(Updatebtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Deletebtn)
                            .addComponent(Clearbtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Exitbtn)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(782, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CategoryIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryIDtxtActionPerformed

    private void InsertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertbtnActionPerformed
        String BookID;
        String BookTitle;
        String Author;
        String Isbn;
        String CategoryID;
        
        BookID =BookIDtxt.getText();
        BookTitle=BookTitletxt.getText();
        Author=Authortxt.getText();
        Isbn=Isbntxt.getText();
        CategoryID=CategoryIDtxt.getText();
        
        try {
            String sql="INSERT INTO books(id,title,author,isbn,category_id)VALUES ('"+BookID+"','"+BookTitle+"','"+Author+"','"+Isbn+"','"+CategoryID+"')";
            pst =connection.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "SUCCESSFULLY INSERTED");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        tableload();
    }//GEN-LAST:event_InsertbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        int check=JOptionPane.showConfirmDialog(null,"Do you want to delete");
        
        if(check==0){
            String id=BookIDtxt.getText();
            try {
                String sql="DELETE FROM books WHERE id='"+id+"'";
                pst=connection.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Deleted Succsessfully");
                        
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        tableload();
        clear();
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
clear();        
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        tabledata();
    }//GEN-LAST:event_table1MouseClicked

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
tabledata();        // TODO add your handling code here:
    }//GEN-LAST:event_table1KeyReleased

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
update(); 
tableload();
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Borrowing r1=new Borrowing();
        r1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

       public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                new Book().setVisible(true);
            }
        });
     }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Authorlbl;
    private javax.swing.JTextField Authortxt;
    private javax.swing.JLabel BookIDlbl;
    private javax.swing.JTextField BookIDtxt;
    private javax.swing.JLabel BookTitlelbl;
    private javax.swing.JTextField BookTitletxt;
    private javax.swing.JLabel Bookslbl;
    private javax.swing.JLabel CategoryIDlbl;
    private javax.swing.JTextField CategoryIDtxt;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Exitbtn;
    private javax.swing.JButton Insertbtn;
    private javax.swing.JLabel Isbnlbl;
    private javax.swing.JTextField Isbntxt;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}