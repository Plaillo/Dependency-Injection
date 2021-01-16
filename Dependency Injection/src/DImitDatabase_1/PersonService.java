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

	public class User {
		MySqlDatabase database = new MySqlDatabase();
		
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
