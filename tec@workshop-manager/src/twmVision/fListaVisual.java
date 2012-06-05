package twmVision;

import javax.swing.tree.DefaultTreeModel;
import twmData.auto;
import twmData.cliente;
import twmData.datosTaller;
import twmData.empleado;

// Ventana que permite la visualización y recorrido de listas
public class fListaVisual extends javax.swing.JFrame
{
    datosTaller dt;
    cliente vCliente;
    empleado vEmpleado;
    auto vAuto;

    public fListaVisual(datosTaller ndt) {
        dt = ndt;
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        vCliente = dt.mClientes;
        vEmpleado = dt.mEmpleados;
        vAuto = dt.mAutos;

        Actualizar();
    }

    // Actualiza todas las listas
    private void Actualizar() {
        vCliente = dt.mClientes;
        vEmpleado = dt.mEmpleados;
        vAuto = dt.mAutos;

        MostrarCliente();
        MostrarEmpleado();
        MostrarAuto();
    }

    // Muestra la información del cliente actual
    private void MostrarCliente() {
        if (vCliente != null) {
            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(vCliente));
            treeCliente.setModel(dtm);
            frameClientes.setVisible(true);
        } else
            frameClientes.setVisible(false);
    }

    // Muestra la información del auto actual
    private void MostrarAuto() {
        if (vAuto != null) {
            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(vAuto));
            treeAuto.setModel(dtm);
            panelColor.setBackground(vAuto.getColor());
            frameAutos.setVisible(true);
        } else
            frameAutos.setVisible(false);
    }

    // Muestra la información del empleado actual
    private void MostrarEmpleado() {
        if (vEmpleado != null) {
            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(vEmpleado));
            treeEmpleado.setModel(dtm);
            frameEmpleados.setVisible(true);
        } else
            frameEmpleados.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        mitemClientes = new javax.swing.JCheckBoxMenuItem();
        mitemEmpleados = new javax.swing.JCheckBoxMenuItem();
        mitemAutos = new javax.swing.JCheckBoxMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        frameClientes = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeCliente = new javax.swing.JTree();
        buttonClienteAnt = new javax.swing.JButton();
        buttonClienteSig = new javax.swing.JButton();
        frameEmpleados = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeEmpleado = new javax.swing.JTree();
        buttonEmpleadoSig = new javax.swing.JButton();
        buttonEmpleadoPrim = new javax.swing.JButton();
        frameAutos = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        treeAuto = new javax.swing.JTree();
        buttonAutoSig = new javax.swing.JButton();
        panelColor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        mitemClientes.setSelected(true);
        mitemClientes.setText("Ver clientes");
        mitemClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mitemClientesItemStateChanged(evt);
            }
        });
        popupMenu.add(mitemClientes);

        mitemEmpleados.setSelected(true);
        mitemEmpleados.setText("Ver empleados");
        mitemEmpleados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mitemEmpleadosItemStateChanged(evt);
            }
        });
        popupMenu.add(mitemEmpleados);

        mitemAutos.setSelected(true);
        mitemAutos.setText("Ver autos");
        mitemAutos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mitemAutosItemStateChanged(evt);
            }
        });
        popupMenu.add(mitemAutos);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Visual");
        setState(3);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setComponentPopupMenu(popupMenu);

        frameClientes.setBackground(new java.awt.Color(255, 255, 255));
        frameClientes.setClosable(true);
        frameClientes.setIconifiable(true);
        frameClientes.setMaximizable(true);
        frameClientes.setResizable(true);
        frameClientes.setTitle("Clientes");
        frameClientes.setVisible(true);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeCliente.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeCliente.setRootVisible(false);
        jScrollPane1.setViewportView(treeCliente);

        buttonClienteAnt.setText("Anterior");
        buttonClienteAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClienteAntActionPerformed(evt);
            }
        });

        buttonClienteSig.setText("Siguiente");
        buttonClienteSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClienteSigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameClientesLayout = new javax.swing.GroupLayout(frameClientes.getContentPane());
        frameClientes.getContentPane().setLayout(frameClientesLayout);
        frameClientesLayout.setHorizontalGroup(
            frameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addGroup(frameClientesLayout.createSequentialGroup()
                        .addComponent(buttonClienteAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonClienteSig, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        frameClientesLayout.setVerticalGroup(
            frameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClienteSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonClienteAnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        frameClientes.setBounds(10, 10, 350, 220);
        jDesktopPane1.add(frameClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        frameEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        frameEmpleados.setClosable(true);
        frameEmpleados.setIconifiable(true);
        frameEmpleados.setMaximizable(true);
        frameEmpleados.setResizable(true);
        frameEmpleados.setTitle("Empleados");
        frameEmpleados.setVisible(true);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeEmpleado.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeEmpleado.setRootVisible(false);
        jScrollPane2.setViewportView(treeEmpleado);

        buttonEmpleadoSig.setText("Siguiente");
        buttonEmpleadoSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEmpleadoSigActionPerformed(evt);
            }
        });

        buttonEmpleadoPrim.setText("Primero");
        buttonEmpleadoPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEmpleadoPrimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameEmpleadosLayout = new javax.swing.GroupLayout(frameEmpleados.getContentPane());
        frameEmpleados.getContentPane().setLayout(frameEmpleadosLayout);
        frameEmpleadosLayout.setHorizontalGroup(
            frameEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addGroup(frameEmpleadosLayout.createSequentialGroup()
                        .addComponent(buttonEmpleadoPrim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEmpleadoSig)))
                .addContainerGap())
        );
        frameEmpleadosLayout.setVerticalGroup(
            frameEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEmpleadoSig)
                    .addComponent(buttonEmpleadoPrim))
                .addContainerGap())
        );

        frameEmpleados.setBounds(370, 10, 310, 220);
        jDesktopPane1.add(frameEmpleados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        frameAutos.setBackground(new java.awt.Color(255, 255, 255));
        frameAutos.setClosable(true);
        frameAutos.setIconifiable(true);
        frameAutos.setMaximizable(true);
        frameAutos.setResizable(true);
        frameAutos.setTitle("Autos");
        frameAutos.setVisible(true);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeAuto.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeAuto.setRootVisible(false);
        jScrollPane3.setViewportView(treeAuto);

        buttonAutoSig.setText("Siguiente");
        buttonAutoSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAutoSigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameAutosLayout = new javax.swing.GroupLayout(frameAutos.getContentPane());
        frameAutos.getContentPane().setLayout(frameAutosLayout);
        frameAutosLayout.setHorizontalGroup(
            frameAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAutosLayout.createSequentialGroup()
                        .addComponent(panelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAutoSig)))
                .addContainerGap())
        );
        frameAutosLayout.setVerticalGroup(
            frameAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAutoSig, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        frameAutos.setBounds(10, 240, 350, 220);
        jDesktopPane1.add(frameAutos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("Utilice el Visualizador de Listas para navegar los datos de las listas generales del taller.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(266, 266, 266))
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClienteSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClienteSigActionPerformed
        if (vCliente != null && vCliente.sig != null) {
            vCliente = vCliente.sig;
            MostrarCliente();
        }
    }//GEN-LAST:event_buttonClienteSigActionPerformed

    private void buttonClienteAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClienteAntActionPerformed
        if (vCliente != null && vCliente.ant != null) {
            vCliente = vCliente.ant;
            MostrarCliente();
        }
    }//GEN-LAST:event_buttonClienteAntActionPerformed

    private void buttonAutoSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAutoSigActionPerformed
        if (vAuto != null) {
            vAuto = vAuto.sig;
            MostrarAuto();
        }
    }//GEN-LAST:event_buttonAutoSigActionPerformed

    private void buttonEmpleadoSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEmpleadoSigActionPerformed
        if (vEmpleado != null && vEmpleado.sig != null) {
            vEmpleado = vEmpleado.sig;
            MostrarEmpleado();
        }
    }//GEN-LAST:event_buttonEmpleadoSigActionPerformed

    private void buttonEmpleadoPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEmpleadoPrimActionPerformed
        if (vEmpleado != null) {
            vEmpleado = dt.mEmpleados;
            MostrarEmpleado();
        }
    }//GEN-LAST:event_buttonEmpleadoPrimActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Actualizar();
    }//GEN-LAST:event_formWindowActivated

    private void mitemClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mitemClientesItemStateChanged
        frameClientes.setVisible(!frameClientes.isVisible());
        mitemClientes.setSelected(frameClientes.isSelected());
    }//GEN-LAST:event_mitemClientesItemStateChanged

    private void mitemEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mitemEmpleadosItemStateChanged
        frameEmpleados.setVisible(!frameEmpleados.isVisible());
        mitemEmpleados.setSelected(frameEmpleados.isSelected());
    }//GEN-LAST:event_mitemEmpleadosItemStateChanged

    private void mitemAutosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mitemAutosItemStateChanged
        frameAutos.setVisible(!frameAutos.isVisible());
        mitemAutos.setSelected(frameAutos.isSelected());
    }//GEN-LAST:event_mitemAutosItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAutoSig;
    private javax.swing.JButton buttonClienteAnt;
    private javax.swing.JButton buttonClienteSig;
    private javax.swing.JButton buttonEmpleadoPrim;
    private javax.swing.JButton buttonEmpleadoSig;
    private javax.swing.JInternalFrame frameAutos;
    private javax.swing.JInternalFrame frameClientes;
    private javax.swing.JInternalFrame frameEmpleados;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBoxMenuItem mitemAutos;
    private javax.swing.JCheckBoxMenuItem mitemClientes;
    private javax.swing.JCheckBoxMenuItem mitemEmpleados;
    private javax.swing.JPanel panelColor;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JTree treeAuto;
    private javax.swing.JTree treeCliente;
    private javax.swing.JTree treeEmpleado;
    // End of variables declaration//GEN-END:variables
}
