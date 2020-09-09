package Sprint.Restaurante;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private Integer qntHorasTrabalhas;
    private Double valorHora;

    public Funcionario(String nome, String cpf, Integer qntHorasTrabalhas, Double valorHora) {
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

    

    public abstract Double getSalario();

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", qntHorasTrabalhas=" + qntHorasTrabalhas + ", valorHora=" + valorHora + '}';
    }

    
}
