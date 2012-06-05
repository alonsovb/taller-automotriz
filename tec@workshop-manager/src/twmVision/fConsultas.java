package twmVision;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import twmData.auto;
import twmData.cliente;
import twmData.datosTaller;
import twmData.empleado;
import twmData.factura;
import twmData.misAutos;
import twmData.misClientes;
import twmData.misTrabajos;
import twmData.trabajo;

// Ventana que permite la visualización de varias consultas a las listas del taller
public class fConsultas extends javax.swing.JDialog
{
    datosTaller dt;
    Date fechaFactura;
    cliente seleccionado;
    factura ftemp;
    misClientes top10Frecuentes;
    misAutos top10MasTiempo;

    public fConsultas(java.awt.Frame parent, boolean modal, datosTaller ndt) {
        super(parent, modal);
        initComponents();
        dt = ndt;
        listClientes.setModel(models.getListModel(dt.mClientes));
        mostrarTopClientes();
        mostrarTopAutos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFecha = new javax.swing.JFormattedTextField();
        buttonFacturar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listClientes = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeFactura = new javax.swing.JTree();
        buttonCancelarTodo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonVerPendientes = new javax.swing.JButton();
        textPlaca = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTrabajosPendientes = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        treeTrabajoPendiente = new javax.swing.JTree();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textFechaPendiente = new javax.swing.JFormattedTextField();
        buttonPendientesPorDia = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        listPendientesPorDia = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        treePendientePorDia = new javax.swing.JTree();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textFechaCancelados = new javax.swing.JFormattedTextField();
        buttonCancelados = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        treeRecaudado = new javax.swing.JTree();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        buttonMejorEmpleado = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textAño = new javax.swing.JTextField();
        textMes = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        treeMejorEmpleado = new javax.swing.JTree();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        buttonDiasOciosos = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        textAñoOcio = new javax.swing.JTextField();
        textMesOcio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        treeOcio = new javax.swing.JTree();
        jPanel11 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        listClientesFrecuentes = new javax.swing.JList();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        listMasTiempo = new javax.swing.JList();
        jScrollPane12 = new javax.swing.JScrollPane();
        treeInfo = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Seleccione la fecha:");

        textFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        buttonFacturar.setText("Facturar");
        buttonFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFacturarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonFacturar)
                .addContainerGap(469, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFacturar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listClientes.setEnabled(false);
        listClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listClientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listClientes);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeFactura.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeFactura.setEnabled(false);
        treeFactura.setRootVisible(false);
        jScrollPane2.setViewportView(treeFactura);

        buttonCancelarTodo.setText("Cancelar todo");
        buttonCancelarTodo.setEnabled(false);
        buttonCancelarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCancelarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancelarTodo)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Facturas", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Seleccione el número de placa:");

        buttonVerPendientes.setText("Mostrar pendientes");
        buttonVerPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerPendientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonVerPendientes)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buttonVerPendientes)
                    .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listTrabajosPendientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTrabajosPendientesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listTrabajosPendientes);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeTrabajoPendiente.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeTrabajoPendiente.setRootVisible(false);
        jScrollPane4.setViewportView(treeTrabajoPendiente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Trabajos pendientes", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Ver trabajos pendientes para el día:");

        textFechaPendiente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        buttonPendientesPorDia.setText("Mostrar");
        buttonPendientesPorDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPendientesPorDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFechaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPendientesPorDia)
                .addContainerGap(396, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFechaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPendientesPorDia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listPendientesPorDia.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPendientesPorDiaValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(listPendientesPorDia);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treePendientePorDia.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treePendientePorDia.setRootVisible(false);
        jScrollPane6.setViewportView(treePendientePorDia);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pendientes por día", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Ver trabajos cancelados para el día:");

        textFechaCancelados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        buttonCancelados.setText("Mostrar");
        buttonCancelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCanceladosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFechaCancelados, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCancelados)
                .addContainerGap(396, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFechaCancelados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Seleccione un día");
        treeRecaudado.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane7.setViewportView(treeRecaudado);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Recaudado por día", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Seleccione el año:");

        buttonMejorEmpleado.setText("Mostrar");
        buttonMejorEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMejorEmpleadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione el mes:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMes, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(textAño, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonMejorEmpleado)
                .addGap(533, 533, 533))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMejorEmpleado)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Ingrese una fecha");
        treeMejorEmpleado.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane8.setViewportView(treeMejorEmpleado);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Empleado del mes", jPanel9);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Seleccione el año:");

        buttonDiasOciosos.setText("Mostrar");
        buttonDiasOciosos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDiasOciososActionPerformed(evt);
            }
        });

        jLabel10.setText("Seleccione el mes:");

        jLabel7.setText("Ingrese un 0 (cero) en el mes si quiere calcular anualmente.");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMesOcio, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(textAñoOcio, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDiasOciosos)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textAñoOcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDiasOciosos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMesOcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Seleccione una fecha");
        treeOcio.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeOcio.setRootVisible(false);
        jScrollPane9.setViewportView(treeOcio);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Días ociosos", jPanel12);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane1.setDividerLocation(180);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel13.setPreferredSize(new java.awt.Dimension(300, 100));

        jLabel8.setText("Clientes más frecuentes del taller:");

        listClientesFrecuentes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listClientesFrecuentesValueChanged(evt);
            }
        });
        jScrollPane10.setViewportView(listClientesFrecuentes);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jSplitPane1.setLeftComponent(jPanel13);

        jLabel11.setText("Autos con más tiempo en el taller:");

        listMasTiempo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listMasTiempoValueChanged(evt);
            }
        });
        jScrollPane11.setViewportView(listMasTiempo);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel15);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeInfo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeInfo.setRootVisible(false);
        jScrollPane12.setViewportView(treeInfo);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Top 10's", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Muestra las facturas por fecha
    private void buttonFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFacturarActionPerformed
        fechaFactura = (Date) textFecha.getValue();
        treeFactura.setModel(null);
        if (fechaFactura != null) {
            listClientes.setEnabled(true);
            treeFactura.setEnabled(true);
            buttonCancelarTodo.setEnabled(true);
        }
    }//GEN-LAST:event_buttonFacturarActionPerformed

    // Muestra la información del cliente seleccionado
    private void listClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listClientesValueChanged
        if (listClientes.getSelectedValue() != null) {
            seleccionado = dt.ObtenerCliente(Integer.parseInt(listClientes.getSelectedValue().toString()));
            ftemp = new factura(seleccionado, dt);
            misTrabajos temp = ftemp.getPrimero();
            DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode(seleccionado.getNombre());

            while (temp != null) {
                if (temp.getTrabajo().getFecha().compareTo(fechaFactura) < 0) //;.equals(fechaFactura))
                    dmtn.add(models.getTreeModel(temp.getTrabajo()));
                temp = temp.sig;
            }

            DefaultTreeModel dtm = new DefaultTreeModel(dmtn);
            treeFactura.setModel(dtm);
        } else {
            seleccionado = null;
            ftemp = null;
        }
    }//GEN-LAST:event_listClientesValueChanged

    // Muestra la opción de cancelar todos los trabajos de un cliente
    private void buttonCancelarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarTodoActionPerformed
        if (seleccionado != null) {
            misTrabajos mt = ftemp.getPrimero();
            if (mt != null) {
                if (JOptionPane.showConfirmDialog(this,
                        "¿Realmente desea cancelar todos estos trabajos?",
                        "Confirmar", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE)
                        == JOptionPane.YES_NO_OPTION) {

                    int total = 0, tGanancia = 0;
                    // Cancela cada trabajo para el cliente
                    while (mt != null) {
                        tGanancia += mt.getTrabajo().getCosto();
                        total++;
                        dt.AgregarGanancia(mt.getTrabajo().Cancelar());
                        mt = mt.sig;
                    }
                    JOptionPane.showMessageDialog(this, String.valueOf(total)
                            + " trabajos completados. "
                            + "Total de ganancias: " + String.valueOf(tGanancia),
                            "Facturas canceladas", JOptionPane.INFORMATION_MESSAGE);
                }
            } else
                JOptionPane.showMessageDialog(this,
                        "No se ha encontrado ningún trabajo", "Sin trabajo",
                        JOptionPane.INFORMATION_MESSAGE);

        } else
            JOptionPane.showMessageDialog(this,
                    "No ha seleccionado ninguna factura.",
                    "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_buttonCancelarTodoActionPerformed

    // Muestra los trabajos pendientes para un auto
    private void buttonVerPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerPendientesActionPerformed
        int placa;
        try {
            placa = Integer.parseInt(textPlaca.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Placa inválida",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        auto atemp = dt.ObtenerAuto(placa);
        listTrabajosPendientes.setModel(models.getListModelPendientes(atemp, dt));
        treeTrabajoPendiente.setModel(null);
    }//GEN-LAST:event_buttonVerPendientesActionPerformed

    // Muestra la información de un trabajo seleccionado
    private void listTrabajosPendientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTrabajosPendientesValueChanged
        trabajo t = dt.ObtenerTrabajo(Integer.parseInt(listTrabajosPendientes.getSelectedValue().toString()));
        if (t != null) {
            DefaultMutableTreeNode treeModel = models.getTreeModel(t);
            treeTrabajoPendiente.setModel(new DefaultTreeModel(treeModel));
        }
    }//GEN-LAST:event_listTrabajosPendientesValueChanged

    // Muestra los trabajos pendientes hasta una fecha dada
    private void buttonPendientesPorDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPendientesPorDiaActionPerformed
        fechaFactura = (Date) textFechaPendiente.getValue();
        if (fechaFactura != null) {
            treePendientePorDia.setModel(null);
            listPendientesPorDia.setModel(models.getListModelPorDia(fechaFactura, dt));
        }
    }//GEN-LAST:event_buttonPendientesPorDiaActionPerformed

    // Muestra la lista de trabajos pendientes a una fecha dada
    private void listPendientesPorDiaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPendientesPorDiaValueChanged
        trabajo t = dt.ObtenerTrabajo(Integer.parseInt(listPendientesPorDia.getSelectedValue().toString()));
        if (t != null) {
            DefaultMutableTreeNode treeModel = models.getTreeModel(t);
            treePendientePorDia.setModel(new DefaultTreeModel(treeModel));
        }
    }//GEN-LAST:event_listPendientesPorDiaValueChanged

    // Muestra la cantidad de trabajos cancelados en una fecha
    private void buttonCanceladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCanceladosActionPerformed
        Date fecha = (Date) textFechaCancelados.getValue();
        if (fecha != null) {
            int cuenta = 0;
            int recaudado = 0;
            trabajo temp = dt.mTrabajos;
            while (temp != null) {
                if (temp.getFecha().equals(fecha) && temp.Cancelado()) {
                    cuenta++;
                    recaudado += temp.getCosto();
                }
                temp = temp.sig;
            }
            DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode("Para este día: "
                    + textFechaCancelados.getText());
            dmtn.add(new DefaultMutableTreeNode("Total de trabajos: " + String.valueOf(cuenta)));
            dmtn.add(new DefaultMutableTreeNode("Recaudado en total: " + String.valueOf(recaudado)));
            if (cuenta > 0)
                dmtn.add(new DefaultMutableTreeNode("Promedio por trabajo: " + String.valueOf(recaudado / cuenta)));

            DefaultTreeModel dtm = new DefaultTreeModel(dmtn);
            treeRecaudado.setModel(dtm);
        }
    }//GEN-LAST:event_buttonCanceladosActionPerformed

    // Busca y muestra el empleado con mayores ganancias para un mes dado
    private void buttonMejorEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMejorEmpleadoActionPerformed
        int año, mes;

        try {
            año = Integer.parseInt(textAño.getText());
            mes = Integer.parseInt(textMes.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El año o el mes no es válido");
            return;
        }

        empleado mejor = obtenerMejor(mes, año);
        if (mejor != null) {
            DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode("Mejor empleado del mes");
            dmtn.add(new DefaultMutableTreeNode("Nombre: " + mejor.getNombre()));
            dmtn.add(new DefaultMutableTreeNode("Cédula: " + String.valueOf(mejor.getCedula())));
            dmtn.add(new DefaultMutableTreeNode("Total recaudado en el mes: "
                    + String.valueOf(recaudadoEnMes(mejor, mes, año))));
            dmtn.add(new DefaultMutableTreeNode("Total general: " + String.valueOf(mejor.getGanancias())));

            DefaultTreeModel dtm = new DefaultTreeModel(dmtn);
            treeMejorEmpleado.setModel(dtm);
        }
    }//GEN-LAST:event_buttonMejorEmpleadoActionPerformed

    // Muestra la cantidad de días sin trabajos para cada empleado en una fecha dada
    private void buttonDiasOciososActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDiasOciososActionPerformed
        int año;
        int mes;
        try {
            año = Integer.parseInt(textAñoOcio.getText());
            mes = Integer.parseInt(textMesOcio.getText());
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto",
                    "Error", JOptionPane.ERROR);
            return;
        }
        DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode("Empleados");
        empleado temp = dt.mEmpleados;
        while (temp != null) {
            dmtn.add(modeloDiasOciosos(temp, mes, año));
            temp = temp.sig;
        }
        DefaultTreeModel dtm = new DefaultTreeModel(dmtn);
        treeOcio.setModel(dtm);

    }//GEN-LAST:event_buttonDiasOciososActionPerformed

    // Muestra la lista de los clientes con más trabajos asignados a sus autos
    private void listClientesFrecuentesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listClientesFrecuentesValueChanged
        if (listClientesFrecuentes.getSelectedValue() != null) {
            cliente temp = dt.ObtenerCliente(Integer.parseInt(listClientesFrecuentes.getSelectedValue().toString()));

            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(temp));
            treeInfo.setModel(dtm);
        }
    }//GEN-LAST:event_listClientesFrecuentesValueChanged

    // Muestra los autos con mayor tiempo en el taller
    private void listMasTiempoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMasTiempoValueChanged
        if (listMasTiempo.getSelectedValue() != null) {
            auto temp = dt.ObtenerAuto(Integer.parseInt(listMasTiempo.getSelectedValue().toString()));

            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(temp));
            treeInfo.setModel(dtm);
        }
    }//GEN-LAST:event_listMasTiempoValueChanged

    // Obtiene el modelo de lista para un empleado en un mes
    private DefaultMutableTreeNode modeloDiasOciosos(empleado emp, int mes, int año) {
        int diasOciosos;
        if (mes > 0)
            diasOciosos = diasOciosos(emp, mes, año);
        else
            diasOciosos = diasOciososAnuales(emp, año);

        DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode(emp.getNombre()
                + " (" + String.valueOf(emp.getCedula()) + "). Total de días ociosos: "
                + String.valueOf(diasOciosos));
        return dmtn;
    }

    // Obtiene la cantidad de dias ociosos para un empleado en un mes
    private int diasOciosos(empleado emp, int mes, int año) {
        misTrabajos mt = emp.mTrabajos;
        int diasTrabajados = 0;
        while (mt != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(mt.getTrabajo().getFecha());
            if (cal.get(Calendar.YEAR) == año
                    && cal.get(Calendar.MONTH) + 1 == mes)
                diasTrabajados++;
            mt = mt.sig;
        }
        Calendar c = new GregorianCalendar(año, mes - 1, 1);
        return c.getActualMaximum(Calendar.DAY_OF_MONTH) - diasTrabajados;
    }

    // Obtiene la cantidad de días ociosos para un empleado en un año
    private int diasOciososAnuales(empleado emp, int año) {
        misTrabajos mt = emp.mTrabajos;
        int diasTrabajados = 0;
        while (mt != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(mt.getTrabajo().getFecha());
            if (cal.get(Calendar.YEAR) == año)
                diasTrabajados++;
            mt = mt.sig;
        }
        Calendar c = new GregorianCalendar(año, 0, 1);
        return c.getActualMaximum(Calendar.DAY_OF_YEAR) - diasTrabajados;
    }

    // Calcula el empleado con más ganancias
    private empleado obtenerMejor(int mes, int año) {
        empleado temp = dt.mEmpleados;
        empleado mejor = temp;
        int mejortotal = 0;

        while (temp != null) {
            if (recaudadoEnMes(temp, mes, año) > mejortotal)
                mejor = temp;
            temp = temp.sig;
        }
        return mejor;
    }

    // Obtiene lo recaudado de un empleado en un mes
    private int recaudadoEnMes(empleado quien, int mes, int año) {
        int total = 0;
        misTrabajos mt = quien.mTrabajos;
        while (mt != null) {
            Calendar fecha = Calendar.getInstance();
            fecha.setTime(mt.getTrabajo().getFecha());
            int taño = fecha.get(Calendar.YEAR);
            int tmes = fecha.get(Calendar.MONTH) + 1;
            if (taño == año && tmes == mes)
                total += mt.getTrabajo().getCosto();
            mt = mt.sig;
        }
        return total;
    }

    // Indica la cantidad de trabajos asignados a los autos de un cliente
    private int totalTrabajos(cliente c) {
        int total = 0;
        trabajo t = dt.mTrabajos;
        while (t != null) {
            if (t.getAuto().getCliente() == c)
                total++;
            t = t.sig;
        }
        return total;
    }

    // Actualiza la lista de clientes más frecuentes
    private misClientes top10frecuentes() {
        cliente temp = dt.mClientes;
        while (temp != null) {
            Insertar(temp);
            temp = temp.sig;
        }

        return top10Frecuentes;
    }

    // Inserta un cliente en la lista de clientes frecuentes
    private void Insertar(cliente c) {
        if (top10Frecuentes == null)
            top10Frecuentes = new misClientes(c);
        else {
            misClientes temp = top10Frecuentes;
            misClientes ant = temp;
            if (totalTrabajos(c) > totalTrabajos(top10Frecuentes.mCliente)) {
                misClientes nuevo = new misClientes(c);
                nuevo.sig = top10Frecuentes;
                top10Frecuentes = nuevo;
            } else {
                misClientes nuevo = new misClientes(c);
                while (temp != null
                        && !temp.mCliente.equals(c)
                        && totalTrabajos(temp.mCliente) >= totalTrabajos(c)) {
                    ant = temp;
                    temp = temp.sig;
                }
                if (temp == null)
                    ant.sig = nuevo;
                else if (!temp.mCliente.equals(c)) {
                    if (ant != null)
                        ant.sig = nuevo;
                    else
                        top10Frecuentes.sig = nuevo;
                    nuevo.sig = temp;
                }
            }
        }
    }

    // Muestra los clientes con más trabajos asignados
    private void mostrarTopClientes() {
        DefaultListModel dlm = new DefaultListModel();
        misClientes temp = top10frecuentes();
        int cuenta = 0;

        while (temp != null && cuenta < 10) {
            dlm.add(dlm.getSize(), temp.mCliente.getCedula());
            temp = temp.sig;
            cuenta++;
        }

        listClientesFrecuentes.setModel(dlm);
    }

    // Inserta un auto en la lista de autos con más tiempo en el taller
    private void Insertar(auto a) {
        if (top10MasTiempo == null)
            top10MasTiempo = new misAutos(a);
        else {
            misAutos temp = top10MasTiempo;
            misAutos ant = temp;
            if (compararFecha(a.getIngreso())
                    > compararFecha(top10MasTiempo.getAuto().getIngreso())) {
                misAutos nuevo = new misAutos(a);
                nuevo.sig = top10MasTiempo;
                top10MasTiempo = nuevo;
            } else {
                misAutos nuevo = new misAutos(a);
                while (temp != null
                        && !temp.getAuto().equals(a)
                        && compararFecha(temp.getAuto().getIngreso())
                        >= compararFecha(a.getIngreso())) {
                    ant = temp;
                    temp = temp.sig;
                }
                if (temp == null)
                    ant.sig = nuevo;
                else if (!temp.getAuto().equals(a)) {
                    if (ant != null)
                        ant.sig = nuevo;
                    else
                        top10MasTiempo.sig = nuevo;
                    nuevo.sig = temp;
                }
            }
        }
    }

    // Compara una fecha con la fecha actual
    private int compararFecha(Date fecha) {
        return Calendar.getInstance().getTime().compareTo(fecha);
    }

    // Actualiza la lista de autos con más tiempo en el taller
    private misAutos top10tiempo() {
        auto temp = dt.mAutos;
        if (temp != null)
            do {
                Insertar(temp);
                temp = temp.sig;
            } while (temp != dt.mAutos);
        return top10MasTiempo;
    }

    // Muestra la lista de autos con más tiempo en el taller
    private void mostrarTopAutos() {
        DefaultListModel dlm = new DefaultListModel();
        misAutos temp = top10tiempo();
        int cuenta = 0;

        while (temp != null && cuenta < 10) {
            dlm.add(dlm.getSize(), temp.getAuto().getPlaca());
            temp = temp.sig;
            cuenta++;
        }
        listMasTiempo.setModel(dlm);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelados;
    private javax.swing.JButton buttonCancelarTodo;
    private javax.swing.JButton buttonDiasOciosos;
    private javax.swing.JButton buttonFacturar;
    private javax.swing.JButton buttonMejorEmpleado;
    private javax.swing.JButton buttonPendientesPorDia;
    private javax.swing.JButton buttonVerPendientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList listClientes;
    private javax.swing.JList listClientesFrecuentes;
    private javax.swing.JList listMasTiempo;
    private javax.swing.JList listPendientesPorDia;
    private javax.swing.JList listTrabajosPendientes;
    private javax.swing.JTextField textAño;
    private javax.swing.JTextField textAñoOcio;
    private javax.swing.JFormattedTextField textFecha;
    private javax.swing.JFormattedTextField textFechaCancelados;
    private javax.swing.JFormattedTextField textFechaPendiente;
    private javax.swing.JTextField textMes;
    private javax.swing.JTextField textMesOcio;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTree treeFactura;
    private javax.swing.JTree treeInfo;
    private javax.swing.JTree treeMejorEmpleado;
    private javax.swing.JTree treeOcio;
    private javax.swing.JTree treePendientePorDia;
    private javax.swing.JTree treeRecaudado;
    private javax.swing.JTree treeTrabajoPendiente;
    // End of variables declaration//GEN-END:variables
}
