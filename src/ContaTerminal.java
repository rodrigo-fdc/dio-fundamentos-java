import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o Número da Conta!");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o Número da Agência com o dígito");
		agencia = sc.nextLine();
		
		System.out.println("Digite seu nome");
		nomeCliente = sc.nextLine();
		
		System.out.println("Infome o saldo inicial da conta");
		saldo = sc.nextDouble();
		
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
		
		
		sc.close();

	}

}
