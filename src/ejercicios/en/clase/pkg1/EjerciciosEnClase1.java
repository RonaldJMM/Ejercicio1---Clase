/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.en.clase.pkg1;

import java.util.Scanner;

/**
 *
 * @author Ronald Jefrey Moreno Mora
 */
public class EjerciciosEnClase1 {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
      Ejercicio1 objeto1=new Ejercicio1();
      objeto1.calculoPromedioNotas();
      
      Ejercicio4 objeto2=new Ejercicio4();
      objeto2.conversionDeSegundos();
      
    }
    
    
}
class Ejercicio1{
    
  String nombreAlumno;
  int numeroNotas;
  float notasAlumno[];
  float totalPromedioNotas;
  int i;
  void calculoPromedioNotas(){
      Scanner lecturaVar = new Scanner(System.in);
      System.out.println("Promedio de notas de un alumno.");
      System.out.println("Digite el nombre del Alumno: .");
       nombreAlumno = lecturaVar.nextLine();
       System.out.println("Digite la cantidad de notas del alumno.");
       numeroNotas = lecturaVar.nextInt();
       
       for(i=1;i==numeroNotas;i++){
          System.out.println("Digite la nota "+i+" : "); 
          notasAlumno[i] = lecturaVar.nextFloat();
       }
       
      System.out.println("Notas del alumno: "+nombreAlumno);
      System.out.println("Promedio de notas de un alumno.");
  }
    
}
 class Ejercicio4{
         long numeroDeSegundosDigitados;//segundos digitados por el usuario
         long totalSemanas;//total de segundos en semanas
         byte totalDias;//total de segundos en dias
         byte totalHoras;//total de horas 
         byte totalMinutos;//total de minutos
         byte totalSegundos;//segundos restantes
         
        void conversionDeSegundos(){
        
         System.out.println("");
         Scanner lecturaVar = new Scanner(System.in);//funcion de lectura o escaner para el usuario.
         
         System.out.println("Conversion de numero de Segundos a Semanas - Dias - Horas - Minutos.");
         System.out.println("Porfavor digite valores enteros.");
         System.out.println("Digite el numero de horas que desea convertir: ");
         numeroDeSegundosDigitados = lecturaVar.nextInt();//lectura de dato u horas.
         System.out.println("El total de segundos digitados es: "+numeroDeSegundosDigitados);
         totalSemanas=(long)(numeroDeSegundosDigitados/604800);
         numeroDeSegundosDigitados=(numeroDeSegundosDigitados-(totalSemanas*604800));
         totalDias=(byte)(numeroDeSegundosDigitados/86400);
         numeroDeSegundosDigitados=numeroDeSegundosDigitados-(totalDias*86400);
         totalHoras=(byte)(numeroDeSegundosDigitados/3600);
         numeroDeSegundosDigitados=numeroDeSegundosDigitados-(totalHoras*3600);
         totalMinutos=(byte)(numeroDeSegundosDigitados/60);
         numeroDeSegundosDigitados=numeroDeSegundosDigitados-(totalMinutos*60);
         totalSegundos=(byte)(numeroDeSegundosDigitados);
         System.out.println("");
         System.out.println("El total de semanas es: "+totalSemanas);
         System.out.println("El total de dias es: "+totalDias);
         System.out.println("El total de horas es: "+totalHoras);
         System.out.println("El total de minutos es: "+totalMinutos);
         System.out.println("El total de segundos es: "+totalSegundos);
         System.out.println("");
    }     
         
    }