package resources;

/**
 * 
 * Obiekty klasy TextResource będą przechowywać zasoby tekstowe (np. notatki).
 * Klasa dziedziczy po Resource, którą rozszerzyliśmy o pole text. 
 *
 */
public class TextResource extends Resource {
	
	private String text;

	/*
	 * Konstruktory
	 */
	public TextResource() {
		super();
	}

	public TextResource(int id, String title, String owner) {
		super(id, title, owner);
	}

	/*
	 * Gettery i settery
	 */
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	/*
	 * toString()
	 * Znowu przesłaniamy metodę toString(), by uzupełnić stan obiektu
	 * o pole text.
	 */
	@Override
	public String toString() {
		//wywołujemy metodę toString z klasy nadrzędnej (super)
		String s = super.toString();
		//dodajemy informację o polu text
		s += "\n  text: "+text;
		return s;
	}

	
}
