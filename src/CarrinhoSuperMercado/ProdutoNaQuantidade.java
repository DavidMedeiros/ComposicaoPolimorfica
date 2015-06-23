package CarrinhoSuperMercado;

public class ProdutoNaQuantidade extends Produto {

	public ProdutoNaQuantidade(String nome, double precoBase, int quantidade, double peso) {
		super(nome, precoBase, quantidade, peso);
	}

	@Override
	public double calculaPrecoProduto() {
		return getQuantidade() * getPrecoBase();
	}

}
