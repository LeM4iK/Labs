/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Story {

    private Toy toy;
    private CarDept carDept;
    private Dispatcher dispatcher;
    private DollDept dollDept;
    private CubesDept CubesDept;
    private BallDept ballDept;

    public Story() {
        this.carDept = new CarDept();
        this.dispatcher = new Dispatcher();
        this.ballDept =  new BallDept();
        this.dollDept =  new DollDept();
        this.CubesDept =  new CubesDept();
    }

    public void addTD(Toy toy) {
       dispatcher.addToD(toy);
    }
    public String toString(){
        String infa  = "Story:\n";
        infa = infa + ballDept.toString()+ CubesDept.toString()+dollDept.toString() + carDept.toString();
        return infa;
    }

    public class CarDept {

        ArrayList<Car> cars = new ArrayList<>();

        public void addCar(Car car) {
            cars.add(car);
        }
        public String toString(){
             String infa = "CAR:\n";
             for(Car car:cars){
                 infa = infa + car+"\n";
             }
                return infa;
    }
    }

    public class DollDept {

        ArrayList<Doll> dolls = new ArrayList<>();

        public void addDoll(Doll doll) {
            dolls.add(doll);
        }
         public String toString(){
             String infa = "DOLL:\n";
             for(Doll doll: dolls){
                 infa = infa + doll+"\n";
             }
                return infa;
    }
    }

    public class CubesDept {

        ArrayList<Cubes> cubes = new ArrayList<>();

        public void addCubes(Cubes cubess) {
            cubes.add(cubess);
        }
         public String toString(){
             String infa = "CUBES:\n";
             for(Cubes cube :cubes  ){
                 infa = infa + cube+"\n";
             }
                return infa;
    }
    }

    public class BallDept {

        ArrayList<Ball> balls = new ArrayList<>();

        public void addBall(Ball ball) {
            balls.add(ball);
        }
         public String toString(){
             String infa = "Ball:\n";
             for(Ball ball: balls){
                 infa = infa + ball+"\n";
             }
                return infa;
    }
    }

    public class Dispatcher {

        public void addToD(Toy toy) {
            if (toy instanceof Car) {
                carDept.addCar((Car)toy);
            }
            if (toy instanceof Doll) {
                dollDept.addDoll((Doll)toy);
            }
            if(toy instanceof Cubes){
                CubesDept.addCubes((Cubes)toy);
            }
            if(toy instanceof Ball){
                ballDept.addBall((Ball)toy);
            }
        }
    }
}
