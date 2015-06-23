package CarrinhoSuperMercado;

public class CalculaProdutoNoPeso extends Calculadora {

	public CalculaProdutoNoPeso(double precoBase, int quantidade, double peso) {
		super(precoBase, quantidade, peso);
	}

	@Override
	public double calculaPrecoProduto() {
		return getPeso() * getPrecoBase();
	}
	
}
