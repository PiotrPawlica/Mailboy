package resources;

/**
 * 
 * Bazowa klasa zasobu. Zawiera podstawowe pola: id, title i owner.
 *
 */
public class Resource {
	//identyfikator zasobu (w przyszłości zmienimy typ na String)
	private int id;
	//tytuł (nazwa) zasobu
	private String title;
	//wlaściciel (twórca) zasobu
	private String owner;

	/*
	 * Konstruktory
	 */
	public Resource() {
	}
	
	public Resource(int id, String title, String owner) {
		this.id = id;
		setTitle(title);		//zamiast: this.title = title;
		setOwner(owner);		//zamiast: this.owner = owner; 
	}
	
	/*
	 * Gettery i settery
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// Metody set i get dla pól title i owner są oznaczone jako finalne (final)
	// Dzięki temu nie można ich przesłonić (co jest w tym przypadku zaletą).
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		if (isCorrect(title)) {
			this.title = title;
		} else {
			throw new IllegalArgumentException("Pole title nie może być puste.");		
		}
	}
	public final String getOwner() {
		return owner;
	}
	public final void setOwner(String owner) {
		if (isCorrect(owner)) {
			this.owner = owner;
		} else {
			throw new IllegalArgumentException("Pole owner nie może być puste.");		
		}
	}
	
	/*
	 * Prywatna metoda sprawdzająca poprawność przekazywanych danych (String).
	 * Jest używana w setTitle() i setOwner().
	 */
	private boolean isCorrect(String s) {
		if ((s != null) && !s.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * toString()
	 * Przesłaniamy metodę toString() z klasy Object,
	 * by zwracała łańcuch opisujący stan obiektu klasy Resource.
	 */
	@Override
	public String toString() {
		//pobieramy prostą nazwę klasy obiektu, na którym jest wywoływana metoda toString()
		String s = getClass().getSimpleName();
		//uzupełniamy o pary nazwa pola-wartość
		s += "\n  id: "+id;
		s += "\n  title: "+title;
		s += "\n  owner: "+owner;		
		return s;
	}
	
}
