public class Abstract_Classes {
    public static void main(String args[]){
    //    Horse h = new Horse();
    //    h.eat();
    //    h.walk();
    //    System.out.println(h.color);
       
    //    Chicken c = new Chicken();
    //    c.eat();
    //    c.walk();
    Mustang myHorse = new Mustang();
    //Animal -> Horse -> Mustang
       
    }
}

abstract class Animal{
    String color;
    
    Animal(){
        System.out.println("Animal constructor called");
        color = "brown";
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("walks on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructore called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on two legs");
    }
}
