package twmData;

// Representa una sublista de autos asignados a un cliente
public class misAutos
{
    // Atributos
    private auto enlace;
    public misAutos sig;

    // Constructor
    public misAutos(auto nAuto) {
        enlace = nAuto;
    }

    // Devuelve el auto asignado
    public auto getAuto() {
        return enlace;
    }
}
