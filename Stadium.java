package ua.lviv.iot.firstLab;

public record Stadium(String name, String location, 
					int seatingCapacity, int spectatorsNumber, 
					int lightPower, float fieldArea) {

	private static boolean isOutdoor = true;
	
	public Stadium() {
		this("none", "who knows where", 0);
	}
	
	public Stadium(String name, String location, int seatingCapacity) {
		this(name, location, seatingCapacity, 0, 0, 0);
	}
	
	public static boolean getIsOutdoor() {
		return isOutdoor;
	}
	
	@Override
	public String toString() {
		return "stadium info: (name: " + name + "; location: " + location 
				+ "; seating capacity: " + seatingCapacity + "; spectators number: " + spectatorsNumber 
				+ "; field area: " + fieldArea + " m2" + "; light power: " + lightPower + " lm)";
	}
}