/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author alisson.matos
 */
public class GeradorUtil {
    
    public double gerarSalario(){
        int numero = (int) (Math.random() * 100000);
        return numero; 
    
    }
    public static void main(String[] args) {
        GeradorUtil objetoDeClasse = new GeradorUtil();
//       
//            System.out.println("Salario" + objetoDessaClasse.gerarSalario());
    }
    
  }
