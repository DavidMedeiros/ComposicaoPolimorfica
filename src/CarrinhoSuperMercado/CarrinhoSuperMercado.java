package CarrinhoSuperMercado;

import java.util.ArrayList;
import java.util.List;
	
public class CarrinhoSuperMercado {
	private List<Produto> listaDeProdutos;
	
	public CarrinhoSuperMercado() {
		listaDeProdutos = new ArrayList<Produto>();
	}
	
	public void adicionaProduto(Produto produto) {
		listaDeProdutos.add(produto);
	}
	
	public void removeProduto(String nomeProduto) {
		for (Produto produto : listaDeProdutos) {
			if (nomeProduto.equals(produto.getNome())){
				listaDeProdutos.remove(produto);
			}
		}
	}
	
	public Produto buscaProdutoMaisPesado() {
		
		Produto produtoDeMaiorPeso = listaDeProdutos.get(0);
		
		for (Produto produto : listaDeProdutos) {
			if (produto.getPeso() > produtoDeMaiorPeso.getPeso()) {
				produtoDeMaiorPeso = produto;
			}
		}
		
		return produtoDeMaiorPeso;
	}
	
	public Produto buscaProdutoEmMaiorQuantidade() {
		
		Produto produtoEmMaiorQuantidade = listaDeProdutos.get(0);
		
		for (Produto produto : listaDeProdutos) {
			if (produto.getQuantidade() > produtoEmMaiorQuantidade.getQuantidade()) {
				produtoEmMaiorQuantidade = produto;
			}
		}
		
		return produtoEmMaiorQuantidade;
	}
	
	public double precoTotalCarrinho() {
		
		double precoTotal = 0;
		
		for (Produto produto : listaDeProdutos) {
			precoTotal = precoTotal + produto.calculaPrecoProduto();
		}
		
		return precoTotal;
	}
	
}
