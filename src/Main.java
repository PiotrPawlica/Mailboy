import java.util.ArrayList;
import java.util.regex.Pattern;

import resources.*;

public class Main {

	public static void main(String[] args) {

		Resource o1 = new Resource(1, "Zasób", "ja");

		//Tworzymy obiekt bazy danych zasobów
		ResDB db = new ResDB();
		
		//Zasoby dodajemy metodą addResource()
		db.addResource(o1);
		db.addResource(new Resource(12, "Nowy zasób", "ktoś"));
		db.addResource(new TextResource(3456, "Notatka 7", "on"));
		
		ArrayList<Resource> list = new ArrayList<Resource>();
		list = db.getResByTitle(".*zasób.*");
		for (Resource o : list) {
			System.out.println(o);
		}
		
	}

}
