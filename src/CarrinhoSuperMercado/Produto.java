package CarrinhoSuperMercado;

public class Produto implements Comparable<Produto> {
	
	private String nome;
	private double precoBase;
	private int quantidade;
	private double peso;
	private Calculadora calculaPreco;
	
	public Produto(String nome, double precoBase, int quantidade, double peso){
		this.nome = nome;
		this.precoBase = precoBase;
		this.quantidade = quantidade;
		this.peso = peso;
	}
	
	public double calculaPrecoProduto(String tipo){
		if (tipo.equals("no peso")){
			calculaPreco = new CalculaProdutoNoPeso(precoBase, quantidade, peso);
		}
		if (tipo.equals("na quantidade")){
			calculaPreco = new CalculaProdutoNaQuantidade(precoBase, quantidade, peso);
		}
		
		return calculaPreco.calculaPrecoProduto();
	}

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

	@Override
	public int compareTo(Produto outroProduto) {
		return this.nome.compareTo(outroProduto.getNome());
	}
}
