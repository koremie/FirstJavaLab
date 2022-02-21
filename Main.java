package ua.lviv.iot.firstLab;

public class Main {

	public static void main(String[] args) {
		Stadium first = new Stadium("Bernabeu", "Chamartin, Madrid, Spain", 81044, 80560, 112000, 7140);
		Stadium second = new Stadium("Camp Nou", "Barcelona, Catalonia, Spain", 99354);
		Stadium third = new Stadium();
		
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println(third.toString());
		System.out.println("the stadium is " + (Stadium.getIsOutdoor()?"outdoor":"indoor"));
	}
}