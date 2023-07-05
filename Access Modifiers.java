public class Access_Modifiers{
  public static void main(String args[]){
    BankAccount myAcc = new BankAccount(); //Bank account object for the access modifier example
    myAcc.username = "rohitGoswami";
    myAcc.setPassword("abcdefghi"); //we can only change the password (which is private) by using fuction but we still can't access it
    System.out.println(myAcc.username);
  }
}
// Access Modifiers Example
//
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}
//
