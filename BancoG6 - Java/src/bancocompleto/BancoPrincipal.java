package bancocompleto;

import java.util.Random;
import java.util.Scanner;

import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;
import entidades.LogoG6;

public class BancoPrincipal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		int numero;
		String nome;
		char op;
		char op1 = ' ';
		char cd = ' ';
		char continua;
		int w = 0;
		char opLetra = ' ';
		
		LogoG6 logo = new LogoG6();
		logo.mostrarLogo();
		System.out.println("\n");
		System.out.print("Sejam bem vindes ao G6 Bank! \n");
		System.out.print("O Banco a sua altura \n");
		System.out.print("O Banco com a sua essência \n");
		System.out.println("Somos o G6, venha fazer parte!\n");
		numero = random.nextInt(99999);
		System.out.printf("-----------------------------------\n");
		System.out.println("Gerando o número da sua conta...");
		System.out.println("Digite o seu nome: ");
		nome = leia.next().toUpperCase();
		ContaPoupanca conta1 = new ContaPoupanca(numero, nome, 25);
		ContaCorrente conta2 = new ContaCorrente (numero,nome, 3);
		ContaEspecial conta3 = new ContaEspecial(numero, nome, 1000);
		ContaEmpresa conta4 = new ContaEmpresa(numero, nome, 10000);
		System.out.printf("-----------------------------------\n");
		do {
			limpaTela();
			System.out.printf("-----------------------------------\n");
			System.out.println("Cliente: "+nome+" Conta: "+numero);
			System.out.println("1 - Conta Poupança");
			System.out.println("2 - Conta Corrente");
			System.out.println("3 - Conta Especial");
			System.out.println("4 - Conta Empresa");
			System.out.println("5 - Conta Estudantil");
			System.out.println("6 - SAIR");
			System.out.printf("-----------------------------------\n");
			System.out.print("Digite o numero da sua opção: ");
			op = leia.next().charAt(0);
			
			if(op == '1') {
			for(int x = 1; x<=10;x++) {
				System.out.print("\n");
				System.out.print("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");
				System.out.print("Bem vinde a Conta Poupanca G6 \n");
				System.out.print("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");
				System.out.println("Contagem de movimentações : "+x);
				System.out.println("Débito ou Credito? [D / C]: ");
				cd = leia.next().toUpperCase() .charAt(0);
				if(cd =='D') {
					System.out.println("Digite o valor que deseja debitar: ");
					double valordeb = leia.nextInt();
					conta1.debito(valordeb);
				}else if(cd =='C') {
					System.out.println("Digite o valor que deseja creditar: ");
					int valorcred = leia.nextInt();
					x++;
					conta1.credito(valorcred);
					if(x<=1) {
						conta1.aumento();
					}
				}else {
					System.out.println("Opção inválida tente novamente.");
					}
				System.out.println("Continua [S / N] ? ");
				continua = leia.next().toUpperCase() .charAt(0);
				if (continua =='N') {
					break;
					}
				}
			}
			if(op == '2') {
				int i;
				System.out.print("\n");
				System.out.print("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");
				System.out.print("Bem vinde a Conta Corrente G6 \n");
				System.out.print("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");
	                 for (i=0; i<10;i++) {
	                    String menuCorrente[] = {"Débito", "Crédito", "Saldo","Cheques", "Voltar ao Menu"};

	                    for(int x = 0; x<menuCorrente.length; x++) {
	                        System.out.print((x+1) + " - " + menuCorrente[x] + "\n");
	                }
	                    System.out.println("Digite uma opção : ");
	                    op = leia.next().charAt(0);
	                    if (op== '1') {
	                        System.out.println("Digite o valor do débito : ");
	                        conta2.debito(leia.nextDouble());
	                    }
	                    else if (op =='2') {
	                        System.out.println("Digite o valor do crédito : ");
	                        conta2.credito(leia.nextDouble());
	                    }
	                    else if (op =='3') {
	                        System.out.println("Valor de saldo é : "+ conta2.getSaldo());
	                    }
	                    else if (op == '4') {

	                        conta2.pedirCheque(2);
	                    }
	                    else if (op == '5') {
	                        
	                            conta2.pedirCheque(1);
	                            break;
	                    			}
	                        
	                    }
	                 if (i==10) {
	                 	System.out.println("Você atingiu o limite de movimentações da Conta Corrente.");
	                 	if (conta2.chequesDisponiveis<3) {
	                 			conta2.pedirCheque(1);
	                 		}
	                   }

	            }
			if(op == '3') {
				System.out.print("\n");
				System.out.print("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");
				System.out.print("Bem vinde a Conta Especial G6 \n");
				System.out.print("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");
				for(int x = 0; x<10;x++) {
					System.out.printf("-----------------------------------\n");
					System.out.println("Contagem de movimentações : "+x);
					conta3.mostraSaldo();
					System.out.printf("-----------------------------------\n");
					System.out.println("Débito ou Credito? [D / C]: ");
					cd = leia.next().toUpperCase() .charAt(0);
					if(cd =='D') {
						System.out.println("Digite o valor que deseja debitar: ");
						double valorDeb = leia.nextInt();
						conta3.debito(valorDeb);
					}else if(cd =='C') {
						System.out.println("Digite o valor que deseja creditar: ");
						int valorCred = leia.nextInt();
						conta3.credito(valorCred);
					}else {
						System.out.println("Opção inválida tente novamente.");
						}
					System.out.println("Continua [S / N] ? ");
					continua = leia.next().toUpperCase() .charAt(0);
					if (continua =='N') {
						System.out.println("agradecemos por usar o banco G6, volte sempre!");
						break;
						}
					if(x == 10) {
						System.out.println("Você atingiu o limite de movimentações da Conta Corrente.");
					}
				}	
			}
			if(op == '4') {									
				int i = 0;
				System.out.print("\n");
				System.out.print("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");
				System.out.print("Bem vinde a Conta Empresa G6 \n");
				System.out.print("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");
				System.out.println("Contagem de movimentações : "+i);
				for (i=0; i<10;i++) {
                String menuCorrente[] = {"Débito", "Crédito", "Saldo","Crédito Empresarial", "Voltar ao Menu"};

                for(int x= 0; x<menuCorrente.length; x++) {
                    System.out.print((x+1) + " - " + menuCorrente[x] + "\n");
                }
				System.out.print("Digite o numero da sua opção: ");
				op = leia.next().charAt(0);
				
				if(op =='1' ) {
					System.out.println("Qual valor deseja debitar: ");
					double valorDeb=leia.nextDouble();
					conta4.debito(valorDeb);
				}
				else if (op =='2' ) {
					System.out.println("Qual valor deseja creditar: ");
					double valorCred=leia.nextDouble();
					conta4.credito(valorCred);
				}
				else if (op =='3' ) {
					System.out.println("Seu saldo atual R$: "+conta4.getSaldo());
				}
				else if (op =='4' ) {							
					System.out.println("Sabemos que você está montando uma empresa!");
					System.out.println("Por isso estamos liberando um credito de R$: "+conta4.getLimiteEmprestimo());
			        System.out.println("Gostaria de contratar o emprestimo? [S/N] ");
			        opLetra = leia.next().toUpperCase().charAt(0);
			        if (opLetra =='S') {	       	    
			        	System.out.println("Qual valor você deseja?");
			        	double valorEmprestimo= leia.nextDouble();
		        		conta4.emprestimoEmpresa(valorEmprestimo);
			        }
				}
				else if (op=='5') {
					System.out.println("agradecemos por usar o banco G6, volte sempre!");
					break;
					}
				} if (i==10) {
                 	System.out.println("Você atingiu o limite de movimentações da Conta Corrente.");
                 	break;
                 		}
                   }
		}while (op!=6);
	}
	public static void limpaTela() {
		for(int x = 1; x<=100; x++) {
			System.out.print("\r\n");
		}
	}
}