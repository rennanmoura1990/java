/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IdadeRG;

import java.util.*;

/**
 *
 * @author aluno
 */
public class IdadeRG {
    static int  qtd = 0;
    public static int obterClienteMaisNovo(int[][]dadosClientes){
        int menorIdade = 999;
        int menorRG = 0;
        for(int i = 0;i<qtd;i++){
        if(dadosClientes[i][1]<menorIdade){
            menorIdade= dadosClientes[i][1];
            menorRG = dadosClientes[i][0];
        }
        }
        return menorRG;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas");
        qtd = s.nextInt();
        int[][] rgIdade = new int[qtd][2];
        for (int i = 0;i<qtd; i++) {
            int numerado = i + 1;
            System.out.println("Digite o RG da " + numerado + "º pessoa");    
            rgIdade[i][0] = s.nextInt();
            System.out.println("Digite agora,a idade desta pessoa");
            rgIdade[i][1] = s.nextInt();
        }
        int resultado = obterClienteMaisNovo(rgIdade);
        System.out.println("RG da Menor Idade é : "+resultado+"");
    }

}
