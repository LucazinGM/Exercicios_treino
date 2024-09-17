package Exercícios_Treino;
import java.util.Scanner;
public class sistema_de_banco {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int maxTentativas = 3;
        int tentativas = 0;
        boolean acessoPermitido = false;
        
        double saldo = 0;
        System.out.println("BEM-VINDO AO BANCO POUCA GRANA!");
        
        while (tentativas < maxTentativas && !acessoPermitido) {
            System.out.println("Digite aqui a sua matrícula em nosso banco: ");
            int matriculaConta = teclado.nextInt();
            System.out.println("Digite aqui a senha da sua conta: ");
            int senhaConta = teclado.nextInt();

            if (matriculaConta == 40028922 && senhaConta == 1234) {
                acessoPermitido = true;
                
                System.out.print(
                		"""
                		************************************************************
                		
                		Dados iniciais do cliente:
                		
                		Nome: Lucas Gonçalves Rufino de Souza
                		Tipo da conta: Corrente
                		Saldo da conta: R$ 0,00
                		
                		************************************************************
                		""");
                int opcao = 0;
                while (opcao != 4) {
                	
                	System.out.print(
                			"""
                			Operações disponíveis:
                			
                			1- CONSULTAR SALDOS
                			2- RECEBER VALOR
                			3- TRANSFERIR VALOR
                			4- SAIR
                			
                			Digite a ação desejada:
                			""");
                    opcao = teclado.nextInt();
                	switch(opcao) {
                		case 1:
                			System.out.printf("O seu saldo é de: R$ %.2f!\n", saldo);
                			break;
                		case 2:
                			System.out.println("Digite aqui quanto você quer transferir: ");
                			double transferencia = teclado.nextDouble();
                			saldo -= transferencia;
                			System.out.printf("Seu novo saldo é de: R$ %.2f!\n", saldo);
                			break;
                		case 3:
                			System.out.println("Digite aqui quanto você quer depositar na sua conta: ");
                			double deposito = teclado.nextDouble();
                			saldo += deposito;
                			System.out.printf("Seu novo saldo é de: R$ %.2f!\n", saldo);
                			break;
                		case 4:
                			System.out.println("Você escolheu sair.");
                			break;
                		default:
                			System.out.println("Opção inválida. Tente novamente.");
            }
          }
          } else {
            System.out.println("Dados incorretos. Por favor, tente novamente!");
            tentativas++;
        }
    }
    if (tentativas == maxTentativas) {
        System.out.println("Número máximo de tentativas atingido. Seu acesso foi bloqueado.");
    }
    teclado.close();
    }
}