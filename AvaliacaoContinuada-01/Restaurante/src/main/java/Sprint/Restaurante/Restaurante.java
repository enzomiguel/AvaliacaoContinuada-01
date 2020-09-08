package Sprint.Restaurante;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class Restaurante {

    private List<Funcionario> listFuncionarios;


    public Restaurante() {
        this.listFuncionarios = new ArrayList<>();
       // this.listFuncionarios.add(new Gerente(0.2, "enzo", "067987687", 5, 3.));
    }
    
    @DeleteMapping("/excluir/{id}")
    public void excluirFuncionario(@PathVariable int id) {
        listFuncionarios.remove(id-1);
        
    }
    
    @PostMapping("/{tipo}")
   public void createFuncionario(@PathVariable String tipo, @RequestParam("nome") String nome , @RequestParam("cpf") String cpf,
           @RequestParam("qntHorasTrabalhas") Integer qntHorasTrabalhas , @RequestParam("valorHora") Double valorHora
          ){
        if (tipo .equalsIgnoreCase("gerente")){
        listFuncionarios.add(new Gerente(nome, cpf,  qntHorasTrabalhas, valorHora) );
        } else if(tipo .equalsIgnoreCase("caixa")){
        listFuncionarios.add(new Caixa(nome, cpf,  qntHorasTrabalhas, valorHora));
        }else if(tipo .equalsIgnoreCase("cozinheira")){
            listFuncionarios.add(new Cozinheira(nome, cpf,  qntHorasTrabalhas, valorHora)
                );
        }
   }

//   @PostMapping("/cozinheira")
//   public void adicionarCozinheira(@RequestBody Cozinheira novaCozinheira){
//       listFuncionarios.add(novaCozinheira);
//   }
//
//    @PostMapping("/gerente")
//    public void adicionaGerente(@RequestBody Gerente novoGerente){
//        listFuncionarios.add(novoGerente);
//
//    }
//
//    @PostMapping("/caixa")
//    public void adicionaCaixa(@RequestBody Caixa novoCaixa){
//        listFuncionarios.add(novoCaixa);
//    } 

    @GetMapping
    public List<Funcionario> exibeTodos() {
        return listFuncionarios;
    }
    
     @GetMapping("/{id}")
    public Funcionario getById(@PathVariable int id) {
        return listFuncionarios.get(id-1);
    }

}