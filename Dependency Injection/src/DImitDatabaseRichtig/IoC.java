package DImitDatabaseRichtig;



public class IoC {

		public static void main(String[] args) {
			IoC container = new IoC();
			User user = container.new User(container.new MySqlDatabase());
			user.add("This is some data");
			
		}
		
		
		public class User {
			MySqlDatabase database;
			
			public User(MySqlDatabase database) {
				this.database = database;
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
