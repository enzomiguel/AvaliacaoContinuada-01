package Sprint.Restaurante;

public class Cozinheira extends Funcionario{
 
    public Cozinheira(String nome, String cpf, Integer qntHorasTrabalhadas, Double valorHora) {
        super(nome, cpf, qntHorasTrabalhadas, valorHora);
    }

    public Double getSalario() {
        return getQntHorasTrabalhas() * getValorHora();
    }

    @Override
    public String toString() {
        return super.toString() + "\nGerente\n" +
                "\nSalário total: " + getSalario()+ "\n";
    }

    
}

