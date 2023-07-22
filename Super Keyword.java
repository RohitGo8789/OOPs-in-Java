public class Super_Keyword {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal comstructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        super.color = "yellow";
        System.out.println("horse constructor is called");
    }
}
