/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursos.capitulo2.tipos;


public class Tipos {
    
      public static void main(String[] args) 
      {
              // Declaramos un arreglo de enteros
        //int[]arreglo1=new int[3];
       
        int[]arreglo1={-20,7,8,54}; //otra forma de inicializar un arreglo
        
        // en el corchete del System va el valor del indice
       //System.out.println(arreglo1[0]); solo imprimiero el valor del indice que
        //pongas.
        //for(int i=0;i<3;i++) for para imprimir los valor del arreglo pero 
        //inicializado en cero
        
       /*
        for(int i=0;i<arreglo1.length;i++) //forma vieja de uas un ciclo for con las propiedades del arreglo
        {
            System.out.println(arreglo1[i]);  
        }
               */
        
        //ciclo for mejorado
        for(int z:arreglo1)
        {
            System.out.println(z);
        }
      }
    
}
