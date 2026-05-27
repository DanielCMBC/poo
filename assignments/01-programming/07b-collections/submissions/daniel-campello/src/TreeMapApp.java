import java.util.TreeMap;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class TreeMapApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> valores = new TreeMap<>();
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
        
        TreeMap<Integer, String> copia_valores = new TreeMap<>(valores);
        System.out.println(copia_valores);

        for (int pares : valores.keySet()) {
            System.out.print("Digite o valor da chave que deseja checar: ");
            pares = scanner.nextInt();
            if (valores.containsKey(pares)) {
                System.out.println("True " + valores.containsKey(pares));
            } else {
                System.out.println("False " + valores.containsKey(pares));
            }
        }

        for (String valor : valores.values()) {
            System.out.print("Digite o valor que deseja checar: ");
            valor = scanner.next();
            if (valores.containsValue(valor)) {
                System.out.println("True " + valores.containsValue(valor));
            } else {
                System.out.println("False " + valores.containsValue(valor));
            }
        }

        valores.keySet();
        System.out.println(valores);

        TreeMap<Integer, String> sortedByValue = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer key1, Integer key2) {
                String value1 = valores.get(key1);
                String value2 = valores.get(key2);
                if (value1 == null || value2 == null) return 0;
                return value1.compareTo(value2);
            }
        });
        sortedByValue.putAll(valores);

        valores.clear();
        System.out.println(valores);

        System.out.print("Digite o valor dos pares para descobrir quem está associado a menor e a maior chave: ");
        int chave = scanner.nextInt();
        scanner.nextLine();
        String valor = scanner.nextLine();
        
        System.out.println("Menor valor " + valor + " Associado a chave: " + sortedByValue.firstKey());
        System.out.println("Maior valor " + valor + " Associado a chave: " + sortedByValue.lastKey());

        scanner.close();

        TreeMap<Integer, String> valoresInvertidos= new TreeMap<>(Collections.reverseOrder());
        valoresInvertidos.putAll(valores);
        System.out.println(valoresInvertidos);

        System.out.print("Digite o valor da chave que deseja recuperar: ");
        int inputKey = scanner.nextInt();
        if (valores.containsKey(inputKey)) {
            System.out.println(valores.get(inputKey));
        } else {
            System.out.println("Chave não encontrada.");
        }
        scanner.close();

        System.out.print("Digite uma chave para mostrar a maior chave menor ou igual à chave informada: ");
        int key = scanner.nextInt();
        for(int k : valores.keySet()){
            if(k<= key){
                System.out.println(key);
            }
        }
        
    }
}
