/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CuentaNegativa;


public class SaldoNegativoException extends Exception {
    
    public SaldoNegativoException(){
        super("saldo insuficiente");
    }
}
