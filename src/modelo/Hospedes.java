package modelo;

public class Hospedes {
	
	private int id;
	private String nome;
	private String sobrenome;
	private int dataNascimento;
	private String nacionalidade;
	private int idReserva;
	
	
	public Hospedes(String nome, String sobrenome, int dataNascimento, String nacionalidade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
	}


	public int getId() {
		return id;
	}


	public int getIdReserva() {
		return idReserva;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public int getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	
	
	
}
