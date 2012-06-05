package twmData;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import twmVision.fInicio;

// Clase principal, encargada de contener las listas principales
// Se utiliza una sola instancia de ella a lo largo de la ejecución del programa
// Contiene métodos de inserción, consulta, modificación y eliminación de elementos
public class datosTaller
{
    // Atributos

    public cliente mClientes;
    public empleado mEmpleados;
    public auto mAutos;
    public trabajo mTrabajos;
    private int ganancias = 0;
    private int sigCod = 0;

    // Agrega la cantidad "total" al taller
    public void AgregarGanancia(int total) {
        ganancias += total;
    }

    // Devuelve el total de ganancias del taller
    public int TotalGanancias() {
        return ganancias;
    }

    // Inserta un cliente en la lista principal
    // Recibe el cliente nuevo
    // Devuelve una valor que indica si se pudo insertar
    public Boolean Insertar(cliente nuevo) {
        if (mClientes == null) {
            // Si es el primero, se ingresa directamente
            mClientes = nuevo;
            return true;
        } else {
            cliente temp = mClientes;
            cliente ant = null;
            // Se comprueba que el elemento no esté repetido
            // A la vez, se busca la posición correcta del cliente
            while (temp != null
                    && nuevo.getNombre().compareTo(temp.getNombre()) > 0
                    && nuevo.getCedula() != temp.getCedula()) {
                ant = temp;
                temp = temp.sig;
            }
            if (temp == null) {
                nuevo.ant = ant;
                ant.sig = nuevo;
                return true;
            } else if (nuevo.getCedula() == temp.getCedula())
                return false;
            else if (nuevo.getNombre().compareTo(temp.getNombre()) <= 0) {
                if (ant != null) {
                    nuevo.ant = ant;
                    ant.sig = nuevo;
                } else
                    mClientes = nuevo;
                nuevo.sig = temp;
                temp.ant = nuevo;
                return true;
            } else
                return false;
        }
    }

    // Inserta un empleado en la lista principal
    // Recibe el empleado nuevo
    // Devuelve una valor que indica si se pudo insertar
    public Boolean Insertar(empleado nuevo) {
        if (mEmpleados == null) {
            // Si es el primero, se inserta directamente
            mEmpleados = nuevo;
            return true;
        } else {
            empleado temp = mEmpleados;
            empleado ant = null;
            // Se comprueba que no esté repetido
            while (temp != null && nuevo.getCedula() != temp.getCedula()) {
                ant = temp;
                temp = temp.sig;
            }
            if (temp == null) {
                ant.sig = nuevo;
                return true;
            } else
                return false;
        }
    }

    // Inserta un auto en la lista principal
    // Recibe el auto nuevo
    // Devuelve una valor que indica si se pudo insertar
    public Boolean Insertar(auto nuevo) {
        if (mAutos == null) {
            // Si es el primero, se ingresa directamente
            mAutos = nuevo;
            // Al ser circular, se apunta el primero a sí mismo
            mAutos.sig = mAutos;
            return true;
        } else {
            auto temp = mAutos;
            // Se comprueba que no está repetido
            while (nuevo.getPlaca() != temp.getPlaca() && temp.sig != mAutos) {
                temp = temp.sig;
            }
            if (temp.sig == mAutos) {
                temp.sig = nuevo;
                nuevo.sig = mAutos;
                return true;
            } else
                return false;
        }
    }

    // Inserta un trabajo en la lista principal
    // Recibe el trabajo nuevo
    // Devuelve una valor que indica si se pudo insertar
    public Boolean Insertar(trabajo nuevo) {
        if (mTrabajos == null) {
            // Si es el primero se inserta directamente
            mTrabajos = nuevo;
            // Actualiza el índice de trabajos
            sigCod++;
            return true;
        } else {
            trabajo temp = mTrabajos;
            // Se comprueba que no se inserte repetido
            while (temp.sig != null && nuevo.getCodigo() != temp.getCodigo()) {
                temp = temp.sig;
            }
            if (temp.sig == null) {
                temp.sig = nuevo;
                sigCod++;
                return true;
            } else
                return false;
        }
    }

    // Devuelve un cliente buscando por cédula
    // si no se encuentra, devuelve null
    public cliente ObtenerCliente(int cedula) {
        cliente temp = mClientes;
        // Se busca por cédula en cada cliente
        while (temp != null && cedula != temp.getCedula()) {
            temp = temp.sig;
        }
        return temp;
    }

    // Devuelve un empleado buscando por cédula
    // si no se encuentra, devuelve null
    public empleado ObtenerEmpleado(int cedula) {
        empleado temp = mEmpleados;
        // Busca por cédula en cada empleado
        while (temp != null && cedula != temp.getCedula()) {
            temp = temp.sig;
        }
        return temp;
    }

    // Devuelve un auto buscando por cédula
    // si no se encuentra, devuelve null
    public auto ObtenerAuto(int placa) {
        if (mAutos != null) {
            auto temp = mAutos;
            do {
                // Se busca por número de placa en cada auto
                if (temp.getPlaca() == placa)
                    return temp;
                temp = temp.sig;
            } while (temp != mAutos);

            return null;
        } else
            return null;
    }

    // Devuelve un trabajo buscando por código
    // si no se encuentra, devuelve null
    public trabajo ObtenerTrabajo(int codigo) {
        trabajo temp = mTrabajos;
        // Revisa cada trabajo por código
        while (temp != null && codigo != temp.getCodigo()) {
            temp = temp.sig;
        }
        return temp;
    }

    // Elimina un cliente de la lista principal
    // Recibe el número de cédula
    // Devuelve un valor que indica si se pudo eliminar
    public Boolean EliminarCliente(int cedula) {
        if (mClientes != null)
            // Compruebo el inicio de la lista
            if (mClientes.getCedula() == cedula) {
                if (mClientes.sig != null)
                    mClientes.sig.ant = null;

                // Reviso los autos asignados a ese cliente y les quito la asignación
                misAutos temp = mClientes.mAutos;
                while (temp != null) {
                    temp.getAuto().setCliente(null);
                    temp = temp.sig;
                }
                mClientes = mClientes.sig;
                return true;
            } else {
                // Busco en el resto de la lista
                cliente temp = mClientes;
                cliente ant = null;
                // Busco por cédula
                while (temp != null && temp.getCedula() != cedula) {
                    ant = temp;
                    temp = temp.sig;
                }
                if (temp != null) {

                    // Reviso los autos asignados a ese cliente y les quito la asignación
                    misAutos atemp = temp.mAutos;
                    while (atemp != null) {
                        atemp.getAuto().setCliente(null);
                        atemp = atemp.sig;
                    }

                    if (ant == null) {
                        mClientes = temp.sig;
                        mClientes.ant = null;
                    } else {
                        ant.sig = temp.sig;
                        if (temp.sig != null)
                            temp.sig.ant = ant;
                    }
                    return true;
                } else
                    return false;
            }
        else
            return false;
    }

    // Elimina un empleado de la lista principal
    // Recibe el número de cédula
    // Devuelve un valor que indica si se pudo eliminar
    public Boolean EliminarEmpleado(int cedula) {
        if (mEmpleados != null)
            // Reviso el primer empleado de la lista
            if (mEmpleados.getCedula() == cedula) {
                mEmpleados = mEmpleados.sig;
                return true;
            } else {
                // Reviso el resto
                empleado temp = mEmpleados;
                // Busco en cada elemento por cédula
                while (temp.sig != null && temp.sig.getCedula() != cedula) {
                    temp = temp.sig;
                }
                if (temp.sig != null) {
                    temp.sig = temp.sig.sig;
                    return true;
                } else
                    return false;
            }
        else
            return false;

    }

    // Elimina un auto de la lista principal
    // Recibe el número de placa
    // Devuelve un valor que indica si se pudo eliminar
    public Boolean EliminarAuto(int placa) {
        if (mAutos != null)
            // Compruebo el primer elemento
            if (mAutos.getPlaca() == placa)
                if (mAutos.sig == mAutos) {
                    mAutos = null;
                    return true;
                } else {
                    auto temp = mAutos;
                    while (temp.sig != mAutos) {
                        temp = temp.sig;
                    }

                    mAutos = mAutos.sig;
                    temp.sig = mAutos;

                    return true;
                }
            else {
                // Busco en el resto de la lista
                auto temp = mAutos;
                // Reviso por número de placa
                while (temp.sig != mAutos && temp.sig.getPlaca() != placa) {
                    temp = temp.sig;
                }
                if (temp.sig != mAutos) {
                    temp.sig = temp.sig.sig;
                    return true;
                } else
                    return false;
            }
        else
            return false;
    }

    // Elimina un trabajo de la lista principal
    // Recibe el código
    // Devuelve un valor que indica si se pudo eliminar
    public Boolean EliminarTrabajo(int codigo) {
        if (mTrabajos != null)
            // Reviso el primer elemento de la lista
            if (mTrabajos.getCodigo() == codigo) {
                mTrabajos = mTrabajos.sig;
                return true;
            } else {
                // Reviso el resto de la lista
                trabajo temp = mTrabajos;
                // Compruebo cada código hasta encontrar el buscado
                while (temp.sig != null && temp.sig.getCodigo() != codigo) {
                    temp = temp.sig;
                }
                if (temp.sig != null) {
                    temp.sig = temp.sig.sig;
                    return true;
                } else
                    return false;
            }
        else
            return false;
    }

    // Modifica los datos de un cliente
    // Recibe el número de cédula y los nuevos datos
    // Devuelve un valor que indica si se pudo eliminar
    public Boolean ModificarCliente(int cedula, String nNombre, String nApellidos,
            String nTelefono, String nDireccion) {
        // Se busca el cliente por cédula
        cliente temp = ObtenerCliente(cedula);
        if (temp != null) {
            // Si se mantiene el nombre, se deja en el mismo lugar
            if (temp.getNombre().equals(nNombre))
                temp.setInfo(nNombre, nApellidos, nTelefono, nDireccion);
            else {
                // De lo contrario se vuelve a ingresar en la lista
                EliminarCliente(cedula);
                temp = new cliente(cedula, nNombre, nApellidos, nTelefono, nDireccion);
                Insertar(temp);
            }
            return true;
        } else
            return false;
    }

    // Modifica los datos de un empleado
    // Recibe el número de cédula y los nuevos datos
    // Devuelve un valor que indica si se pudo eliminar
    public Boolean ModificarEmpleado(int cedula, String nNombre, String nApellidos,
            String nTelefono, String nDireccion) {
        // Se busca el empleado por cédula
        empleado temp = ObtenerEmpleado(cedula);
        if (temp != null) {
            // Se cambian sus datos
            temp.setInfo(nNombre, nApellidos, nTelefono, nDireccion);
            return true;
        } else
            return false;
    }

    // Modifica los datos de un auto
    // Recibe el número de placa y los nuevos datos
    // Devuelve un valor que indica si se pudo eliminar
    public Boolean ModificarAuto(int placa, String nMarca, String nModelo,
            Color nColor) {
        // Se busca el auto por placa
        auto temp = ObtenerAuto(placa);
        if (temp != null) {
            // Se modifican los datos
            temp.setInfo(nMarca, nModelo, nColor);
            return true;
        } else
            return false;
    }

    // Modifica los datos de un trabajo
    // Recibe el código y los nuevos datos
    // Devuelve un valor que indica si se pudo eliminar
    public Boolean ModificarTrabajo(int codigo, String nDesc, int nCosto,
            Date nFecha, auto nAuto) {
        // Se busca el trabajo por código
        trabajo temp = ObtenerTrabajo(codigo);
        if (temp != null) {
            // Se modifican los datos del trabajo
            temp.setInfo(nDesc, nCosto, nFecha, nAuto);
            return true;
        } else
            return false;
    } // DOCUMENTAR

    // Recibe un trabajo
    // Se actualiza el trabajo a completado
    public void CompletarTrabajo(trabajo trb) {
        trb.getAuto().Insertar(trb);
        trb.completar();
    }

    // Devuelve el siguiente código para trabajo disponible
    public int getSigCod() {
        return sigCod;
    }

    // Estos son datos de prueba agregados a una instancia de datosTaller
    // Usar en el método main para propósitos de prueba.
    public static void Test(datosTaller ndt) {
        auto a1 = new auto(1212, "Toyota", "1999", Color.BLACK);
        auto a2 = new auto(2424, "Nissan", "2002", Color.RED);
        auto a3 = new auto(3321, "Mitsub", "2008", Color.GREEN);

        ndt.Insertar(a1);
        ndt.Insertar(a2);
        ndt.Insertar(a3);

        cliente c1 = new cliente(11203, "Alonso", "Vega", "123", "alajuela");
        c1.Insertar(a1);
        a1.setCliente(c1);
        cliente c2 = new cliente(22372, "Brandon", "Cruz", "145", "heredia");
        c2.Insertar(a2);
        a2.setCliente(c2);
        cliente c3 = new cliente(12943, "Lourdes", "Brenes", "145", "cartago");
        c3.Insertar(a3);
        a3.setCliente(c3);

        ndt.Insertar(c1);
        ndt.Insertar(c2);
        ndt.Insertar(c3);

        empleado e1 = new empleado(206830627, "Alonso", "Vega", "8346-7950", "La Tigra");
        empleado e2 = new empleado(204590458, "Yaser", "Castillo", "8362-2369", "Barrio Coper");
        empleado e3 = new empleado(203237928, "Denis", "Cruz", "8312-1236", "Ciudad Quesada");

        ndt.Insertar(e1);
        ndt.Insertar(e2);
        ndt.Insertar(e3);
    }

    // Método de entrada de la aplicación
    public static void main(String args[]) {

        // Se cambia la apariencia gráfica de los controles
        // <editor-fold defaultstate="collapsed" desc="Set LookAndFeel">
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(datosTaller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(datosTaller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(datosTaller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(datosTaller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }// </editor-fold>

        datosTaller dt = new datosTaller();
        // La siguiente línea ingresa algunos datos de prueba.
        // Comente para obtener un estado original.
        datosTaller.Test(dt);

        // Se muestra la ventana inicial de la aplicación
        fInicio inicio = new fInicio(dt);
        //<editor-fold defaultstate="collapsed" desc="Alinear ventana al centro">
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = inicio.getSize().width;
        int h = inicio.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        inicio.setLocation(x, y);// </editor-fold>
        inicio.setVisible(true);
    }
}
