package task12;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("GODOFWAR");
		arraylist.add("GTAVI");
		arraylist.add("WWE2K23");
		arraylist.add("AC");
		
		System.out.println("List of games: "+ arraylist);
		
		arraylist.clear();
		
		System.out.print("Sold out: "+arraylist);

	}

}
