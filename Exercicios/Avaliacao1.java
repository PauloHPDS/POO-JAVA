package exercicio;

public class Avaliacao1 {
	
	public static void main(String[] args) {
		
		/* Um Empregado de uma empresa recebe aumento salarial anualmente. Sabe-se que esse empregado foi contratado em 2019, com salário inicial de R$ 1.000,00,
		em 2020 recebeu aumento de 1,5% sobre seu salário inicial, a partir de 2021 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual 
		do ano anterior.Faça um programa em java que determine o salário desse empregado até o ano de 2026. E exiba todos os salários na tela.*/
		
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
