package exercicio;
import java.util.Scanner;

public class atividades {
	
	/* escreve o número de anos necessários para que a população do país A ultrapasse ou iguale
	 * a população do país B, com taxas de crescimento de 3% para a cidade A e 1,5% para a cidade B. */
	
	public static void crescimentoPopulacao() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a população da primeira cidade(Menor): ");
		double populacaoA = sc.nextDouble();
		System.out.println("Digite a população da segunda cidade(Maior): ");
		double populacaoB = sc.nextDouble();
		int quantidadeAnos=0;
		while(populacaoA<=populacaoB) {
			populacaoA=populacaoA+((populacaoA/100)*3);
			populacaoB=populacaoB+((populacaoB/100)*1.5);
			quantidadeAnos++;
		}
	    System.out.println("São necessarios "+quantidadeAnos+" anos.");
	    sc.close();	
	}
	
	//////////informa o maior número de 5 numeros digitados. //////////
	
	public static void maiorDeCinco() {
		Scanner sc = new Scanner(System.in);
		int n,maior;
		System.out.println("Digite 5 numeros: ");
		n = sc.nextInt();
    	maior=n;
	    for(int i=0;i<4;i++) {
	    	n = sc.nextInt();
	    	if(n>maior) {
	    		maior=n;
	    	}
	    }
	    System.out.println("O maior é = "+ maior);
	    sc.close();
		
	}
	
	//////////imprime na tela apenas os números ímpares entre 1 e 50 //////////
	
	public static void imparesDe50() {
		System.out.println("Numeros impares ate 50: ");
		for(int i=1;i<51;i++) {
	    	if(i%2!=0){
	    		System.out.print(i+", ");
	    	}
	    }
	}
	
	//////recebe dois números inteiros e gera os números que estão no intervalo compreendido por eles. //////////
	
	public static void numerosNoIntervalo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero que deve iniciar: ");
		int inicio=sc.nextInt();
		System.out.println("Digite o numero que deve finalizar: ");
		int fim = sc.nextInt();
		for(inicio++;inicio<fim;inicio++) {
	    	System.out.print(inicio+", ");
	    }
	    sc.close();
	}
	
	////////////// Menu ///////////////
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcao=0;
		while (opcao != 5){
			System.out.println("\n1 - Crescimento Populacional.\n2 - Maior Numero De Cinco.\n"
					+ "3 - Numeros Impares ate 50.\n4 - Numeros No Intervalo De Outros Dois Numeros Digitados.\n5 - Sair");
			opcao=sc.nextInt();
			switch (opcao){
			case 0:
            break;
            case 1:crescimentoPopulacao();
                break;
            case 2:maiorDeCinco();
                break;
            case 3:imparesDe50();
                break;
            case 4:numerosNoIntervalo();
                break;
            case 5:
                break;
            default:System.out.print("ERRO!!!");
                break;
			}
		}
		sc.close();
		
	}

}
