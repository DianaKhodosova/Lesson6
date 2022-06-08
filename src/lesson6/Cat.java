package lesson6;

public class Cat extends Animal {

    private int swimmingSpeed;
    private final int MaxRunLength = 200;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MaxRunLength)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: false");

    }

    public Cat(String name, String color, int age){
        super(name, color, age);
    }

    public Cat(String name, String color, int age, int swimmingSpeed) {
        super(name, color, age);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Cat(int runDistance, int swimDistance) {
        super(runDistance, swimDistance);
    }


    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public void voice(){
        System.out.println("Мяу");
    }
    public void swim(){
        System.out.println("Кот плывет со скоростью " + swimmingSpeed);
    }
    public void run(){
        System.out.println("Кот пробежал " + 200 + "м");
    }

}
