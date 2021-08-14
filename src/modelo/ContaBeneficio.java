package modelo;

public class ContaBeneficio extends Conta {

	@Override
	public String getTipo() {
		return "Benefício";
	}

	@Override
	public String toString() {
		return "Conta beneficio número " + getNumero();
	}

}
