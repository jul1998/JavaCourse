public class Fish  extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, String size, double weight, int gills, int fins) {
        super(type, size, weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("Fish is moving muscles");
    }

    private void moveBackFin(){
        System.out.println("Fish is moving back fin");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                '}';
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast"){
            moveBackFin();
        }




    }

}
