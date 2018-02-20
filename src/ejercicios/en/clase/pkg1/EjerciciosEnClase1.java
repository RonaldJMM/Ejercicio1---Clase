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
    //  Ejercicio1 objeto1=new Ejercicio1();
    //  objeto1.calculoPromedioNotas();
      
    //  Ejercicio4 objeto2=new Ejercicio4();
    //  objeto2.conversionDeSegundos();
      
      Ejercicio2 objeto3 =new Ejercicio2();
      objeto3.estaciones();
      
    }
    
    
}
class Ejercicio1{
    
  String nombreAlumno;
  int numeroNotas;
  float notasAlumno;
  float totalPromedioNotas;
  int desicion;
  int i=0;
  void calculoPromedioNotas(){
      Scanner lecturaVar = new Scanner(System.in);
      System.out.println("Promedio de notas de un alumno.");
      System.out.println("Digite el nombre del Alumno: .");
       nombreAlumno = lecturaVar.nextLine();
       do{
           i++;
           numeroNotas=i;
           System.out.println("Digite la nota "+i+" : ");
           notasAlumno=notasAlumno+lecturaVar.nextFloat();
           if(notasAlumno<0){
               
           }
           System.out.println("Desea ingresar otra nota?");
           System.out.println("1.Si  2.No");
           System.out.println("Respuesta: ");
           desicion=lecturaVar.nextInt();
           
       }while(desicion!=2);
       
       totalPromedioNotas=(float)(notasAlumno/numeroNotas);
      System.out.println("Promedio de notas del Alumno: "+nombreAlumno);
      System.out.println("Total Promedio: "+totalPromedioNotas);
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

class Ejercicio2{

          int mes;
          int opcion ;
    
            
    
             
            void estaciones(){
                
                
                
                
                Scanner entrada = new Scanner(System.in);
            
                do{
                
                System.out.println("Digite por favor el numero del mes correspondiente para determinas estacion");
                mes =entrada.nextInt();
                
                
                switch(mes){
                
                    case 1 :
                        
                        System.out.println("La estacion del mes que digito es invierno");
                        
                        break;
                     case 2 :
                        
                        System.out.println("La estacion del mes que digito es invierno");
                        
                        break;   
                        
                      case 3 :
                        
                        System.out.println("La estacion del mes que digito es invierno");
                        
                        break;  
                        
                         case 4 :
                        
                        System.out.println("La estacion del mes que digito es verano");
                        
                        break;
                
                        case 5 :
                        
                        System.out.println("La estacion del mes que digito es verano");
                        
                        break;
                        
                         case 6 :
                        
                        System.out.println("La estacion del mes que digito es verano");
                        
                        break;
                        
                        
                         case 7 :
                        
                        System.out.println("La estacion del mes que digito es otoño");
                        
                        break;
                        
                         case 8 :
                        
                        System.out.println("La estacion del mes que digito es otoño");
                        
                        break;
                        
                         case 9:
                        
                        System.out.println("La estacion del mes que digito es otoño");
                        
                        break;
                        
                        
                         case 10 :
                        
                        System.out.println("La estacion del mes que digito es primavera");
                        
                        break;
                        
                         case 11 :
                        
                        System.out.println("La estacion del mes que digito es primavera");
                        
                        break;
                        
                         case 12 :
                        
                        System.out.println("La estacion del mes que digito es primavera");
                        
                        break;
                        
                
                }
                
                
                System.out.println("Desea ejecutar nuevamente el programa");
                System.out.println("1.si");
                System.out.println("2.no");
                opcion=entrada.nextInt();
                
                
            
                }while(opcion!=2);
            
                System.out.println("Gracias por usar este programa");
            }



}