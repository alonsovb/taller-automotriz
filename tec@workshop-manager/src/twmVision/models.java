package twmVision;

import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import twmData.cliente;
import twmData.empleado;
import twmData.auto;
import twmData.trabajo;
import twmData.misAutos;
import twmData.misTrabajos;
import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;
import twmData.datosTaller;
import twmData.historial;

// Clase con métodos para la construcción de listas visuales y listas jerárquicas
// para los controles que permiten la visualización de las clases principales.
// Permiten construir modelos para jList y jTree
public class models
{

    // <editor-fold defaultstate="collapsed" desc="Modelos de trabajos">
    public static DefaultListModel getListModel(trabajo t, Boolean soloIncompletos) {

        DefaultListModel dlm = new DefaultListModel();
        trabajo temp = t;

        while (temp != null) {
            if (!(soloIncompletos && t.estaCompleto()))
                dlm.add(dlm.getSize(), temp.getCodigo());
            temp = temp.sig;
        }

        return dlm;
    }

    public static DefaultListModel getListModel(misTrabajos mt, Boolean soloIncompletos) {

        DefaultListModel dlm = new DefaultListModel();
        misTrabajos temp = mt;

        while (temp != null) {
            if (!(soloIncompletos && temp.getTrabajo().estaCompleto()))
                dlm.add(dlm.getSize(), temp.getTrabajo().getCodigo());
            temp = temp.sig;
        }

        return dlm;
    }

    public static DefaultListModel getListModel(historial h) {

        DefaultListModel dlm = new DefaultListModel();
        historial temp = h;

        while (temp != null) {
            dlm.add(dlm.getSize(), temp.getTrabajo().getCodigo());
            temp = temp.sig;
        }

        return dlm;
    }

    public static DefaultListModel getListModelPendientes(auto ma, datosTaller ndt) {

        DefaultListModel dlm = new DefaultListModel();
        trabajo t = ndt.mTrabajos;

        while (t != null) {
            if (t.getAuto().equals(ma) && !t.estaCompleto())
                dlm.add(dlm.getSize(), t.getCodigo());
            t = t.sig;
        }

        return dlm;
    }
    
    public static DefaultListModel getListModelPorDia(Date fecha, datosTaller ndt) {

        DefaultListModel dlm = new DefaultListModel();
        trabajo t = ndt.mTrabajos;

        while (t != null) {
            if (t.getFecha().equals(fecha) && !t.estaCompleto())
                dlm.add(dlm.getSize(), t.getCodigo());
            t = t.sig;
        }

        return dlm;
    }    

    public static DefaultMutableTreeNode getAllTreeModel(historial h) {

        historial temp = h;
        if (temp != null) {
            DefaultMutableTreeNode dtn = new DefaultMutableTreeNode("Historial");

            while (temp != null) {
                dtn.add(getTreeModel(temp.getTrabajo()));
                temp = temp.sig;
            }

            return dtn;
        } else
            return new DefaultMutableTreeNode("No hay trabajos para mostrar");
    }

    public static DefaultMutableTreeNode getAllTreeModel(misTrabajos mt) {

        misTrabajos temp = mt;
        if (temp != null) {
            DefaultMutableTreeNode dtn = new DefaultMutableTreeNode("Trabajos");

            while (temp != null) {
                dtn.add(getTreeModel(temp.getTrabajo()));
                temp = temp.sig;
            }

            return dtn;
        } else
            return new DefaultMutableTreeNode("No hay trabajos para mostrar");
    }

    public static DefaultMutableTreeNode getTreeModel(trabajo t) {

        DefaultMutableTreeNode dtm = new DefaultMutableTreeNode(String.valueOf(t.getCodigo()));

        dtm.add(new DefaultMutableTreeNode("Código: " + String.valueOf(t.getCodigo())));
        dtm.add(new DefaultMutableTreeNode("Descripción: " + t.getDescripcion()));
        dtm.add(new DefaultMutableTreeNode("Costo: " + String.valueOf(t.getCosto())));
        if (t.getFecha() != null) {
            String todo, ndia, dia, mes, año;
            todo = t.getFecha().toString();
            ndia = todo.substring(0, 4);
            dia = todo.substring(8, 11);
            mes = todo.substring(4, 8);
            año = todo.substring(24, 28);
            todo = ndia + dia + mes + año;
            dtm.add(new DefaultMutableTreeNode("Fecha: " + todo));
        }
        if (t.estaCompleto()) {
            dtm.add(new DefaultMutableTreeNode("Completado por: "
                    + t.getEmpleado().getNombre()));
            if (t.Cancelado())
                dtm.add(new DefaultMutableTreeNode("Estado: Cancelado"));
            else
                dtm.add(new DefaultMutableTreeNode("Estado: Sin cancelar"));
        } else
            dtm.add(new DefaultMutableTreeNode("Aún pendiente"));

        return dtm;
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Modelos de autos">
    public static DefaultListModel getListModel(auto a) {

        DefaultListModel dlm = new DefaultListModel();
        auto temp = a;

        do {
            dlm.add(dlm.getSize(), temp.getPlaca());
            temp = temp.sig;
        } while (temp != a);

        return dlm;
    }

    public static DefaultListModel getListModel(misAutos ma) {

        DefaultListModel dlm = new DefaultListModel();
        misAutos temp = ma;

        while (temp != null) {
            dlm.add(dlm.getSize(), temp.getAuto().getPlaca());
            temp = temp.sig;
        }

        return dlm;
    }

    public static DefaultMutableTreeNode getTreeModel(auto a) {

        DefaultMutableTreeNode dtm = new DefaultMutableTreeNode(String.valueOf(a.getPlaca()));

        dtm.add(new DefaultMutableTreeNode("Placa: " + String.valueOf(a.getPlaca())));
        dtm.add(new DefaultMutableTreeNode("Marca: " + a.getMarca()));
        dtm.add(new DefaultMutableTreeNode("Modelo: " + a.getModelo()));
        if (a.getCliente() != null)
            dtm.add(new DefaultMutableTreeNode("Propietario: "
                    + a.getCliente().getNombre() + " "
                    + a.getCliente().getApellidos()));
        else
            dtm.add(new DefaultMutableTreeNode("Propietario sin asignar"));

        dtm.add(getAllTreeModel(a.mHistorial));

        return dtm;
    }

    public static DefaultMutableTreeNode getAllTreeModel(misAutos ma) {

        misAutos temp = ma;
        if (temp != null) {
            DefaultMutableTreeNode dtn = new DefaultMutableTreeNode("Autos");

            while (temp != null) {
                dtn.add(getTreeModel(temp.getAuto()));
                temp = temp.sig;
            }

            return dtn;
        } else
            return new DefaultMutableTreeNode("No hay autos para mostrar");
    }

    public static DefaultComboBoxModel getComboModel(auto a) {

        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        if (a != null) {
            auto temp = a;
            do {
                cbm.addElement(temp.getPlaca());
                temp = temp.sig;
            } while (temp != a);
        }
        return cbm;
    }

    public static DefaultComboBoxModel getComboModelSinAsignar(auto a) {

        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        if (a != null) {
            auto temp = a;
            do {
                if (temp.getCliente() == null)
                    cbm.addElement(temp.getPlaca());
                temp = temp.sig;
            } while (temp != a);
        }
        return cbm;
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Modelos de clientes">
    public static DefaultListModel getListModel(cliente c) {

        DefaultListModel dlm = new DefaultListModel();
        cliente temp = c;

        while (temp != null) {
            dlm.add(dlm.getSize(), temp.getCedula());
            temp = temp.sig;
        }

        return dlm;
    }

    public static DefaultMutableTreeNode getTreeModel(cliente c) {

//        DefaultMutableTreeNode dtmRes = new DefaultMutableTreeNode(String.valueOf(c.getCedula()));
        DefaultMutableTreeNode dtm = new DefaultMutableTreeNode(c.getNombre());

        dtm.add(new DefaultMutableTreeNode("Cédula: " + String.valueOf(c.getCedula())));
        dtm.add(new DefaultMutableTreeNode("Nombre: " + c.getNombre()));
        dtm.add(new DefaultMutableTreeNode("Apellidos: " + c.getApellidos()));
        dtm.add(new DefaultMutableTreeNode("Teléfono: " + c.getTelefono()));
        dtm.add(new DefaultMutableTreeNode("Dirección: " + c.getDireccion()));

        dtm.add(getAllTreeModel(c.mAutos));

        return dtm;
    }

    public static DefaultMutableTreeNode getAllTreeModel(cliente c) {

        cliente temp = c;
        if (temp != null) {
            DefaultMutableTreeNode dtn = new DefaultMutableTreeNode("Clientes");

            while (temp != null) {
                dtn.add(getTreeModel(temp));
                temp = temp.sig;
            }

            return dtn;
        } else
            return new DefaultMutableTreeNode("No hay clientes para mostrar");
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Modelos de empleados">
    public static DefaultListModel getListModel(empleado e) {

        DefaultListModel dlm = new DefaultListModel();
        empleado temp = e;

        while (temp != null) {
            dlm.add(dlm.getSize(), temp.getCedula());
            temp = temp.sig;
        }

        return dlm;
    }

    public static DefaultMutableTreeNode getTreeModel(empleado e) {

        DefaultMutableTreeNode dtm = new DefaultMutableTreeNode("Información");

        dtm.add(new DefaultMutableTreeNode("Cédula: " + String.valueOf(e.getCedula())));
        dtm.add(new DefaultMutableTreeNode("Nombre: " + e.getNombre()));
        dtm.add(new DefaultMutableTreeNode("Apellidos: " + e.getApellidos()));
        dtm.add(new DefaultMutableTreeNode("Teléfono: " + e.getTelefono()));
        dtm.add(new DefaultMutableTreeNode("Dirección: " + e.getDireccion()));

        dtm.add(getAllTreeModel(e.mTrabajos));

        return dtm;
    }// </editor-fold>
}
