package ExercíciosdeHerança;

public class TesteCliente {

	public static void main(String[] args) 
	{
		
		
		Cliente cliente1 = new Cliente ("Ana Oliveira", 218756);
		cliente1.compra();
		//cliente1.setNomeCliente("Maria da Silva");
		//System.out.println(cliente1.getNomeCliente());
		System.out.println(cliente1.getinfo());
	}
}

