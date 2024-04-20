import java.util.ArrayList;
import java.util.Scanner;

public class QUESTAO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> valorVendido = new ArrayList<Double>();

        int[] contador = new int[9];
        double salario_Total;
        double vendas = 0;
        int i = 0;

        while (vendas != -1) {
            System.out.println("Informe o valor que você teve de vendas brutas\nDigite -1 para sair");
            vendas = scanner.nextDouble();
            valorVendido.add(vendas);
        }

        for (double valor : valorVendido) {
            salario_Total = 200 + (valor * 0.09);
            if (salario_Total >= 200 && salario_Total <= 299) {
                contador[0]++;
            } else if (salario_Total >= 300 && salario_Total <= 399) {
                contador[1]++;
            } else if (salario_Total >= 400 && salario_Total <= 499) {
                contador[2]++;
            } else if (salario_Total >= 500 && salario_Total <= 599) {
                contador[3]++;
            } else if (salario_Total >= 600 && salario_Total <= 699) {
                contador[4]++;
            } else if (salario_Total >= 700 && salario_Total <= 799) {
                contador[5]++;
            } else if (salario_Total >= 800 && salario_Total <= 899) {
                contador[6]++;
            } else if (salario_Total >= 900 && salario_Total <= 999) {
                contador[7]++;
            } else {
                contador[8]++;
            }
        }

        System.out.println("A quantidade de funcionarios que estão em cada range:");
        for (i = 0; i < 8; i++) {
            System.out.printf("$%d00 - $%d99: %d\n", i + 2, i + 2, contador[i]);
        }
        System.out.println("$1000 em diante: " + contador[8]);

        scanner.close();
    }

}