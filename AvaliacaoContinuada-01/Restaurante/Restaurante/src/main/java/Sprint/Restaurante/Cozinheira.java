package Sprint.Restaurante;

public class Cozinheira extends Funcionario{

    @Override
    public Double getSalario() {
    return getValorHora() * getQntHorasTrabalhas();   
    }
    

    
    public Cozinheira(String nome, String cpf, Integer qntHorasTrabalhas, Double valorHora) {
        super(nome, cpf, qntHorasTrabalhas, valorHora);
    }

    

    @Override
    public String toString() {
        return "Cozinheira\n" +
                 super.toString();
    }
}
