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
	public void retornaProdutos(){
		for (int i = 0; i < produtos.size(); i++) {
			System.out.println(i+1 + "° produto:" + produtos.get(i).getNome());
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public void exclui(Produto produto) {
		produtos.remove(produto);
		System.out.println("Produto removido:" + produto.getNome());
	}
	public void ordenaNome() {
		Collections.sort(produtos);
		System.out.println("Ordenados por nome:");
		for (int i = 0; i < produtos.size(); i++) {
			System.out.println(i+1 + "° produto:" + produtos.get(i).getNome());
		}
	}
	

}

