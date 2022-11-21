package web;

public class creditModel {
	
	private double capital ;
	private double taux;
	private int duree;
	private double mesualite;
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getMesualite() {
		return mesualite;
	}
	public void setMesualite(double mesualite) {
		this.mesualite = mesualite;
	}
	public creditModel() {
		
	}
	public creditModel(double capital, double taux, int duree,double mesualite) {
		super();
		this.capital = capital;
		this.taux = taux;
		this.duree = duree;
		this.mesualite=mesualite;
	}
	
	

}
