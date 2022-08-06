package lessonSeven;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void deacreaseFood(int n) { food -= n; }
    public void info() {
        System.out.println("в тарелке: " + food + " еды");
    }
    public int getFood (){ return food; }
    public void setFood(int food) { this.food = food; }

}
