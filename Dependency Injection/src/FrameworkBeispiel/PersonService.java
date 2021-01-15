package FrameworkBeispiel;

public class PersonService {

	public static void main(String[] arguments) {
		Weld weld = new Weld();

		// Bean-Klassen explizit hinzufügen
		weld.addBeanClass(MySqlDatabase.class);
		weld.addBeanClass(PersonService.class);

		try (WeldContainer container = weld.initialize()) {
			// Neue Instanz des PersonService über Weld erzeugen
			PersonService personService = container.select(PersonService.class).get();
			// Testmethode aufrufen
			personService.doSomething();
		}
	}
}
