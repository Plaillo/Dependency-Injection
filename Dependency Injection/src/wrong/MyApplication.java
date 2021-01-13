package wrong;

public class MyApplication {
	private EmailService email = new EmailService();
	
	public void handleMesssages(String msg, String rec) {
		this.email.sendEmail(msg, rec);
	}
	
	}
