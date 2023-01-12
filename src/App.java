import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<String> firstArray = new ArrayList<>();
        List<String> secondArray = new ArrayList<>();
        List<String> equalsArray = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Digite uma palavra para o array " + i + ", deixe vazio para finalizar o array!");
            while (true) {
                String word = sc.nextLine();
                if ("".equals(word)) {
                    break;
                } else {
                    if (i == 1) firstArray.add(word);
                    if (i == 2) secondArray.add(word);
                }
            }
        }

        for (int i = 0; i < firstArray.size(); i++) {
            if (secondArray.contains(firstArray.get(i))) {
                equalsArray.add(firstArray.get(i));
            }
        }

        System.out.println("array1: " + firstArray);
        System.out.println("array2: " + secondArray);
        System.out.println("duplicated elements: " + equalsArray);
    }
}