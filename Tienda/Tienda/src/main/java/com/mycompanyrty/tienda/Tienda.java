
package com.mycompanyrty.tienda;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;



public class Tienda extends javax.swing.JFrame {
    String mesas[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","15","16"};
    double precio =0;
    int cantidad =0;
    DefaultTableModel modelo=new DefaultTableModel();
    ArrayList<Venta> listaVentas=new ArrayList<Venta>();
    String descripcionPedidio = "empty";
    final double IVA = 0.21;

    public Tienda() {
        initComponents();
        this.setTitle("TIENDA MANU");
        this.setLocationRelativeTo(null);
        
        DefaultComboBoxModel comboMode2=new DefaultComboBoxModel(mesas);
        
        jComboBoxMesa.setModel(comboMode2);
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO/U");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");

        actualizarTabla();
        
        calcularPrecio();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnAgregar1 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        jComboBoxMesa = new javax.swing.JComboBox<>();
        jLabelMesa = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnHambutguesa = new javax.swing.JButton();
        btnPerrito = new javax.swing.JButton();
        brnPatatas = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("CANTIDAD");
        jLabel2.setToolTipText("");

        spnCantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.setToolTipText("");
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        tblProductos.setAutoCreateRowSorter(true);
        tblProductos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductos.setToolTipText("");
        jScrollPane1.setViewportView(tblProductos);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("SUBTOTAL");
        jLabel7.setToolTipText("");

        lblSubtotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSubtotal.setText("0.0$");
        lblSubtotal.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("IVA");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("TOTAL");
        jLabel10.setToolTipText("");

        lblIva.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIva.setText("0.0$");
        lblIva.setToolTipText("");

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotal.setText("0.0$");
        lblTotal.setToolTipText("");

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/TITULO - copia.png"))); // NOI18N

        btnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-bandera-a-cuadros-96.png"))); // NOI18N
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-imprimir-80.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-borrar-para-siempre-96.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-evento-aceptado-80.png"))); // NOI18N
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        jComboBoxMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesaActionPerformed(evt);
            }
        });

        jLabelMesa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelMesa.setText("MESA");
        jLabelMesa.setToolTipText("");

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(new java.awt.GridLayout(2, 5, 20, 20));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-coca-cola-96.png"))); // NOI18N
        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-agua-80.png"))); // NOI18N
        jPanel3.add(jButton3);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-fanta-is-a-brand-of-fruit-flavored-carbonated-drinks-marketed-globally-96.png"))); // NOI18N
        jButton1.setText("jButton1");
        jPanel3.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-pepsi-a-carbonated-soft-drink-manufactured-by-pepsico-96.png"))); // NOI18N
        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel3.add(jButton10);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-pulpo-100.png"))); // NOI18N
        jButton9.setText("jButton1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel3.add(jButton8);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel3.add(jButton7);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel3.add(jButton6);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel3.add(jButton4);

        jPanel2.setLayout(new java.awt.GridLayout(5, 5, 20, 20));

        btnHambutguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-burguer-96.png"))); // NOI18N
        btnHambutguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHambutguesaActionPerformed(evt);
            }
        });
        jPanel2.add(btnHambutguesa);

        btnPerrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-pancho-48.png"))); // NOI18N
        btnPerrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerritoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPerrito);

        brnPatatas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-chips-64.png"))); // NOI18N
        brnPatatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnPatatasActionPerformed(evt);
            }
        });
        jPanel2.add(brnPatatas);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-ensalada-60.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-cuenco-de-arroz-96.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-emoji-de-corte-de-carne-96.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-bistec-poco-hecho-40.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton17);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton19);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton20);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton21);

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton34);

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton33);

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton32);

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton31);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton30);

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton29);

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton28);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton27);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-x-96.png"))); // NOI18N
        jPanel2.add(jButton26);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel14.setText("COMIDAS");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel15.setText("BEBIDAS");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("NOTAS DEL PEDIDO");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/icons8-guardar-80.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243)
                                .addComponent(jLabelMesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10))
                                            .addGap(58, 58, 58)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblSubtotal)
                                                .addComponent(lblTotal)
                                                .addComponent(lblIva))
                                            .addGap(47, 47, 47)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(226, 226, 226))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(228, 228, 228))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMesa)
                            .addComponent(jComboBoxMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(lblSubtotal))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblIva)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(lblTotal))))
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesaActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        new Mesas().setVisible(true);
    }//GEN-LAST:event_btnReservasActionPerformed
    
    // Método que actualiza los lbl subtotal, iva, y total.
    private void actualizarDatosBajo(){
        double subtotal=0;
        for (Venta v : listaVentas){
            subtotal+=v.getImporte();
        }
        lblSubtotal.setText(aMoneda(subtotal));
        double importeConIva=subtotal*IVA;
        lblIva.setText(aMoneda(importeConIva));
        lblTotal.setText(aMoneda(subtotal+importeConIva));
    }
    
    // Elimina el producto de la tabla pidiendo antes una confirmación.
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila=tblProductos.getSelectedRow();
        double subtotal= Double.parseDouble(lblSubtotal.getText());
        if (fila>=0){
            int opcion=JOptionPane.showConfirmDialog(this, "¿Desea eliminar el producto?", "ELIMINAR PRODUCTO", JOptionPane.YES_NO_OPTION);
            if (opcion==JOptionPane.YES_OPTION){
                subtotal-=listaVentas.get(fila).getImporte();
                listaVentas.remove(fila);
                actualizarTabla();
                lblSubtotal.setText(aMoneda(subtotal));
                double iva=subtotal*0.16;
                lblIva.setText(aMoneda(iva));
                lblTotal.setText(aMoneda(subtotal+iva));

            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        JFileChooser fileChooser=new JFileChooser();
        //crear un archivo de texto con la compra
        if (fileChooser.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
            String ruta=fileChooser.getSelectedFile().getAbsolutePath();
            try (BufferedWriter archivo = new BufferedWriter(new FileWriter(ruta))) {
                archivo.write("COMPROBANTE DE COMPRA\n");
                LocalDateTime now = LocalDateTime.now();
                archivo.write("FECHA: "  + now + "\n");
                archivo.write("DESCRIPCION\tPRECIO\tCANTIDAD\tIMPORTE\n");
                for (Venta v : listaVentas){
                    archivo.write(v.getDescripcion() + "\t"+v.getPrecio()+"\t"+v.getCantidad()+"\t" + "\t"  +v.getImporte()+"\n");
                }
                archivo.write("SUBTOTAL: " + lblSubtotal.getText()+"\n");
                archivo.write("IVA: "+lblIva.getText()+"\n");
                archivo.write("TOTAL: "+lblTotal.getText()+"\n");
                archivo.write("---DESCRIPCIÓN DEL PEDIDO---\n");
                archivo.write(descripcionPedidio + "\n");
                archivo.write("GRACIAS POR SU COMPRA\n");
                archivo.write("VUELVA PRONTO\n");
                JOptionPane.showMessageDialog(this, "ARCHIVO CREADO CON EXITO EN LA RUTA: "+ ruta);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "ERROR AL CREAR EL ARCHIVO");
            }
        }
    }//GEN-LAST:event_btnImprimirActionPerformed
    
    // Método para redondear precios.
    private double redondear(double num) {
       Double numero = Math.round(num * 100.0) / 100.0;
        return numero;
    }

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed

        /*MENSAJE PIDIENDO QUE SI DESEA CONFIRMAR LA COMPRA con opción de si o no */
        int opcion=JOptionPane.showConfirmDialog(this, "¿Desea finalizar la compra?", "FINALIZAR COMPRA", JOptionPane.YES_NO_OPTION);
        if (opcion==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "COMPRA FINALIZADA");

            listaVentas.clear();
            actualizarTabla();
            lblSubtotal.setText("0.0$");
            lblIva.setText("0.0$");
            lblTotal.setText("0.0$");
           
            borrarVenta();
        }
    }//GEN-LAST:event_btnAgregar1ActionPerformed
    
    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged
    
// BOTONES DE COMIDA Y BEBIDA
    
    // Añade el objeto de tipo Venta a la lista y despues a la tabla.
    // Suma y actualiza los precios totales.
    private void btnHambutguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHambutguesaActionPerformed
        listaVentas.add(new Venta("Hamburguesa", cantidad, 5.20,redondear(cantidad*5.20)));
                actualizarTabla();
                actualizarDatosBajo();
    }//GEN-LAST:event_btnHambutguesaActionPerformed

    private void btnPerritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerritoActionPerformed
        listaVentas.add(new Venta("Perrito", cantidad, 3.35,redondear(cantidad*3.35)));
                actualizarTabla();
                actualizarDatosBajo();
    }//GEN-LAST:event_btnPerritoActionPerformed

    private void brnPatatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnPatatasActionPerformed
        listaVentas.add(new Venta("Patatas", cantidad, 2.00,redondear(cantidad*2.00)));
                actualizarTabla();
                actualizarDatosBajo();
    }//GEN-LAST:event_brnPatatasActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        listaVentas.add(new Venta("Ensalada", cantidad, 7.00,redondear(cantidad*7.00)));
                actualizarTabla();
                actualizarDatosBajo();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        listaVentas.add(new Venta("Arroz", cantidad, 5.00,redondear(cantidad*5.00)));
                actualizarTabla();
                actualizarDatosBajo();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        listaVentas.add(new Venta("Chuletón", cantidad, 25.00,redondear(cantidad*25.00)));
                actualizarTabla();
                actualizarDatosBajo();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        listaVentas.add(new Venta("Entrecot", cantidad, 22.00,redondear(cantidad*22.00)));
                actualizarTabla();
                actualizarDatosBajo();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        listaVentas.add(new Venta("CocaCola", cantidad, 2.40,redondear(cantidad*2.40)));
                actualizarTabla();
                actualizarDatosBajo();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        listaVentas.add(new Venta("Pulpo", cantidad, 666.40,redondear(cantidad*666.40)));
                actualizarTabla();
                actualizarDatosBajo();
               lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompanyrty/tienda/TITULO.png"))); 
                
    }//GEN-LAST:event_jButton9ActionPerformed
    //Guarda la descripción en un String.
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        descripcionPedidio = txtDescripcion.getText();
        if (!txtDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Descripción guardada");
        }else{
            JOptionPane.showMessageDialog(this, "Debe introducir una descripción");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void borrarVenta(){
        precio=0;
        cantidad=0;
    }
    public void calcularPrecio(){
        
        cantidad=Integer.parseInt(spnCantidad.getValue().toString());
       
        
        
    }
    public String aMoneda(double precio){
        return Math.round(precio*100.0)/100.0 + "";      
    }
    
    public void actualizarTabla(){
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
            
        }
        //recorrer la lista de ventas y añadir los productos a la tabla
        for (Venta v : listaVentas){
            Object x[]=new Object[4];
            x[0]=v.getDescripcion();
            x[1]=(v.getPrecio());
            x[2]=v.getCantidad();
            x[3]=v.getImporte();
            modelo.addRow(x);
            
        }
        tblProductos.setModel(modelo);
        
    }
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
                
            }
        });
    }

    
    

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnPatatas;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHambutguesa;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPerrito;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBoxMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
