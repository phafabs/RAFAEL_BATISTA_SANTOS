package com.P2LP2.Dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
    private String clienteLocacao;
    private String data_dev;
    private String data_emp;
    private String filmesEmprestados;
    
    @ManyToOne (optional = false)
    @JoinColumn(name = "Emprestimo_Id")
    private ClienteComum clientecomum;
    
    public Emprestimo( ) {}
    
	public Emprestimo(String clienteLocacao, String data_dev, String data_emp, String filmesEmprestados) {
		super();
		this.clienteLocacao = clienteLocacao;
		this.data_dev = data_dev;
		this.data_emp = data_emp;
		this.filmesEmprestados = filmesEmprestados;
	}

	public String getClienteLocacao() {
		return clienteLocacao;
	}

	public void setClienteLocacao(String clienteLocacao) {
		this.clienteLocacao = clienteLocacao;
	}

	public String getData_dev() {
		return data_dev;
	}

	public void setData_dev(String data_dev) {
		this.data_dev = data_dev;
	}

	public String getData_emp() {
		return data_emp;
	}

	public void setData_emp(String data_emp) {
		this.data_emp = data_emp;
	}

	public String getFilmesEmprestados() {
		return filmesEmprestados;
	}

	public void setFilmesEmprestados(String filmesEmprestados) {
		this.filmesEmprestados = filmesEmprestados;
	}
}    
