package twmData;

// Representa una lista de trabajos sin pagar para un cliente
public final class factura
{
    // Atributos
    public cliente miCliente;
    private misTrabajos mTrabajos;
    private datosTaller dt;

    // Constructor
    public factura(cliente mCliente, datosTaller ndt) {
        miCliente = mCliente;
        dt = ndt;
        actualizar();
    }

    // Obtiene la lista de trabajos para el cliente
    public misTrabajos getPrimero() {
        actualizar();
        return mTrabajos;
    }

    // Refresca la lista de trabajos sin pagar del cliente
    private void actualizar() {
        mTrabajos = null;
        trabajo temp = dt.mTrabajos;
        while (temp != null) {
            // Se comprueba que sea el cliente correcto
            // que el trabajo esté completado y no cancelado
            if (temp.getAuto().getCliente() == miCliente &&
                    temp.estaCompleto() && !temp.Cancelado())
                insertar(new misTrabajos(temp));
            temp = temp.sig;
        }
    }

    // Agrega los trabajos a la lista
    private void insertar(misTrabajos nTrabajo) {
        if (mTrabajos == null)
            mTrabajos = nTrabajo;
        else {
            nTrabajo.sig = mTrabajos;
            mTrabajos = nTrabajo;
        }
    }
}
