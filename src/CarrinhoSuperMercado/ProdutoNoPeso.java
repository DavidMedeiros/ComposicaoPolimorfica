package CarrinhoSuperMercado;

public class ProdutoNoPeso extends Produto {

	public ProdutoNoPeso(String nome, double precoBase, int quantidade, double peso) {
		super(nome, precoBase, quantidade, peso);
	}

	@Override
	public double calculaPrecoProduto() {
		return getPeso() * getPrecoBase();
	}

}
