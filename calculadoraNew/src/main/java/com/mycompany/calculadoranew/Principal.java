/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoranew;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Principal {
    
    // Aqui se crea el metodo principal del programa
    
    public static void main (String[] args)
    {
        
        //Paarte para definir variables
        Scanner objInput = new Scanner(System.in);
        String strContinurar = null;
           String Continues =  null;
        do
        {
            System.out.println("Favor seleccione una opción para que realice para calculadora");
            System.out.println(" 1. Suma ");
            System.out.println(" 2. Resta ");
            System.out.println(" 3. Multiplicación ");
            System.out.println(" 4. División ");
            System.out.println(" Ingrese el numero de Opcion:");
            
            // ----------------- Recibe el valor del buffer del teclado, o bien el dato deseado -----------
            String OP = objInput.nextLine();
            
            //---------Definir variables para cada operacion -------
            float[]fltArrNum = new float[2];
            float fltTotal=0;
            
            // --------- Definir Error ----------          
            
            boolean MSTK =false;
            
            switch(OP)
            {
                case "1":
                    OP = "Suma";
                    System.out.println("");
                    
                    //pedir datos
                    for(int i=0; i<2; i++)
                    {
                        System.out.println(" Ingrese el Numero a Sumar #" + (i+1) + " : ");
                        fltArrNum[i] = objInput.nextFloat();
                        
                    }
                    fltTotal = fltArrNum[0] + fltArrNum[1];
                    
                    //CONTROL
                    MSTK = false;
                    //cierre case
                    break;
                    
                case "2":
                    OP = "Resta";
                    System.out.println("");
                    
                    //pedir datos a restar
                    for(int i=0; i<2; i++)
                    {
                        System.out.println(" Ingrese el numero a restar #" + (i+1) + " : ");
                        fltArrNum[i]= objInput.nextFloat();
                        
                    }
                   fltTotal = fltArrNum[0] - fltArrNum[1];
                   
                   //control
                   MSTK=false;
                   //cierre case
                   break;
                   
                   case "3":
                    OP = "Multiplicación";
                    System.out.println("");
                    
                    //pedir datos a multiplicar
                    for(int i=0; i<2; i++)
                    {
                        System.out.println(" Ingrese el numero a Multiplicar #" + (i+1) + " : ");
                        fltArrNum[i]= objInput.nextFloat();
                        
                    }
                   fltTotal = fltArrNum[0] * fltArrNum[1];
                   
                   //control
                   MSTK=false;
                   //cierre case
                   break;
                   
                    case "4":
                    OP = "División";
                    System.out.println("");
                    Scanner reader = new Scanner(System.in);
                    //pedir datos a multiplicar
                        int a;
                        int numdiv1,numdiv2;
                        
                    
                        System.out.println(" Ingrese numero dividendo ");
                        numdiv1 = reader.nextInt();
                        System.out.println(" Ingrese el numero divisor ");
                        numdiv2 = reader.nextInt();
                        
                        // --------- se cre auna condicion, si para verificar si la divisin es posible de realizar de lo contrario mostrar el error ---------
                        if((numdiv1 / numdiv2) == 0)
                        {
                            System.out.println(numdiv1 + " es divisible por " + numdiv2);
                            System.out.println(" El resultado es: " + (numdiv1/numdiv2));
                        }
                            else
                        {
                            System.out.println(numdiv1 + " NO es divisible por " + numdiv2);
                        }
                 
                   
                   //control
                   MSTK=false;
                   //cierre case
                   break;
                   
                default:
                    
                    MSTK=true;
                    break;
                    
            }
            System.out.println("");
            
            // Despliegue de los datos, si no hay error
            if (MSTK==false) {
                System.out.println("El resultado es: " + fltTotal);
            }
            else if (MSTK == true) {
                System.out.println("Error no se puede realizar su operacion");
            }
            
            System.out.println("La opcion seleccionada es " + OP);
            
            System.out.println("Desea continuar? S/N");
            
            // Capturar el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
         
            Continues = objInput2.nextLine();
            
        }    while(Continues.equals("s")|| Continues.equals("S"));
    }
}
    
    
    
    
    

