package wrong;

public class Application {
	
	private EmailService email = new EmailService();
	
	public void handleMesssages(String msg, String rec) {
		this.email.sendEmail(msg, rec);
	}
	
	}
