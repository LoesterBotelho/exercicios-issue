public class MainEx5 {

	public static void main(String[] args) {
	
	    Ex5 produto = new Ex5(
	            "Cimento CP-II",
	            "Saco de cimento 50kg",
	            40.00,
	            50.0,
	            10);
	
	    System.out.println("=== Produto Cadastrado ===");
	    System.out.println("Nome: " + produto.getNome());
	    System.out.println("Descrição: " + produto.getDescricao());
	    System.out.println("Preço: R$ " + produto.getPreco());
	    System.out.println("Peso: " + produto.getPeso() + " kg");
	    System.out.println("Estoque: " + produto.getEstoque());
	
	    // Adiciona 5 unidades
	    produto.adicionarEstoque(5);
	    System.out.println("\nEstoque após adicionar 5 unidades: " + produto.getEstoque());
	
	    // Adiciona 1 unidade (método sem parâmetro)
	    produto.adicionarEstoque();
	    System.out.println("Estoque após adicionar 1 unidade: " + produto.getEstoque());
	
	    // Venda de 3 unidades
	    produto.venderProduto(3);
	    System.out.println("Estoque após venda de 3 unidades: " + produto.getEstoque());
	
	    // Promoção de 20%
	    produto.aplicarPromocao(20);
	    System.out.println("Preço após promoção: R$ " + produto.getPreco());
	
	    }
	
	}