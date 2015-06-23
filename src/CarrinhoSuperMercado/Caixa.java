package CarrinhoSuperMercado;

public class Caixa {

	public static void main(String[] args) {
	CarrinhoSuperMercado carrinho = new CarrinhoSuperMercado();
	
	Produto produto1 = new Produto("sabonete", 10, 3, 50);
	Produto produto2 = new Produto("shampoo", 20, 4, 50);
	Produto produto3 = new Produto("feijao", 5, 10, 1000);
	Produto produto4 = new Produto("arroz", 4, 11, 1000);
	
	carrinho.adicionaProduto(produto1);
	carrinho.adicionaProduto(produto2);
	carrinho.adicionaProduto(produto3);
	carrinho.adicionaProduto(produto4);
	
	System.out.println("Produto em maior quantidade: " + carrinho.buscaProdutoEmMaiorQuantidade());
	System.out.println("Produto mais pesado: " + carrinho.buscaProdutoMaisPesado());
	System.out.println("");
	
	System.out.println("Total do carrinho por calculo em quantidade: R$ " + carrinho.precoTotalCarrinho("em quantidade"));
	System.out.println("Total do carrinho por calculo no peso: R$ " + carrinho.precoTotalCarrinho("no peso"));
	
	System.out.println("");
	System.out.println("Lista não ordenada: " + carrinho.getListaDeProdutos());
	
	carrinho.ordenaProdutosPeloNome();
	
	System.out.println("Lista ordenada pelos nomes dos produtos: " + carrinho.getListaDeProdutos());
	}
}
