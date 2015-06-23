package ControleAcademico;

import java.util.ArrayList;
import java.util.List;

/*O aluno possui um nome, um curso e uma matr�cula. Um aluno pode tamb�m calcular um
CRE de acordo com uma lista espec�fica de notas. Por�m, existem duas formas de calcular o
CRE. O CRE pode ser calculando usando: (i) uma m�dia harm�nica, ou ent�o (ii) uma m�dia
aritm�tica dos valores da lista de notas*/

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
