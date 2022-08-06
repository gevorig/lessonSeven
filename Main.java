package lessonSeven;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 20, true);
        Cat cat2 = new Cat("Марсик", 21, true);
        Cat cat3 = new Cat("Васик", 19, true);
        Cat cat4 = new Cat("Гарик", 22, true);
        Cat cat5 = new Cat("Персик", 18, true);
        Plate plate = new Plate(90);




        Cat[] cats = {cat1,cat2,cat3,cat4,cat5};
        for (int i = 0; i < cats.length-1; i++) {

            if (plate.getFood() >= cats[i].getAppetite()){
                for (Cat cat: cats){
                    plate.info();
                    System.out.println("-------------------------------");
                    cat.eat(plate);
                    cat.catInfo();
                    //plate.setFood(plate.getFood() - cat.getAppetite());
                    //plate.info();
                } } else System.out.println("Нехватает еды! ");
        }
    }
}
