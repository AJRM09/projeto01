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
     *
     * @param qtde
     * @return
     */
    
    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {

            numero = (int) (Math.random() * 10);
            senha = senha + numero;
        }
        return senha;

    }

    public String gerarTelFixo() {
        return "(48) 3" + gerarNumero(3) + "-" + gerarNumero(4);

    }

    public String gerarTelCelular() {
        return "(48) 9" + gerarNumero(4) + "-" + gerarNumero(4);

    }

    public double gerarSalario() {
        int numero = (int) (Math.random() * 100000);
        return numero;

    }
    
    
    
    public String gerarCep () {
        return gerarNumero(5) + "" + gerarNumero(3);
    }
    
    
    public String gerarNome(){
        
        String[] nomes = {"Alisson", "João", "Maria", "Gui", "Bruna", "Jose",
            "Carlo", "Ana", "Katia", "Wilson", "Vitor", "Antonio", "Chico",
        "Eduardo", "Luiz", "Patrik", "Joelmir", "Leonardo", "Lais", "Giovanna"};
        
        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        
        return nomes[indice] + " " + gerarSobrenome();
    }
    
    private String gerarSobrenome(){
        String[] sobrenomes = {"Correia", "Silva", "Mendes", "Oliveira",
            "Weber", "Santos",
            "Machado", "Rosa", "Rocha", "Pinto", "Souza", "Silveira", "Stark",
            "Fischer", "Vitorino", "Carvalho", "Ferreira", "Peixoto", "Espindola",
            "Zen"};
        
         int tamanhoLista = sobrenomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        
        return sobrenomes[indice];
        
        
        
    }

    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
        String Nome = util.gerarNome();
        System.out.println("Nome:" + Nome);

        
//        System.out.println("Salário: " + objetoDessaClasse.gerarSalario());
//       
//           
    }

}
