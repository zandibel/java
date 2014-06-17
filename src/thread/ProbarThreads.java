/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Forma no.1
package thread;



public class ProbarThreads 
{
    public static void main(String args[])
    {
        //Paso 1: Crear el thread
        Facil t1=new Facil();
        //Paso 2: Lo inicializamos t1 es un objeto y start lo hereda del thread
       t1.start();
    }
}
