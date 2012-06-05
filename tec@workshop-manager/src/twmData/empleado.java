package twmData;

// Hereda a persona.
public class empleado extends persona
{
    // Atributos
    private int ganancias = 0;
    public misTrabajos mTrabajos;
    public empleado sig;

    // Constructor
    public empleado(int cedula, String nombre, String apellidos,
            String telefono, String direccion) {
        super(cedula, nombre, apellidos, telefono, direccion);
    }

    // Inserta un nuevo trabajo a la lista de trabajos del empleado
    // Recibe el trabajo nuevo
    // Devuelve un valor que indica si se insertó correctamente
    public Boolean Insertar(trabajo nuevo) {
        misTrabajos nTrabajo = new misTrabajos(nuevo);
        if (mTrabajos == null) {
            // Si es el primero, se ingresa al inicio
            mTrabajos = nTrabajo;
            return true;
        } else {
            // De lo contrario, se busca el lugar apropiado para insertar
            misTrabajos temp = mTrabajos;
            while (nuevo.getCodigo() != temp.getTrabajo().getCodigo()
                    && !temp.getTrabajo().getFecha().equals(nuevo.getFecha())
                    && temp.sig != null) {
                temp = temp.sig;
            }
            if (temp.getTrabajo().getFecha().equals(nuevo.getFecha()))
                return false;
            else if (temp.sig == null) {
                temp.sig = nTrabajo;
                return true;
            } else
                return false;
        }
    }

    // Devuelve el total de ganancias del empleado
    public int getGanancias() {
        return ganancias;
    }

    // Agrega una cantidad al total de ganancias de este empleado
    public void agregarGanancia(int cantidad) {
        ganancias += cantidad;
    }

}
