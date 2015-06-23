package CarrinhoSuperMercado;

public class CalculaProdutoNaQuantidade extends Calculadora {
	
	public CalculaProdutoNaQuantidade(double precoBase, int quantidade, double peso) {
		super(precoBase, quantidade, peso);
	}

	@Override
	public double calculaPrecoProduto() {
		return getQuantidade() * getPrecoBase();
	}

}
