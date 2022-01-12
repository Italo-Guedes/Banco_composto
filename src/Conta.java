public class Conta {
	private double saldo; //= 100; //Ao abrir uma conta o saldo já é 100. PRIVADO, não pode ser lido nem modificado a não ser dentro da própria classe.
	int agencia;
	int numero;
	Cliente titular;	// = new Cliente(); // Se quiser, toda vez que der um new conta abre um novo cliente, ou seja, ao abrir uma conta cria um novo cliente. Desta forma não precisa iniciá-la posteeiormente.
	
	public void deposita(double valor) { //void após deposita não é devolvido nada!CRIAÇÃO DE MÉTODO.
		this.saldo += + valor; //this se refere a esta conta(que chamou e método), o this é opcional.
	}
	
	public boolean saca(double valor) {//retorna um valor booleano.
		if(this.saldo >= valor) { //&& valor != 0) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);//ou destino.saldo += valor;
			return true;
		}
		return false;
		
	}
	
	public double getsaldo() {
		return this.saldo;
	}
}