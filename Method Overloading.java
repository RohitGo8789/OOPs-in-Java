public class Method_Overloading {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,5));
        System.out.println(calc.sum((float)1.6,(float)5.3));
        System.out.println(calc.sum(1,5,9));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
