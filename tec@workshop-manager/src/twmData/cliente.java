package twmData;

// Hereda a la clase persona.
public class cliente extends persona
{
    // Atributos
    public cliente sig;
    public cliente ant;
    public misAutos mAutos;

    // Constructor
    public cliente(int cedula, String nombre, String apellidos,
            String telefono, String direccion) {
                                                                    //Constructor de la clase cliente
        super(cedula, nombre, apellidos, telefono, direccion);

    }

    // Inserta un auto a la lista del cliente
    // Recibe el auto a insertar
    // Devuelve true si se ingresó correctamente, de lo contrario, false
    public Boolean Insertar(auto nAuto) {

        // Se comprueba que el auto no tenga asignado otro usuario
        if (nAuto.getCliente() == null) {
            // Nuevo nodo a insertar
            misAutos nuevo = new misAutos(nAuto);

            if (mAutos == null) {
                // Se ingresa en la lista inmediatamente si esta está vacía
                mAutos = nuevo;
                nAuto.setCliente(this);
                return true;
            } else {
                // De otra forma se recorre la lista comprobando que el auto
                // no esté ingresado ya.
                misAutos temp = mAutos;
                misAutos tAnt = mAutos;

                while (temp != null) {
                    if (temp.getAuto() == nAuto)
                        return false;
                    tAnt = temp;
                    temp = temp.sig;
                }
                tAnt.sig = nuevo;
                // Se le asigna este cliente al auto
                nAuto.setCliente(this);
                return true;
            }
        } else
            return false;
    }
}
