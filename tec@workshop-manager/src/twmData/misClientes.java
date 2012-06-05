package twmData;

// Representa una sublista de clientes
public class misClientes
{
    // Atributos
    public cliente mCliente;
    public misClientes sig;

    // Constructor
    public misClientes(cliente c) {
        mCliente = c;
    }
}
