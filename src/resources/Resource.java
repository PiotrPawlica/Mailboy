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
		this.title = title;
		this.owner = owner;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
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
