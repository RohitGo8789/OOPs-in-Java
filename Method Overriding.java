public class Method_Overriding {
    public static void main(String args[]){
        Deer d = new Deer(); //In method overriding, the function will be called according to the created object
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
