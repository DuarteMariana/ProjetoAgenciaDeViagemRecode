package agenciadeviagem;

import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("=====Cadastro Cliente=====");
		
		Cliente turista = new Cliente();
		System.out.println("Informe seu nome: ");
		turista.setNome(entrada.nextLine());
		System.out.println("Informe seu CPF: ");
		turista.setCpf(entrada.nextLine());
		System.out.println("Informe seu telefone: ");
		turista.setTelefone(entrada.nextLine());
		System.out.println("Informe seu endereço: ");
		turista.setEndereco(entrada.nextLine());
		
		System.out.println("======Cadastro Viagem======");
		
		Viagem destino = new Viagem();
		System.out.println("Informe seu destino: ");
		destino.setDestino(entrada.nextLine());
		System.out.println("Informe sua data de ida: ");
		destino.setIda(entrada.nextLine());
		System.out.println("Informe sua data de volta: ");
		destino.setVolta(entrada.nextLine());
		
		System.out.println("Escolha um pacote de viagem:");
		System.out.println("[1] Passagem aerea ida e volta, classe economica R$ 1.200,00");
		System.out.println("[2] Passagem aerea ida e volta, classe executiva R$ 1.700,00");
		System.out.println("[3] Passagem aerea ida e volta, primeira classe R$ 2.500,00");
		destino.setPreco(entrada.nextInt());
		
		System.out.println("==========Agência de Viagens========");
		System.out.println("------------------------------------");
		System.out.println("==========Dados do Cliente==========");
		System.out.println("Nome: " + turista.getNome());
		System.out.println("CPF: " + turista.getCpf());
		System.out.println("Telefone: " + turista.getTelefone());
		System.out.println("Endereço: " + turista.getEndereco());
		
		System.out.println("=========Dados da sua Viagem=========");
		System.out.println("Destino: " + destino.getDestino());
		System.out.println("Data de ida: " + destino.getIda());
		System.out.println("Data de volta: " + destino.getVolta());
		if (destino.getPreco()== 1) {
			System.out.println("Passagem aerea ida e volta, classe econômica, valor a pagar: R$1.200,00");
		}
		else if (destino.getPreco() == 2){
			System.out.println("Passagem aerea ida e volta, classe executiva, valor a pagar R$1.700,00");
		}
		else {
			System.out.println("Passagem aerea ida e volta, primeira classe, valor a pagar R$2.500,00");
		}
		entrada.close();

	}

}