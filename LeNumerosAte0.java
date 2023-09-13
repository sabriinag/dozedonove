import java.util.Scanner;

public class LeNumerosAte0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acumulada = 0;
        int cont = 0;

        System.out.print("Digite seus numeros, 0 encerra : ");

        int m = scanner.nextInt();

        while (m !=0){ 
            cont = cont + 1;
            acumulada = acumulada + m;
            System.out.print("proximo: " );
            m = scanner.nextInt();
        }

        if (cont == 0){
            System.out.println("nenhum valor foi digitado");
        }
        else {
            System.out.println("obrigado, tamo junto! acumulada é : " + acumulada);
            double media = (double)acumulada / cont;
            System.out.println("media dos valores : " + media);
        }
        
        scanner.close();
    }    
}
