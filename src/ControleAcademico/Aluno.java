package ControleAcademico;

import java.util.ArrayList;
import java.util.List;

/*O aluno possui um nome, um curso e uma matrícula. Um aluno pode também calcular um
CRE de acordo com uma lista específica de notas. Porém, existem duas formas de calcular o
CRE. O CRE pode ser calculando usando: (i) uma média harmônica, ou então (ii) uma média
aritmética dos valores da lista de notas*/

public class Aluno {
	private String nome;
	private String curso;
	private String matricula;
	private List<Double> listaDeNotas;
	private CalculoCRE cre;
	
	public Aluno(String nome, String curso, String matricula) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		listaDeNotas = new ArrayList<Double>();
	}
	
	public void adicionaNota(double nota) {
		listaDeNotas.add(nota);
	}
	
	public double calculaCRE() {
		if (listaDeNotas.size() <= 3) {
			cre = new CalculoCREAritmetico(listaDeNotas);
		}
		if (listaDeNotas.size() > 3)  {
			cre = new CalculoCREHarmonico(listaDeNotas);
		}
		
		return cre.calulaCRE();
	}

	public String getNome() {
		return nome;
	}

	public String getCurso() {
		return curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public List<Double> getListaDeNotas() {
		return listaDeNotas;
	}

	public CalculoCRE getCre() {
		return cre;
	}
}
