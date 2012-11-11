import java.util.ArrayList;

import resources.*;

public class Main {

	public static void main(String[] args) {

		// Tworzymy obiekt zasobu
		Resource o1 = new Resource(1, "Zasób", "ja");
		// Demonstracja kodu sprawdzającego poprawność danych (wyjątki)
		try {
			o1.setTitle("");	//próbujemy ustawić pusty tytuł
		// przechwytujemy wyjątek	
		} catch (IllegalArgumentException e) {
			System.out.println("*** Błąd: "+e.getMessage());
		}
		
		//********************* Przechowywanie zasobów *******************************
		
		// Do przechowywania zasobów można użyć tablicy:
		/*
		Resource[] t = new Resource[5];
		t[0] = o1;
		t[1] = new Resource(12, "Zasób", "xxss");
		t[2] = new TextResource(3456, "coś", "on");
		
		// Iterujemy i wypisujemy
		for (int i=0; i<t.length; i++) {
			System.out.println(t[i]);
		}
		*/
		// Tablice mają swoje zalety, ale elastyczność do nich nie należy...
		
		// Tworzymy kolekcję (ArrayList) elementów klasy Resource...
		ArrayList<Resource> list = new ArrayList<Resource>();
		// ...i dodajemy kilka elementów
		list.add(o1);
		list.add(new Resource(12, "Zasób", "ktoś"));
		list.add(new TextResource(3456, "Notatka 2", "on"));
		
		// Do iterowania po kolekcji można podejść "klasycznie":
		//for (int i=0; i<list.size(); i++) {
		//	System.out.println(list.get(i));
		//}
		
		// Lepiej jednak użyć pętli "for each", która w Javie ma taką składnię:
		for (Resource o : list) {
			System.out.println(o);
		}
		
	}

}
