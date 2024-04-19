import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QUESTAO1 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);
      
        double temperatura;
        double soma = 0; 
        double mediaAnual;
      
        List<Double> temp = new ArrayList<Double>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] );
             temperatura = enterScanner.nextDouble();
            temp.add(temperatura);
        }
            for (double tempe: temp) {
            soma += tempe;
        }
         mediaAnual = soma / 12;

        System.out.println("Contando que a media anual foi "+mediaAnual+ ", esses foram os meses que ficaram acima");
        for (int i = 0; i < 12; i++) {
            temperatura = temp.get(i);
            if (temperatura > mediaAnual) {
                System.out.println(meses[i] + ": " + temperatura + "°C");
            }
          enterScanner.close();
        }
    }
  
}
