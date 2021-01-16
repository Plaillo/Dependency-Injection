package DImitDatabase_1;

/**
 * Bad Example
 */
public class PersonService {

	public static void main(String[] args) {
		PersonService container = new PersonService();
		User user = container.new User();
		user.add("Irgendwelche Daten");

	}

	/**
	 * Business Layer Logic
	 */
	public class User {

		MySqlDatabase database;
		/* Fehler: MySql instanz erschwert testen einer Instanz 
		 * Fehler: Man kann keine Mock-Instanz einer Datenbank injizieren 
		 * Fehler: Andere Datenbanken können nicht getestet werden */ 
		
		public User() {
			database = new MySqlDatabase();
		}

		public void add(String data) {
			database.persist(data);
		}
	}

	/**
	 * Database Access Layer
	 */
	public class MySqlDatabase {

		public void persist(String data) {
			System.out.println("MySql hält bereit: " + data);
		}
	}

}
