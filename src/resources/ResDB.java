package resources;
import java.util.ArrayList;

/**
 * Klasa opisująca bazę danych zasobów
 */

public class ResDB {
	private ArrayList<Resource> list = new ArrayList<Resource>();

	/* Metoda dodające zasób */
	public void addResource(Resource o) {
		list.add(o);
	}
	
	/* Metoda zwracająca kopię listy zasobów */
	@SuppressWarnings("unchecked")
	public ArrayList<Resource> getList() {
		return (ArrayList<Resource>)list.clone();
	}
	
	/* Metoda zwracająca zasób o określonym identyfikatorze */
	public Resource getResById(int id) {
		for (Resource o : list) {
			if (o.getId() == id) {
				return o;
			}
		}
		return Resource.NULL;
	}
	
}
