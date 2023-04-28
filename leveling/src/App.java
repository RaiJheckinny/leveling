import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codePart, numberPart;
        double pricePart, pagarPart;

        System.out.printf("Código da Peça: ");
        codePart = sc.nextInt();
        
        System.out.printf("Número da Peça: ");
        numberPart = sc.nextInt();

        System.out.printf("Preço Por Peça: R$");
        pricePart = sc.nextDouble();

        pagarPart = numberPart*pricePart;

        System.out.printf("O Valor A Pagar: %.2f", pagarPart);

        sc.close();
    }
}
