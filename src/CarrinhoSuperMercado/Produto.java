package CarrinhoSuperMercado;

public abstract class Produto {
	
	private String nome;
	private double precoBase;
	private int quantidade;
	private double peso;
	
	public Produto(String nome, double precoBase, int quantidade, double peso){
		this.nome = nome;
		this.precoBase = precoBase;
		this.quantidade = quantidade;
		this.peso = peso;
	}
	
	public abstract double calculaPrecoProduto();

	public String getNome() {
		return nome;
	}

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
