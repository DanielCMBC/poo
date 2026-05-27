import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer,String> valores = new HashMap<>();
        valores.put(1, "Um");
        valores.put(2, "Dois");
        valores.put(3, "Três");
        valores.put(4, "Quatro");
        valores.put(5, "Cinco");
        valores.put(6, "Seis");
        valores.put(7, "Sete");
        valores.put(8, "Oito");
        valores.put(9, "Nove");
        valores.put(10, "Dez");

        System.out.println(valores);

        for(int pares : valores.keySet()){
            System.out.println(pares);
        }

        for(String pares : valores.values()){
            System.out.println(pares);
        }
        HashMap<Integer,String> copia_valores = new HashMap<>(valores);
        System.out.println(copia_valores);

        valores.clear();
        System.out.println(valores);

        boolean isEmpty;
        isEmpty = valores.isEmpty();
        if(isEmpty){
            System.out.println("True " + isEmpty);
        }else{
            System.out.println("False " + isEmpty);
        }

        valores.clone();
        System.out.println(valores.clone());

        for(int pares : valores.keySet()){
            System.out.print("Digite o elemento que deseja checar: ");
            pares = scanner.nextInt();
            if(valores.containsKey(pares)){
                System.out.println("True " + valores.containsKey(pares));
            }else{
                System.out.println("False " + valores.containsKey(pares));
            }
            scanner.close();
        }

        for(String valor : valores.values()){
            System.out.print("Digite o elemento que deseja checar: ");
            String inputValue = scanner.nextLine();
            if(valores.containsValue(inputValue)){
                System.out.println("True " + valores.containsValue(inputValue));
            }else{
                System.out.println("False " + valores.containsValue(inputValue));
            }
        }
        scanner.close();
        for(String valor : valores.values()){
            System.out.println("Digite o valor da chave que deseja recuperar: ");
            String inputKey = scanner.nextLine();
            if(valores.containsKey(inputKey)){
                System.out.println(valores.get(inputKey));
            } else{
                System.out.println("Chave não encontrada.");
            }
            scanner.close();
        } 
        
        valores.entrySet();
        System.out.println(valores);

        valores.keySet();
        System.out.println(valores);

        valores.values();
        System.out.println(valores);
    }
}
