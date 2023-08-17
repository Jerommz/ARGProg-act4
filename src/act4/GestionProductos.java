/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act4;

import java.util.Iterator;
import java.util.Objects;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jero
 */
public class GestionProductos extends javax.swing.JInternalFrame {

    private DefaultComboBoxModel modelocb = new DefaultComboBoxModel();

    /**
     * Creates new form GestionProductos
     */
    public GestionProductos() {
        initComponents();
        armarCategorias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        textDescripcion = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        listaRubroGP = new javax.swing.JComboBox<>();
        textStock = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Gestion de productos");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Rubro");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Stock");

        textCodigo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        textCodigo.setForeground(java.awt.Color.black);

        botonBuscar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        botonBuscar.setForeground(java.awt.Color.black);
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        textDescripcion.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        textDescripcion.setForeground(java.awt.Color.black);

        textPrecio.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        textPrecio.setForeground(java.awt.Color.black);

        listaRubroGP.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        listaRubroGP.setForeground(java.awt.Color.black);
        listaRubroGP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        textStock.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        textStock.setForeground(java.awt.Color.black);

        botonGuardar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        botonGuardar.setForeground(java.awt.Color.black);
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        botonEliminar.setForeground(java.awt.Color.black);
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        botonSalir.setForeground(java.awt.Color.black);
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonNuevo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        botonNuevo.setForeground(java.awt.Color.black);
        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(8, 8, 8)))
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textStock, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(listaRubroGP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonBuscar))
                                            .addComponent(textDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(botonBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(listaRubroGP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonGuardar)
                    .addComponent(botonEliminar)
                    .addComponent(botonSalir))
                .addGap(31, 31, 31))
        );

        setBounds(0, 0, 467, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        try {
            int codigo = Integer.parseInt(textCodigo.getText());
            int cant = Menu.listaProductos.size();
            for (Productos prod : Menu.listaProductos) {
                if (prod.getCodigo() == codigo) {
                    textDescripcion.setText(prod.getDescripcion());
                    textPrecio.setText(prod.getPrecio() + "");
                    textStock.setText(prod.getStock() + "");
                    if (prod.getRubro().toString().equalsIgnoreCase("Comestibles")) {
                        listaRubroGP.setSelectedIndex(1);
                    } else if (prod.getRubro().toString().equalsIgnoreCase("Limpieza")) {
                        listaRubroGP.setSelectedIndex(2);
                    } else {
                        listaRubroGP.setSelectedIndex(3);
                    }
                }
            }
            if (codigo > cant) {
                textDescripcion.setText("");
                textPrecio.setText("");
                listaRubroGP.setSelectedIndex(0);
                textStock.setText("");
                JOptionPane.showMessageDialog(this, "No hay un producto con ese codigo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero.");
        }


    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        // TODO add your handling code here:
        try {
            int codigo = Integer.parseInt(textCodigo.getText());
            String nombre = textDescripcion.getText();
            double precio = Double.parseDouble(textPrecio.getText());
            boolean c = false;
            for (Productos prod : Menu.listaProductos) {
                if (prod.getCodigo() == codigo) {
                    int op = JOptionPane.showConfirmDialog(this,
                            "Producto repetido, desea actualizar el stock?",
                            "",
                            JOptionPane.YES_NO_OPTION);
                    if (op == JOptionPane.NO_OPTION) {
                        this.dispose();
                    } else {
                        int suma = prod.getStock() + Integer.parseInt(textStock.getText());
                        JOptionPane.showMessageDialog(this, "Stock actualizado.");
                        prod.setStock(suma);
                        c = true;
                    }
                }
            }
            if (c == false) {
                int ultimo = Menu.listaProductos.size();
                if (codigo > ultimo + 1) {
                    JOptionPane.showMessageDialog(this, "El codigo debe continuar a los demas.");
                    int code = ultimo+1;
                    textCodigo.setText(code+"");
                    switch (listaRubroGP.getSelectedIndex()) {
                        case 1:
                            Menu.listaProductos.add(new Productos(code, nombre, precio, Integer.parseInt(textStock.getText()), Categorias.COMESTIBLES));
                            break;
                        case 2:
                            Menu.listaProductos.add(new Productos(code, nombre, precio, Integer.parseInt(textStock.getText()), Categorias.LIMPIEZA));
                            break;
                        case 3:
                            Menu.listaProductos.add(new Productos(code, nombre, precio, Integer.parseInt(textStock.getText()), Categorias.PERFUMERIA));
                            break;
                    }
                } else {
                    switch (listaRubroGP.getSelectedIndex()) {
                        case 1:
                            Menu.listaProductos.add(new Productos(codigo, nombre, precio, Integer.parseInt(textStock.getText()), Categorias.COMESTIBLES));
                            break;
                        case 2:
                            Menu.listaProductos.add(new Productos(codigo, nombre, precio, Integer.parseInt(textStock.getText()), Categorias.LIMPIEZA));
                            break;
                        case 3:
                            Menu.listaProductos.add(new Productos(codigo, nombre, precio, Integer.parseInt(textStock.getText()), Categorias.PERFUMERIA));
                            break;
                    }
                }

                JOptionPane.showMessageDialog(this, "Producto agregado correctamente.");
            }
        } catch (NumberFormatException e) {
            if (textCodigo.getText() == null || textDescripcion.getText() == null || textPrecio.getText() == null || textStock.getText() == null || listaRubroGP.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Debe rellenar todos los espacios en blanco.");
            }
        }
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        try {
            int op = JOptionPane.showConfirmDialog(null,
                    "Seguro que desea guardar los cambios realizados?",
                    "",
                    JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.NO_OPTION) {
                this.dispose();
            } else {
                int codigo = Integer.parseInt(textCodigo.getText());
                String nombre = textDescripcion.getText();
                double precio = Double.parseDouble(textPrecio.getText());
                int stock = Integer.parseInt(textStock.getText());
                boolean c = false;
                for (Productos prod : Menu.listaProductos) {
                    if (prod.getCodigo() == codigo) {
                        prod.setDescripcion(nombre);
                        prod.setPrecio(precio);
                        prod.setStock(stock);
                        switch (listaRubroGP.getSelectedIndex()) {
                            case 1:
                                prod.setRubro(Categorias.COMESTIBLES);
                                break;
                            case 2:
                                prod.setRubro(Categorias.LIMPIEZA);
                                break;
                            case 3:
                                prod.setRubro(Categorias.PERFUMERIA);
                                break;
                        }
                    } else {
                        c = true;
                    }
                }
                if (c = true) {
                    int op2 = JOptionPane.showConfirmDialog(this, "No hay ningun producto con el codigo ingresado,"
                            + " desea agregar el producto a la lista?", "",
                            JOptionPane.YES_NO_OPTION);
                    if (op2 == JOptionPane.NO_OPTION) {
                        this.dispose();
                    } else {
                        switch (listaRubroGP.getSelectedIndex()) {
                            case 1:
                                Menu.listaProductos.add(new Productos(codigo, nombre, precio, Integer.parseInt(textStock.getText()), Categorias.COMESTIBLES));
                                break;
                            case 2:
                                Menu.listaProductos.add(new Productos(codigo, nombre, precio, Integer.parseInt(textStock.getText()), Categorias.LIMPIEZA));
                                break;
                            case 3:
                                Menu.listaProductos.add(new Productos(codigo, nombre, precio, Integer.parseInt(textStock.getText()), Categorias.PERFUMERIA));
                                break;
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No puede haber espacios en blanco si desea guardar un producto nuevo");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        try{
            
        
        int codigo = Integer.parseInt(textCodigo.getText());
        String nombre = textDescripcion.getText();
        Iterator<Productos> it = Menu.listaProductos.iterator();
        while(it.hasNext()){
            Productos prod=it.next();
            if(prod.getCodigo()==Integer.parseInt(textCodigo.getText()) || prod.getDescripcion().
                    equalsIgnoreCase(textDescripcion.getText())){
                it.remove();
                int op= JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este producto?", "",
                        JOptionPane.YES_NO_OPTION);
                if(op==JOptionPane.NO_OPTION){
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Producto eliminado.");
                    limpiarTodo();
                }
            }
        }
        }catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> listaRubroGP;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDescripcion;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JTextField textStock;
    // End of variables declaration//GEN-END:variables

    private void armarCategorias() {
        modelocb.addElement("");
        modelocb.addElement("Comestibles");
        modelocb.addElement("Limpieza");
        modelocb.addElement("Perfumeria");
        listaRubroGP.setModel(modelocb);
    }

    private void limpiarTodo() {
        textCodigo.setText("");
        textDescripcion.setText("");
        textPrecio.setText("");
        listaRubroGP.setSelectedIndex(0);
        textStock.setText("");
    }
}
