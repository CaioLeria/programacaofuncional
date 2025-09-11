package Exercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String[] aux = {"Anderson", "Caio", "Cesar", "Astromelia","Angela","Ayrton","Aastronaiodilde"};

        List<String> funcionarios =Arrays.asList(aux);

        Predicate<String> filtroA = e->(e.startsWith("A"));

        //funcionarios.stream()
          //      .filter(filtroA).map(String::toUpperCase)
            //    .sorted()
              //  .forEach(System.out::println);

        List <String > resultado = funcionarios.stream()
                .filter(filtroA)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        resultado.forEach(System.out::println);
    }
}
