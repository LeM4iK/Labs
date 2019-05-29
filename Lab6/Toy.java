package toys;

public abstract class Toy {
    private String name;
    private double price;
    private int counter;

    public Toy(String name, double price, int counter) {
        this.name = name;
        this.price = price;
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCounter() {
        return counter;
    }
    public String toString(){
        return "Toy: " + getName()+" " + getPrice()+" " + getCounter();
    }
     
        
    }

