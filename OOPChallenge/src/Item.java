public class Item {

    private String name;
    private String type;
    private double price;
    private String size;

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public String getName(){
        if (this.type.equals("SIDE") || type.equals("DRINK") ){
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice(){
        return price;
    }

    public double getAdjustedPrice(){
        return switch(this.size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
        }

        public void setSize(String size){
            this.size = size;
        }

        public static void printItem(String name, double price) {
            System.out.println(name + " - $" + price);
        }

        public void printItem() {
            System.out.println(this.getName() + " - $" + this.getAdjustedPrice());
        }
    }



