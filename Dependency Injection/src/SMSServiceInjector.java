public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new DIApplication(new SMSServiceImpl());
	
	}

}
