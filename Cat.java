package lessonSeven;

public class Cat {
    private String name;

    private int appetite;
    private boolean hungry = true;

    public Cat (String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }
    public boolean isHungry() { return hungry; }

    public void setHungry(boolean hungry) { this.hungry = hungry; }

    public void catInfo(){
        System.out.println(name+" съел "+appetite+" еды!");
    }

    public void eat(Plate p) { p.deacreaseFood(appetite); }
/*    public void eat(Plate p) {
        if (!isHungry()) { }
    }*/
    public int getAppetite() {
        return appetite;
    }
}
