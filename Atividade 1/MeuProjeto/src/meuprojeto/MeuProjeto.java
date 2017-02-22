package meuprojeto;

import java.util.Scanner;

public class MeuProjeto{
    
    public static void main(String[] args){
        int a = 0;
        
       Funcionario f1 = new Funcionario("zé do pulo", 20, (float) 4.50);
        System.out.println(f1.getNome() + " Ganha " +f1.calcula_hora()+ " R$ por hora. "); 
        
       Funcionario f2 = new Funcionario("Paulo preguiça", 10, (float) 6.65);
        System.out.println(f2.getNome() + " Ganha " +f2.calcula_hora()+ " R$ por hora. ");
        
       Funcionario f3 = new Funcionario("Toin barca furada", 40, (float) 13.80);
        System.out.println(f3.getNome() + " Ganha " +f3.calcula_hora()+ " R$ por hora.\n");
        
        while (a<3){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o nome do funcionário.");
            String nome = teclado.nextLine();
            System.out.println("Digite quantas horas o funcionario trabalhou.");
            float horas = teclado.nextFloat();
            System.out.println("Digite o valor da hora.");
            float v_l = teclado.nextFloat();
            
            Funcionario b = new Funcionario(nome, horas, v_l);
            System.out.println(b.getNome() + " Ganha " +b.calcula_hora()+ " R$ por hora.\n ");
            a++;
        }
        
    }
}
