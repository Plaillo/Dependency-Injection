
public class DIApplication implements Consumer {
	
	
	private MessageService service;
		
	public DIApplication(MessageService svc) {
		this.service = svc;
	}
	
	@Override
	public void processMessages(String msg, String rec) {
		// Message Validierung und Manipulation Logic, etc
		this.service.sendMessage(msg, rec);

	}
}
