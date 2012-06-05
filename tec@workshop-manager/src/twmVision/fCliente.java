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
import twmData.auto;
import twmData.datosTaller;
import twmData.cliente;
import twmData.factura;
import twmData.misTrabajos;
import twmData.trabajo;

// Ventana que muestra la información de los clientes
// Da la posibilidad de insertar, modificar y eliminar
// Así como de ver y agregar autos asignados a él.
public class fCliente extends javax.swing.JDialog
{
    java.awt.Frame padre;
    datosTaller dt;
    cliente seleccionado;

    public fCliente(java.awt.Frame parent, boolean modal, datosTaller ndt) {
        super(parent, modal);
        initComponents();
        padre = parent;
        textBusqueda.getDocument().addDocumentListener(dl);
        dt = ndt;
        ActualizarLista();
        ActualizarCombo();
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
        listClientes = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        textBusqueda = new javax.swing.JTextField();
        checkTiempoReal = new javax.swing.JCheckBox();
        comboDestinoBusqueda = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeClientes = new javax.swing.JTree();
        jPanel6 = new javax.swing.JPanel();
        buttonModificar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        labelCedula2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listAutos = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        treeAutos = new javax.swing.JTree();
        buttonAgregarAuto = new javax.swing.JButton();
        buttonAsignar = new javax.swing.JButton();
        comboAsignar = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listFacturas = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        treeTrabajo = new javax.swing.JTree();
        buttonCancelar = new javax.swing.JButton();
        buttonCancelarTodo = new javax.swing.JButton();
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
        jPanel9 = new javax.swing.JPanel();
        buttonNuevoAuto = new javax.swing.JButton();
        comboSinAsignar = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        panelColor = new javax.swing.JPanel();
        buttonSalir4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        listClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listClientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listClientes);

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
                .addContainerGap(178, Short.MAX_VALUE))
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

        treeClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Seleccione un elemento.");
        treeClientes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeClientes.setRequestFocusEnabled(false);
        treeClientes.setRootVisible(false);
        jScrollPane2.setViewportView(treeClientes);

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
                    .addComponent(buttonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(buttonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        tabEmpleados.addTab("General", jPanel1);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        labelCedula2.setForeground(new java.awt.Color(0, 102, 102));
        labelCedula2.setText("Cédula:");

        listAutos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listAutosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listAutos);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Seleccione un elemento.");
        treeAutos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeAutos.setRootVisible(false);
        jScrollPane4.setViewportView(treeAutos);

        buttonAgregarAuto.setText("Agregar");
        buttonAgregarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarAutoActionPerformed(evt);
            }
        });

        buttonAsignar.setText("Asignar");
        buttonAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCedula2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(buttonAgregarAuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboAsignar, 0, 343, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCedula2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAgregarAuto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAsignar)
                    .addComponent(comboAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabEmpleados.addTab("Autos", jPanel10);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        listFacturas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listFacturasValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(listFacturas);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeTrabajo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeTrabajo.setRootVisible(false);
        jScrollPane6.setViewportView(treeTrabajo);

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonCancelarTodo.setText("Cancelar todo");
        buttonCancelarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCancelarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancelarTodo)))
                .addContainerGap())
        );

        tabEmpleados.addTab("Facturas pendientes", jPanel2);

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
                .addContainerGap(295, Short.MAX_VALUE))
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
                .addComponent(labelModMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
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

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Autos"));

        buttonNuevoAuto.setText("Agregar Auto");
        buttonNuevoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevoAutoActionPerformed(evt);
            }
        });

        comboSinAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSinAsignarActionPerformed(evt);
            }
        });

        jLabel7.setText("Autos sin asignar aún:");

        labelMarca.setText("Marca");

        labelModelo.setText("Modelo");

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonNuevoAuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboSinAsignar, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSinAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonNuevoAuto))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(buttonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                        .addComponent(buttonInsertar))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        tabEmpleados.addTab("Insertar", jPanel3);

        buttonSalir4.setText("Salir");
        buttonSalir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalir4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(440, Short.MAX_VALUE)
                .addComponent(buttonSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(tabEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tabEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSalir4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Actualizar los datos al seleccionar un nuevo cliente
    private void listClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listClientesValueChanged
        if (listClientes.getSelectedValue() != null) {
            String itemStr = listClientes.getSelectedValue().toString();
            int ced = Integer.parseInt(itemStr);
            seleccionado = dt.ObtenerCliente(ced);

            DefaultTreeModel dtm = new DefaultTreeModel(models.getTreeModel(seleccionado));
            treeClientes.setModel(dtm);

            labelCedula2.setText(itemStr);
            EditarSeleccionado();
            ActualizarAutos();
            ActualizarFacturas();
        }
}//GEN-LAST:event_listClientesValueChanged

    // Búsqueda instantánea al presionar "Entrar"
    private void textBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBusquedaActionPerformed
        Instant();
}//GEN-LAST:event_textBusquedaActionPerformed

    private void checkTiempoRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTiempoRealActionPerformed
        if (checkTiempoReal.isSelected())
            textBusqueda.getDocument().addDocumentListener(dl);
        else
            textBusqueda.getDocument().removeDocumentListener(dl);
}//GEN-LAST:event_checkTiempoRealActionPerformed

    // Si hay un cliente seleccionado, muestra la pestaña de editar sus datos
    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        if (seleccionado != null) {
            tabEmpleados.setSelectedComponent(panelEditar);
            EditarSeleccionado();
        }
}//GEN-LAST:event_buttonModificarActionPerformed

    // Presenta la opción de eliminar el cliente seleccionado
    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        if (seleccionado != null)
            if (JOptionPane.showConfirmDialog(this,
                    "¿Desea eliminar el cliente seleccionado?",
                    "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                dt.EliminarCliente(seleccionado.getCedula());
                seleccionado = null;
                ActualizarLista();

                EliminarSeleccionArbol();
            }
}//GEN-LAST:event_buttonEliminarActionPerformed

    // Inserta un nuevo cliente a partir de la información dada
    private void buttonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertarActionPerformed
        if (comboSinAsignar.getSelectedItem() != null) {
            int nCedula;
            try {
                nCedula = Integer.parseInt(textCedula.getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this,
                        "La cédula no tiene el formato correcto.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Se crea el nuevo cliente
            cliente nuevo = new cliente(nCedula, textNombre.getText(),
                    textApellidos.getText(), textTelefono.getText(),
                    textDireccion.getText());
            // Se obtiene el auto seleccionado
            auto nAuto = dt.ObtenerAuto(Integer.parseInt(comboSinAsignar.getSelectedItem().toString()));
            if (nAuto == null) {
                JOptionPane.showMessageDialog(this,
                        "No se encuentra el auto seleccionado", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Se inserta el nuevo cliente
            if (dt.Insertar(nuevo)) {
                nuevo.Insertar(nAuto);
                textCedula.setText("");
                textNombre.setText("");
                textApellidos.setText("");
                textTelefono.setText("");
                textDireccion.setText("");
                ActualizarLista();
                ActualizarCombo();
            } else
                JOptionPane.showMessageDialog(this, "Error al insertar", "Error",
                        JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(this,
                    "El cliente debe tener al menos un auto válido", "Error",
                    JOptionPane.ERROR_MESSAGE);
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

    // Se guarda la nueva información para el cliente seleccionado
    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        if (dt.ModificarCliente(seleccionado.getCedula(), textnNombre.getText(),
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

    // Muestra la opción de agregar un nuevo auto al cliente
    private void buttonNuevoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoAutoActionPerformed
        fAgregarAuto a = new fAgregarAuto(this, true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = a.getSize().width;
        int h = a.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        a.setLocation(x, y);

        a.setVisible(true);
        if (a.getAuto() != null)
            if (dt.Insertar(a.getAuto()))
                ActualizarCombo();
        a.dispose();
    }//GEN-LAST:event_buttonNuevoAutoActionPerformed

    // Muestra la información del auto seleccionado en el combo
    private void comboSinAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSinAsignarActionPerformed

        if (comboSinAsignar.getSelectedIndex() > 0) {
            String itemStr = comboSinAsignar.getSelectedItem().toString();
            auto temp = dt.ObtenerAuto(Integer.valueOf(itemStr));
            if (temp != null) {
                labelMarca.setText(temp.getMarca());
                labelModelo.setText(temp.getModelo());
                panelColor.setBackground(temp.getColor());
            }
        }
    }//GEN-LAST:event_comboSinAsignarActionPerformed

    private void buttonSalir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalir4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonSalir4ActionPerformed

    private void listAutosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listAutosValueChanged

        if (listAutos.getSelectedValue() != null) {
            auto sel = dt.ObtenerAuto(Integer.parseInt(listAutos.getSelectedValue().toString()));
            DefaultTreeModel dlm = new DefaultTreeModel(models.getTreeModel(sel));
            treeAutos.setModel(dlm);
        }

    }//GEN-LAST:event_listAutosValueChanged

    private void buttonAgregarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarAutoActionPerformed
        if (seleccionado != null) {
            fAgregarAuto aa = new fAgregarAuto(this, true);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int w = aa.getSize().width;
            int h = aa.getSize().height;
            int x = (dim.width - w) / 2;
            int y = (dim.height - h) / 2;
            aa.setLocation(x, y);

            aa.setVisible(true);
            auto nAuto = aa.getAuto();
            if (nAuto != null)
                if (dt.Insertar(nAuto)
                        && seleccionado.Insertar(nAuto)) {
                    ActualizarLista();
                    ActualizarAutos();
                } else
                    JOptionPane.showMessageDialog(this, "Imposible agregar el auto",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAgregarAutoActionPerformed

    private void listFacturasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listFacturasValueChanged
        if (seleccionado != null) {
            factura ftemp = new factura(seleccionado, dt);
            misTrabajos temp = ftemp.getPrimero();
            DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode(seleccionado.getNombre());

            while (temp != null) {
                dmtn.add(models.getTreeModel(temp.getTrabajo()));
                temp = temp.sig;
            }

            DefaultTreeModel dtm = new DefaultTreeModel(dmtn);
            treeTrabajo.setModel(dtm);
        }
    }//GEN-LAST:event_listFacturasValueChanged

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        if (seleccionado != null) {
            trabajo mt = dt.ObtenerTrabajo(Integer.parseInt(listFacturas.getSelectedValue().toString()));
            if (mt != null) {
                dt.AgregarGanancia(mt.Cancelar());
                ActualizarFacturas();
                treeTrabajo.setModel(null);
            }
        }
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonCancelarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarTodoActionPerformed
        if (seleccionado != null) {
            factura ftemp = new factura(seleccionado, dt);
            misTrabajos mt = ftemp.getPrimero();
            while (mt != null) {
                dt.AgregarGanancia(mt.getTrabajo().Cancelar());
                mt = mt.sig;
            }
            ActualizarFacturas();
            treeTrabajo.setModel(null);
        }
    }//GEN-LAST:event_buttonCancelarTodoActionPerformed

    private void buttonAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAsignarActionPerformed
        if (seleccionado != null && comboAsignar.getSelectedItem() != null) {
            auto temp = dt.ObtenerAuto(Integer.parseInt(comboAsignar.getSelectedItem().toString()));
            if (temp != null) {
                seleccionado.Insertar(temp);
                temp.setCliente(seleccionado);
                ActualizarCombo();
                ActualizarLista();
                ActualizarAutos();
                ActualizarFacturas();
            }
        }
    }//GEN-LAST:event_buttonAsignarActionPerformed

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

    private void EliminarSeleccionArbol() {
        DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode("Seleccione un elemento.");
        DefaultTreeModel dtm = new DefaultTreeModel(dmtn);
        treeClientes.setModel(dtm);
    }

    private void Instant() {
        DefaultListModel ndlm = new DefaultListModel();
        String busq = textBusqueda.getText();
        cliente temp = dt.mClientes;

        while (temp != null) {
            String itemStr = String.valueOf(temp.getCedula());
            if (itemStr.contains(busq))
                ndlm.add(ndlm.getSize(), itemStr);
            temp = temp.sig;
        }

        listClientes.setModel(ndlm);
        EliminarSeleccionArbol();
    }

    private void ActualizarLista() {

        DefaultListModel dlm = new DefaultListModel();
        cliente temp = dt.mClientes;

        while (temp != null) {
            dlm.add(dlm.getSize(), temp.getCedula());
            temp = temp.sig;
        }
        listClientes.setModel(dlm);

    }

    private void ActualizarCombo() {
        comboSinAsignar.setModel(models.getComboModelSinAsignar(dt.mAutos));
        comboAsignar.setModel(models.getComboModelSinAsignar(dt.mAutos));
    }

    private void ActualizarAutos() {
        if (seleccionado != null) {

            labelCedula2.setText("Cédula: " + String.valueOf(seleccionado.getCedula()));
            listAutos.setModel(models.getListModel(seleccionado.mAutos));
        }
    }

    private void ActualizarFacturas() {
        if (seleccionado != null) {
            factura ftemp = new factura(seleccionado, dt);
            listFacturas.setModel(getFacturasModel(ftemp.getPrimero()));
        }
    }

    public DefaultListModel getFacturasModel(misTrabajos mt) {

        DefaultListModel dlm = new DefaultListModel();
        misTrabajos temp = mt;

        while (temp != null) {
            if (!temp.getTrabajo().Cancelado())
                dlm.add(dlm.getSize(), temp.getTrabajo().getCodigo());
            temp = temp.sig;
        }

        return dlm;
    }
    //<editor-fold defaultstate="collapsed" desc="Generated Code">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregarAuto;
    private javax.swing.JButton buttonAsignar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCancelarTodo;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonGuardar1;
    private javax.swing.JButton buttonInsertar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonNuevoAuto;
    private javax.swing.JButton buttonSalir4;
    private javax.swing.JCheckBox checkTiempoReal;
    private javax.swing.JComboBox comboAsignar;
    private javax.swing.JComboBox comboDestinoBusqueda;
    private javax.swing.JComboBox comboSinAsignar;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCedula2;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelModMensaje;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JList listAutos;
    private javax.swing.JList listClientes;
    private javax.swing.JList listFacturas;
    private javax.swing.JPanel panelColor;
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
    private javax.swing.JTree treeAutos;
    private javax.swing.JTree treeClientes;
    private javax.swing.JTree treeTrabajo;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
