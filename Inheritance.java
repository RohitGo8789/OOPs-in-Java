public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}


//Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class / sub-class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("fish swims in water");
    }
}
