/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompanyrty.tienda;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manu
 */
public class Mesas extends javax.swing.JFrame {
    private JButton botonPulsado;

    /**
     * Creates new form Mesas
     */
    public Mesas() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMesa2 = new javax.swing.JButton();
        btnMesa1 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        btnMesa5 = new javax.swing.JButton();
        btnMesa14 = new javax.swing.JButton();
        btnMesa13 = new javax.swing.JButton();
        btnMesa10 = new javax.swing.JButton();
        btnMesa9 = new javax.swing.JButton();
        btnMesa16 = new javax.swing.JButton();
        btnMesa12 = new javax.swing.JButton();
        btnMesa8 = new javax.swing.JButton();
        btnMesa4 = new javax.swing.JButton();
        btnMesa15 = new javax.swing.JButton();
        btnMesa11 = new javax.swing.JButton();
        btnMesa7 = new javax.swing.JButton();
        btnMesa3 = new javax.swing.JButton();
        jLabelMesas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();
        btnAddReserva = new javax.swing.JButton();
        btnDelReserva = new javax.swing.JButton();
        btnModReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setText("RESERVAS");

        btnMesa2.setText("2");
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });

        btnMesa1.setText("1");
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });

        btnMesa6.setText("6");
        btnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa6ActionPerformed(evt);
            }
        });

        btnMesa5.setText("5");
        btnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa5ActionPerformed(evt);
            }
        });

        btnMesa14.setText("14");
        btnMesa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa14ActionPerformed(evt);
            }
        });

        btnMesa13.setText("13");
        btnMesa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa13ActionPerformed(evt);
            }
        });

        btnMesa10.setText("10");
        btnMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa10ActionPerformed(evt);
            }
        });

        btnMesa9.setText("9");
        btnMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa9ActionPerformed(evt);
            }
        });

        btnMesa16.setText("16");
        btnMesa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa16ActionPerformed(evt);
            }
        });

        btnMesa12.setText("12");
        btnMesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa12ActionPerformed(evt);
            }
        });

        btnMesa8.setText("8");
        btnMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa8ActionPerformed(evt);
            }
        });

        btnMesa4.setText("4");
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });

        btnMesa15.setText("15");
        btnMesa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa15ActionPerformed(evt);
            }
        });

        btnMesa11.setText("11");
        btnMesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa11ActionPerformed(evt);
            }
        });

        btnMesa7.setText("7");
        btnMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa7ActionPerformed(evt);
            }
        });

        btnMesa3.setText("3");
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });

        jLabelMesas.setText("MESA SELECCIONADA:");

        tblReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "HORA", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblReservas);

        btnAddReserva.setText("AÑADIR RESERVA");
        btnAddReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReservaActionPerformed(evt);
            }
        });

        btnDelReserva.setText("ELIMINAR RESERVA");
        btnDelReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelReservaActionPerformed(evt);
            }
        });

        btnModReserva.setText("MODIFICAR RESERVA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMesa2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnMesa4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                            .addComponent(jLabelMesas))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabelMesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReservaActionPerformed
        if(botonPulsado == null){
            JOptionPane.showMessageDialog(this, "Selecciona una mesa para añadir una reserva");
            return;
        }
        // Pedir datos de reserva al usuario y crear una nueva reserva usando un JOptionPane
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String hora = JOptionPane.showInputDialog("Introduce la hora");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad"));

        Reserva reserva = new Reserva(Integer.parseInt(botonPulsado.getText()), nombre, hora, cantidad);

        reservas.add(reserva);

        // Actualiza la tabla
        actualizarTabla();
    }//GEN-LAST:event_btnAddReservaActionPerformed

    private void btnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa6ActionPerformed
        botonPulsado = btnMesa6;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa6ActionPerformed

    private void btnDelReservaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDelReservaActionPerformed
        // Elimina la reserva seleccionada
        int filaSeleccionada = tblReservas.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una reserva para eliminarla");
        } else {
            reservas.remove(filaSeleccionada);
            actualizarTabla();
        }
    }// GEN-LAST:event_btnDelReservaActionPerformed

    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa1ActionPerformed
        botonPulsado = btnMesa1;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
        actualizarTabla();
    }// GEN-LAST:event_btnMesa1ActionPerformed

    private void btnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa2ActionPerformed
        botonPulsado = btnMesa2;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa2ActionPerformed

    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa3ActionPerformed
        botonPulsado = btnMesa3;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa3ActionPerformed

    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa4ActionPerformed
        botonPulsado = btnMesa4;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa4ActionPerformed

    private void btnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa5ActionPerformed
        botonPulsado = btnMesa5;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa5ActionPerformed

    private void btnMesa7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa7ActionPerformed
        botonPulsado = btnMesa7;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa7ActionPerformed

    private void btnMesa8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa8ActionPerformed
        botonPulsado = btnMesa8;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa8ActionPerformed

    private void btnMesa9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa9ActionPerformed
        botonPulsado = btnMesa9;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa9ActionPerformed

    private void btnMesa10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa10ActionPerformed
        botonPulsado = btnMesa10;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa10ActionPerformed

    private void btnMesa11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa11ActionPerformed
        botonPulsado = btnMesa11;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa11ActionPerformed

    private void btnMesa12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa12ActionPerformed
        botonPulsado = btnMesa12;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa12ActionPerformed

    private void btnMesa13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa13ActionPerformed
        botonPulsado = btnMesa13;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa13ActionPerformed

    private void btnMesa14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa14ActionPerformed
        botonPulsado = btnMesa14;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa14ActionPerformed

    private void btnMesa15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa15ActionPerformed
        botonPulsado = btnMesa15;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa15ActionPerformed

    private void btnMesa16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesa16ActionPerformed
        botonPulsado = btnMesa16;
        jLabelMesas.setText("MESA SELECCIONADA: " + botonPulsado.getText());
    }// GEN-LAST:event_btnMesa16ActionPerformed

    List<Reserva> reservas = new ArrayList<>();

    // Inicializa el modelo con las columnas de la tabla
    DefaultTableModel modelo = new DefaultTableModel(new Object[] { "Mesa", "Nombre", "Hora", "Cantidad" }, 0);

    // Método para actualizar la tabla
    private void actualizarTabla() {
        // Limpia la tabla
        modelo.setRowCount(0);

        // Añade cada reserva a la tabla
        for (Reserva r : reservas) {
            modelo.addRow(new Object[] { r.mesa, r.nombre, r.hora, r.cantidad });
        }
        tblReservas.setModel(modelo);
    }

   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddReserva;
    private javax.swing.JButton btnDelReserva;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa10;
    private javax.swing.JButton btnMesa11;
    private javax.swing.JButton btnMesa12;
    private javax.swing.JButton btnMesa13;
    private javax.swing.JButton btnMesa14;
    private javax.swing.JButton btnMesa15;
    private javax.swing.JButton btnMesa16;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnMesa7;
    private javax.swing.JButton btnMesa8;
    private javax.swing.JButton btnMesa9;
    private javax.swing.JButton btnModReserva;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMesas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblReservas;
    // End of variables declaration//GEN-END:variables
}
