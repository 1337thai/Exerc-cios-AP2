import java.util.Scanner;

public class exc3m7 {
public static void main(String[] args) {
      // Criação do objeto Scanner para a entrada do sc 
    Scanner sc = new Scanner(System.in);
    //Declarando variavel
    String endereco;
    //Solicitando dado
    System.out.printf("Digite seu endereço: ");
    endereco = sc.nextLine();
    //Dando o resultado
    System.out.printf("Seu endereço é: " +endereco);
    //Fechando codigo 
    sc.close();
}
}
