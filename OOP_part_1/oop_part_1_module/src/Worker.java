public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public String toString() {
        return "Worker name: " + this.name + ", birth date: " + this.birthDate + ", end date: " + this.endDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return 2020 - Integer.parseInt(birthDate);
    }

    public double collectPayment() {
        return 0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }
}
