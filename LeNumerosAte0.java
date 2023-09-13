import java.util.Scanner;

public class LeNumerosAte0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acumulada = 0;

        System.out.print("Digite seus numeros \n\n0 encerra ");

        int m = scanner.nextInt();

        while (m !=0){
            acumulada = acumulada + m;
            System.out.print("proximo: " );
            m = scanner.nextInt();
            
        }

        System.out.println("obrigado, tamo junto! acumulada é : " + acumulada);

        scanner.close();
    }    
}
