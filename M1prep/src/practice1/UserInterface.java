package practice1;

import java.util.*;

public class UserInterface {
   public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		VesselUtil util = new VesselUtil();
		 int  n = sc.nextInt();
		 sc.nextLine();
		 
		 
		 for(int i = 0 ; i<n ; i++) {
			 String input = sc.nextLine();
			 String [] parts = input.split(":");
			 
			 Vessel v = new Vessel(
					 parts[0],
					 parts[1],
					 Double.parseDouble(parts[2]),
					 parts[3]
				 
					 );
			 util.addVesselPerformance(v);
			 				 
		 }
		 
		 String id = sc.nextLine();
		 Vessel result = util.getVesselById(id);
		 
		 if (result != null) {
	            System.out.println(result.getId() + " | " +
	                    result.getName() + " | " +
	                    result.getType() + " | " +
	                    result.getSpeed() + " knots");
	        } else {
	            System.out.println("Vessel Id " + id + " not found.");
	        }
		 
		 List<Vessel> highList = util.getHighPerformanceVessel();

	        for (Vessel v : highList) {
	            System.out.println(v.getId() + " | " +
	                    v.getName() + " | " +
	                    v.getType() + " | " +
	                    v.getSpeed() + " knots");
	        }
	    }
		   
		
		
		
		
		
		
		
		
}

}
