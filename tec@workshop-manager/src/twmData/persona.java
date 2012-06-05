package twmData;

// Representa una clase base para una persona
public class persona
{
    // Atributos

    private int _cedula;
    private String _nombre;
    private String _apellidos;
    private String _telefono;
    private String _direccion;

    // Constructor
    public persona(int cedula, String nombre, String apellidos) {
        _cedula = cedula;
        _nombre = nombre;
        _apellidos = apellidos;
        _telefono = "";
        _direccion = "";
    }

    // Constructor
    public persona(int cedula, String nombre, String apellidos,
            String telefono, String direccion) {
        _cedula = cedula;
        _nombre = nombre;
        _apellidos = apellidos;
        _telefono = telefono;
        _direccion = direccion;
    }

    public int getCedula() {
        return _cedula;
    }

    public String getNombre() {
        return _nombre;
    }

    public String getApellidos() {
        return _apellidos;
    }

    public String getTelefono() {
        return _telefono;
    }

    public String getDireccion() {
        return _direccion;
    }

    // Cambiar los datos de la persona
    public void setInfo(String nombre, String apellidos, String telefono,
            String direccion) {
        _nombre = nombre;
        _apellidos = apellidos;
        _telefono = telefono;
        _direccion = direccion;
    }
}