import java.util.Scanner;

public class exc2em7 {
    public static void main(String[] args) {

      // Criação objeto no Scanner para a entrada dos items 
        Scanner items = new Scanner(System.in);
        //Declarando variaveis 
        int v1, v2, v3, v4, v5;
        //Solicitando dados 
        System.out.print("Digite o valor da compra 1: ");
        v1 = items.nextInt();

        System.out.print("Digite o valor da compra 2: ");
        v2 = items.nextInt();

        System.out.print("Digite o valor da compra 3: ");
        v3 = items.nextInt();

        System.out.print("Digite o valor da compra 4: ");
        v4 = items.nextInt();

        System.out.print("Digite o valor da compra 5: ");
        v5 = items.nextInt();
        //Fazendo o calculo
        int total = v1 + v2 + v3 + v4 + v5;
        //Dando o resultado 
        System.out.println("O valor total é: " + total);
        //Fechando o codigo 
        items.close();
    }
}