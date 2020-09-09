/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprint.Restaurante;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ConsoleAdapter {
    private Restaurante restaurante;

    public ConsoleAdapter() {
        this.restaurante = new Restaurante();
    }
    
    
  public  void createFuncionario(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tipo do funcionario\ncaixa - Caixa\ncozinheira - Cozinheiro(a)\ngerente - Gerente");
        String tipoFuncionario = leitor.nextLine();
        System.out.println("Digite o nome do funcionario");
        String nomeFuncionario = leitor.nextLine();
        System.out.println("Digite o cpf do funcionario");
        String cpfFuncionario = leitor.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas do funcionario");
        int horasTrabalhadasFuncionario = leitor.nextInt();
        System.out.println("Digite o valor da hora trabalhada do funcionario");
        double valorHoraTrabalhadaFuncionario = leitor.nextDouble();
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO(nomeFuncionario, cpfFuncionario, horasTrabalhadasFuncionario, valorHoraTrabalhadaFuncionario);
        this.restaurante.createFuncionario(tipoFuncionario, funcionarioDTO);
    }
  
    public void exibeTodos(){
        System.out.println("\n====== Lista dos Funcionarios ======");
        for (Funcionario f : this.restaurante.listaFuncionarios()) {
            System.out.println(f);

        }
    }
    public double exibeSalarioTotal(){
        Double total = 0.0;
        for (Funcionario f : this.restaurante.listaFuncionarios()) {
            total += f.getSalario();
        }
        return total;
    }
     public void exibeCaixa(){
       System.out.println("\n====== Lista de Caixas ======");
       for(Funcionario f: this.restaurante.listaFuncionarios()){
           if (f  instanceof Caixa){
               System.out.print(f);
           }

       }
   }
      public void exibeGerente(){
        System.out.println("\n====== Lista de Gerentes ======");
        for(Funcionario f: this.restaurante.listaFuncionarios()){
            if (f  instanceof Gerente){
                System.out.print(f);
            }

        }
    }

    public void exibeCozinheira(){
        System.out.println("\n====== Lista de Cozinheiras ======");
        for(Funcionario f: this.restaurante.listaFuncionarios()){
            if (f  instanceof Cozinheira){
                System.out.print(f);
            }

        }
    }
    public static void main(String[] args) {
        boolean deveExibirMenu = true;
        Scanner leitor = new Scanner(System.in);
        ConsoleAdapter consoleAdapter = new ConsoleAdapter();
        while(deveExibirMenu){
            System.out.println("O que voce deseja? \n1-Exibir todos os funcionarios\n2-Exibir somente caixas \n3-Exibir somente gerente"
                    + "\n4-Exibir somente cozinheiras(os)\n5-Exibir valor total de salários pagos\n6-Criar funcionario\n7-sair");
            int opcaoDigitada = leitor.nextInt();
            if(opcaoDigitada == 1)
                consoleAdapter.exibeTodos();
            if(opcaoDigitada == 2)
                consoleAdapter.exibeCaixa();
            if(opcaoDigitada == 3)
                consoleAdapter.exibeGerente();
            if(opcaoDigitada == 4)
                consoleAdapter.exibeCozinheira();
            if(opcaoDigitada == 5)
                consoleAdapter.exibeSalarioTotal();
            if(opcaoDigitada == 6)
                consoleAdapter.createFuncionario();
           
            deveExibirMenu = opcaoDigitada != 7;
        }
    }
    
    
}
