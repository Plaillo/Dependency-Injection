public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new DIApplication(new EmailServiceImpl());
	}

}
