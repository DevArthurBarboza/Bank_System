package model;

import java.util.*;

public class ContaComum{

    protected long nro_conta;
    protected Date dt_abertura;
    protected Date dt_encerramento;
    protected int situacao = 1;
    protected int senha;
    protected double saldo = 0;
	protected long getNro_conta() {
		return nro_conta;
	}
	protected void setNro_conta(long nro_conta) {
		this.nro_conta = nro_conta;
	}
	protected Date getDt_abertura() {
		return dt_abertura;
	}
	protected void setDt_abertura(Date dt_abertura) {
		this.dt_abertura = dt_abertura;
	}
	protected Date getDt_encerramento() {
		return dt_encerramento;
	}
	protected void setDt_encerramento(Date dt_encerramento) {
		this.dt_encerramento = dt_encerramento;
	}
	protected int getSituacao() {
		return situacao;
	}
	protected void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	protected int getSenha() {
		return senha;
	}
	protected void setSenha(int senha) {
		this.senha = senha;
	}
	protected double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}