package Exemplos;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exemplo01 {
    public static void main(String[] args) {
        int []x={10,5,7,6,2,1};
        IntStream fluxo =  IntStream.of(x);

        //imprimir apenas os numeros impares
        //fluxo.filter(valor ->(valor %2 != 0))
          //      .map(valor -> valor +10)
            //    .forEach(System.out::println);

        //imprimir a soma dos elemetos do vetor
        int resultado = fluxo.reduce(0, (total, i ) -> total+i);

        System.out.println(resultado);

    }
}
