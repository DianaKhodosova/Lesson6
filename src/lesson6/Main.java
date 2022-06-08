package lesson6;

public class Main {


    public static void main(String[] args){
        Cat cat = new Cat("Борис","рыжий", 5);
        Dog dog = new Dog("Бобик", "чёрный", 6);


        cat.setAge(cat.getAge() + 1);
        dog.setAge(dog.getAge() + 1);


        System.out.println(cat);
        System.out.println(dog);


     cat.voice();
     dog.voice();


     cat.setSwimmingSpeed(25);
     dog.setRunSpeed(100);

     cat.swim();
     dog.swim();

     dog.run();
     cat.run();

        cat.run(201);
        cat.swim(1);

        dog.run(500);
        dog.swim(10);



    }
}
