import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        SportsEquipment sportsEquipment1 =  new SportsEquipment(522, 8, "jok");
        SportsEquipment sportsEquipment2 =  new SportsEquipment(455, 12, "aok");
        ArrayList<SportsEquipment> equipments = new ArrayList<>();
        Collections.addAll(equipments, sportsEquipment1,sportsEquipment2);
        Collections.sort(equipments);
        for (int i = 0; i < equipments.size(); i++) {
            System.out.println(equipments.get(i));
      }
      System.out.println(" ");
    }
}
