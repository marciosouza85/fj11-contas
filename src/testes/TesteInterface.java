package testes;

import modelo.Conta;
import modelo.ContaBeneficio;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.SeguroDeVida;
import modelo.Tributavel;

public class TesteInterface {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		Conta c3 = new ContaCorrente();
		Conta c4 = new ContaCorrente();
		Conta c5 = new ContaCorrente();
		Conta c6 = new ContaCorrente();
		c1.setNumero(123);
		c1.setTitular("Carlos");
		System.out.println(c1);
		System.out.println(c1.getTitular());
		
		c1.depositar(100);
		
		ContaCorrente contaCorrente = (ContaCorrente) c1;
		
		System.out.println(contaCorrente.getValorImposto());
		
		contaCorrente.setTitular("Marcos");
		System.out.println("Titular de c1: " + c1.getTitular());
		
		Tributavel tributavel = new ContaCorrente(2000);
		System.out.println(tributavel.getValorImposto());
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		seguroDeVida.setValor(200);
		
		Tributavel tributavel2 = seguroDeVida;
		
		System.out.println(tributavel2.getValorImposto());
		
		System.out.println("Quantidade de contas é "+ Conta.QTD_CONTA);
		
		
	}

}
