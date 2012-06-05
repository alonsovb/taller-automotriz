package twmVision;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import twmData.datosTaller;
import twmData.empleado;
import twmData.trabajo;

// Ventana que muestra los empleados del taller
// Permite agregar, modificar y eliminar
// Además, la asignación de trabajos
public class fEmpleado extends javax.swing.JDialog
{

    datosTaller dt;
    empleado seleccionado;
    trabajo tseleccionado;

    public fEmpleado(java.awt.Frame parent, boolean modal, datosTaller ndt) {
        super(parent, modal);
        initComponents();
        textBusqueda.getDocument().addDocumentListener(dl);
        dt = ndt;
        ActualizarLista();
    }

    // Búsqueda en tiempo real
    DocumentListener dl = new DocumentListener()
    {

        public void insertUpdate(DocumentEvent e) {
            Instant();
        }

        public void removeUpdate(DocumentEvent e) {
            Instant();
        }

        public void changedUpdate(DocumentEvent e) {
            Instant();
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabEmpleados = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEmpleados = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        textBusqueda = new javax.swing.JTextField();
        checkTiempoReal = new javax.swing.JCheckBox();
        comboDestinoBusqueda = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeEmpleados = new javax.swing.JTree();
        jPanel6 = new javax.swing.JPanel();
        buttonModificar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTrabajos = new javax.swing.JList();
        buttonNuevoTrabajo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        treeTrabajos = new javax.swing.JTree();
        buttonCompletado = new javax.swing.JButton();
        labelCedula2 = new javax.swing.JLabel();
        panelEditar = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        textnNombre = new javax.swing.JTextField();
        textnApellidos = new javax.swing.JTextField();
        textnTelefono = new javax.swing.JTextField();
        textnDireccion = new javax.swing.JTextField();
        buttonGuardar = new javax.swing.JButton();
        buttonGuardar1 = new javax.swing.JButton();
        labelModMensaje = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        textCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textApellidos = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        buttonInsertar = new javax.swing.JButton();
        labelMensaje = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados");
        setMinimumSize(new java.awt.Dimension(355, 270));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        listEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listEmpleadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listEmpleados);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        textBusqueda.setText("Buscar");
        textBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBusquedaActionPerformed(evt);
            }
        });

        checkTiempoReal.setBackground(new java.awt.Color(255, 255, 255));
        checkTiempoReal.setSelected(true);
        checkTiempoReal.setText("TReal ©");
        checkTiempoReal.setToolTipText("Búsqueda en tiempo real.");
        checkTiempoReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTiempoRealActionPerformed(evt);
            }
        });

        comboDestinoBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cédula", "Nombre", "Apellidos", "Teléfono", "Dirección", "Todo (Beta)" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboDestinoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkTiempoReal)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDestinoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkTiempoReal))
                .addContainerGap())
        );

        treeEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Seleccione un elemento.");
        treeEmpleados.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeEmpleados.setRootVisible(false);
        jScrollPane2.setViewportView(treeEmpleados);

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
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(buttonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
        );

        tabEmpleados.addTab("General", jPanel1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        listTrabajos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTrabajosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listTrabajos);

        buttonNuevoTrabajo.setText("Agregar");
        buttonNuevoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevoTrabajoActionPerformed(evt);
            }
        });

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeTrabajos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeTrabajos.setRootVisible(false);
        jScrollPane4.setViewportView(treeTrabajos);

        buttonCompletado.setText("Completado");
        buttonCompletado.setToolTipText("Marcar el trabajo seleccionado como completado.");
        buttonCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCompletadoActionPerformed(evt);
            }
        });

        labelCedula2.setText("Cedula:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(buttonNuevoTrabajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(buttonCompletado, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(labelCedula2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCompletado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNuevoTrabajo)))
                .addContainerGap())
        );

        tabEmpleados.addTab("Trabajos pendientes", jPanel7);

        panelEditar.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Nombre");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione las propiedades que desea modificar.");

        labelCedula.setForeground(new java.awt.Color(0, 102, 102));
        labelCedula.setText("Cédula:");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Apellidos");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Teléfono");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Dirección");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        textnNombre.setEnabled(false);

        textnApellidos.setEnabled(false);

        textnTelefono.setEnabled(false);

        textnDireccion.setEnabled(false);

        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        buttonGuardar1.setText("Cancelar");

        javax.swing.GroupLayout panelEditarLayout = new javax.swing.GroupLayout(panelEditar);
        panelEditar.setLayout(panelEditarLayout);
        panelEditarLayout.setHorizontalGroup(
            panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelModMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(labelCedula)
                    .addGroup(panelEditarLayout.createSequentialGroup()
                        .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textnNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textnApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textnTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textnDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEditarLayout.createSequentialGroup()
                        .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonGuardar1)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        panelEditarLayout.setVerticalGroup(
            panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(textnNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(textnApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(textnTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(textnDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGuardar)
                    .addComponent(buttonGuardar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelModMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabEmpleados.addTab("Modificar", panelEditar);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Cédula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Teléfono");

        jLabel5.setText("Dirección");

        buttonInsertar.setText("Insertar");
        buttonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertarActionPerformed(evt);
            }
        });

        labelMensaje.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addGap(353, 353, 353))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonInsertar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(357, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        tabEmpleados.addTab("Insertar", jPanel3);

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(buttonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(438, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tabEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Se actualiza la información al seleccionar un nuevo empleado
    private void listEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listEmpleadosValueChanged
        if (listEmpleados.getSelectedValue() != null) {
            String itemStr = listEmpleados.getSelectedValue().toString();
            int ced = Integer.parseInt(itemStr);
            seleccionado = dt.ObtenerEmpleado(ced);

            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(seleccionado));
            treeEmpleados.setModel(dtm);

            labelCedula2.setText(itemStr);
            EditarSeleccionado();
            ActualizarTrabajos();
        }
    }//GEN-LAST:event_listEmpleadosValueChanged

    private void checkTiempoRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTiempoRealActionPerformed
        if (checkTiempoReal.isSelected())
            textBusqueda.getDocument().addDocumentListener(dl);
        else
            textBusqueda.getDocument().removeDocumentListener(dl);
    }//GEN-LAST:event_checkTiempoRealActionPerformed

    // Búsqueda instantánea
    private void textBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBusquedaActionPerformed
        Instant();
    }//GEN-LAST:event_textBusquedaActionPerformed

    // Inserta un nuevo empleado con los datos dados
    private void buttonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertarActionPerformed
        int nCedula;
        try {
            nCedula = Integer.parseInt(textCedula.getText());
        } catch (NumberFormatException nfe) {
            labelMensaje.setForeground(Color.red);
            labelMensaje.setText("La cédula no tiene el formato correcto.");
            return;
        }
        empleado nuevo = new empleado(nCedula, textNombre.getText(),
                textApellidos.getText(), textTelefono.getText(),
                textDireccion.getText());
        if (dt.Insertar(nuevo)) {
            labelMensaje.setForeground(Color.black);
            labelMensaje.setText("Insertado con éxito.");
            textCedula.setText("");
            textNombre.setText("");
            textApellidos.setText("");
            textTelefono.setText("");
            textDireccion.setText("");
            ActualizarLista();
        } else {
            labelMensaje.setForeground(Color.red);
            labelMensaje.setText("No se puede insertar");
        }
    }//GEN-LAST:event_buttonInsertarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        textnNombre.setEnabled(jCheckBox1.isSelected());
        if (seleccionado != null && !jCheckBox1.isSelected())
            textnNombre.setText(seleccionado.getNombre());
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        textnApellidos.setEnabled(jCheckBox2.isSelected());
        if (seleccionado != null && !jCheckBox2.isSelected())
            textnApellidos.setText(seleccionado.getApellidos());
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        textnTelefono.setEnabled(jCheckBox3.isSelected());
        if (seleccionado != null && !jCheckBox3.isSelected())
            textnTelefono.setText(seleccionado.getTelefono());
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        textnDireccion.setEnabled(jCheckBox4.isSelected());
        if (seleccionado != null && !jCheckBox4.isSelected())
            textnDireccion.setText(seleccionado.getDireccion());
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    // Permite la eliminación de un empleado seleccionado
    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        if (seleccionado != null)
            if (JOptionPane.showConfirmDialog(this,
                    "¿Desea eliminar el empleado seleccionado?",
                    "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                dt.EliminarEmpleado(seleccionado.getCedula());
                seleccionado = null;
                ActualizarLista();

                EliminarSeleccionArbol();
            }
    }//GEN-LAST:event_buttonEliminarActionPerformed

    // Muestra la pestaña de modificar para un empleado seleccionado
    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        if (seleccionado != null) {
            tabEmpleados.setSelectedComponent(panelEditar);
            EditarSeleccionado();
        }
    }//GEN-LAST:event_buttonModificarActionPerformed

    // Actualiza la información del empleado
    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        if (dt.ModificarEmpleado(seleccionado.getCedula(), textnNombre.getText(),
                textnApellidos.getText(), textnTelefono.getText(),
                textnDireccion.getText())) {
            labelModMensaje.setForeground(Color.black);
            labelModMensaje.setText("Edición exitosa.");
            EditarSeleccionado();
            ActualizarLista();
            EliminarSeleccionArbol();
        } else {
            labelModMensaje.setForeground(Color.red);
            labelModMensaje.setText("No se pudo editar.");
        }
    }//GEN-LAST:event_buttonGuardarActionPerformed

    // Agrega un nuevo trabajo al empleado seleccionado
    private void buttonNuevoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoTrabajoActionPerformed
        if (seleccionado != null) {
            fAgregarTrabajo f = new fAgregarTrabajo(this, true, dt);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

            int w = f.getSize().width;
            int h = f.getSize().height;
            int x = (dim.width - w) / 2;
            int y = (dim.height - h) / 2;

            f.setLocation(x, y);
            f.setVisible(true);

            trabajo nTrabajo = f.getTrabajo();
            if (nTrabajo != null)
                if (seleccionado.Insertar(nTrabajo)
                        && dt.Insertar(nTrabajo)) {
                    nTrabajo.setEmpleado(seleccionado);
                    ActualizarTrabajos();
                    ActualizarLista();
                } else
                    JOptionPane.showMessageDialog(
                            this, "No se puede insertar el trabajo",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonNuevoTrabajoActionPerformed

    // Actualiza la información para el nuevo trabajo seleccionado
    private void listTrabajosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTrabajosValueChanged
        if (listTrabajos.getSelectedValue() != null) {
            String itemStr = listTrabajos.getSelectedValue().toString();
            int codigo = Integer.parseInt(itemStr);
            tseleccionado = dt.ObtenerTrabajo(codigo);

            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(tseleccionado));
            treeTrabajos.setModel(dtm);
        } else {
            treeTrabajos.setModel(null);
        }

    }//GEN-LAST:event_listTrabajosValueChanged

    // Actualiza el estado del trabajo seleccionado a completado
    private void buttonCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCompletadoActionPerformed
        if (tseleccionado != null)
            if (JOptionPane.showConfirmDialog(this, "¿Marcar el trabajo como completado?",
                    "Finalizar trabajo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)
                    == JOptionPane.OK_OPTION) {
                dt.CompletarTrabajo(tseleccionado);
                tseleccionado = null;
                ActualizarTrabajos();
                treeTrabajos.setModel(null);
            }
    }//GEN-LAST:event_buttonCompletadoActionPerformed

    // Oculta la ventana
    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonSalirActionPerformed

    // Actualiza la información de un empleado seleccionado
    private void EditarSeleccionado() {
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);

        textnNombre.setEnabled(false);
        textnApellidos.setEnabled(false);
        textnTelefono.setEnabled(false);
        textnDireccion.setEnabled(false);

        if (seleccionado != null) {

            labelCedula.setText("Cédula: " + String.valueOf(seleccionado.getCedula()));
            textnNombre.setText(seleccionado.getNombre());
            textnApellidos.setText(seleccionado.getApellidos());
            textnTelefono.setText(seleccionado.getTelefono());
            textnDireccion.setText(seleccionado.getDireccion());
        }
    }

    // Muestra en blanco la información de empleado
    private void EliminarSeleccionArbol() {
        DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode("Seleccione un elemento.");
        DefaultTreeModel dtm = new DefaultTreeModel(dmtn);
        treeEmpleados.setModel(dtm);
    }

    // Búsqueda en tiempo real
    private void Instant() {
        DefaultListModel ndlm = new DefaultListModel();
        String busq = textBusqueda.getText();

        for (empleado emp = dt.mEmpleados; emp != null; emp = emp.sig) {
            String itemStr = String.valueOf(emp.getCedula());
            if (itemStr.contains(busq))
                ndlm.add(ndlm.getSize(), itemStr);
        }

        listEmpleados.setModel(ndlm);
        EliminarSeleccionArbol();
    }

    // Actualiza la lista de empleados
    private void ActualizarLista() {
        DefaultListModel dlm = models.getListModel(dt.mEmpleados);
        listEmpleados.setModel(dlm);
    }

    // Actualiza la lista de trabajos
    private void ActualizarTrabajos() {
        DefaultListModel dlm = models.getListModel(seleccionado.mTrabajos, true);
        listTrabajos.setModel(dlm);
    }
    //<editor-fold defaultstate="collapsed" desc="Generated Code">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCompletado;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonGuardar1;
    private javax.swing.JButton buttonInsertar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonNuevoTrabajo;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JCheckBox checkTiempoReal;
    private javax.swing.JComboBox comboDestinoBusqueda;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCedula2;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelModMensaje;
    private javax.swing.JList listEmpleados;
    private javax.swing.JList listTrabajos;
    private javax.swing.JPanel panelEditar;
    private javax.swing.JTabbedPane tabEmpleados;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textBusqueda;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JTextField textnApellidos;
    private javax.swing.JTextField textnDireccion;
    private javax.swing.JTextField textnNombre;
    private javax.swing.JTextField textnTelefono;
    private javax.swing.JTree treeEmpleados;
    private javax.swing.JTree treeTrabajos;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}