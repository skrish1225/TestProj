package testPackage;

public class Vehicles {
	
	
	static public void Bicycle() {
		System.out.println("Bike");
	}
	public void Motorbike() {
		System.out.println("Motorbike");
	}
	public void Car() {
		System.out.println("Car");
	}
	public void Bus() {
		System.out.println("Bus");
	}
	
	
	public void Bus(String colour) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Bus");
		
		
	}
	
	public String getVehicleNumberPlate() {
		return vehicleNumberPlate;
	}
	public void setVehicleNumberPlate(String vehicleNumberPlate) {
		this.vehicleNumberPlate = vehicleNumberPlate;
	}

	private String vehicleNumberPlate;
	
	
	
	
}
