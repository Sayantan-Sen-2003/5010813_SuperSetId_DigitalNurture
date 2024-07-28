public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use service to find a customer
        Customer customer = customerService.getCustomer("100");
        System.out.println(customer);
    }
}

// output:
// Customer{id='100', name='Sayantan Sen'}