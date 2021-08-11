
public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor + 1);
	}

}
