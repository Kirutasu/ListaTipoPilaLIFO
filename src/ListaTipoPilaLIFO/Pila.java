package ListaTipoPilaLIFO;

import javax.swing.*;

public class Pila {

    private Nodo ultimoValorIngresado;
    int tamaño = 0;
    String lista = "";

    public Pila() {
        ultimoValorIngresado = null;
        tamaño = 0;

    }

    public boolean PilaVacia() {
        return ultimoValorIngresado == null;
    }

    public void InsertarNodo(int nodo) {
        Nodo nuevoNodo = new Nodo(nodo);
        nuevoNodo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevoNodo;
        tamaño++;
    }

    public int EliminarNodo() {
        int auxiliar = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        tamaño--;
        return auxiliar;
    }

    public int MostrarUltimoValorIngresado() { //sabremos cual es el ultimo numero que el usuario ingresó
        return ultimoValorIngresado.informacion;
    }

    public int TamañoPila() { //para saber qué tamaño tiene la pila
        return tamaño;
    }

    public void VaciarPila() {//metodo para vaciar la pila
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }

    public void MostrarValoresPila() { //para mostrar la pila apilada
        Nodo lectorDePila = ultimoValorIngresado;
        while (lectorDePila != null) {
            lista += lectorDePila.informacion + "\n";
            lectorDePila = lectorDePila.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = ""; //hay que limpiar la lista que muestra porque si no acumula numeros y no mostrará los valores correctos actuales, si no todos los que han pasado
    }

}
