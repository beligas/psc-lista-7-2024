
import java.util.Scanner;
import java.util.ArrayList;

public class QUESTAO2 {
  public static void main(String[] args) {
    Scanner enterScanner = new Scanner(System.in);
    ArrayList<String> ListaPerguntas = new ArrayList<String>();

    int count = 0;
    char resposta;

    ListaPerguntas.add("Telefonou para a vítima?");
    ListaPerguntas.add("Esteve no local do crime?");
    ListaPerguntas.add("Mora perto da vítima?");
    ListaPerguntas.add("Devia para a vítima?");
    ListaPerguntas.add("Já trabalhou com a vítima?");

    for (String pergunta : ListaPerguntas) {
      System.err.println(pergunta);
      System.out.println("Responda 's' para sim e 'n' para não");
      resposta = enterScanner.nextLine().charAt(0);
      if (resposta == 's') {
        count++;
      }
    }
    if (count == 2) {
      System.out.println("Suspeita");
    } else if (count >= 3 && count <= 4) {
      System.out.println("Cúmplice");
    } else if (count == 5) {
      System.out.println("Assassino");
    } else {
      System.out.println("Inocente");
    }

    enterScanner.close();
  }
}