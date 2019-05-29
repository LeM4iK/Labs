package sport;


public class Person {
     private String surname;
    private String name;
    private String gender;
    private int points;
    private boolean isDoping;
    private double weight;

    public Person(String surname, String name, String gender, int points, boolean isDoping, double weight) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.points = points;
        this.isDoping = isDoping;
        this.weight = weight;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getPoints() {
        return points;
    }

    public boolean isIsDoping() {
        return isDoping;
    }

    public double getWeight() {
        return weight;
    }
    
}
