public class Static_Keyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "sunshine";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
