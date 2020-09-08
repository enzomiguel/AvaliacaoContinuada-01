package Sprint.Restaurante;

public class Caixa extends Funcionario {

    public Caixa( String nome, String cpf, Integer qntHorasTrabalhas, Double valorHora) {
        super(nome, cpf, qntHorasTrabalhas, valorHora);
       
    }

   

    @Override
    public Double getSalario() {
    return getValorHora() * getQntHorasTrabalhas();   
    }
    
  
    @Override
    public String toString() {
        return "Caixa{" +
                "Salário total: " + getSalario()+
                "} " + super.toString();
    }
}