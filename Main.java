package sistema_estoque;
public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Celular", "001", 2000.00, 40);
		Produto p2 = new Produto("Notebook", "002", 4000.00, 80);
		Produto p3 = new Produto("Ipad", "003", 2500.00, 50);
		Produto p4 = new Produto("Airpods", "004", 2.600, 10);
		Produto p5 = new Produto("Mouse", "005", 20, 40);
		Lista lista = new Lista("Produtos");
		lista.adicionarProduto(p1);
		lista.adicionarProduto(p2);
		lista.adicionarProduto(p3);
		lista.adicionarProduto(p4);
		lista.adicionarProduto(p5);
		lista.retornaProdutos();
		lista.ordenaNome();
		lista.exclui(p1);
		lista.ordenaNome();
		

	}

}
