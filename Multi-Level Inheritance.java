public class Multi_level_Inheritance {
    public static void main(String args[]){
        Dog kutta = new Dog();
        kutta.eat();
        kutta.legs = 4;
        System.out.println(kutta.legs);
    }
}

// base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//derived class
class Mammal extends Animal{
    int legs;
}

//derived class
class Dog extends Mammal{
    String breed;
}
