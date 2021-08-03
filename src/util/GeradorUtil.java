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
    
    /**
     * Retorna um valor String conforme a quantidade de numero solicitado. 
     * @param qtde
     * @return 
     */
    
   public String gerarNumero(int qtde) {
         String senha = "";
         int numero;
         for(int i = 0; i < qtde; i++){
             
             numero = (int)(Math.random() * 10);
             senha = senha + numero;
        }
         return senha;
         
    }
   
   public String gerarCpf (){
       return gerarNumero(3) + "."+ gerarNumero(3) + "." + gerarNumero(3) + "."
               + gerarNumero(2);
       
      
   }
   
   public double gerarSalario(){
        int numero = (int) (Math.random() * 100000);
     return numero; 
    
  }
      
    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
       String cpf = util.gerarCpf();
        System.out.println("CPF :" + cpf);
   

//        System.out.println("Salário: " + objetoDessaClasse.gerarSalario());
//       
//           
    }
    
  }