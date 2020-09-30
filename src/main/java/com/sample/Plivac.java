package com.sample;

import java.util.LinkedList;
import java.util.List;

public class Plivac {
	
	private boolean eksplozivan = false;
	private boolean fleksibilan = true;
	private boolean perfekcionistaZaTehniku = false;
	private boolean plovan = true;
	private boolean snazan = true;
	private boolean izdrzljiv = true;
	private boolean mentalnoIzdrzljiv = true;
	private boolean voziBiciklITrci = false;
	private int BMI = 30;
	private int visina = 175;
	private String pol = "M";
	private int godine = 16;
	private String starost = "";
	private String kategorijaBMI="";
	private boolean visok= false;
	private boolean nePlivaPrsno = false;
	private boolean plivaUSlanojVodi = false;
	private int brojTreningaNedeljno = 6;
	private int brojGodinaPlivackogStaza = 6;
	
	public boolean isPlivaUSlanojVodi() {
		return plivaUSlanojVodi;
	}
	public void setPlivaUSlanojVodi(boolean plivaUSlanojVodi) {
		this.plivaUSlanojVodi = plivaUSlanojVodi;
	}
	public int getBrojTreningaNedeljno() {
		return brojTreningaNedeljno;
	}
	public void setBrojTreningaNedeljno(int brojTreningaNedeljno) {
		this.brojTreningaNedeljno = brojTreningaNedeljno;
	}
	private List<Disciplina> disciplinaList;
	
	public boolean isEksplozivan() {
		return eksplozivan;
	}
	public void setEksplozivan(boolean eksplozivan) {
		this.eksplozivan = eksplozivan;
	}
	public boolean isFleksibilan() {
		return fleksibilan;
	}
	public void setFleksibilan(boolean fleksibilan) {
		this.fleksibilan = fleksibilan;
	}
	public boolean isPerfekcionistaZaTehniku() {
		return perfekcionistaZaTehniku;
	}
	public void setPerfekcionistaZaTehniku(boolean perfekcionistaZaTehniku) {
		this.perfekcionistaZaTehniku = perfekcionistaZaTehniku;
	}
	public boolean isPlovan() {
		return plovan;
	}
	public void setPlovan(boolean plovan) {
		this.plovan = plovan;
	}
	public boolean isSnazan() {
		return snazan;
	}
	public void setSnazan(boolean snazan) {
		this.snazan = snazan;
	}
	public boolean isIzdrzljiv() {
		return izdrzljiv;
	}
	public void setIzdrzljiv(boolean izdrzljiv) {
		this.izdrzljiv = izdrzljiv;
	}
	public boolean isMentalnoIzdrzljiv() {
		return mentalnoIzdrzljiv;
	}
	public void setMentalnoIzdrzljiv(boolean mentalnoIzdrzljiv) {
		this.mentalnoIzdrzljiv = mentalnoIzdrzljiv;
	}
	public boolean isVoziBiciklITrci() {
		return voziBiciklITrci;
	}
	public void setVoziBiciklITrci(boolean voziBiciklITrci) {
		this.voziBiciklITrci = voziBiciklITrci;
	}
	public int getBMI() {
		return BMI;
	}
	public void setBMI(int bMI) {
		BMI = bMI;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}

	public List<Disciplina> getDisciplinaList() {
		return disciplinaList;
	}
	public void setDisciplinaList(List<Disciplina> disciplinaList) {
		this.disciplinaList = disciplinaList;
	}
	
	public String toString(){
		String preporuka = "";
		if (disciplinaList.size()==0) {
			return "Nema preporuka za ovog plivaca";
		}
		for (Disciplina disciplina : disciplinaList) {
			preporuka += "Plivacu se preporucuje "+disciplina.getTipDuzine()+"disciplina, tacnije "+disciplina.getDuzina()+" "+disciplina.getTehnika()+" stilom.\n";
		}
		return preporuka;
	}
	
	public Plivac(){
		disciplinaList = new LinkedList<Disciplina>();
		disciplinaList.add(new Disciplina("50,100m","kratka","kraul"));
		disciplinaList.add(new Disciplina("50,100m","kratka","prsno"));
		disciplinaList.add(new Disciplina("200m","srednja","prsno"));
		disciplinaList.add(new Disciplina("50,100m","kratka","ledjno"));
		disciplinaList.add(new Disciplina("200m","srednja","ledjno"));
		disciplinaList.add(new Disciplina("50m","kratka","delfin"));
		disciplinaList.add(new Disciplina("100,200m","srednja","delfin"));
		disciplinaList.add(new Disciplina("200,400m","srednja","kraul"));
		disciplinaList.add(new Disciplina("800,1500m","duga","kraul"));
		disciplinaList.add(new Disciplina("100,200","kratka","mesovito"));
		disciplinaList.add(new Disciplina("400m","srednja","mesovito"));
		disciplinaList.add(new Disciplina("5,10,15km","maraton","kraul"));
		disciplinaList.add(new Disciplina("800,1500m","srednja","triatlon"));
		disciplinaList.add(new Disciplina("2,4km","dugi","triatlon"));
	}
	public String getStarost() {
		return starost;
	}
	public void setStarost(String starost) {
		this.starost = starost;
	}
	public String getKategorijaBMI() {
		return kategorijaBMI;
	}
	public void setKategorijaBMI(String kategorijaBMI) {
		this.kategorijaBMI = kategorijaBMI;
	}
	public boolean isVisok() {
		return visok;
	}
	public void setVisok(boolean visok) {
		this.visok = visok;
	}
	public boolean isNePlivaPrsno() {
		return nePlivaPrsno;
	}
	public void setNePlivaPrsno(boolean nePlivaPrsno) {
		this.nePlivaPrsno = nePlivaPrsno;
	}
	public int getBrojGodinaPlivackogStaza() {
		return brojGodinaPlivackogStaza;
	}
	public void setBrojGodinaPlivackogStaza(int brojGodinaPlivackogStaza) {
		this.brojGodinaPlivackogStaza = brojGodinaPlivackogStaza;
	}
}