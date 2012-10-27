import resources.*;

public class Main {

	public static void main(String[] args) {
		//tworzymy obiekt ogólnego zasobu
		Resource o1 = new Resource(1, "Zasób", "ja");
		System.out.println(o1);	//tu na obiekcie o1 jest tak naprawdę wywoływana metoda toString()

		//tworzymy obiekt zasobu tekstowego
		TextResource o2 = new TextResource(2, "Notatka", "on");
		o2.setText("bla bla bla");
		System.out.println(o2);

		//tworzymy jeszcze jeden obiekt zasobu tekstowego, ale zapisujemy go
		//w zmienej obiektowej o3 typu Resource
		Resource o3 = new TextResource(3, "Nowa notatka", "my");
		//ponieważ o3 jest klasy Resource, nie mamy dostępu do metody setText();
		//aby ją wywołać, musimy rzutować o3 na TextResource
		((TextResource)o3).setText("Kim jestem - Resource czy TextResource?");
		System.out.println(o3);

	
	}

}
