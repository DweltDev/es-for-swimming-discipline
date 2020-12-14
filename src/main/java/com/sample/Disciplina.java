package com.sample;

public class Disciplina {

	private boolean kraul = true;
	private boolean prsno = true;
	private boolean ledjno = true;
	private boolean delfin = true;
	private boolean mesovito = true;
	private boolean triatlon = true;
	private boolean stafeta = true;
	
	private boolean kratkaDisciplina = true;
	private boolean srednjaDisciplina = true;
	private boolean dugaDisciplina = true;
	private boolean maraton = true;
	
	
	public boolean isKraul() {
		return kraul;
	}


	public void setKraul(boolean kraul) {
		this.kraul = kraul;
	}


	public boolean isPrsno() {
		return prsno;
	}


	public void setPrsno(boolean prsno) {
		this.prsno = prsno;
	}


	public boolean isLedjno() {
		return ledjno;
	}


	public void setLedjno(boolean ledjno) {
		this.ledjno = ledjno;
	}


	public boolean isDelfin() {
		return delfin;
	}


	public void setDelfin(boolean delfin) {
		this.delfin = delfin;
	}


	public boolean isMesovito() {
		return mesovito;
	}


	public void setMesovito(boolean mesovito) {
		this.mesovito = mesovito;
	}


	public boolean isKratkaDisciplina() {
		return kratkaDisciplina;
	}


	public void setKratkaDisciplina(boolean kratkaDisciplina) {
		this.kratkaDisciplina = kratkaDisciplina;
	}


	public boolean isSrednjaDisciplina() {
		return srednjaDisciplina;
	}


	public void setSrednjaDisciplina(boolean srednjaDisciplina) {
		this.srednjaDisciplina = srednjaDisciplina;
	}


	public boolean isDugaDisciplina() {
		return dugaDisciplina;
	}


	public void setDugaDisciplina(boolean dugaDisciplina) {
		this.dugaDisciplina = dugaDisciplina;
	}


	public boolean isMaraton() {
		return maraton;
	}


	public void setMaraton(boolean maraton) {
		this.maraton = maraton;
	}


	public boolean isTriatlon() {
		return triatlon;
	}


	public void setTriatlon(boolean triatlon) {
		this.triatlon = triatlon;
	}
	
	public boolean isStafeta() {
		return stafeta;
	}


	public void setStafeta(boolean stafeta) {
		this.stafeta = stafeta;
	}


	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Disciplina))
		return false;
		
		Disciplina d = (Disciplina)obj;
		return d.kraul == this.kraul && d.prsno == this.prsno && d.ledjno == this.ledjno && d.delfin == this.delfin && d.mesovito == this.mesovito
				&& d.kratkaDisciplina == this.kratkaDisciplina && d.srednjaDisciplina == this.srednjaDisciplina && d.dugaDisciplina == this.dugaDisciplina
				&& d.maraton == this.maraton && d.triatlon == this.triatlon;
	}
	
	public String ListDiscipline() {
		String rezultat = "Plivacu se preporucuju sledece discipline: ";
		if(this.kraul) {
			if(this.kratkaDisciplina) rezultat+="50m,100m kraul, ";
			if(this.srednjaDisciplina) rezultat+="200m,400m kraul, ";
			if(this.dugaDisciplina) rezultat+="800m,1500m kraul, ";
			if(this.maraton) rezultat+="5km,10km,15km kraul maraton, ";
		}
		if(this.prsno) {
			if(this.kratkaDisciplina) rezultat+="50m,100m prsno, ";
			if(this.srednjaDisciplina) rezultat+="200m prsno, ";
		}
		if(this.ledjno) {
			if(this.kratkaDisciplina) rezultat+="50m,100m ledjno, ";
			if(this.srednjaDisciplina) rezultat+="200m ledjno, ";
		}
		if(this.delfin) {
			if(this.kratkaDisciplina) rezultat+="50m,100m delfin, ";
			if(this.srednjaDisciplina) rezultat+="200m delfin, ";
		}
		if(this.mesovito) {
			if(this.kratkaDisciplina) rezultat+="100m,200m mesovito, ";
			if(this.srednjaDisciplina) rezultat+="400m mesovito, ";
		}
		if(this.triatlon) {
			if(this.srednjaDisciplina) rezultat+="triatlon sa plivanjem 800m,1500m, ";
			if(this.dugaDisciplina) rezultat+="triatlon sa plivanjem 2km,4km, ";
		}
		if(this.stafeta) {
			rezultat+="4x50m stafetna trka ";
		}
		
		return rezultat;
	}
	
	public boolean NemaOdgovarajuceDiscipline() {
		return !this.kraul && !this.prsno && !this.ledjno &&!this.delfin && !this.mesovito && !this.triatlon;
	}
}
