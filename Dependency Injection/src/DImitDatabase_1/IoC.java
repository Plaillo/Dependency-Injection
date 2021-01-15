package DImitDatabase_1;

/**
 * Bad Example
 */
public class IoC {

	public static void main(String[] args) {
		IoC container = new IoC();
		User user = container.new User();
		user.add("Irgendwelche Daten");

	}

	/**
	 * Business Layer Logic
	 */
	public class User {

		MySqlDatabase database;

		/* Fehler: MySql instanz erschwert testen einer Instantz 
		   Fehler: Man kann keine Mock-Instanz einer Datenbank injizieren
		   Fehler: Andere Datenbanken können nicht getestet werden */
		
		// IoC: Control-Flow muss geändert werden
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
