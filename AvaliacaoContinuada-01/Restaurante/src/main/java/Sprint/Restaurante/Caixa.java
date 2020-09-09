package Sprint.Restaurante;

public class Caixa extends Funcionario {
    
    public Caixa(String nome, String cpf, Integer qntHorasTrabalhadas, Double valorHora) {
        super(nome, cpf, qntHorasTrabalhadas, valorHora);
     
    }

    public Double getSalario() {
        return getQntHorasTrabalhas() * getValorHora();
    }

    
    @Override
    public String toString() {
        return  super.toString() +"\nCaixa" +
                "\nSalário total: " + getSalario()+ "\n";
    }
}

