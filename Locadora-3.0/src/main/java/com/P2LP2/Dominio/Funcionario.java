package com.P2LP2.Dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer Id;
	private String funcao;
	private int codigo;
    private String nome;
    
    @ManyToOne (optional = false)
    @JoinColumn(name = "Funcionarios_Id")
    private Locadora locadora;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario")
	private List<ClienteComum> clientes;
    
    public Funcionario(){}

	public Funcionario(String funcao, int codigo, String nome) {
		super();
		this.funcao = funcao;
		this.codigo = codigo;
		this.nome = nome;
		this.clientes = new ArrayList<ClienteComum>();	
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<ClienteComum> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteComum> clientes) {
		this.clientes = clientes;
	}
}    
