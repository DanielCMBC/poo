import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet; 
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        System.out.println(numeros);

        for(int numero : numeros){
            System.out.println(numero);
        }

        System.out.println(numeros);

        TreeSet<Integer> copia_numeros = new TreeSet<>(numeros);
        System.out.println(copia_numeros);

        NavigableSet<Integer> reversedSet = numeros.descendingSet();
        System.out.println(reversedSet);

        for(int i = 0; i < numeros.size(); i++){
            if(i ==0 ){
                System.out.println(numeros.first() + "\n" + numeros.last());
            }
        }

        TreeSet<Integer> clone_numeros = new TreeSet<>(numeros);
        System.out.println(clone_numeros);

        System.out.println(numeros.size() + "");

        boolean isEqual = numeros.equals(copia_numeros);
        if(isEqual) {
            System.out.println("True " + isEqual);
        } else {
            System.out.println("False " + isEqual);
        }

        for(int i = 0; i < numeros.size(); i++){
            if(i < 6 ){
                System.out.println("Numeros menores que " + i + ": " + numeros.headSet(i));
            }
        }

        System.out.print("Digite a posição do elemento a ser recuperado: ");
        int posicao = scanner.nextInt();

        List<Integer> listaNumeros = new ArrayList<>(numeros);
        int index = posicao - 1; 
        if (index >= 0 && index < listaNumeros.size()) {
            Integer elemento = listaNumeros.get(index);
            System.out.println("Elemento na posição " + posicao + ": " + elemento);
        } else if (index < 0 || index >= listaNumeros.size()) {
            System.out.println("Posição inválida.");
        }
        scanner.close();

        System.out.print("Digite o valor para buscar o maior elemento menor ou igual a ele: ");
        int valorInformado = scanner.nextInt();

        Integer resultado = numeros.floor(valorInformado);
        System.out.println("Resultado: " + resultado); // Returns null if nothing matches
        scanner.close();
        
        System.out.print("Digite o valor para buscar o elemento estritamente maior: ");
        valorInformado = scanner.nextInt();
        resultado = numeros.higher(valorInformado);
        System.out.println("Resultado: " + resultado);

        System.out.print("Digite o valor para buscar o elemento estritamente menor: ");
        valorInformado = scanner.nextInt();
        resultado = numeros.lower(valorInformado);
        System.out.println("Resultado: " + resultado);

        System.out.print("Digite o valor a ser removido: ");
        valorInformado = scanner.nextInt();
        numeros.remove(valorInformado);
        System.out.println(numeros);

        scanner.close();
    }
}
