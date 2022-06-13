
public class CustomerManager implements ICustomerService{

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		System.out.println("Business Rules");
		customerDal.add();
		
	}

}
