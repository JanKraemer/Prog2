package Sommersemester15;

public class Hypothekenkonto extends Konto{
	
	public Hypothekenkonto(String inhaber, double saldo, double zinssatz){
		super(inhaber,saldo,zinssatz);
	}

	@Override
	protected boolean istBuchungZulaessig(double betrag) {
		if(betrag < -this.getSaldo())
			return true;
		return false;
	}
	
	public String toString(){
		return "Hypothek " + super.toString();
	}

	public void sondertilgung(double betrag){
		if(istBuchungZulaessig(betrag))
			this.setSaldo(this.getSaldo()+betrag);
		else
			throw new IllegalArgumentException();
		
	}
}
