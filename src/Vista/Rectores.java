/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kristian--
 */
public class Rectores extends javax.swing.JFrame {

    /**
     * Creates new form Rectores
     */
    public Rectores() {
        initComponents();
        CargarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneRector = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtTipoDoc = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtTipodesangre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rbMasculinoA = new javax.swing.JRadioButton();
        rbFemeninoA = new javax.swing.JRadioButton();
        btnguardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        ckMatriculado = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRectores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneRector.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Documento:");

        jLabel5.setText("Tipo de identificacion:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Tipo de sangre:");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        txtTipodesangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipodesangreActionPerformed(evt);
            }
        });

        jLabel13.setText("Sexo:");

        rbMasculinoA.setText("Masculino");
        rbMasculinoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoAActionPerformed(evt);
            }
        });

        rbFemeninoA.setText("Femenino");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        ckMatriculado.setText("Activo");

        javax.swing.GroupLayout paneRectorLayout = new javax.swing.GroupLayout(paneRector);
        paneRector.setLayout(paneRectorLayout);
        paneRectorLayout.setHorizontalGroup(
            paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneRectorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneRectorLayout.createSequentialGroup()
                        .addComponent(ckMatriculado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(paneRectorLayout.createSequentialGroup()
                        .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDocumento)
                            .addGroup(paneRectorLayout.createSequentialGroup()
                                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(paneRectorLayout.createSequentialGroup()
                        .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(btnguardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion)
                            .addComponent(txtTipodesangre)
                            .addComponent(txtTipoDoc)
                            .addComponent(txtTelefono)
                            .addGroup(paneRectorLayout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(29, 29, 29)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar))
                            .addGroup(paneRectorLayout.createSequentialGroup()
                                .addComponent(rbMasculinoA)
                                .addGap(18, 18, 18)
                                .addComponent(rbFemeninoA)
                                .addContainerGap(135, Short.MAX_VALUE))))))
        );
        paneRectorLayout.setVerticalGroup(
            paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneRectorLayout.createSequentialGroup()
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneRectorLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneRectorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTipodesangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbMasculinoA)
                        .addComponent(rbFemeninoA))
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(ckMatriculado)
                .addGap(18, 18, 18)
                .addGroup(paneRectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        tblRectores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nombres", "Apellidos", "Documento", "Tipo de documento", "Direccion", "Tipo de sangre", "Sexo", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRectores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRectoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRectores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 486, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(paneRector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(950, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(paneRector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtTipodesangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipodesangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipodesangreActionPerformed

    private void rbMasculinoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoAActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String Nombres= txtNombres.getText();
        String Apellidos= txtApellidos.getText();
        String Documento= txtDocumento.getText();
        String TipodeIdentificacion= txtTipoDoc.getText();
        String Direccion= txtDireccion.getText();
        String Tipodesangre= txtTipodesangre.getText();
        String Sexo;
        if(rbMasculinoA.isSelected()==true){
            Sexo ="M";
        }else if(rbFemeninoA.isSelected()==true){
            Sexo="F";
        }else{
            Sexo="M";
        }
        String Telefono = txtTelefono.getText();
        Boolean Activo = ckMatriculado.isSelected();
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Rectores (Nombres,Apellidos,Documento,Tipo_identificacion,Direccion,Tipo_sangre,Sexo,Telefono,Activo) VALUES (?,?,?,?,?,?,?,?,?);");
            ps.setString(1, Nombres);
            ps.setString(2, Apellidos);
            ps.setString(3, Documento);
            ps.setString(4, TipodeIdentificacion);
            ps.setString(5, Direccion);
            ps.setString(6, Tipodesangre);
            ps.setString(7, Sexo);
            ps.setString(8, Telefono);
            ps.setBoolean(9, Activo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Rectores Guardado");
            // CargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String Nombres= txtNombres.getText();
        String Apellidos= txtApellidos.getText();
        String Documento= txtDocumento.getText();
        String TipodeIdentificacion= txtTipoDoc.getText();
        String Direccion= txtDireccion.getText();
        String Tipodesangre= txtTipodesangre.getText();
        String Sexo;
        if(rbMasculinoA.isSelected()==true){
            Sexo ="M";
        }else if(rbFemeninoA.isSelected()==true){
            Sexo="F";
        }else{
            Sexo="M";
        }
        String Telefono = txtTelefono.getText();
        Boolean Activo = ckMatriculado.isSelected();
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE Rectores SET  Nombres=?,Apellidos=?,Documento=?,Tipo_identificacion=?,Direccion=?,Tipo_sangre=?,Sexo=?,Telefono=?,Activo=? WHERE Id=?");
            ps.setString(1, Nombres);
            ps.setString(2, Apellidos);
            ps.setString(3, Documento);
            ps.setString(4, TipodeIdentificacion);
            ps.setString(5, Direccion);
            ps.setString(6, Tipodesangre);
            ps.setString(7, Sexo);
            ps.setString(8, Telefono);
            ps.setBoolean(9, Activo);
            ps.setInt(10,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Actualizacion exitosa");
            CargarTabla();
            Limpiar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(txtId.getText());

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM Rectores WHERE Id=?");
            ps.setInt(1,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Rectores Eliminado");
            CargarTabla();
            Limpiar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblRectoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRectoresMouseClicked
        try{
            int fila = tblRectores.getSelectedRow();
            int id = Integer.parseInt(tblRectores.getValueAt(fila,0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT Nombres,Apellidos,Documento,Tipo_identificacion,Direccion,Tipo_sangre,Sexo,Telefono,Activo FROM Rectores WHERE Id=?");
            ps.setInt(1, id);
            rs= ps.executeQuery();
            while(rs.next()){
                txtId.setText(String.valueOf(id));
                txtNombres.setText(rs.getString("Nombres"));
                txtApellidos.setText(rs.getString("Apellidos"));
                txtDocumento.setText(rs.getString("Documento"));
                txtTipoDoc.setText(rs.getString("Tipo_identificacion"));
                txtDireccion.setText(rs.getString("Direccion"));
                txtTipodesangre.setText(rs.getString("Tipo_sangre"));
                if(rs.getString("sexo").equals("M")){
                    rbMasculinoA.setSelected(true);
                }else if(rs.getString("sexo").equals("F")){
                    rbFemeninoA.setSelected(true);
                }
                txtTelefono.setText(rs.getString("Telefono"));
            }
        }
        catch(SQLException e ){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblRectoresMouseClicked

        private void CargarTabla() {
         DefaultTableModel mt = (DefaultTableModel) tblRectores.getModel();
        mt.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        int [] anchos ={1,1,10,10,8,2,10,2,8,1,5,7,8,8,2,8};
        for ( int i =0; i <tblRectores.getColumnCount();i++){
        tblRectores.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        try{
            Connection con = Conexion.getConexion();
             ps = con.prepareStatement("SELECT Id,Nombres,Apellidos,Documento,Tipo_identificacion,Direccion,Tipo_sangre,Sexo,Telefono,Activo FROM Rectores");
            rs= ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while (rs.next()){
                Object[] fila  = new Object [columnas];
                for (int indice=0;indice<columnas;indice++){
                    fila[indice]= rs.getObject(indice + 1);
                }
                mt.addRow(fila);
            }
        }
        catch(SQLException e ){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void Limpiar() {
txtId.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
       
        txtDireccion.setText("");
      
        txtDocumento.setText("");
        txtTelefono.setText("");
      
        txtTipodesangre.setText("");
        txtTipoDoc.setText("");
        
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
            java.util.logging.Logger.getLogger(Rectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rectores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JCheckBox ckMatriculado;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paneRector;
    private javax.swing.JRadioButton rbFemeninoA;
    private javax.swing.JRadioButton rbMasculinoA;
    private javax.swing.JTable tblRectores;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoDoc;
    private javax.swing.JTextField txtTipodesangre;
    // End of variables declaration//GEN-END:variables
}
