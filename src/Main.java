public class Main {
    public static void main(String[] args) {
       Animal animal = new Animal("Cat", "Medium", 20);
            doAnimalStuff(animal, "fast");

       Dog dog= new Dog("Dog", "Medium", 20, "Pointy", "Long");
            doAnimalStuff(dog, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______");
    }


}