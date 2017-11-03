package br.uninove.entidade;

public class Filme {
	private Integer id;
	private String filme;
	private String genero;
	private String classificacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFilme() {
		return filme;
	}
	public void setFilme(String filme) {
		this.filme = filme;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

}
