import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principamlmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar,
 * ou retornar um valor
 */

public class ConsumerExample {
    public static void main(String[] args) {
        //criando uma lista de numeros inteiros já pré definidos
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //utilização do consumer com expressão lambda
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };
        numeros.stream().forEach(imprimirNumeroPar);

        //Também modemos realizar desta maneira:
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });

        //Agora sabendo como implementar um Consumer, podemos simplificar utilizando o filter:
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}


