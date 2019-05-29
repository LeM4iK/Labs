package sport;

import java.util.ArrayList;

public class Sport {
   

   private Person person;
   private ArrayList<Person> participantF = new ArrayList<>();
   private ArrayList<Person> participantM = new ArrayList<>();
   private ArrayList<Person> dis = new ArrayList<>();
   
    public void sort(){
        if(person.getGender().equals("F")){
            participantF.add(person);
    }else{
            participantM.add(person);
        }
    }
}
