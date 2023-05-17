package modelo;

public class Reservas {

	private int id;
	private int dataEntrada;
	private int dataSaida;
	private int valor;
	private String formaPagamento;
	
	
	public Reservas(int dataEntrada, int dataSaida, int valor, String formaPagamento) {
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




	public int getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(int dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public int getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(int dataSaida) {
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
