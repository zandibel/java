/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hora;

import java.util.Calendar;


public class Hora {
    public static void main(String args[]){
        Thread t1=new Thread(new Runnable() {
           public void run(){
               while (true){
                   try{
                       Calendar c= Calendar.getInstance();
                       int hora=c.get(Calendar.HOUR);
                       int minuto=c.get(Calendar.MINUTE);
                       if(hora==12&&minuto==11){
                           System.out.println("Ya termino la clase");
                           
                       }
                       Thread.sleep(1000);
                   }
                   catch(Exception c){}
               }
               
           }
           
        }
        );
            
        t1.start();
    }
    
}
