import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class LinkedListApp {

    public static boolean exists;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> cores = new LinkedList<>();

        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Branco");

        System.out.println(cores);

        for(int i = 0; i < cores.size(); i++){
            System.out.println(cores.get(i));
        }

        for(String cor : cores){
            System.out.println(cor);
        }

        for(int i = cores.size(); i >= 0; i--){
            System.out.println(cores.get(i));
        }
        cores.add(0, "Preto");
        System.out.println(cores);

        cores.addFirst("Laranja");
        cores.addFirst("Roxo");
        cores.addFirst("Cinza");
        
        cores.addLast("Ciano");
        cores.addLast("Rosa");
        cores.addLast("Marrom");
        System.out.println(cores);

        for(int i = 0; i < cores.size(); i++){
            if(i == 3){
                cores.add("Verde Claro");
            }
            System.out.print(cores);
        }

        String target = "Azul";
        int first = cores.indexOf(target);
        int last = cores.lastIndexOf(target);
        System.out.println(first);
        System.out.println(last);

        for(int i = 0; i < cores.size(); i++){
            System.out.println("index -> " + i + " element -> " + cores.get(i));
        }
        cores.remove(9);
        System.out.println(cores);

        cores.removeFirst();
        cores.removeLast();
        System.out.println(cores);


        Collections.swap(cores, 1, 2);
        System.out.println(cores);

        Collections.shuffle(cores);
        System.out.println(cores);
        
        List<String> copia_cores = new LinkedList<>();
        copia_cores.addAll(cores);
        System.out.println(copia_cores);

        List<String> total_cores = new LinkedList<>(cores);
        Collections.addAll(total_cores, copia_cores.toArray(new String[0]));
        System.out.println(total_cores);

        cores.remove(0);
        System.out.println(cores);

        String firstElement = cores.peekFirst();
        System.out.println(firstElement);

        String lastElement = cores.peekLast();
        System.out.println(lastElement);

        boolean exists = cores.contains("Verde");
        if(exists == true) {
            System.out.println("True " + exists);
        } else {
            System.out.println("False " + exists);
        }
        
        String[] array_cores = cores.toArray(new String[0]);
        System.out.println(array_cores);
        
        boolean isEqual = cores.equals(copia_cores);
        System.out.println(isEqual);

        boolean isEmpty = cores.isEmpty();
            if(isEmpty == true) {
                System.out.println("True " + isEmpty);
            } else {
                System.out.println("False " + isEmpty);
            }

        for(int i = 0; i < cores.size(); i++){
            if(i == 1){
                System.out.println(cores.get(i));
                Collections.swap(cores, 2, 4);
            }
            System.out.println(cores);
        }

        cores.clear();
        System.out.println(cores);

        
    }
}
