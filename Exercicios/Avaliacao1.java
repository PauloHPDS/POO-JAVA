package exercicio;

public class Avaliacao1 {
	
	public static void main(String[] args) {
		
		// Calcula o aumento salarial anualmente. dobrando a cada ano.
		
		double salario=1000.0,aumento=1.5;
		int ano=2019;
		System.out.println("Ano: "+ano+", Salario: "+salario);
		ano++;
		while(ano<=2026) {
			salario=salario+((salario/100)*aumento);
			System.out.printf("Ano: %d, Salario: %.2f\n",ano,salario);
			ano++;
			aumento=aumento+aumento;
		}
	}
}