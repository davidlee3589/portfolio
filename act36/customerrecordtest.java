public class CustomerRecordTest {
    public static void main(String[] args) {
        CustomerRecord customerRecord = new CustomerRecord();
        customerRecord.addCustomer(new Customer("John", "Doe", "555-1234", "johndoe@email.com",
                "1234567", 30));
        customerRecord.addCustomer(new Customer("Jane", "Doe", "555-5678", "janedoe@email.com",
                "7654321", 28));
        System.out.println(customerRecord.getAllCustomers());
    }
}