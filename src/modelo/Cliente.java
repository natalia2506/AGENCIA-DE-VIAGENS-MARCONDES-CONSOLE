package modelo;

public class Cliente {
	private int id_cliente;
	private String nome;
	private int idade;
	private String identidade;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	
	
	
	public Cliente() {
	}

	public Cliente(int id_cliente, String nome, int idade, String identidade, String cpf, String endereco,
			String telefone, String email) {
		super();
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.idade = idade;
		this.identidade = identidade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void mostrar() {
		System.out.println(" \nnome=" + nome + ", idade=" + idade + ", identidade="
				+ identidade + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email);
	}


	

	

}
