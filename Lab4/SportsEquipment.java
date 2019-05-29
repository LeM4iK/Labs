public class SportsEquipment implements Comparable<SportsEquipment>{
    
    private double price;
    private int number;
    private String name;

    public SportsEquipment(double price, int number, String name) {
        this.price = price;
        this.number = number;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
   public int compareTo(SportsEquipment sportsEquipment) {
    int rem = Double.compare(price, sportsEquipment.price);
    if(rem!=0) return rem;
    rem = Integer.compare(sportsEquipment.number, number);
    if(rem!=0) return rem;
    return rem = name.compareTo(sportsEquipment.name);
        
        
    }
    public String toString() {
        return "name "+name+" price " + price+" number "+number;
    }
}
