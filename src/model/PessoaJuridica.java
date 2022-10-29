package model;

import java.util.*;

public class PessoaJuridica extends Pessoa{

    private long cnpj_pessoa;

	protected long getCnpj_pessoa() {
		return cnpj_pessoa;
	}

	protected void setCnpj_pessoa(long cnpj_pessoa) {
		this.cnpj_pessoa = cnpj_pessoa;
	}

}