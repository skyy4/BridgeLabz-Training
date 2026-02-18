package rough;
import java.util.*;
public class UserInterface {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ShipUtil util = new ShipUtil();
		
		int n = sc.nextInt();
		sc.nextLine();
		 
		for(int i = 0;i<n ;i++) {
			String input = sc.nextLine();
			String [] parts = input.split(":");
			
			Ship s = new Ship(
					parts[0],
					parts[1],
					Double.parseDouble(parts[2])	
					);
			util.addShip(s);
						
		}
		String id = sc.nextLine();
		Ship result = util.findShip(id);
		
		if(result != null) {
		 System.out.println(result.getshipId()+"|"+result.getShipName()+ "|" + result.getSpeed());
		}
		else {
			System.out.println("Ship not found");
		}
		
		List<Ship> fastList = util.findFastestShip();
		
		for(Ship s : fastList ) {
			System.out.println(s.getshipId()+"|"+ s.getShipName()+"|"+s.getSpeed());
		}
		
	
		
		

				
		
	}
	

}
