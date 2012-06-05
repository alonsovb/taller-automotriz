package twmVision;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeModel;
import twmData.auto;
import twmData.datosTaller;
import twmData.historial;
import twmData.trabajo;

// Ventana que muestra la información de los autos
// Da la posibilidad de insertar, modificar y eliminar,
// asi como de ver el historial del auto
public class fAuto extends javax.swing.JDialog
{
    datosTaller dt;
    auto seleccionado;
    trabajo tseleccionado;

    public fAuto(java.awt.Frame parent, boolean modal, datosTaller ndt) {
        super(parent, modal);
        initComponents();
        dt = ndt;
        ActualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAuto = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeAuto = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        textBusqueda = new javax.swing.JTextField();
        comboBusqueda = new javax.swing.JComboBox();
        checkTReal = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        buttonModificar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listHistorial = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        treeHistorial = new javax.swing.JTree();
        labelPlaca = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        buttonSalir = new javax.swing.JButton();
        buttonInsertar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        listAuto.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listAutoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listAuto);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Seleccione un elemento.");
        treeAuto.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeAuto.setRootVisible(false);
        jScrollPane2.setViewportView(treeAuto);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        comboBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Placa", "Marca", "Modelo", "Todo (beta)" }));

        checkTReal.setBackground(new java.awt.Color(255, 255, 255));
        checkTReal.setText("TReal ©");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkTReal)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkTReal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        buttonModificar.setText("Editar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(buttonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEliminar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, 0, 127, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("General", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        listHistorial.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listHistorialValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listHistorial);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeHistorial.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeHistorial.setRootVisible(false);
        jScrollPane4.setViewportView(treeHistorial);

        labelPlaca.setText("Placa:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                    .addComponent(labelPlaca))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPlaca)
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Historial", jPanel3);

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        buttonInsertar.setText("Insertar");
        buttonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(buttonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalir)
                    .addComponent(buttonInsertar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Modifica la información al seleccionar un auto nuevo
    private void listAutoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listAutoValueChanged
        if (listAuto.getSelectedValue() != null) {
            String itemStr = listAuto.getSelectedValue().toString();
            int placa = Integer.parseInt(itemStr);
            seleccionado = dt.ObtenerAuto(placa);

            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(seleccionado));
            treeAuto.setModel(dtm);

            ActualizarHistorial();
        }
    }//GEN-LAST:event_listAutoValueChanged

    // Si hay un auto seleccionado, muestra la ventana de modificar
    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        if (seleccionado != null) {
            fEditarAuto ea = new fEditarAuto(this, true, seleccionado);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int w = ea.getSize().width;
            int h = ea.getSize().height;
            int x = (dim.width - w) / 2;
            int y = (dim.height - h) / 2;
            ea.setLocation(x, y);

            ea.setVisible(true);
            ActualizarLista();
        }
}//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        if (seleccionado != null)
            if (JOptionPane.showConfirmDialog(this,
                    "¿Desea eliminar el auto seleccionado?",
                    "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                dt.EliminarCliente(seleccionado.getPlaca());
                seleccionado = null;
            }
}//GEN-LAST:event_buttonEliminarActionPerformed

    // Muestra la ventana de insertar nuevo auto
    private void buttonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertarActionPerformed
        fAgregarAuto a = new fAgregarAuto(this, true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = a.getSize().width;
        int h = a.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        a.setLocation(x, y);

        a.setVisible(true);
        if (a.getAuto() != null && dt.Insertar(a.getAuto()))
            ActualizarLista();
        a.dispose();
    }//GEN-LAST:event_buttonInsertarActionPerformed

    // Cierra la ventana
    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonSalirActionPerformed

    // Actualiza la información de historial
    private void listHistorialValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listHistorialValueChanged
        if (listHistorial.getSelectedValue() != null) {
            int cod = (Integer) listHistorial.getSelectedValue();
            tseleccionado = dt.ObtenerTrabajo(cod);

            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(tseleccionado));
            treeHistorial.setModel(dtm);
        }

    }//GEN-LAST:event_listHistorialValueChanged

    // Actualiza la lista de autos
    private void ActualizarLista() {

        if (dt.mAutos != null) {

            DefaultListModel dlm = new DefaultListModel();
            auto temp = dt.mAutos;
            do {
                dlm.add(dlm.getSize(), temp.getPlaca());
                temp = temp.sig;
            } while (temp != dt.mAutos);

            listAuto.setModel(dlm);
            ActualizarHistorial();
        }
    }

    // Actualiza la lista de trabajos del historial del auto seleccionado
    private void ActualizarHistorial() {
        if (seleccionado != null) {
            historial h = seleccionado.mHistorial;
            DefaultListModel dlm = new DefaultListModel();

            while (h != null) {
                dlm.add(dlm.getSize(), h.getTrabajo().getCodigo());
                h = h.sig;
            }

            listHistorial.setModel(dlm);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonInsertar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JCheckBox checkTReal;
    private javax.swing.JComboBox comboBusqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JList listAuto;
    private javax.swing.JList listHistorial;
    private javax.swing.JTextField textBusqueda;
    private javax.swing.JTree treeAuto;
    private javax.swing.JTree treeHistorial;
    // End of variables declaration//GEN-END:variables
}
