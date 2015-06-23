package ControleAcademico;

import java.util.List;

public class CalculoCREAritmetico extends CalculoCRE {

	public CalculoCREAritmetico(List<Double> listaDeNotas) {
		super(listaDeNotas);
	}

	@Override
	public double calulaCRE() {
		double dividendo = 0;
		for (int i = 0; i < getListaDeNotas().size() ; i++) {
			dividendo = dividendo + getListaDeNotas().get(i);
		}
		
		return dividendo/getListaDeNotas().size();
	}

}
