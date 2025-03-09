package ListaTipoPilaLIFO;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        int nodo = 0;
        Pila objetoPila = new Pila();

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones:\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La pila está vacía?\n"
                        + "4. ¿Cual es el ultimo valor ingresado en la Pila?\n"
                        + "5. ¿Cuantos nodos tiene la pila?\n"
                        + "6. Vaciar la Pila\n"
                        + "7. Mostrar valores dentro de la pila\n"
                        + "8. Salir\n\n"));

            } catch (NumberFormatException e) {

                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                         if (!objetoPila.PilaVacia()) {
                             JOptionPane.showMessageDialog(null, "Se ha vaciado co rrectamente");
                         }
                        break;

                    case 5: //invocamos al metodo TamañoPila de la clase Pila, para averiguar cuantos nodos contiene
                        JOptionPane.showMessageDialog(null, "La pila contiene " + objetoPila.TamañoPila() + " nodos.");
                        break;

                    case 6: //invocamos al metodo VaciarPila de la clase Pila, despues de verificar si está vacia o no con el metodo PilaVacia
                        if (!objetoPila.PilaVacia()) {
                            objetoPila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacia");
                        }
                        break;

                    case 7: //llamamos al metodo de clase pila que muestra los valores
                        objetoPila.MostrarValoresPila();
                        break;

                    case 8: //para que salga del bucle
                        opcion = 8;
                        break;

                    default:
                        System.out.println("Opcion incorrecta. Vuelve a intentarlo");
                        break;

                }

            }
            while (opcion != 8) {

            }
        }

    }
}