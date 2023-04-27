package sistema_estoque;
import java.util.*;
public class Produto implements Comparable<Produto> {
	private String nome;
	private String codigo;
	private double preco;
	private int qtd_estoque;
	private List<Produto> produtos;
	
	public Produto(String nome, String codigo, double preco, int qtd_estoque) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.qtd_estoque = qtd_estoque;
		produtos = new ArrayList<Produto>();
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public int compareTo(Produto outroProduto) {
        return this.nome.compareTo(outroProduto.getNome());
    }
	
	
}
