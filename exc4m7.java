import java.util.Scanner;

public class exc4m7 {
    public static void main(String[] args) {
        // Criação de dois objetos Scanner para a entrada do usuário
        Scanner nome = new Scanner(System.in);
        Scanner items = new Scanner(System.in);
        //Declarando variaveis 
        String name;
        int v2, v3;
        //Solicitando dados 
        System.out.printf("Digite seu nome: ");
        name = nome.nextLine();

        System.out.printf("Digite o valor da compra: ");
        v2 = items.nextInt();

        System.out.printf("Digite o valor da compra: ");
        v3 = items.nextInt();
        //Somando 
        int total = v2 + v3;
        //Dando resultado 
        System.out.printf("O valor total é: " + total);
        //Fechando codigo 
        items.close();
        nome.close(); 
    }
}