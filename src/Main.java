import resources.*;

public class Main {

	public static void main(String[] args) {

		Resource o1 = new Resource(1, "Zasób", "ja");

		//Tworzymy obiekt bazy danych zasobów
		ResDB db = new ResDB();
		
		//Zasoby dodajemy metodą addResource()
		db.addResource(o1);
		db.addResource(new Resource(12, "Zasób", "ktoś"));
		db.addResource(new TextResource(3456, "Notatka 2", "on"));
		
		//Metoda getResById służy do wyszukiwania zasobu o określonym identyfikatorze
		Resource o = db.getResById(2);
		
		//Stała Resource.NULL oznacza brak zasobu
		if (o == Resource.NULL) {
			System.out.println("Nie znalazłem zasobu.");
		}
		System.out.println(o);
		
	}

}
