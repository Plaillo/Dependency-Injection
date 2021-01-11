public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyDIApplication(new EmailServiceImpl());
	}

}
