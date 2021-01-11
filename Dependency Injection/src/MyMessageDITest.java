
public class MyMessageDITest {
	
	public static void main(String[] args) {
		String msg = "Hallo Welt";
		String email = "test@abc.com";
		String phone = "+491111111123239";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		// Versende Email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		// Versende SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
		
	}
}
