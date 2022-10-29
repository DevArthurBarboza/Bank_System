package model;

import java.util.*;

public class ContaPoupanca extends ContaComum{

    private Date dt_aniversario;

	protected Date getDt_aniversario() {
		return dt_aniversario;
	}

	protected void setDt_aniversario(Date dt_aniversario) {
		this.dt_aniversario = dt_aniversario;
	} 
}