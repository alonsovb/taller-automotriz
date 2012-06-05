package twmVision;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import twmData.datosTaller;

// Ventana inicial que permite la visualización de otras ventanas
public class fInicio extends javax.swing.JFrame
{

    datosTaller dt;

    public fInicio(datosTaller ndt) {

        dt = ndt;
        initComponents();
        ActualizarGeneral();
    }

    // Actualiza todos los datos visibles del taller
    public final void ActualizarGeneral() {

        DefaultMutableTreeNode tnClientes = models.getAllTreeModel(dt.mClientes);
        DefaultMutableTreeNode tnMain = new DefaultMutableTreeNode("Clientes");
        tnMain.add(tnClientes);

        DefaultTreeModel tnFinal = new DefaultTreeModel(tnMain);
        treeMain.setModel(tnFinal);
        labelGanancias.setText("Ganancias: $" +
                String.valueOf(dt.TotalGanancias()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pimg_sup = new javax.swing.JPanel();
        limg_sup = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bVerClientes = new javax.swing.JButton();
        bVerEmpleados = new javax.swing.JButton();
        bVerAutos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeMain = new javax.swing.JTree();
        buttonVisual = new javax.swing.JButton();
        buttonConsultas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelGanancias = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("tec@workshop-manager // Inicio");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        pimg_sup.setBackground(new java.awt.Color(255, 255, 255));

        limg_sup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twmbeta.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bVerClientes.setText("Clientes");
        bVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerClientesActionPerformed(evt);
            }
        });

        bVerEmpleados.setText("Empleados");
        bVerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerEmpleadosActionPerformed(evt);
            }
        });

        bVerAutos.setText("Autos");
        bVerAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerAutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVerClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bVerEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bVerAutos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("cliente1");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("cliente2");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("cliente3");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("cliente4");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Empleados");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("empleado1");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("empleado2");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("empleado3");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("empleado4");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Autos");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("auto1");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("auto2");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("auto3");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("auto4");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeMain.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeMain.setRootVisible(false);
        jScrollPane1.setViewportView(treeMain);

        buttonVisual.setText("Lista Visual");
        buttonVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualActionPerformed(evt);
            }
        });

        buttonConsultas.setText("Consultas");
        buttonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultasActionPerformed(evt);
            }
        });

        labelGanancias.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelGanancias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelGanancias.setText("Ganancias: $0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addComponent(labelGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelGanancias)
                .addContainerGap())
        );

        javax.swing.GroupLayout pimg_supLayout = new javax.swing.GroupLayout(pimg_sup);
        pimg_sup.setLayout(pimg_supLayout);
        pimg_supLayout.setHorizontalGroup(
            pimg_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pimg_supLayout.createSequentialGroup()
                .addGroup(pimg_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limg_sup)
                    .addGroup(pimg_supLayout.createSequentialGroup()
                        .addGroup(pimg_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pimg_supLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonVisual, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pimg_supLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pimg_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pimg_supLayout.setVerticalGroup(
            pimg_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pimg_supLayout.createSequentialGroup()
                .addComponent(limg_sup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pimg_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pimg_supLayout.createSequentialGroup()
                        .addComponent(buttonVisual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonConsultas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pimg_supLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jMenu1.setText("Sistema");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Empleados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem3.setText("Acerca de tec@workshop-manager");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pimg_sup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pimg_sup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Muestra la ventana de empleados
    private void bVerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerEmpleadosActionPerformed
        fEmpleado nFEmpleado = new fEmpleado(this, true, dt);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = nFEmpleado.getSize().width;
        int h = nFEmpleado.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        nFEmpleado.setLocation(x, y);

        nFEmpleado.setVisible(true);
        ActualizarGeneral();
    }//GEN-LAST:event_bVerEmpleadosActionPerformed

    // Muestra la ventana de clientes
    private void bVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerClientesActionPerformed
        fCliente nFCliente = new fCliente(this, true, dt);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = nFCliente.getSize().width;
        int h = nFCliente.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        nFCliente.setLocation(x, y);

        nFCliente.setVisible(true);
        ActualizarGeneral();
    }//GEN-LAST:event_bVerClientesActionPerformed

    // Muestra la ventana de autos
    private void bVerAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerAutosActionPerformed
                
        fAuto nFAuto = new fAuto(this, true, dt);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = nFAuto.getSize().width;
        int h = nFAuto.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        nFAuto.setLocation(x, y);

        nFAuto.setVisible(true);
        ActualizarGeneral();
    }//GEN-LAST:event_bVerAutosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        bVerEmpleadosActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        bVerClientesActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Muestra la ventana de Visualización de listas
    private void buttonVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualActionPerformed
        fListaVisual lv = new fListaVisual(dt);
        lv.setVisible(true);
    }//GEN-LAST:event_buttonVisualActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        ActualizarGeneral();
    }//GEN-LAST:event_formFocusGained

    // Muestra la ventana de Consultas
    private void buttonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultasActionPerformed
        fConsultas c = new fConsultas(this, true, dt);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = c.getSize().width;
        int h = c.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        c.setLocation(x, y);
        c.setVisible(true);
        ActualizarGeneral();
    }//GEN-LAST:event_buttonConsultasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(this, "tec@workshop-manager. ITCR-SSC 2010");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVerAutos;
    private javax.swing.JButton bVerClientes;
    private javax.swing.JButton bVerEmpleados;
    private javax.swing.JButton buttonConsultas;
    private javax.swing.JButton buttonVisual;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelGanancias;
    private javax.swing.JLabel limg_sup;
    private javax.swing.JPanel pimg_sup;
    private javax.swing.JTree treeMain;
    // End of variables declaration//GEN-END:variables
}
