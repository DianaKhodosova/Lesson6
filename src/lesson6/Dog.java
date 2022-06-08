package lesson6;

public class Dog extends Animal {

    private final int MaxRunLength = 500;
    private final int MaxSwimLength = 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MaxRunLength)) System.out.println("run: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MaxSwimLength)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }


    private int runSpeed;

    public Dog(String name, String color, int age){
        super(name,color,age);
    }
    public Dog(String name, String color, int age, int runSpeed){
        super(name,color,age);
        this.runSpeed = runSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public void voice(){
        System.out.println("Гав");
    }
    public void swim(){
        System.out.println("Собака плывет");
   }

   public void run(){
       System.out.println("Собака пробежала " + runSpeed + "м");
   }
}
