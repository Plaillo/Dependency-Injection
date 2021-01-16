package DImitDatabase_1;

/**
 * Bad Example
 */
public class PersonService_BAD {
	
	MySqlDatabase database = new MySqlDatabase();
	
	public PersonService_BAD() {
		database = new MySqlDatabase();
	}

	public void add(String data) {
		database.persist(data);
	}

	public static void main(String[] args) {
		PersonService_BAD container = new PersonService_BAD();
		PersonService_BAD user = container.new PersonService_BAD();
		user.add("Irgendwelche Daten");

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
