package Sommersemester15;

public class Sparkonto extends Konto{

	private int kuendigungsfrist;
	
	public Sparkonto(String inhaber, double saldo, double zinssatz, int kuendigungsfrist){
		super(inhaber,saldo, zinssatz);
		this.kuendigungsfrist = kuendigungsfrist;
	}

	@Override
	protected boolean istBuchungZulaessig(double betrag) {
		if(this.getSaldo()>=betrag)
			return true;
		return false;
	}
	
	public double abheben(double gewuenschterBetrag){
		if(!istBuchungZulaessig(gewuenschterBetrag))
			return 0;
		this.setSaldo(this.getSaldo()-gewuenschterBetrag);
		return gewuenschterBetrag;
	}
	public String toString(){
		return "Sparkonto " + super.toString();
	}
}
