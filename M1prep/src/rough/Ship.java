package rough;

public class Ship {
	private String shipId;
	private String shipName;
	private double speed;
	
	
	public Ship(String shipId , String shipName, double speed) {
		this.shipId=shipId;
		this.shipName = shipName;
		this.speed= speed;		

}
	
	
	public String getShipId() {
		return shipId;
	}
	
	public String getShipName() {
		return shipName;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	
	public void setShipId(String shipId) {
		this.shipId = shipId;
	}


	public void setShipName(String shipName) {
		this.shipName = shipName;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	
	
	
}

