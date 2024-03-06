package application;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listclass {
    public static void main(String[] args) {
        
        
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Ana");
        list.add("Joao");
        list.add("Bob");
        list.add(2,"Marco");

        System.out.println("Lista original: ");

        for (String x :list){
            System.out.println(x);
        }

        System.out.println("=====================================");

        System.out.println("com remocao de componentes : ");
        //remover dado
        list.remove("Joao");
        //remover dado por posição

        for (String x :list){
            System.out.println(x);
        }
        System.out.println("=====================================");
        System.out.println("Remocao por predicado: 'M' ");
        System.out.println();
        //remoção por predicado
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x :list){
            System.out.println(x);
        }

        System.out.println("=====================================");
        
        System.out.println("tamanho da lista: ");
        //tamanho da lista
        System.out.println(list.size());

        System.out.println("=====================================");
        //procurar elemento na lista

        System.out.println("Index of Bob: " + list.indexOf("Bob") );
        //Quando não encontra o indexOf retorna -1
        System.out.println("Index of Marco: " + list.indexOf("Marco") );


        System.out.println("=====================================");
        System.out.println("nomes filtrados pela letra 'A' ");
        System.out.println();
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
        System.out.println(x);
        }

        System.out.println("=====================================");
        System.out.println("Primeiro elemento cujo o nome começa com A");
        //Econtrando o elemento 
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
