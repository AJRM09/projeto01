/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;


/**
 *
 * @author alisson.matos
 */
public class TestaAluno {
   //Metodo Main 
    public static void main(String[] args) {
     Aluno aluno =  new Aluno();
     
//     String nome = JOptionPane.showInputDialog("Digite seu nome");
     aluno.setNome(JOptionPane.showInputDialog("Digite seu nome"));
     
     String sobrenome = JOptionPane.showInputDialog("Digite sobrenome");
     aluno.setsobrenome(sobrenome);
     
     String idade = JOptionPane.showInputDialog("Digite idade");
     aluno.setIdade(idade);
     
      
     System.out.println("Nome:" + aluno.getNome() + " " + aluno.getsobrenome() + "\nIdade: " + aluno.getIdade(idade));
     
    
     
    
//     aluno.sobrenome = JOptionPane.showInputDialog("Digite seu Sobrenome");
//     aluno.idade = JOptionPane.showInputDialog("Digite sua Idade");
//     
//    
//       String salario = JOptionPane.showInputDialog("Digite Salario");
//             
//     aluno.salario = Float.parseFloat(salario);
//     
//     
////     aluno.salario = Float.parseFloat(JoptionPane.
////             showInputDialog)("Digitre Salario"));
//     
//     aluno.cpf = Long.parseLong(JOptionPane.
//             showInputDialog("Digite CPF"));
     
     
//     JOptionPane.showMessageDialog(null, "Nome :" + " " + aluno.nome +" "
//             +  aluno.sobrenome + "\nIdade:" + aluno.idade
//     + "\nSalario:"+ aluno.salario + "\nCPF:" + aluno.cpf );
     
     
     
             
       
                
               
    }
    
}
