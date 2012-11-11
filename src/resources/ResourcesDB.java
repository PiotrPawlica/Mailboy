package resources;
import java.util.ArrayList;

public class ResourcesDB {

	private ArrayList<Resource> list = new ArrayList<Resource>();
	
	public void addResource(int id, String title, String owner) {
		list.add(new Resource(id, title, owner));
	}
	
	public void addTextResource(int id, String title, String owner, String text) {
		list.add(new TextResource(id, title, owner, text));
	}
	
	public Resource getResourceById(int id) {
		for (Resource r : list) {
			if (r.getId() == id) {
				return r;
			}
		}
		return Resource.NULL;
	}
	
	public void removeResource(int id) {
		list.remove(getResourceById(id));
	}
	
	public ArrayList<Resource> getFullList() {
		return (ArrayList<Resource>) list.clone();
	}
}
