package ControleAcademico;

import java.text.DecimalFormat;

public class TesteAlunoMain {
	public static void main(String[] args) {
		
		Aluno david = new Aluno("David", "Computacao", "114211306");
		Aluno ana = new Aluno("Ana", "Computacao", "114211000");
		
		david.adicionaNota(10);
		david.adicionaNota(7);
		david.adicionaNota(8);
		
		
		ana.adicionaNota(4);
		ana.adicionaNota(10);
		ana.adicionaNota(5);
		ana.adicionaNota(8);
		
		
		
		DecimalFormat format = new DecimalFormat("#0.00");
		
		System.out.println(format.format(david.calculaCRE()));
		System.out.println(format.format(ana.calculaCRE()));
		
	}
}
