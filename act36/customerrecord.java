import java.util.ArrayList;

public class CustomerRecord {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public String getAllCustomers() {
        StringBuilder allCustomers = new StringBuilder();
        for (Customer customer : customers) {
            allCustomers.append(customer.getCustomerInfo()).append("\n");
        }
        return allCustomers.toString();
    }
}
