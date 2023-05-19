package modelo;

import java.sql.Date;

public class Reservas {

	private int id;
	private Date dataEntrada;
	private Date dataSaida;
	private int valor;
	private String formaPagamento;
	
	
	public Reservas(Date dataEntrada, Date dataSaida, int valor, String formaPagamento) {
		super();
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}


	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Date getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public Date getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	
}
