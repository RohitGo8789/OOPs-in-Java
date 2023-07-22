// single base class and multiple derived classes
public class Hierarchial_Inheritance {
    public static void main(String args[]){
        Bird crow = new Bird();
        crow.eat();
        crow.breathe();
        crow.fly();
    }
}

//base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}
