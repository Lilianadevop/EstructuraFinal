package main;


import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alondriwis
 */
import static javax.swing.JOptionPane.*;

public class VentanaLibro extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLibro
     */
    public VentanaLibro() {
        initComponents();
        m = (DefaultTableModel) tblLibro.getModel();
        buttonGroup1.add(rbtnburbuja);
        buttonGroup1.add(rbtshell);
        buttonGroup1.add(rbnradix);
        buttonGroup1.add(rbtquick);
        buttonGroup2.add(rbtnasc);
        buttonGroup2.add(rbtndesc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar6 = new javax.swing.JToolBar();
        jToolBar8 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnaagregar = new javax.swing.JButton();
        jToolBar7 = new javax.swing.JToolBar();
        btnguardar = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        btnCancelar = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        btnbuscar = new javax.swing.JButton();
        cbmIndex = new javax.swing.JComboBox<>();
        txtvalue = new javax.swing.JTextField();
        jToolBar5 = new javax.swing.JToolBar();
        btnbinaria = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtisbn = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibro = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        rbtnburbuja = new javax.swing.JRadioButton();
        rbtshell = new javax.swing.JRadioButton();
        rbtquick = new javax.swing.JRadioButton();
        rbtnasc = new javax.swing.JRadioButton();
        rbtndesc = new javax.swing.JRadioButton();
        rbnradix = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jToolBar6.setRollover(true);

        jToolBar8.setRollover(true);
        jToolBar6.add(jToolBar8);

        jButton3.setText("Cancelar");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar6.add(jButton3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Libro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        btnaagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar.png"))); // NOI18N
        btnaagregar.setText("Agregar");
        btnaagregar.setFocusable(false);
        btnaagregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnaagregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnaagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaagregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnaagregar);

        jToolBar7.setRollover(true);
        jToolBar7.setEnabled(false);

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setEnabled(false);
        btnguardar.setFocusable(false);
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jToolBar7.add(btnguardar);

        jToolBar2.setRollover(true);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnCancelar);

        jToolBar3.setRollover(true);

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/secuencial.png"))); // NOI18N
        btnbuscar.setText("Bsec");
        btnbuscar.setFocusable(false);
        btnbuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jToolBar3.add(btnbuscar);

        cbmIndex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Criterio", "ISBN", "Titulo", "Autor", "Editorial", "Precio" }));
        cbmIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmIndexActionPerformed(evt);
            }
        });

        jToolBar5.setRollover(true);

        btnbinaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Binaria.png"))); // NOI18N
        btnbinaria.setText("Bbin");
        btnbinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbinariaActionPerformed(evt);
            }
        });
        jToolBar5.add(btnbinaria);

        txtAutor.setEnabled(false);

        txtTitulo.setEnabled(false);

        txtisbn.setEnabled(false);

        txtEditorial.setEnabled(false);

        jLabel1.setText("ISBN");

        jLabel2.setText("Titulo");

        jLabel3.setText("Autor");

        jLabel4.setText("Editorial");

        jLabel5.setText("Precio");

        txtPrecio.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAutor)
                    .addComponent(txtisbn)
                    .addComponent(txtTitulo)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txtPrecio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Titulo", "Autor", "Editorial", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLibro.setCellSelectionEnabled(true);
        tblLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLibro);

        rbtnburbuja.setText("Burbuja");

        rbtshell.setText("Shell");

        rbtquick.setText("Quicksort");

        rbtnasc.setText("Asc");

        rbtndesc.setText("Des");
        rbtndesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtndescActionPerformed(evt);
            }
        });

        rbnradix.setText("Radix");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("*Metodos de ordenamiento**");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rbtnburbuja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtshell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtquick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbnradix))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rbtnasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtndesc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnburbuja)
                    .addComponent(rbtshell)
                    .addComponent(rbtquick)
                    .addComponent(rbnradix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnasc)
                    .addComponent(rbtndesc))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToolBar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtvalue)
                            .addComponent(cbmIndex, 0, 128, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToolBar7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToolBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbmIndex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        //boton de buscar en general por todos los campos
        if(txtvalue.getText().equals("") || cbmIndex.getSelectedIndex()==0){
            showMessageDialog(null, "Por favor ingrese el dato y criterio a buscar");
            txtvalue.requestFocus();
        }else
            if(!Metodo.bSec(L, txtvalue.getText(), tblLibro.getRowCount(),cbmIndex.getSelectedIndex()))
                showMessageDialog(null, "No se encuentra");
        
            
            
            
            
        
            
            
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        //darle click al guardar
        try{
            L[++tope] = new Libro(txtisbn.getText(), txtTitulo.getText(), txtAutor.getText(), txtEditorial.getText(), (Integer.parseInt(txtPrecio.getText())));
        
        }catch(NumberFormatException e){
            showMessageDialog(null, "Error: ingrese solo valores numericos enteros para el precio.");
            txtPrecio.requestFocus();
        }
        desBloquearCampos();
        Object O[] = new Object[5];
        O[0] = L[tope].getISBN();
        O[1] = L[tope].getTitulo();
        O[2] = L[tope].getAutor();
        O[3] = L[tope].getEd();
        O[4] = L[tope].getPrecio();
        m.addRow(O);
        BloquearCampos();
        limpicarcampos();
        btnaagregar.setEnabled(true);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void cbmIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmIndexActionPerformed
        if (cbmIndex.getSelectedIndex() != 0) {
            txtvalue.setEditable(true);
        } else {
            txtvalue.setEditable(false);
        }
    }//GEN-LAST:event_cbmIndexActionPerformed

    private void btnaagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaagregarActionPerformed
        //AGREGAR
        //desbloquear las cajas de texto para poder hacer registros
        desBloquearCampos();
        //limpicarcampos();
        desBloquearBotones();
        // BloquearCampos(); txtisbn.requestFocus();
        //crear renglones en la tabla
        //m.setRowCount(m.getRowCount() + 1);

    }//GEN-LAST:event_btnaagregarActionPerformed

    private void btnbinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbinariaActionPerformed
        // Busqueda binaria
        
        try{
            Libro[] L1 = new Libro[m.getRowCount()];
            //showMessageDialog(null, m.getRowCount());
            for (int i = 0; i < m.getRowCount(); i++) {

                L1[i] = new Libro(m.getValueAt(i, 0).toString(), m.getValueAt(i, 1).toString(), m.getValueAt(i, 2).toString(), m.getValueAt(i, 3).toString(), Integer.parseInt(m.getValueAt(i, 4).toString()));
            }

            if (L1.length > 0) {

                Metodo.ordBurbujaAlmno(L1, true, tblLibro.getSelectedColumn());

                int pos = binariaRecur(L1, txtvalue.getText(), 0, L1.length, cbmIndex.getSelectedIndex());

                if (pos != -1) {
                    showMessageDialog(rootPane, "se encuentra en la posición " + pos++);
                } else {
                    showMessageDialog(rootPane, "no se encuentra ");
                }

            } else {
                showMessageDialog(rootPane, "se encuentra en la posición 0");
            }
        }catch(HeadlessException | NumberFormatException e){
            showMessageDialog(rootPane, "no se encuentra");
        }
       
        
        
       
    }//GEN-LAST:event_btnbinariaActionPerformed

    private void rbtndescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtndescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtndescActionPerformed

    private void tblLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibroMouseClicked
        // Dar clic en cada columna para ordenar los datos
        
        if(!rbtnasc.isSelected() && !rbtndesc.isSelected())
            rbtnasc.setSelected(true);
        
        if(!rbtnburbuja.isSelected() && !rbtshell.isSelected() && !rbtquick.isSelected() && !rbnradix.isSelected())
            rbtquick.setSelected(true);
        
        int f = tblLibro.getSelectedColumn();
        L = new Libro[m.getRowCount()];
        for (int i = 0; i < m.getRowCount(); i++) {
            L[i] = new Libro(m.getValueAt(i, 0).toString(), m.getValueAt(i, 1).toString(), m.getValueAt(i, 2).toString(),
                    m.getValueAt(i, 3).toString(), Integer.parseInt(m.getValueAt(i, 4).toString()));
        }
        
        boolean a = rbtnasc.isSelected();
        if (rbtnburbuja.isSelected()) {
            Metodo.ordBurbujaAlmno(L, a, tblLibro.getSelectedColumn());
        }
        if (rbtquick.isSelected()) {
            Metodo.quicksortLibro(L, 0, a, L.length - 1, tblLibro.getSelectedColumn());
        }
        if (rbtshell.isSelected()) {
            Metodo.shellasc(L, a, tblLibro.getSelectedColumn());
        }
        if (rbnradix.isSelected()) {
            Metodo.radixSort(L, a, tblLibro.getSelectedColumn());

        }
        
        for (int i = 0; i < L.length; i++) {
            switch (f) {
                case 0:
                    m.setValueAt(L[i].getISBN(), i, f);
                    break;
                case 1:
                    m.setValueAt(L[i].getTitulo(), i, f);
                    break;
                case 2:
                    m.setValueAt(L[i].getAutor(), i, f);
                    break;
                case 3:
                    m.setValueAt(L[i].getEd(), i, f);
                    break;
                case 4:
                    m.setValueAt(L[i].getPrecio(), i, f);
                    break;
            }
        }
    }//GEN-LAST:event_tblLibroMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Salir
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Cancelar
        ///boton ce cancelar
        limpicarcampos();
        BloquearCampos();
        btnaagregar.setEnabled(true);
        btnguardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnbuscar.setEnabled(false);
        //new VentanaLibro().setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void desBloquearCampos() {

        txtisbn.setEnabled(true);
        txtTitulo.setEnabled(true);
        txtAutor.setEnabled(true);
        txtEditorial.setEnabled(true);
        txtPrecio.setEnabled(true);

    }

    public void BloquearCampos() {

        txtisbn.setEnabled(false);
        txtTitulo.setEnabled(false);
        txtAutor.setEnabled(false);
        txtEditorial.setEnabled(false);
        txtPrecio.setEnabled(false);

    }

    public void limpicarcampos() {
        txtisbn.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        txtEditorial.setText("");
        txtPrecio.setText("");
    }

    public void desBloquearBotones() {
        btnaagregar.setEnabled(false);
        btnguardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnbuscar.setEnabled(true);
    }

    
     public static int binariaRecur(Libro[] L, String valor, int inf, int sup, int opt) {
         switch(opt){
             case 1:
                 int mitad = (inf + sup) / 2;
                 if ((inf >= sup) && !L[inf].getISBN().equals(valor)) {
                     return -1;
                 } else if (L[mitad].getISBN().equals(valor)) {
                     return mitad;
                 } else if (valor.compareToIgnoreCase(L[mitad].getISBN()) > 0) {
                     return binariaRecur(L, valor, mitad + 1, sup, opt);
                 }
                 return binariaRecur(L, valor, inf, mitad - 1, opt);
                 
                 
             case 2:
                 mitad = (inf + sup) / 2;
                 if ((inf >= sup) && !L[inf].getAutor().equals(valor)) {
                     return -1;
                 } else if (L[mitad].getAutor().equals(valor)) {
                     return mitad;
                 } else if (valor.compareToIgnoreCase(L[mitad].getAutor()) > 0) {
                     return binariaRecur(L, valor, mitad + 1, sup, opt);
                 }
                 return binariaRecur(L, valor, inf, mitad - 1, opt);
                 
             case 3:
                 mitad = (inf + sup) / 2;
                 if ((inf >= sup) && !L[inf].getTitulo().equals(valor)) {
                     return -1;
                 } else if (L[mitad].getTitulo().equals(valor)) {
                     return mitad;
                 } else if (valor.compareToIgnoreCase(L[mitad].getTitulo()) > 0) {
                     return binariaRecur(L, valor, mitad + 1, sup, opt);
                 }
                 return binariaRecur(L, valor, inf, mitad - 1, opt);
                 
                 
                 
             case 4:
                 mitad = (inf + sup) / 2;
                 if ((inf >= sup) && !L[inf].getEd().equals(valor)) {
                     return -1;
                 } else if (L[mitad].getEd().equals(valor)) {
                     return mitad;
                 } else if (valor.compareToIgnoreCase(L[mitad].getEd()) > 0) {
                     return binariaRecur(L, valor, mitad + 1, sup, opt);
                 }
                 return binariaRecur(L, valor, inf, mitad - 1, opt);
                 
             case 5:
                 mitad = (inf + sup) / 2;
                 if ((inf >= sup) && L[inf].getPrecio()!=Integer.parseInt(valor)) {
                     return -1;
                 } else if (L[mitad].getPrecio()==Integer.parseInt(valor)) {
                     return mitad;
                 } else if (Integer.parseInt(valor)>L[mitad].getPrecio()) {
                     return binariaRecur(L, valor, mitad + 1, sup, opt);
                 }
                 return binariaRecur(L, valor, inf, mitad - 1, opt);
                 
             default:
                 break;
         }
         
         return -1;         
        
    } //binaria recursiva

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
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLibro().setVisible(true);
            }
        });
    }
    private Libro L[]= new Libro[100];
    private int A[];
    private int tope = -1;
    private DefaultTableModel m;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnaagregar;
    private javax.swing.JButton btnbinaria;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbmIndex;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JToolBar jToolBar7;
    private javax.swing.JToolBar jToolBar8;
    private javax.swing.JRadioButton rbnradix;
    private javax.swing.JRadioButton rbtnasc;
    private javax.swing.JRadioButton rbtnburbuja;
    private javax.swing.JRadioButton rbtndesc;
    private javax.swing.JRadioButton rbtquick;
    private javax.swing.JRadioButton rbtshell;
    private javax.swing.JTable tblLibro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtvalue;
    // End of variables declaration//GEN-END:variables
}