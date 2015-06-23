package ControleAcademico;

import java.util.List;

public class CalculoCREHarmonico extends CalculoCRE {

	public CalculoCREHarmonico(List<Double> listaDeNotas) {
		super(listaDeNotas);
	}

	@Override
	public double calulaCRE() {
		double divisor = 0;
		for (int i = 0; i < getListaDeNotas().size() ; i++) {
			divisor = divisor + 1 / getListaDeNotas().get(i);
		}
		
		return (getListaDeNotas().size()/divisor);
	}

}
