import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello what game are you looking for");
    scan.next();
    System.out.println("Out top selling games are Rocket Leaue, Forza and Call of Duty");
    scan.next();
    System.out.println("For 10 dollars you can get Rocket League");
    scan.next();
    System.out.println("Your welcome");
    
    
    static String greeting(String name)
    {
      String hello = "Hello again. What brings you back " ;
      return hello;
    }
    

    static int money(int moneyPaid , int moneyBack)
    {
     int money = moneyPaid - moneyBack;
     return money;
    }

  }
} 