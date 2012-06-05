package twmData;

// Representa una sublista de trabajos asignados a un auto
public class historial
{
    // Atributos
    private trabajo enlace;
    public historial sig;

    // Constructor
    public historial(trabajo nTrabajo) {
        enlace = nTrabajo;
    }

    // Devuelve el trabajo asignado
    public trabajo getTrabajo() {
        return enlace;
    }
}