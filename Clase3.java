/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;
import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        
    System.out.print("Ejercicio1");
    System.out.println(); 
        int ancho=10;
        int largo=5;
        
        for (int i = 0; i < largo; i++) {
            for (int j =0; j < ancho; j++) {
                System.out.print("@");
            }
            System.out.println(); 
        }
     
    System.out.print("Ejercicio2"); 
    System.out.println();
       String input = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(input);

        String tabla = "Tabla de multiplicar del número " + numero + ":\n";
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabla += numero + " x " + i + " = " + resultado + "\n";
        }

        JOptionPane.showMessageDialog(null, tabla);
    
    
    
    System.out.print("Ejercicio3"); 
    System.out.println();
    
        String inputt = JOptionPane.showInputDialog("Ingrese el número de filas del triángulo:");
        int Filas = Integer.parseInt(inputt);

        String triangulo = "";
        for (int i = 1; i <= Filas; i++) {
            for (int j = 1; j <= i; j++) {
                triangulo += "* ";
            }
            triangulo += "\n";
        }

        JOptionPane.showMessageDialog(null, triangulo);
    
    
    System.out.print("Ejercicio4"); 
    System.out.println();
    System.out.println("Valores al cuadrado:");

        for (int i = 20; i <= 30; i++) {
            int cuadrado = i * i;
            System.out.println(i + "al cuadrado =" + cuadrado);
        }
    
    System.out.print("Ejercicio5y6");
    System.out.println();
    
        int sumaNotas = 0;
        int notaMayor = 0;
        int notaMenor = 100;
        int estudiantesAprobados = 0;
        int contadorEstudiantes = 0;

        while (true) {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del estudiante " + (contadorEstudiantes + 1) + ":"));

            if (nota <= 0) {
                if (contadorEstudiantes == 0) {
                    JOptionPane.showMessageDialog(null, "No se ingresaron notas.");
                    return;
                }
                break;
            }
            sumaNotas += nota;
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
            if (nota >= 70) {
                estudiantesAprobados++;
            }
            contadorEstudiantes++;
        }
        double promedio = (double) sumaNotas / contadorEstudiantes;
        JOptionPane.showMessageDialog(null, "Nota promedio: " + promedio +
                "\nNota mayor: " + notaMayor +
                "\nNota menor: " + notaMenor +
                "\nEstudiantes aprobados: " + estudiantesAprobados);
    }    
}  
   