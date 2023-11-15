import java.util.Scanner;

public class exc1m7 {
    public static void main(String[] args) {
    
       // Criação de três objetos Scanner para a entrada do usuário
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        
        //Declarando variaveis 
        String nome,idade,endereco;

        //Solicitando dados do cliente
        System.out.printf("Digite seu nome:");
        nome=a.nextLine();

        System.out.printf("Digite sua idade:");
        idade=b.nextLine();

        System.out.printf("Digite seu endereço:");
        endereco=c.nextLine();
        //Rodando o código
        System.out.println("Seus dados corresponde: "  +nome +idade +endereco );
        
        //Fechando o código 
        a.close();
        b.close();
        c.close();
    }
    
}