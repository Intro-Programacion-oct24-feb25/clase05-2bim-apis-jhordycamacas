/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa;
        String direccion;

        double[] misNotas;
        double promedio;
        double mejorNota;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        empresa = DatoTrabajo.obtenerNombreEmpresa();
        direccion = DatoTrabajo.obtenerDireccion();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        mejorNota = DatoFinal.obtenerMejorNota(misNotas);

        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Empresa: %s - Direccion: %s\n"
                + "Promedio: %.2f\n" 
                +"La mejor nota es: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                empresa,
                direccion,
                promedio,
                mejorNota);
    }

}
