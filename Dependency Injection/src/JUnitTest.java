
import org.junit.After;
import org.junit.Before;
import org.junit.Test;





public class JUnitTest {

	private MessageServiceInjector injector;
	@Before
	public void setUp(){
		injector = new MessageServiceInjector() {
			
			@Override
			public Consumer getConsumer() {
				return new DIApplication(new MessageService() {
					
					@Override
					public void sendMessage(String msg, String rec) {
						System.out.println("Mock Message");
						
					}
				});
			}
		};
	}
	
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("JUnit", "test@junit.com");
	}
	
	@After
	public void tear(){
		injector = null;
	}

}