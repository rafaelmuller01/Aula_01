package aula04;

import java.util.*;

public class Principal {
	public static void main(String[] args) {

		poupanca poup01 = new poupanca(1789, 756.90f, 15);

		poupanca poup02 = new poupanca(12174, 241.95f, 02);

		especial espec01 = new especial(3441, 10522.00f, 50000.00f);

		especial espec02 = new especial(2049, 5840.05f, 7000.00f);
		
		System.out.println(poup01.retornaConta());
		System.out.println(poup02.retornaConta());
		System.out.println(espec01.retornaConta());
		System.out.println(espec02.retornaConta());
		
		boolean valor;

		valor = poup01.debitaSaldo((float)110.00);

		if (valor = true) {
			System.out.println("Valor debitado");
		} else {
			System.out.println("Valor não debitado devido a falta de saldo");
		}
		
		valor = espec01.debitaSaldo((float) 50000.00);
		if (valor = true) {
			System.out.println("Valor debitado");
		} else {
			System.out.println("Valor não debitado devido a falta de saldo");
		  }
		
		System.out.println(poup01.retornaConta());
		System.out.println(espec01.retornaConta());
	}
}
