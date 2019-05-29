package toys;

public class Main {
    public static void main(String[] args) {
        Story story =  new Story();
        Ball ball1 =  new Ball("Ball", 1200, 5);
        Ball ball2 = new Ball("ball2", 122, 1);
        Doll doll =  new Doll("doll", 4, 5);
        Doll doll1 =  new Doll("doll2", 85, 4);
        Car car = new Car("Car", 5, 1);
        story.addTD(ball2);
        story.addTD(car);
        story.addTD(ball1);
        story.addTD(doll);
        story.addTD(doll1);
           
        System.out.println(story);
        
        
       
    }
}
