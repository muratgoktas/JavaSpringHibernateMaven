
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {

	public main(String[] args) {
		
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
ICustomerService customerService1 =  
(context.getBean( "service",ICustomerService.class));
		
		customerService1.add();
		context.close();
	 
	}

}
