import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListApp {
    public static void updateList(String oldElement, String newElement, List<String> cores){
        if(cores.contains(oldElement)){
            int index = cores.indexOf(oldElement);
            cores.set(index, newElement);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();
        int tamanho_minimo;

        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Branco");

        System.out.print("" + cores.size());

        for(int i = 0; i < cores.size(); i++){
            System.out.println(cores.get(i));
        }

        for(String cor : cores){
            System.out.println(cor);
        }

        System.out.print("Digite um Elemento a Ser Inserido no Início da Lista: ");
        String novaCor = scanner.nextLine();
        cores.add(0, novaCor);
        System.out.println(cores);
                    
        System.out.print("Digite um Elemento a Ser Inserido na Terceira Posição da Lista: ");
        String terceiraCor = scanner.nextLine();
        cores.add(2, terceiraCor);
        System.out.println(cores.get(2));
        System.out.println(cores);

        System.out.print("Insira o elemento antigo para Substituir: ");
        String corAntiga = scanner.nextLine();
        System.out.print("Insira o novo elemento: ");
        String corNova = scanner.nextLine();
        updateList(corAntiga, corNova, cores);
        System.out.println(cores);

        System.out.print("Digite um elemento a ser verificado: ");
        String elemento = scanner.nextLine();
        boolean exists = cores.contains(elemento);
        if(exists){
            System.out.println("True " + exists);
        }else{
            System.out.println("False " + exists); 
        }
            
        System.out.print("Informe as posições de cores a serem trocadas (pos 1 e 2 separadas por enter): ");
        int pos1 = scanner.nextInt();
        int pos2 = scanner.nextInt();
        Collections.swap(cores, pos1, pos2);
        System.out.println(cores);

        System.out.print("Digite a Nova Capacidade da Lista: ");
        tamanho_minimo = scanner.nextInt();
        cores.ensureCapacity(tamanho_minimo);
        cores.trimToSize();
        System.out.println(cores.size());
        
        cores.remove(2);
        System.out.println(cores);

        
        Collections.sort(cores);
        System.out.println(cores);

        List<String> copia_cores = new ArrayList<>();
        copia_cores.addAll(cores);
        System.out.println(copia_cores);

        Collections.shuffle(cores);
        System.out.println(cores);

        Collections.reverse(cores);
        System.out.println(cores);

        List<String> Sublista = cores.subList(1, 3);
        System.out.println(Sublista);

        boolean isEqual = cores.equals(copia_cores);
        System.out.println(isEqual);

        Collections.swap(cores, 2, 3);
        System.out.println(cores);

        List<String> todas_cores = new ArrayList<>(cores);
        Collections.addAll(todas_cores, copia_cores.toArray(new String[0]));
        System.out.println(todas_cores);

        cores.clear();
        System.out.println(cores);

        boolean isEmpty = cores.isEmpty();
        if(isEmpty){
            System.out.println("True " + isEmpty);
        }else{
            System.out.println("False " + isEmpty);
        }

        cores.add("Verde");
        cores.add("Azul");
        cores.add("Branco");
        cores.add("Amarelo");
        cores.add("Preto");
        
        for(int i = 0; i < cores.size(); i++){
            if(i == 1){
                System.out.println(cores.get(i));
                Collections.swap(cores, 2, 4);
            }
            System.out.println(cores);
        }
        
        for(int i = 0; i < cores.size(); i++){
            System.out.println("index -> " + i + " element " + cores.get(i));
        }
        
        scanner.close();
    }
}
