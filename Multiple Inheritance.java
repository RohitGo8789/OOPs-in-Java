public class Multiple_Inheritance{
    public static void main(String args[]){
        Bear b = new Bear();
        b.eat();
    }
}

interface Herbivore{
    void eat();
} 

interface Carnivore{
    void eat();
}

class Bear implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("eats both grass and meat");
    }
}
