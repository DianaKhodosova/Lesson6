package lesson6;
//HW

abstract class Animal {
    private String name;
    private String color;
    private int age;

    private final int MaxRunLength = 0;
    private final int MaxSwimLength = 0;


    abstract void run(int length);

    abstract void swim(int length);


    public Animal(String name, String color, int age){
        this.age = age;
        this.color = color;
        this.name = name;

    }

    public Animal(int runDistance, int swimDistance) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){

        return "Name is " + name + " color is " + color + "age is " + age;
    }

    public void voice(){
        System.out.println("Животное издает звук");
    }
}
