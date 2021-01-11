public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		// Logik um die Email zu versenden
		System.out.println("Email versendet an: '" + rec + "' mit der Nachricht: '" + msg + "'");

	}

}
