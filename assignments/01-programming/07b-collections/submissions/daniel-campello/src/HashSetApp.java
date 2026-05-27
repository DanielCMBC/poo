import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class HashSetApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int index;
        HashSet<String> cores = new HashSet<>();

        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Branco");

        System.out.println(cores);
        

        for(String cor : cores){
            System.out.println(cor);
        }

        HashSet<String> clone_cores = (HashSet<String>) cores.clone();
        System.out.println(clone_cores);


        HashSet<String> copia_cores = new HashSet<>(cores);
            System.out.println(copia_cores);
        cores.clear();

        String [] cores_array = cores.toArray(new String[0]);
        System.out.println(cores_array);

        TreeSet<String> cores_TreeSet = new TreeSet<>(cores);
        System.out.println(cores_TreeSet);

        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);

        for(int i = 0; i < numeros.size(); i++){
            if(i == 6) {
                System.out.println("Números menores que " + i + ": " + numeros.headSet(i));
            }
            
        }
    
        boolean isEqual = cores.equals(copia_cores);
        if(isEqual) {
            System.out.println(cores);
            System.out.println(copia_cores);
            System.out.println("True " + isEqual);
        } else {
            System.out.println("False " + isEqual);
        }

        boolean isEmpty = cores.isEmpty();
        if(cores.contains("Verde")) {
            System.out.println("True " + isEmpty);
        } else {
            System.out.println("False " + isEmpty);
        }

        
        System.out.println(cores);

        for(int i = 0; i < cores.size(); i++){
            if(cores.containsAll(cores_TreeSet)) {
                System.out.println("True " + cores.containsAll(cores_TreeSet));
            } else {
                System.out.println("False " + cores.containsAll(cores_TreeSet));
            }
        }
        scanner.close();
        
        cores.clear();
    }
}
