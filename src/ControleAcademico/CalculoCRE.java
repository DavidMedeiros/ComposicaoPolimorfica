package ControleAcademico;

import java.util.List;

public abstract class CalculoCRE {
	private List<Double> listaDeNotas;
	
	public CalculoCRE(List<Double> listaDeNotas) {
		this.listaDeNotas = listaDeNotas;
	}
	
	public abstract double calulaCRE();

	public List<Double> getListaDeNotas() {
		return listaDeNotas;
	}
}
