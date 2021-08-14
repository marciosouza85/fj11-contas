package modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(double valor) {
		super();
		super.depositar(valor);
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor + 1);
	}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return getSaldo() * 0.01;
	}

}
