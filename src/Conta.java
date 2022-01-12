public class Conta {
	private double saldo; //= 100; //Ao abrir uma conta o saldo j� � 100. PRIVADO, n�o pode ser lido nem modificado a n�o ser dentro da pr�pria classe.
	int agencia;
	int numero;
	Cliente titular;	// = new Cliente(); // Se quiser, toda vez que der um new conta abre um novo cliente, ou seja, ao abrir uma conta cria um novo cliente. Desta forma n�o precisa inici�-la posteeiormente.
	
	public void deposita(double valor) { //void ap�s deposita n�o � devolvido nada!CRIA��O DE M�TODO.
		this.saldo += + valor; //this se refere a esta conta(que chamou e m�todo), o this � opcional.
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