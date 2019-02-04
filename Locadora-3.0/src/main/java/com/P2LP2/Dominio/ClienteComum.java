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
public class ClienteComum {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    private String nome;
    private String telefone;
    
    @ManyToOne (optional = false)
    @JoinColumn(name = "Clientes_Id")
    private Funcionario funcionario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientecomum")
	private List<Emprestimo> emprestimos;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientecomum")
	private List<Reserva> reservas;
    
    public ClienteComum( ) {}
    
	public ClienteComum(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.emprestimos = new ArrayList<Emprestimo>();
		this.reservas = new ArrayList<Reserva>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
}	