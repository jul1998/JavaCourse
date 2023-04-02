public class Employee extends Worker {

    private long  employeeId;

    private String hireDate;

    private static int employeeNo = 1;




    public Employee(String name, String birthdDate, String endDate, String hireDate) {
        super(name, birthdDate, endDate);
        this.employeeId = Employee.employeeNo ++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeNo +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
