package model;

import java.util.*;


public class PessoaFisica extends Pessoa{

    private long cpf_pessoa;
    private long rg_pessoa;
	protected long getCpf_pessoa() {
		return cpf_pessoa;
	}
	protected void setCpf_pessoa(long cpf_pessoa) {
		this.cpf_pessoa = cpf_pessoa;
	}
	protected long getRg_pessoa() {
		return rg_pessoa;
	}
	protected void setRg_pessoa(long rg_pessoa) {
		this.rg_pessoa = rg_pessoa;
	} 
}