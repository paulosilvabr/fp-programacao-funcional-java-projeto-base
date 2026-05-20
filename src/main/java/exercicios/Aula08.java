package exercicios;

import exercicios.base.Aula;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Aula08 extends Aula {
    public Aula08() {
        // REDUCE
//        var estudante1 = estudantes.getFirst();
//        var estudante = estudantes.stream()
//                .reduce(estudante1, (e1, e2) -> e1.compareTo(e2) > 0 ? e1 : e2);
//        System.out.println(estudante);
//
//        estudantes.stream().sorted().forEach(System.out::println);

        // MAP
        var mapPessoaComanda = new HashMap<>(Map.of(
                "João", 1.75,
                "Maria", 1.65,
                "José", 1.80,
                "Ana", 1.70,
                "Carlos", 1.75,
                "Mariana", 1.65,
                "Pedro", 1.80,
                "Paula", 1.70
        ));

        mapPessoaComanda.putIfAbsent("Paulo", 100.0);
        mapPessoaComanda.computeIfAbsent("Rayssa", k -> 300.0);
        mapPessoaComanda.forEach((nome, valor) -> {
            System.out.println(nome + ": " + valor);
        });
    }

    static void main() {
        new  Aula08();
    }
}
