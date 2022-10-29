package model;

import java.sql.Time;
import java.util.*;

public class Movimento {
    protected int getTipo_mov() {
		return tipo_mov;
	}
	protected void setTipo_mov(int tipo_mov) {
		this.tipo_mov = tipo_mov;
	}
	protected Date getDt_mov() {
		return dt_mov;
	}
	protected void setDt_mov(Date dt_mov) {
		this.dt_mov = dt_mov;
	}
	protected Time getHor_mov() {
		return hor_mov;
	}
	protected void setHor_mov(Time hor_mov) {
		this.hor_mov = hor_mov;
	}
	protected double getVal_mov() {
		return val_mov;
	}
	protected void setVal_mov(double val_mov) {
		this.val_mov = val_mov;
	}
	private int tipo_mov;
    private Date dt_mov;
    private Time hor_mov;
    private double val_mov;
}