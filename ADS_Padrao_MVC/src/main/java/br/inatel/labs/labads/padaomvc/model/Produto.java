package br.inatel.labs.labads.padaomvc.model;

public class Produto {
	private long id;
	private String descricao;
	private Double preco;
	
	public Produto(long id, String descricao, Double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getPreco() {
		return preco;
	}
	
	
}
