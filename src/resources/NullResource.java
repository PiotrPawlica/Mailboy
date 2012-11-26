package resources;
/**
 * Obiekty klasy NullResource są używane, gdy nie ma określonego zasobu
 */
public class NullResource extends Resource {
	private final String MSG = "<brak zasobu>";
	
	public NullResource() {
		setId(-1);
		setTitle(MSG);
		setOwner(MSG);
	}
}
