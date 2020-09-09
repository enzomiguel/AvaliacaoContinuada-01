package Sprint.Restaurante;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, Integer qntHorasTrabalhadas, Double valorHora) {
        super(nome, cpf, qntHorasTrabalhadas, valorHora);
    }


    public Double getSalario() {
        return getQntHorasTrabalhas() * getValorHora();
    }

    @Override
    public String toString() {
        return super.toString() + "\nGerente\n" +
                "Salário total: " +
                getSalario()+ "\n";
    }


}

   

