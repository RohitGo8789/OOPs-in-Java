public class OOPs {
    public static void main(String args[]){
          Pen P1 = new Pen(); // Created a pen object called P1
          P1.setColor("Blue");
          System.out.println(P1.color);
          P1.setTip(5);
          System.out.println(P1.tip);
          P1.color = "Yellow";
          System.out.println(P1.color);


    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int maths){
        percentage = (phy + chem + maths) / 3;
    }
}
