package twmData;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;

// La clase auto representa un auto con todos sus atributos
// además de un historial de trabajos que se le han hecho.
public class auto
{
    // Atributos del auto

    int _placa;
    String _marca;
    String _modelo;
    Color _color;
    // Punteros
    public cliente _cliente;
    public auto sig;
    public historial mHistorial;
    private Date ingreso;

    public auto(int placa, String marca, String modelo, Color color) {
        _placa = placa;
        _marca = marca;
        _modelo = modelo;
        _color = color;
        ingreso = Calendar.getInstance().getTime();
    } //Constructor de clase auto

    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    public void setCliente(cliente c) {
        _cliente = c;
    }
//Los metodos "set" son para definir valores de un atributo dentro de una clase
//Los metodos "get" obtienen un valor determinado de un atributo dentro de la clase

    public cliente getCliente() {
        return _cliente;
    }

    public int getPlaca() {
        return _placa;
    }

    public String getMarca() {
        return _marca;
    }

    public String getModelo() {
        return _modelo;
    }

    public Color getColor() {
        return _color;
    }

    // Modifica los datos del auto
    public void setInfo(String nMarca, String nModelo, Color nColor) {
        _marca = nMarca;
        _modelo = nModelo;
        _color = nColor;
    }// </editor-fold>

    // Inserta un trabajo en el historial del auto
    // Recibe el trabajo nuevo
    // Devuelve true si lo insertó correctamente, false si no se logró insertar
    public Boolean Insertar(trabajo nTrabajo) {
        //Nuevo nodo a insertar
        historial nuevo = new historial(nTrabajo);

        if (mHistorial == null) {
            //Verifica si la lista está vacía para ingresarlo inmediatamente
            mHistorial = nuevo;
            return true;
        } else {

            historial temp = mHistorial;
            historial ant = mHistorial;

            while (temp != null) {
                // Comprueba que no entre repetido
                if (temp.getTrabajo() == nTrabajo)
                    return false;
                ant = temp;
                temp = temp.sig;
            }

            ant.sig = nuevo;
            return true;
        }
    }

    // Obtiene la fecha en que se creó el auto
    public Date getIngreso() {
        return ingreso;
    }
}
