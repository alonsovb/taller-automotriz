package twmData;

import java.util.Date;

// Representa un trabajo con sus datos y su estado
public class trabajo
{
    // Atributos
    private int _codigo;
    private String _descripcion;
    private int _costo;
    private Date _fecha;
    private Boolean completado = false;
    private Boolean cancelado = false;
    private auto _auto;
    private empleado _empleado;
    public trabajo sig;

    // Constructor
    public trabajo(int codigo, String descripcion, int costo, Date fecha,
            auto Auto) {
        _codigo = codigo;
        _descripcion = descripcion;
        _costo = costo;
        _fecha = fecha;
        _auto = Auto;
    }

    public int getCodigo() {
        return _codigo;
    }

    public String getDescripcion() {
        return _descripcion;
    }

    public int getCosto() {
        return _costo;
    }

    public Date getFecha() {
        return _fecha;
    }

    public auto getAuto() {
        return _auto;
    }

    // Cambiar los datos del trabajo
    protected void setInfo(String nDescripcion, int nCosto, Date nFecha,
            auto nAuto) {
        _descripcion = nDescripcion;
        _costo = nCosto;
        _fecha = nFecha;
        _auto = nAuto;
    }

    // Modificar el empleado al que está asignado el trabajo
    public void setEmpleado(empleado Empleado) {
        _empleado = Empleado;
    }

    // Devuelve el empleado al que se asignó el trabajo
    public empleado getEmpleado() {
        return _empleado;
    }

    // Cambia el estado del trabajo a "completado"
    // y agrega una ganancia al empleado
    public void completar() {
        completado = true;
        this._empleado.agregarGanancia(_costo);
    }

    // Comprueba si el trabajo está completo
    public Boolean estaCompleto() {
        return completado;
    }

    // Marca el trabajo como cancelado
    // Devuelve el costo del trabajo
    public int Cancelar() {
        cancelado = true;
        return _costo;
    }

    public Boolean Cancelado() {
        return cancelado;
    }
}