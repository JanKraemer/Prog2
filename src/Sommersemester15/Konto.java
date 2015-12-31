package Sommersemester15;

public abstract class Konto {
	private String inhaber;
	private double saldo = 0.0;
	private double zinssatz = 0.0;
	
	public Konto(String inhaber, double saldo, double zinssatz){
		this.inhaber = inhaber;
		this.saldo = saldo;
		this.zinssatz = zinssatz;
	}
	
	protected abstract boolean istBuchungZulaessig(double betrag);
	
	public String toString(){
		return "Inhaber= " + inhaber +
				", Saldo=" + saldo +
				", Zinssatz=" + zinssatz;
	}
	
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public double getZinssatz(){
		return zinssatz;
	}

}
