package com.P2LP2.Dominio;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Filme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    private String categoria;
    private String titulo;
    private String dateDeLancamento;
    
    @ManyToOne (optional = false)
    @JoinColumn(name = "Filmes_Id")
    private Locadora locadora;
    
    public Filme() {}

	public Filme(String categoria, String titulo, String dateDeLancamento) {
		super();
		this.categoria = categoria;
		this.titulo = titulo;
		this.dateDeLancamento = dateDeLancamento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDateDeLancamento() {
		return dateDeLancamento;
	}

	public void setDateDeLancamento(String dateDeLancamento) {
		this.dateDeLancamento = dateDeLancamento;
	}
}