/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprint.Restaurante;

/**
 *
 * @author Aluno
 */

// essa classe vai esta recebendo os valores do json, 


public class FuncionarioDTO {
    
    private String nome;
    private String cpf;
    private Integer qntHorasTrabalhas;
    private Double valorHora;

    public FuncionarioDTO(String nome, String cpf, Integer qntHorasTrabalhas, Double valorHora) {
        this.nome = nome;
        this.cpf = cpf;
        this.qntHorasTrabalhas = qntHorasTrabalhas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getQntHorasTrabalhas() {
        return qntHorasTrabalhas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    @Override
    public String toString() {
        return "FuncionarioDTO{" + "nome=" + nome + ", cpf=" + cpf + ", qntHorasTrabalhas=" + qntHorasTrabalhas + ", valorHora=" + valorHora + '}';
    }
    
}
