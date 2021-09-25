package calcula;

import ex1.pessoa;

public class calculo{
	public double calcula(final pessoa p) {
		final var altura = p.getAltura();
		final var peso = p.getPeso();
		final var imc = peso / (altura * altura);
		
		return imc;
	}
	
	
}
