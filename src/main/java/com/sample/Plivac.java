package com.sample;

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
	public Disciplina disciplina;
	
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
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {

		return getDisciplina().ListDiscipline();
	}
	public Plivac() {
		super();
		this.disciplina = new Disciplina();
	}
	
	
	
}