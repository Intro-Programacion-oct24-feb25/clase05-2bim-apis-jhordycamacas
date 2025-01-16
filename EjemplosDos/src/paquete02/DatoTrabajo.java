/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    public static String obtenerNombreEmpresa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de empresa");
        String empresa = entrada.nextLine();

        return empresa;
    }

    public static String obtenerDireccion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese direccion de empresa");
        String direccion = entrada.nextLine();

        return direccion;
    }

// método que permita preguntar al usuario el nombre de la empresa
    // método que permita preguntar al usuario la dirección de la empresa
}
