package br.com.aula.spring.data.service;

import br.com.aula.spring.data.orm.Cargo;
import br.com.aula.spring.data.orm.Funcionario;
import br.com.aula.spring.data.repository.CargoRepository;
import br.com.aula.spring.data.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Scanner;
/*
@Service
public class CrudFuncionarioService {
    private Boolean system = true;
    private  final FuncionarioRepository funcionarioRepository;

    public CrudFuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public void inicial(Scanner scanner){

        while (system){
            System.out.println("Qual acao de cargo deseja executar");
            System.out.println("0 - Sair");
            System.out.println("1 - Salvar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Visualizar");
            System.out.println("4 - Deletar");

            int action = scanner.nextInt();
            switch (action){
                case 1:
                    salvar(scanner);
                    break;
                case 2:
                    atualizar(scanner);
                    break;
                case 3:
                    visualizar();
                    break;
                case 4:
                    deletar(scanner);
                    break;
                default:
                    system = false;
                    break;
            }
        }

    }

    private void atualizar(Scanner scanner) {
    }

    private void salvar(Scanner scanner){
        System.out.println("Descrição do cargo");
        String descricao = scanner.next();
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(descricao);
        funcionarioRepository.save(funcionario);
        funcionario.setCargo(funcionario.getCargo());
        funcionarioRepository.save(funcionario);
        funcionario.setCpf(descricao);
        funcionarioRepository.save(funcionario);
        funcionario.setDataContratacao(LocalDate.parse(descricao));
        funcionarioRepository.save(funcionario);
        Double sal = scanner.nextDouble();
        funcionario.setSalario(sal);
        funcionarioRepository.save(funcionario);

        System.out.println("Salvo");

    }

  /*  private void atualizar(Scanner scanner){
        System.out.println("Id");
        int id = scanner.nextInt();
        System.out.println("Descrião do Cargo");
        String descricao = scanner.next();

        Cargo cargo = new Cargo();
        cargo.setId(id);
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);
        System.out.println("Atualizado");


    }

    private void visualizar(){
        Iterable<Cargo> cargos = cargoRepository.findAll();
        cargos.forEach(cargo -> System.out.println(cargo));

    }
    private void deletar(Scanner scanner){
        System.out.println("Id");
        int id = scanner.nextInt();
        cargoRepository.deleteById(id);
        System.out.println("Atualizado");
    }

}*/
