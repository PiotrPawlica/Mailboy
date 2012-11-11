package resources;

public class NullResource extends Resource {

	/*
	 * toString()
	 * Przesłaniamy metodę toString() z klasy Object,
	 * by zwracała łańcuch opisujący stan obiektu klasy Resource.
	 */
	@Override
	public String toString() {
		//pobieramy prostą nazwę klasy obiektu, na którym jest wywoływana metoda toString()
		String s = getClass().getSimpleName();
		//uzupełniamy o komunikat
		s += " <brak zasobu>";
		return s;
	}
}
