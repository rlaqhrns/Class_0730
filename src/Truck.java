
public class Truck {

	int tire;
	double repaire;
	int credit;
	String driver;
	Truck(){
		
	}
	Truck(int tire,double repaire,int credit,String driver){
		this.tire = tire;
		this.repaire = repaire;
		this.credit = credit;
		this.driver = driver;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public double getRepaire() {
		return repaire;
	}
	public void setRepaire(float repaire) {
		this.repaire = repaire;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	
	
	
	
}
