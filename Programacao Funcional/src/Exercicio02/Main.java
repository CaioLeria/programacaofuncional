package Exercicio02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario.add(new Funcionario("Cesar", 20000, 10));
        listaFuncionario.add(new Funcionario("Caio", 2000, 3));
        listaFuncionario.add(new Funcionario("Pedro", 22300, 7));
        listaFuncionario.add(new Funcionario("Lucas", 20300, 1));

        Predicate<Funcionario> calcularAdicional = funcionario -> funcionario.anosExperiencia() <= 5;


        for (Funcionario f : listaFuncionario) {
            System.out.println(f);
        }
        System.out.println("               ");
        //listaFuncionario.stream()
        //     .map(funcionario -> new Funcionario(funcionario.nome(),
        //           funcionario.salario() * (funcionario.anosExperiencia()>=5 ?  1.2 : 1.10), funcionario.anosExperiencia()))
        //.forEach(System.out::println);


        List<Funcionario> novosSalarios = listaFuncionario.stream()
                .map(funcionario -> new Funcionario(funcionario.nome(),
                        funcionario.salario() * (calcularAdicional.test(funcionario) ? 1.2 : 1.10), funcionario.anosExperiencia()))
                .sorted(Comparator.comparing(Funcionario::nome))
                .toList();

        novosSalarios.forEach(System.out::println);
    }
}
