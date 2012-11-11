import java.util.ArrayList;

import resources.*;

public class Main {

	public static void main(String[] args) {

		// Tworzymy obiekt klasy ResourcesDB
		ResourcesDB resDb = new ResourcesDB();
		
		// ...i dodajemy kilka elementów
		//resDb.addResource(new Resource(...)); ->
		resDb.addResource(1, "Zasób", "ja");
		resDb.addResource(12, "Zasób", "ktoś");
		resDb.addTextResource(3456, "Notatka 2", "on", "bla bla bla...");
				
		resDb.removeResource(11);
		
		for (Resource o : resDb.getFullList()) {
			System.out.println(o);
		}
	
		Resource a = resDb.getResourceById(11);
		System.out.println(a);
		
	}

}
