/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Forma no.2
package thread;

//la interface es como el tio y la clase es tu papa
//runnable es tio de la clase intermedia
public class Intermedia implements Runnable
{
    public static void main(String args[])
    {
     //Paso 1 Crear el Thread
        Runnable r=new Intermedia();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        //Paso 2 inicializarlo
        t1.start();//impresion
        t2.start();//conexion
        t3.start();//guardar
        t1.setName("Impresion");
        t2.setName("Conexion");
        t3.setName("Guardar");
    }

    @Override
    public void run() 
    {
        try 
        {
        if( Thread.currentThread().getName().equals("Conexion")) Thread.sleep(2000);
        if( Thread.currentThread().getName().equals("Guardar")) Thread.sleep(4000);
        if( Thread.currentThread().getName().equals("Imprimir")) Thread.sleep(6000);
       System.out.println(Thread.currentThread().getName());
       System.out.println("Soy un Thread mediano :@");
        } catch(Exception e) {}
    }
}
