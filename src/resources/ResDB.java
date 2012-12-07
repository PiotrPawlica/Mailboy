package resources;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	/* Metoda zwracająca listę zasobów o podanym tytule (w postaci wyrażenia regularnego) */
	public ArrayList<Resource> getResByTitle(String searchStr, boolean caseSensitive) {
		ArrayList<Resource> found = new ArrayList<Resource>();
		Pattern p = Pattern.compile(searchStr, caseSensitive ? 0 : Pattern.CASE_INSENSITIVE);
				
		for (Resource o : list) {
			Matcher m = p.matcher(o.getTitle());
			if (m.matches()) {
				found.add(o);
			}
		}
		
		return found;
	}
	
	public ArrayList<Resource> getResByTitle(String searchStr) {
		return getResByTitle(searchStr, false);
	}

	
	
}
