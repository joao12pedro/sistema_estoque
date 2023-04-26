package sistema_estoque;
import java.util.*;

public class Lista {
	private String nome;
	private List<Produto> produtos;
	
	public Lista(String nome) {
		this.nome = nome;
		produtos = new ArrayList<Produto>();
		
	}
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	public List<Produto> retornaProdutos(){
		return produtos;
	}
	

}
