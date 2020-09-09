/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprint.Restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */

//ESSA E MINHA CLASSE ONDE VAI FICA TODAS AS MINHAS REGRAS 
//CORE DOMAIN = e o nucleo do dominio

public class Restaurante {
  
    private List<Funcionario> lista;
    private String nomeResta;

    public Restaurante() {
        this.nomeResta = nomeResta;
        lista = new ArrayList<Funcionario>();
    }

    public void adicionaFuncionario( Funcionario f) {
        lista.add(f);
    }

    public List<Funcionario> listaFuncionarios(){
        return lista;
    }

   public Funcionario findById(int id){
       return lista.get(id - 1);
   }
    public void excluiFuncionario(int id){
       lista.remove(id - 1);
   }
   
   public Funcionario createFuncionario(String tipo, FuncionarioDTO dto){
       Funcionario funcionario = null;
        if (tipo .equalsIgnoreCase("gerente")){
            funcionario = new Gerente(dto.getNome(), dto.getCpf(),  dto.getQntHorasTrabalhas(), dto.getValorHora());
       } else if(tipo .equalsIgnoreCase("caixa")){
           funcionario = new Caixa(dto.getNome(), dto.getCpf(),  dto.getQntHorasTrabalhas(), dto.getValorHora());
       }else if(tipo .equalsIgnoreCase("cozinheira")){
           funcionario = new Cozinheira(dto.getNome(), dto.getCpf(),  dto.getQntHorasTrabalhas(), dto.getValorHora());
       }
       lista.add(funcionario);
       return funcionario;
   }
   
 
}

    

