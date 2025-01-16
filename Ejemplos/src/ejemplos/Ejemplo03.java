/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.security.SecureRandom;

// import java.security.*;
/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numeroElementos = 20;
        int limite = 100;
        int[] valores = obtenerValores(numeroElementos, limite);
        presentarDatos(valores);

    }

    public static void presentarDatos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%d\n", arreglo[i]);
        }

    }

    public static int[] obtenerValores(int a, int b) {
        // objeto generador de números aleatorios
        SecureRandom valorAleatorio = new SecureRandom();
        int[] arreglo = new int[a];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = valorAleatorio.nextInt(0, b);

        }
        return arreglo;
    }

    public static int obtnerSuma(int a, int b) {
        return a + b;
    }

}
