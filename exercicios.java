import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe sua senha, por favor:");
		int senha = sc.nextInt();
		int tentativas = 0;
		int Dica = 3;
		
		while (senha != 2002) {
			if(tentativas >= Dica) {
				System.out.println("A senha é 2002");
			} 
			System.out.println("Senha inválida");
			System.out.println("Tente novamente");
			senha = sc.nextInt();
			
			tentativas += 1;
		}
		System.out.println("Acesso permitido");
		
		System.out.println("--------------Iniciando sistemas de coordenadas--------------");
		
		System.out.println("Insira as coordenadas de X e Y usando números inteiros:");
		int X = sc.nextInt();;
		int Y = sc.nextInt();
		
		while (X != 0 && Y != 0) {
			if(tentativas >= Dica) {
				System.out.println("Para sair do loop digite 0 em qualquer umas das coordenadas");
			}else if(X > 0 && Y > 0) {
				System.out.println("primeiro");
				System.out.println("Digite novamente usando números inteiros:");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo");
				System.out.println("Digite novamente usando números inteiros:");
			}
			else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
				System.out.println("Digite novamente usando números inteiros:");
			}
			else {
				System.out.println("quarto");
				System.out.println("Digite novamente usando números inteiros:");
			}
			
			tentativas += 1;

			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		System.out.println("--------------Vamos para o posto de gasolina--------------");
		
		int digito = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int fim = 4;
		
		System.out.println("Seja bem vindo ao sistema do posto de gasolina, informe o combustivbel desejado");
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Digite o comando desejado listado abaixo");
		System.out.println("1 - Álccol");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Encerrar sistema");
		System.out.println("-----------------------------------------------------");
		
		while (digito != fim) {
			digito = sc.nextInt();
			if(digito <= 0) {
				System.out.println("Por favor, infomre uma das opções listadas acima");
			} else if (digito == 1) {
				alcool += 1;
				System.out.println("Você escolheu Álccol");
			} else if (digito == 2) {
				gasolina += 1;
				System.out.println("Você escolheu Gasolina");
			} else if (digito == 3) {
				diesel += 1;
				System.out.println("Você escolheu Diesel");
			} else {
				System.out.println("Por favor, insira algum dos comando listados a cima");
			}
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Muito obrigado");
		System.out.println("--Popularidade de nossos combustiveis--");
		System.out.println("Álccol: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}