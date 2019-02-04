package com.P2LP2.Dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer Id;

	private String filmeDesejado;
	private String dataReserva;
	
	@ManyToOne (optional = false)
    @JoinColumn(name = "Reserva_Id")
    private ClienteComum clientecomum;
	
	public Reserva() {}
	
	public Reserva(String filmeDesejado, String dataReserva) {
		super();
		this.filmeDesejado = filmeDesejado;
		this.dataReserva = dataReserva;
	}

	public String getFilmeDesejado() {
		return filmeDesejado;
	}

	public void setFilmeDesejado(String filmeDesejado) {
		this.filmeDesejado = filmeDesejado;
	}

	public String getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}
	
}