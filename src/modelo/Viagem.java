package modelo;

public class Viagem {
	private int id_viagem;
	private String origem;
	private String destino;
	private String data_de_ida;
	private String data_de_volta;
	private double preco;
	private Cliente cliente;
	
	public Viagem() {
	}

	public Viagem(int id_viagem, String origem, String destino, String data_de_ida, String data_de_volta, double preco,
			Cliente cliente) {
		
		this.id_viagem = id_viagem;
		this.origem = origem;
		this.destino = destino;
		this.data_de_ida = data_de_ida;
		this.data_de_volta = data_de_volta;
		this.preco = preco;
		this.cliente = cliente;
	}


	public int getId_viagem() {
		return id_viagem;
	}


	public void setId_viagem(int id_viagem) {
		this.id_viagem = id_viagem;
	}


	public String getOrigem() {
		return origem;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getData_de_ida() {
		return data_de_ida;
	}


	public void setData_de_ida(String data_de_ida) {
		this.data_de_ida = data_de_ida;
	}


	public String getData_de_volta() {
		return data_de_volta;
	}


	public void setData_de_volta(String data_de_volta) {
		this.data_de_volta = data_de_volta;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	
	public void mostrarViagem() {
		System.out.println("\nViagem: id_viagem=" + id_viagem + ", origem=" + origem + ", destino=" + destino + ", data_de_ida="
				+ data_de_ida + ", data_de_volta=" + data_de_volta + ", preco=" + preco + ", cliente=" + cliente.getNome() + ".");
	}
	
	
	
	
	

}