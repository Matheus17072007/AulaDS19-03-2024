import java.util.Scanner;

public class EntradaComScanner {

    public static void main(String[] args) {

        float largura, comprimento, area, perimetro;
        Scanner sc;
        try {
            System.out.println("Entre com o comprimento: ");
            sc = new Scanner(System.in);
            comprimento = sc.nextFloat();

            System.out.println("Entre com a largura: ");
            sc = new Scanner(System.in);
            largura = sc.nextFloat();

            area = comprimento * largura;
            perimetro = largura * 2 + comprimento * 2;

            System.out.println("Area do terreno: " + area);
            System.out.println("Area do perimetro: " + perimetro);
        }
        catch (NumberFormatException e) {
            System.out.println("Houve erro na conversão, digite apenas caracteres númericos!");
        }

    }
}
