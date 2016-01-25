/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author alum.fial8
 */
public class Valores {
   private  int datos [];

    public Valores() {
    }

    public Valores(int[] datos) {
        this.datos = datos;
    }
   
   public int getValores ()
   {
       return datos.length;
   }
    public int sumaValores ()
   {
       int suma=0;
       for (int i = 0; i < datos.length; i++) {
           suma+=datos[i];
           
       }
       return suma;
   }
    
     public int mayorN ()
   {
       int mayor=0;
       for (int i = 0; i < datos.length; i++) {
           if (datos [i]>mayor)
           
           mayor=datos[i];
           
       }
       return mayor;
   }
}
