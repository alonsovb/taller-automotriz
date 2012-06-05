package twmData;

// Representa una sublista de trabajos asignados a un empleado
public class misTrabajos
{
    // Atributos
    private trabajo enlace;
    public misTrabajos sig;

    // Constructor
    public misTrabajos(trabajo nTrabajo) {
        enlace = nTrabajo;
    }

    // Devuelve el trabajo asignado
    public trabajo getTrabajo() {
        return enlace;
    }

}
