package Sprint.Restaurante;

public class Gerente extends Funcionario {

    public Gerente( String nome, String cpf, Integer qntHorasTrabalhas, Double valorHora) {
        super(nome, cpf, qntHorasTrabalhas, valorHora);
   
    }

    @Override
    public Double getSalario() {
    return (getValorHora()* getQntHorasTrabalhas());
    }

    
    @Override
    public String toString() {
        return "Gerente{" + super.toString() ;
    }

   
}
