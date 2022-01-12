
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		//System.out.println(contaDaMarcela.saldo);
		
		contaDaMarcela.titular = new Cliente();//outra forma de referenciar o titular a cliente.
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		contaDaMarcela.deposita(10);
		System.out.println(contaDaMarcela.getsaldo());
 		
	}
}
