package Ejemplo_Arreglos;

import javax.swing.JOptionPane;

public class Principal {

        //Se nos pedira Ingresar las 6 calificaciones de un alumno, en un arreglo.
        //Despues mostraremos las calificaciones aprobadas.
        //Y tambien mostraremos cuantos aprobaron
    public static void main(String[] args){

        int contador = 0; 

        double calificaciones [] = new double [6];         
        System.out.println("Ingrese las calificaciones: ");

        for(int i=0; i<calificaciones.length; i++){//i=0

            calificaciones[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Ingresa las 6 calificaciones: "+(i+1)));
        }

        System.out.println("Mostrar calificaciones aprobatorias: ");
        for(int i=0; i<calificaciones.length; i++){

            if(calificaciones[i]>=7){
                System.out.println(calificaciones[i]);
                contador++;
            }
        }
        System.out.println("Numero de aprobados: "+contador);
    
    
    }
}
