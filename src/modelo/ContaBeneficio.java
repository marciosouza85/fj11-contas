package modelo;

public class ContaBeneficio extends Conta {

	@Override
	public String getTipo() {
		return "Benef�cio";
	}

	@Override
	public String toString() {
		return "Conta beneficio n�mero " + getNumero();
	}

}
