import java.util.Scanner;

public class ContaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o inicio: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o fim : ");
        int fim = scanner.nextInt();

        
        int cont = inicio;

        while (cont <= fim){
            System.out.print(cont + " ");
            cont = cont + 1;

        }
        
        scanner.close();
    }

}
