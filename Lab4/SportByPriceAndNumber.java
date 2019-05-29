import java.util.Comparator;

public class SportByPriceAndNumber implements Comparator<SportsEquipment>{

     @Override
    public int compare(SportsEquipment o1, SportsEquipment o2) {
         
        return Double.valueOf(o1.getPrice()).compareTo(Double.valueOf(o2.getPrice()));
        
    }
}

   

    

