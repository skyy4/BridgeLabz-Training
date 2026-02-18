package practice1;
	
import java.util.*;

public class Vessel {
	private String vesselId;
	private String vesselName;
	private double averageSpeed;
	private String vesselType;
	
	
	public Vessel(String vesselId,String vesselName,double averageSpeed,String vesselType) {
		this.vesselId = vesselId;
		this.vesselName= vesselName;
		this.averageSpeed= averageSpeed;
		this.vesselType= vesselType;
		
	}
	
	public String getId() {
		return vesselId;
	}
	

	public String getName() {
		return vesselName;
	}
	

	public double getSpeed() {
		return averageSpeed;
	}
	

	public String getType() {
		return vesselType;
	}
	
	
	public void setId(String vesselId) {
		this.vesselId = vesselId;
	}
	
	public void setName(String vesselName) {
		this.vesselName = vesselName;
	}
	
	public void setSpeed(double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	
	public void setType(String vesselType) {
		this.vesselType = vesselType;
	}
	
}
	




