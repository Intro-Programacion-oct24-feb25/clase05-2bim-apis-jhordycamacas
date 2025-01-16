/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;
import paquete06.Imprimir;

// import paquete04.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero(100);
        int valorB = OperadorUno.obtenerNumero(10);
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multiplicacion = OperadorTres.obtenerMultiplicacion(valorA, valorB);
        Imprimir.imprimirMensaje(valorA, valorB, suma, multiplicacion);
//llamo a un procedimiento que se encuentra en la clase Imprimir del paquete06
//el cual nos sirve y ayuda a mostrar los datos, enviandole 4 parametros
    }
}
