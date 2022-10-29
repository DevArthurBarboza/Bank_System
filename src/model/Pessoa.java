package model;

import java.util.*;


public class Pessoa{


    protected String nom_pessoa;
    protected String end_pessoa;
    protected long cep_pessoa;
    protected String tel_pessoa;
    protected double renda_pessoa;
    protected int sit_pessoa;
	protected String getNom_pessoa() {
		return nom_pessoa;
	}
	protected void setNom_pessoa(String nom_pessoa) {
		this.nom_pessoa = nom_pessoa;
	}
	protected String getEnd_pessoa() {
		return end_pessoa;
	}
	protected void setEnd_pessoa(String end_pessoa) {
		this.end_pessoa = end_pessoa;
	}
	protected long getCep_pessoa() {
		return cep_pessoa;
	}
	protected void setCep_pessoa(long cep_pessoa) {
		this.cep_pessoa = cep_pessoa;
	}
	protected String getTel_pessoa() {
		return tel_pessoa;
	}
	protected void setTel_pessoa(String tel_pessoa) {
		this.tel_pessoa = tel_pessoa;
	}
	protected double getRenda_pessoa() {
		return renda_pessoa;
	}
	protected void setRenda_pessoa(double renda_pessoa) {
		this.renda_pessoa = renda_pessoa;
	}
	protected int getSit_pessoa() {
		return sit_pessoa;
	}
	protected void setSit_pessoa(int sit_pessoa) {
		this.sit_pessoa = sit_pessoa;
	}
}