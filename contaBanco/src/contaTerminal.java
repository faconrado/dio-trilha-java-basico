import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
        var contaSaldo = 237.48; // Saldo da conta

      Scanner scanner = new Scanner(System.in); // Criando o scanner.

      System.out.println("Por favor, digite a sua conta!"); // Pedido de inserção da conta do usuário.
      var contaBanco = scanner.nextInt(); // Entrada da conta do usuário em contaBanco.

      scanner.nextLine();  // Limpeza do buffer
      System.out.printf("Conta digitada: %d. Precione Enter para confirmar.", contaBanco); // Confirmação do número digitado pelo usuário.
      scanner.nextLine(); // Enter para confirmar

      System.out.println("Digite a Agência"); // Pedido de inserção da agência do usuário.
      var contaAgencia = scanner.nextInt(); // Entrada da agência do usuário em contaAgencia.

      scanner.nextLine(); // Limpeza do buffer 
      System.out.printf("Conta digitada: %d. Precione Enter para confirmar.", contaAgencia); // Confirmação do número digitado pelo usuário.
      scanner.nextLine(); // Enter para confirmar

      System.out.println("Digite o Nome do Cliente!"); // Pedido de inserção do nome do cliente.
      var contaCliente = scanner.next(); // Entrada do nome do cliente em contaCliente.

      scanner.nextLine();  // Limpeza do buffer
      System.out.printf("Nome do usuário digitado: %s. Precione Enter para confirmar.", contaCliente); // Confirmação do número digitado pelo usuário.
      scanner.nextLine(); // Enter para confirmar

      System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f%n já está disponível para saque.", contaCliente, contaAgencia, contaBanco, contaSaldo); // Mensagem final ao usuário.

      scanner.close();  // Fecha o Scanner 


    }


}
