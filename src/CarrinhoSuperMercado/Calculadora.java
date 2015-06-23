package CarrinhoSuperMercado;

public abstract class Calculadora {

	private double precoBase;
	private int quantidade;
	private double peso;
	
	public Calculadora(double precoBase, int quantidade, double peso) {
		this.precoBase = precoBase;
		this.quantidade = quantidade;
		this.peso = peso;
	}
	
	public abstract double calculaPrecoProduto();

	public double getPrecoBase() {
		return precoBase;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPeso() {
		return peso;
	}
	
	
	
}
