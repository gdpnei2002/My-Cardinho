package br.com.mercadogod.screens;

import java.sql.*;
import br.com.mercadogod.dal.ConnectionModule;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class NewProdScreen extends javax.swing.JInternalFrame {
    private Connection connection;
    private PreparedStatement pst;
    private ResultSet rs;
    /**
     * Creates new form NewProdScreen
     */
    public NewProdScreen() {
        initComponents();
        connection = ConnectionModule.connection();
        search();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProdId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtProdName = new javax.swing.JTextField();
        txtProdVal = new javax.swing.JTextField();
        txtProdMou = new javax.swing.JTextField();
        txtProdPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProdOrigi = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSearch = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MERCADOGOD - NEW PROD SCREEN");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("PROD ID");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("*PRODUCT ID");

        txtProdId.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProdName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 398, 36));

        txtProdVal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtProdVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 400, 36));

        txtProdMou.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtProdMou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdMouActionPerformed(evt);
            }
        });
        jPanel2.add(txtProdMou, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 70, 36));

        txtProdPrice.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtProdPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 150, 36));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("*NOME PROD");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 170, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("*VALIDADE PROD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, -1, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("*QUANTIDADE PROD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 94, 180, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("*PRE??O PROD");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 93, -1, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("*VALOR ORIGINAL PROD");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 136, 240, -1));

        txtProdOrigi.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtProdOrigi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 330, 36));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mercadogod/icons/create.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mercadogod/icons/update.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mercadogod/icons/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSearchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSearch);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setToolTipText("PROD ID");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("PESQUISAR");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setBounds(0, 0, 1365, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdMouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdMouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdMouActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        create();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tableSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSearchMouseClicked
        // TODO add your handling code here:
        before_modify();
    }//GEN-LAST:event_tableSearchMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        edit();
    }//GEN-LAST:event_btnEditActionPerformed
    private void create(){
        String query = "insert into prodtable (productid,prodname,prodval,prodamount,prodprice,prodvalue) values (DEFAULT,?,?,?,?,?)";
        try{
            if(txtProdName.getText().isEmpty()||txtProdVal.getText().isEmpty()||txtProdMou.getText().isEmpty()||txtProdPrice.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Informe os campos obrigat??rios!");
            } else {
                pst = connection.prepareStatement(query);
                pst.setString(1, txtProdName.getText());
                pst.setString(2,txtProdVal.getText());
                pst.setString(3, txtProdMou.getText());
                pst.setString(4, txtProdPrice.getText().replace(",", "."));
                pst.setString(5, txtProdOrigi.getText().replace(",", "."));
                int sucesso = pst.executeUpdate();
                if(sucesso > 0){
                    JOptionPane.showMessageDialog(null,"Produto adicionado com sucesso!");
                    txtProdName.setText(null);
                    txtProdVal.setText(null);
                    txtProdMou.setText(null);
                    txtProdPrice.setText(null);
                    txtProdOrigi.setText(null);
                    search();
                }
            }
        } catch(SQLException e){
            
        }
    }
    private void search(){
        String query = "select productid as IDProduto, prodname as NomeProd, prodval as Validade, prodamount as Quantidade, prodprice as Pre??o, prodvalue as ProdCusto from prodtable where prodname like ?";
        try{
            pst = connection.prepareStatement(query);
            pst.setString(1, txtSearch.getText()+"%");
            rs = pst.executeQuery();
            tableSearch.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            
        }
    }
    private void before_modify(){
        int set = tableSearch.getSelectedRow();
        txtProdId.setText(tableSearch.getModel().getValueAt(set,0).toString());
        txtProdName.setText(tableSearch.getModel().getValueAt(set,1).toString());
        txtProdVal.setText(tableSearch.getModel().getValueAt(set,2).toString());
        txtProdMou.setText(tableSearch.getModel().getValueAt(set,3).toString());
        txtProdPrice.setText(tableSearch.getModel().getValueAt(set,4).toString());
        txtProdOrigi.setText(tableSearch.getModel().getValueAt(set,5).toString());
        btnCreate.setEnabled(false);
    }
    private void edit(){
        String query = "update prodtable set prodname=?, prodval=?, prodamount=?, prodprice=?,prodvalue=? where productid=?";
        try{
            if(txtProdId.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Utilize a tabela de pesquisa para conseguir informar o ID do produto!");
            } else{
                pst = connection.prepareStatement(query);
                pst.setString(1, txtProdName.getText());
                pst.setString(2, txtProdVal.getText());
                pst.setString(3, txtProdMou.getText());
                pst.setString(4, txtProdPrice.getText().replace(",", "."));
                pst.setString(5, txtProdOrigi.getText().replace(",", "."));
                pst.setString(6, txtProdId.getText());
                int sucesso = pst.executeUpdate();
                if(sucesso>0){
                    JOptionPane.showMessageDialog(null,"Produto alterado com sucesso!");
                    txtProdName.setText(null);
                    txtProdVal.setText(null);
                    txtProdMou.setText(null);
                    txtProdId.setText(null);
                    txtProdPrice.setText(null);
                    txtProdOrigi.setText(null);
                    btnCreate.setEnabled(true);
                    search();
                }
            }
        }catch(SQLException e){
            
        }
    }
    private void delete(){
        String query = "delete from prodtable where productid=?";
        try{
            if(txtProdId.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Utilize a tabela de procura para informar o produto a ser deletado!");
            } else {
                pst = connection.prepareStatement(query);
                pst.setString(1, txtProdId.getText());
                int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar este produto ?","Aten????o", JOptionPane.YES_NO_OPTION);
                if(confirm==JOptionPane.YES_OPTION){
                    int sucesso = pst.executeUpdate();
                    if(sucesso>0){
                        JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
                        txtProdName.setText(null);
                        txtProdVal.setText(null);
                        txtProdMou.setText(null);
                        txtProdId.setText(null);
                        txtProdPrice.setText(null);
                        txtProdOrigi.setText(null);
                        btnCreate.setEnabled(true);
                        search();
                    }
                } else {
                    
                }
            }
        }catch(SQLException e){
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSearch;
    private javax.swing.JTextField txtProdId;
    private javax.swing.JTextField txtProdMou;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtProdOrigi;
    private javax.swing.JTextField txtProdPrice;
    private javax.swing.JTextField txtProdVal;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
