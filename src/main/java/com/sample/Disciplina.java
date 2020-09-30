package com.sample;

public class Disciplina {

	private String duzina;
	private String tipDuzine;
	private String tehnika;
	
	public String getDuzina() {
		return duzina;
	}
	public void setDuzina(String duzina) {
		this.duzina = duzina;
	}
	public String getTipDuzine() {
		return tipDuzine;
	}
	public void setTipDuzine(String tipDuzine) {
		this.tipDuzine = tipDuzine;
	}
	public String getTehnika() {
		return tehnika;
	}
	public void setTehnika(String tehnika) {
		this.tehnika = tehnika;
	}
	
	public Disciplina(String duzina, String tipDuzine, String tehnika){
		this.duzina = duzina;
		this.tipDuzine = tipDuzine;
		this.tehnika = tehnika;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Disciplina))
		return false;
		
		Disciplina d = (Disciplina)obj;
		return d.duzina == this.duzina && d.tehnika == this.tehnika && d.tipDuzine == this.tipDuzine;
	}
	
	
}
