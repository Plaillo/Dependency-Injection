public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		// Logik um die SMS zu versenden
		System.out.println("SMS versendet an: '" + rec + "' mit der Nachricht: '" + msg + "'");
		
	}

}
