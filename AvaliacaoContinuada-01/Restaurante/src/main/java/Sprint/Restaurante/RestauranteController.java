package Sprint.Restaurante;


//ESSA CLASSE VAI RECEBER OS DADO DA API
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class RestauranteController {

    private List<Funcionario> listFuncionarios;
    private Restaurante restaurante;
    
    public RestauranteController() {
        this.listFuncionarios = new ArrayList<>();
        this.restaurante = new Restaurante();
       // this.listFuncionarios.add(new Gerente(0.2, "enzo", "067987687", 5, 3.));
    }
    
    @DeleteMapping("/{id}")
    public void excluirFuncionario(@PathVariable int id) {
        this.restaurante.excluiFuncionario(id);
        
    }
      @GetMapping("/{id}")
    public Funcionario getById(@PathVariable int id) {
        return this.restaurante.findById(id);
    }
     
    @PostMapping("/{tipo}")
   public void createFuncionario(@PathVariable String tipo, @RequestBody FuncionarioDTO dto){
        this.restaurante.createFuncionario(tipo, dto);
   }
   
   @GetMapping
    public List<Funcionario> exibeTodos() {
        return this.restaurante.listaFuncionarios();
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

    

}