package pruebatiendafrutas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TiendaFrutas extends javax.swing.JFrame {
    
    Cliente newCliente;
    
    String[][] Pedido;
    DefaultTableModel tblModelPedido;
    
    List listaFruta = new ArrayList<>();
   
    
    public TiendaFrutas() {
         initComponents();
         
        lblMostrarCedulaInfo.setText("");
        lblMostrarNombreInfo.setText("");
       
        //Inicializo Tabla 
        
        Pedido = new String [][] {};
        
         String tituloTblPedidos[] = new String [] {
            "Fruta",
            "Precio",
        };
        
        tblModelPedido = new DefaultTableModel(Pedido, tituloTblPedidos);
        tblPedidosFrutas.setModel(tblModelPedido);
        
        //Fin Tabla 
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        lblTituloFrutas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbListaFrutas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoFruta = new javax.swing.JTextField();
        lblNombreFruta = new javax.swing.JLabel();
        txtNombreFruta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioFruta = new javax.swing.JTextField();
        btnAñadirFruta = new javax.swing.JButton();
        btnRegistrarPedido = new javax.swing.JButton();
        lblTituloPedidos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbListaCedulas = new javax.swing.JComboBox<>();
        btnMostrarPedido = new javax.swing.JButton();
        lblInformacion = new javax.swing.JLabel();
        lblNombreInformacion = new javax.swing.JLabel();
        lblInfoCedula = new javax.swing.JLabel();
        lblMostrarNombreInfo = new javax.swing.JLabel();
        lblMostrarCedulaInfo = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidosFrutas = new javax.swing.JTable();
        btnSeleccionarFruta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloCliente.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTituloCliente.setText("Cliente");

        lblNombre.setText("Nombre");

        lblCedula.setText("Cédula");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        lblTituloFrutas.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTituloFrutas.setText("Frutas");

        jLabel1.setText("Lista de Frutas");

        cmbListaFrutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pera", "Uva", "Manzana", "Naranja", "Sandia" }));

        jLabel2.setText("Codigo");

        lblNombreFruta.setText("Nombre");

        jLabel3.setText("Precio");

        btnAñadirFruta.setText("Añadir Fruta al Pedido");
        btnAñadirFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirFrutaActionPerformed(evt);
            }
        });

        btnRegistrarPedido.setText("Registrar Pedido");
        btnRegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPedidoActionPerformed(evt);
            }
        });

        lblTituloPedidos.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTituloPedidos.setText("Pedidos Registrados");

        jLabel4.setText("Lista de Cedulas");

        btnMostrarPedido.setText("Mostrar Pedido");
        btnMostrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPedidoActionPerformed(evt);
            }
        });

        lblInformacion.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        lblInformacion.setText("Información del Cliente");

        lblNombreInformacion.setText("Nombre");

        lblInfoCedula.setText("Cedula");

        lblMostrarNombreInfo.setText("jLabel5");

        lblMostrarCedulaInfo.setText("jLabel6");

        lblPedidos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        lblPedidos.setText("Pedidos del Cliente");

        tblPedidosFrutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPedidosFrutas);

        btnSeleccionarFruta.setText("Seleccionar");
        btnSeleccionarFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarFrutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTituloFrutas)
                        .addGap(264, 264, 264))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombreFruta)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(119, 119, 119)
                                    .addComponent(cmbListaCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMostrarPedido))
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNombre)
                                                .addComponent(lblCedula))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                                .addComponent(txtNombreCliente)))
                                        .addComponent(lblTituloPedidos))
                                    .addGap(119, 119, 119)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)))
                                .addComponent(lblInformacion)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombreInformacion)
                                        .addComponent(lblInfoCedula))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblMostrarNombreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMostrarCedulaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioFruta)
                                    .addComponent(txtNombreFruta)
                                    .addComponent(cmbListaFrutas, 0, 114, Short.MAX_VALUE)
                                    .addComponent(txtCodigoFruta))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSeleccionarFruta)
                                    .addComponent(btnAñadirFruta))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPedidos)
                                        .addGap(157, 157, 157))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnRegistrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloCliente)
                    .addComponent(lblTituloFrutas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmbListaFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarFruta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedula)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtCodigoFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreFruta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAñadirFruta))
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addComponent(btnRegistrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTituloPedidos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbListaCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarPedido))
                        .addGap(41, 41, 41)
                        .addComponent(lblInformacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreInformacion)
                            .addComponent(lblMostrarNombreInfo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInfoCedula)
                            .addComponent(lblMostrarCedulaInfo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPedidos)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnSeleccionarFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarFrutaActionPerformed
        // TODO add your handling code here:
        int cargosInt = cmbListaFrutas.getSelectedIndex();
              
        
        if(txtNombreCliente.getText().equals("") || txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Texto en Cliente");
        }else{
        
   
        
        if(cargosInt == 0){
        //Pera   
         txtCodigoFruta.setText("F001");
         txtNombreFruta.setText("Pera");
         txtPrecioFruta.setText("0.15");
         
         
        
        }else if(cargosInt == 1){
        //Uva      
        txtCodigoFruta.setText("F002");
         txtNombreFruta.setText("Uva");
         txtPrecioFruta.setText("0.10");
         
        }else if(cargosInt == 2){
        //Manzana
        txtCodigoFruta.setText("F003");
         txtNombreFruta.setText("Manzana");
         txtPrecioFruta.setText("0.35");
         
         
        }else if(cargosInt == 3){
        //Naranja      
        txtCodigoFruta.setText("F004");
         txtNombreFruta.setText("Naranja");
         txtPrecioFruta.setText("0.30");
         
        
        }else if(cargosInt == 4){
         //Sandia   
         txtCodigoFruta.setText("F005");
         txtNombreFruta.setText("Sandia");
         txtPrecioFruta.setText("1.00");
        }
        }
        
        
    }//GEN-LAST:event_btnSeleccionarFrutaActionPerformed

    private void btnAñadirFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirFrutaActionPerformed
        // TODO add your handling code here:
        
        listaFruta.add(txtNombreFruta);
        
        
    }//GEN-LAST:event_btnAñadirFrutaActionPerformed

    private void btnRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPedidoActionPerformed
        // TODO add your handling code here:
        
        txtNombreFruta.getText();
        txtCodigoFruta.getText();
        txtPrecioFruta.getText();
        txtCedula.getText();
        txtNombreCliente.getText();
        
        newCliente = new Cliente(txtNombreCliente.getText(), txtCedula.getText());
       
        cmbListaCedulas.addItem(newCliente.getCedula());
        
    }//GEN-LAST:event_btnRegistrarPedidoActionPerformed

    private void btnMostrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPedidoActionPerformed
        // TODO add your handling code here:
       
        tblModelPedido.setRowCount(0);
        
        String cedula = cmbListaCedulas.getSelectedItem().toString();
                
        lblMostrarCedulaInfo.setText(cedula);        
        lblMostrarNombreInfo.setText(txtNombreCliente.getText()); 
        
        
        tblModelPedido.addRow(new String[]{txtNombreFruta.getText(),txtPrecioFruta.getText()});
        
        
        
    }//GEN-LAST:event_btnMostrarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(TiendaFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiendaFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiendaFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiendaFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiendaFrutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirFruta;
    private javax.swing.JButton btnMostrarPedido;
    private javax.swing.JButton btnRegistrarPedido;
    private javax.swing.JButton btnSeleccionarFruta;
    private javax.swing.JComboBox<String> cmbListaCedulas;
    private javax.swing.JComboBox<String> cmbListaFrutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblInfoCedula;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblMostrarCedulaInfo;
    private javax.swing.JLabel lblMostrarNombreInfo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreFruta;
    private javax.swing.JLabel lblNombreInformacion;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblTituloCliente;
    private javax.swing.JLabel lblTituloFrutas;
    private javax.swing.JLabel lblTituloPedidos;
    private javax.swing.JTable tblPedidosFrutas;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigoFruta;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreFruta;
    private javax.swing.JTextField txtPrecioFruta;
    // End of variables declaration//GEN-END:variables
}
