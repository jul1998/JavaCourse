public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Dog", "Medium", 20);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                '}';
    }

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, size, weight < 15 ? 20 : weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void move(String speed) {
        super.move(speed);
       // System.out.println("Dog is moving at " + speed);

        if (speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println("_______");
    }

    private void bark(){
        System.out.println("Dog is barking");
    }

    private void run(){
        System.out.println("Dog is running");
    }

    private void walk(){
        System.out.println("Dog is walking");
    }

    private void wagTail(){
        System.out.println("Dog is wagging tail");
    }




}
