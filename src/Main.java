
public class Main {

	public static void main(String[] args) {
		Cliente adriano = new Cliente();
		adriano.setNome("Adriano");

		Conta cc = new ContaCorrente(adriano);
		cc.depositar(100);

		Conta poupanca = new ContaPoupanca(adriano);
		cc.transferir(80, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
