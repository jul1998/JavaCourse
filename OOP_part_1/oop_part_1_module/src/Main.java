
public class Main {
    public static void main(String[] args) {

        Worker Julian = new Worker("Julian", "1990", "2020");
        System.out.println(Julian.toString());
        System.out.println(Julian.getAge());
        System.out.println(Julian.collectPayment());

        Employee John = new Employee("John", "1990", "2020",  "2020");
        System.out.println(John.toString());

        Employee Mike = new Employee("Mike", "1990", "2020", "2020");
        System.out.println(John.toString());
    }
}

