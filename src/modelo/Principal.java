package modelo;

public class Principal {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente(1,"João das Dores", 19, "17.423.695", "158.988.457-58", "Rua Rio Terra", "79587-2545", "joao@gmail.com" );
		joao.mostrar();
		Cliente antonia = new Cliente(2, "Antonia de Castro", 27, "18.023.650", "008.958.057-00", "Rua Darieri", "76667-0046", "antonia@gmail.com"); 
		antonia.mostrar(); 
		Cliente maria = new Cliente(3, "Maria de Oliveira", 39, "00.125.050", "108.908.257.10", "Rua Baretine", "70069-0046", "maria@gmail.com"); 
		maria.mostrar(); 
		Cliente ricardo = new Cliente(4, "Ricardo Santos", 18, "99.066.887", "777.888.257.99", "Rua Midecides", "79998-7788", "ricardo@gmail.com"); 
		ricardo.mostrar();
			
		
		Viagem rioDeJaneiro = new Viagem(1, "Brasilia", "Rio de Janeiro", "25/07/2022", "30/07/2022", 847.99  ,joao);
		rioDeJaneiro.mostrarViagem();
		Viagem rioDeJaneiro1 = new Viagem(2, "Brasilia", "Rio de Janeiro", "25/07/2022", "30/07/2022", 847.99  , antonia);
		rioDeJaneiro1.mostrarViagem();
		Viagem rioDeJaneiro2 = new Viagem(3, "Brasilia", "Rio de Janeiro", "25/07/2022", "30/07/2022", 847.99  ,maria);
		rioDeJaneiro2.mostrarViagem();
		Viagem rioDeJaneiro3 = new Viagem(4, "Brasilia", "Rio de Janeiro", "25/07/2022", "30/07/2022", 847.99  ,ricardo);
		rioDeJaneiro3.mostrarViagem();
		
		
		Viagem beloHorizonte = new Viagem(1, "São Paulo", "Belo Horizonte", "19/10/2022", "24/10/2022", 599.99  ,joao);
		beloHorizonte.mostrarViagem();
		Viagem beloHorizonte1 = new Viagem(2, "São Paulo", "Belo Horizonte", "19/10/2022", "24/10/2022", 599.99  ,antonia);
		beloHorizonte1.mostrarViagem();
		Viagem beloHorizonte2 = new Viagem(3, "São Paulo", "Belo Horizonte", "19/10/2022", "24/10/2022", 599.99  ,maria);
		beloHorizonte2.mostrarViagem();
		Viagem beloHorizonte3 = new Viagem(4, "São Paulo", "Belo Horizonte", "19/10/2022", "24/10/2022", 599.99  ,ricardo);
		beloHorizonte3.mostrarViagem();
		
		Viagem saoPaulo = new Viagem(1, "Gongonhas", "São Paulo", "05/02/2022", "10/02/2022", 799.99  ,joao);
		saoPaulo.mostrarViagem();
		Viagem saoPaulo1 = new Viagem(2, "Gongonhas", "São Paulo", "05/02/2022", "10/02/2022", 799.99  ,antonia);
		saoPaulo1.mostrarViagem();
		Viagem saoPaulo2 = new Viagem(3, "Gongonhas", "São Paulo", "05/02/2022", "10/02/2022", 799.99  ,maria);
		saoPaulo2.mostrarViagem();
		Viagem saoPaulo3 = new Viagem(4, "Gongonhas", "São Paulo", "05/02/2022", "10/02/2022", 799.99  ,ricardo);
		saoPaulo3.mostrarViagem();
	

		System.out.println("\nO Cliente: " + joao.getNome() + " realizará uma viagem para o " + rioDeJaneiro.getDestino() +  " na data de " + rioDeJaneiro.getData_de_ida() + " e voltará na data de " + rioDeJaneiro.getData_de_volta() + ". "  + joao.getNome() + " ficou feliz, pois comprou o pacote da viagem no valor de R$ " + rioDeJaneiro.getPreco() + " . Também realizará viagens para a cidade de "+ beloHorizonte.getDestino() + " e para a cidade de " + saoPaulo.getDestino() ); 
	}

	

}
