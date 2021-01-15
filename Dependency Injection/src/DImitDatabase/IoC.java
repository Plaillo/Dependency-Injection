package DImitDatabase;

public class IoC {

	public static void main(String[] args) {
		IoC container = new IoC();
		User user = container.new User();
		user.add("This is some data");
		
	}
	
	
	public class User {
		MySqlDatabase database;
		
		public User() {
			database = new MySqlDatabase();
		}
		
		public void add(String data) {
			database.persist(data);
		}
	}
	
	public class MySqlDatabase {
		
		public void persist(String data) {
			System.out.println("Mysql has persisted: " + data);
		}
	}
	
	
	
}
