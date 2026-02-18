package rough;
import java.util.*;

public class ShipUtil {
	private List<Ship> shipList = new ArrayList<>();

	public List<Ship> getShipList() {
		return shipList;
	}

	public void setShipList(List<Ship> shipList) {
		this.shipList = shipList;
	}
	
	public void addShip(Ship ship) {
		shipList.add(ship);
		
	}
	
	
	public  Ship findShip(String shipId) {
		for(Ship s : shipList) {
			if(s.getshipId().equals(shipId)) {
				return s;
			}
		}
		return null;
		
	}
	
	public List<Ship> findFastestShip(){
		List<Ship> result = new ArrayList<>();
		double max = 0;
		for(Ship s : shipList) {
			if(s.getSpeed()>max){
				max = s.getSpeed();
				
			}
		}
		
		for(Ship s : shipList) {
			if(s.getSpeed()==max) {
				result.add(s);
			}
		}
		
		return result;
	}
	
	
	
	

}
