package conta;

import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	
	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		
		Scanner leia = new Scanner(System.in);

		int opcao, numero = 0, agencia, tipo, aniversario, numeroDestino = 0;
		String titular;
		float saldo = 0, limite, valor;
		
		System.out.println("\nCriar Contas\n");
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();
		
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     "); 
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
			
			if(opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\n Criar Conta\n\n");
				
				System.out.println("Digite o número da agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				
				do {
					System.out.println("Digite o tipo da conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
					
				}while(tipo < 1 && tipo > 2);
				
				System.out.println("Digite o saldo da conta (R$): ");
				limite = leia.nextFloat();
				
				switch(tipo) {
				case 1 -> {
					System.out.println("Digite o limite de crédito (R$): ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do aniversário da conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					
				 }
				}
				keyPress();
                 break;
			case 2:
				System.out.println("\n Listar todas as Contas\n\n");
				contas.listarTodas();
				
				keyPress();
                 break;
			case 3:
				System.out.println("\n Consultar dados da conta - por número\n\n");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				contas.procurarPorNumero(numero);
				
				keyPress();
				break;
			case 4:
				System.out.println("\n Atualizar dados da Conta\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				if (contas.buscarNaCollection(numero) != null) {
					System.out.println("Digite o número da agência: ");
					agencia = leia.nextInt();
					System.out.println("Digite o nome do titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					System.out.println("Digite o saldo da conta (R$): ");
					limite = leia.nextFloat();
					
					tipo = contas.retornaTipo(numero);
					
					switch(tipo) {
					case 1 -> {
						System.out.println("Digite o limite de crédito (R$): ");
						limite = leia.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do aniversário da conta: ");
						aniversario = leia.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
					default -> {
						System.out.println("Tipo de conta inválido!");
					}
					}
				} else
					System.out.println("\nConta não encontrada!");
				
				keyPress();
                 break;
			case 5:
				System.out.println("\n Apagar Conta\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				contas.deletar(numero);
				
				
				keyPress();
                 break;
			case 6:
				System.out.println("\n Saque\n\n");
				System.out.println("Digite o número da conta: ");
				
				do {
					System.out.println("Digite o valor do saque (R$): ");
					valor = leia.nextFloat();
					
				}while (valor <= 0);
				
				contas.sacar(numero, valor);
				
				keyPress();
				break;
             case 7:
				System.out.println("\n Depositar\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				do {
					System.out.println("Digite o valor do saque (R$): ");
					valor = leia.nextFloat();
					
				}while (valor <= 0);
				
				contas.depositar(numero, valor);
				
				keyPress();
				break;
             case 8:
				System.out.println("\n Transferência entre contas\n\n");
				System.out.println("Digite o número da conta de origem: ");
				numero = leia.nextInt();
				
				do {
					System.out.println("Digite o valor da transferência (R$): ");
					valor = leia.nextFloat();
					
				}while(valor <= 0);
				
				contas.transferir(numero, numeroDestino, valor);
				
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida\n\n");
				
				keyPress();
                 break;
			}
        }
	}

	private static void keyPress() {
		
		
	}

}