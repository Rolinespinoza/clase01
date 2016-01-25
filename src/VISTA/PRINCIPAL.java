/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import MODEL.ALUMNO;
import MODEL.Numero;
import MODEL.Valores;
import static VISTA.PRINCIPAL.scanner;
import java.util.Scanner;


/**
 *
 * @author alum.fial8
 */
public class PRINCIPAL {
static ALUMNO a1;
static Numero n1;
static Valores v;
static Scanner scanner = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //   agregar ();
    //    nuevoN();
        obtenerDatos();
    }
    public static void agregar ()
            
    {
        a1= new ALUMNO("Reyes", "María", 17, "la alameda");
        System.out.println("datos de alumno");
        System.out.println("----------------------");
        System.out.println(a1.getNombres()+""+a1.getApellidos()+""+a1.getEdad()+""+a1.getDireccion());
       
    }
     public static void nuevoN()
        {
            n1 = new Numero(1);
            System.out.println(n1.getN());
            /*System.out.println(n1.setN(2));*/
        }
      public static void obtenerDatos()
        {
            int x;
            int a[];
            System.out.print("numero de elementos:");
            x=scanner.nextInt();
            a= new int [x];
            System.out.println("ingresar  "+x+"  numeros:");
            System.out.println("");
            for (int i = 0; i < a.length; i++) {
                a[i]=scanner.nextInt();
            }
            v= new Valores(a);
            System.out.println("la suma es:"+v.sumaValores());
                System.out.print("el mayor es:"+v.mayorN());
                System.out.println("");
            
        }
           
}
