import OOPInheritance.BankAccount;

public class Main {
    public static void main(String[] args) {

//        OOPInheritance.Car car = new OOPInheritance.Car();
//        car.setMake("Honda");
//        car.setModel("Mustang");
//        car.setColor("Red");
//        car.setDoors(2);
//        car.setConvertible(false);
//        car.describeCar();

//        BankAccount customer1 = new BankAccount("1234", 1000, "John Doess", "email.com", "1234567890");
//        BankAccount customer2 = new BankAccount();
//        System.out.println("Customer name: " + customer1.getCustomerName());
//        System.out.println(customer2.getCustomerName());
//        customer1.setAccountNumber("123456789");
//        customer1.setBalance(1000);
//        customer1.setCustomerName("John Doe");
//        customer1.setEmail("email.com");
//        customer1.setPhoneNumber("1234567890");
//        System.out.println("Customer name: " + customer1.getCustomerName());
//        System.out.println("Customer email: " + customer1.getEmail());
//        System.out.println("Customer phone number: " + customer1.getPhoneNumber());
//        System.out.println("Customer account number: " + customer1.getAccountNumber());
//        System.out.println("Customer balance: " + customer1.getBalance());
//          customer1.deposit(100);
//            customer1.withdraw(200);
//            customer1.withdraw(1000);

//    OOPInheritance.SimpleCalculator calculator = new OOPInheritance.SimpleCalculator();
//
//            calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//

        OOPInheritance.Customer customer = new OOPInheritance.Customer("John", "Doe@email.com", "1234567890");
        OOPInheritance.Customer customer1 = new OOPInheritance.Customer();
        System.out.println(customer1.getName());

    }


}