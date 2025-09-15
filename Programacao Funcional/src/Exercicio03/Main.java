package Exercicio03;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Produto> produto = new ArrayList<>();
        produto.add(new Produto("Leite",6,"mercearia"));
        produto.add(new Produto("Pilha",26,"Eletrônico"));
        produto.add(new Produto("café",50,"Mercearia"));

        Predicate<Produto> filtro = produt -> produt.preco()>=20 && produt.categoria().equalsIgnoreCase("eletrônico");

        produto.stream().filter(filtro)
                .map(p-> new Produto(p.nome(),p.preco()*0.9,p.categoria()))
                .forEach(System.out::println);
    }
}
