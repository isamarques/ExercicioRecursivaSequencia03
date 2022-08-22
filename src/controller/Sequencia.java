// Criar uma aplicação em Java que tenha uma função recursiva que,
// recebendo um número inteiro (N), apresente a saída da somatória
// S = 1 + 1/2 + 1/3 + 1/4 + … + 1/N

//num inserido pelo usuario tem de ser igual ao divisor final
// cond de parada deve ser qnd divisor chegar ao mesmo numero de N

package controller;

public class Sequencia {

	public Sequencia() {
		super();
	}
	
	public double seq (double divisor) {
		if (divisor == 1) { //cond de parada
			return 1;
		}
		else {
			double div = 1 / divisor;
			divisor = divisor - 1;
			return div + seq(divisor); //calculo funcao
		}
	}

}
