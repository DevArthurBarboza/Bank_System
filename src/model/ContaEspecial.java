package model;

import java.util.*;


public class ContaEspecial extends ContaComum{
    private double limite_conta;

	protected double getLimite_conta() {
		return limite_conta;
	}

	protected void setLimite_conta(double limite_conta) {
		this.limite_conta = limite_conta;
	}
}