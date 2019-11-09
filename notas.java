/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author Felix Castro
 */
public class notas {
    public static void main(String[] args) {
        //titulo
        System.out.println("CALIFICACIONES");
        
        //linea
        System.out.println("--------------------------");
        
        llenarVector();//procedimiento
    }
    
    public static void llenarVector() {
        //lectura de datos
        Scanner leer = new Scanner(System.in);
        
        //definicion de variables
        double [] notas;
        int numNotas;
        
        //inicializar variables y arrays
        System.out.println("Ingrese el numero de notas");
        numNotas = leer.nextInt();
        
        notas = new double[numNotas];
        
        //linea
        System.out.println("--------------------------");
        
        //ingresamos las notas
        System.out.println("Ingreso de notas");
        for (int i = 0; i < notas.length; i++) {
            System.out.print((i + 1) + ".Nota:");
            notas[i] = leer.nextDouble();
        }
        
        menu(notas, numNotas);//procedimiento menu
    }
    
    public static void menu(double [] notas, int numNotas) {
        //definimos variables
        double s;
        double p;
        
        //inicializar variables
        s = suma(notas, numNotas);
        p = promedio(s, numNotas);
        
        //imprimomos p que es promedio
        System.out.println("El promedio de notas es " + p);
        
        mayor(notas, numNotas);//procedimiento notas mayores
    }
    
    public static double suma(double [] notas, int numNotas){
        //definicion de variables
        double s;
        
        //inicializar variables
        s = 0;
        
        //inicializar
        for (int i = 0; i < numNotas; i++) {
            s = s + notas[i];
        }
        return s;
    }
    
    public static double promedio(double s, int numNotas){
        //definimos variables
        double p;
        
        //proceso
        p = s / numNotas;
        
        //retornamos
        return p;
    }
    
    public static void mayor(double [] notas, int numNotas) {
        //definir variables
        double may;
        
        may = notas[0];
        
        for (int i = 1; i < numNotas; i++) {
            if (notas[i] > may) {
                may = notas[i];
            }
        }
        
        System.out.println("La nota mayor es " + may);
    }
}
