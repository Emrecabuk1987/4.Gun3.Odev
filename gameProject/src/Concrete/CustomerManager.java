package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService  {
	


private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) throws Exception {

						
			if(customerCheckService.checkIfRealPerson(customer)) {
				this.add(customer);
			}else {
				throw new Exception("Not a valid person");

			}

		}
		
	

	@Override
	public void update(Customer customer) {
		
		System.out.println("kullanıcı güncellendi " +customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		
		System.out.println("Kullanıcı silindi" +customer.getFirstName());
		
	}
	

	
}
