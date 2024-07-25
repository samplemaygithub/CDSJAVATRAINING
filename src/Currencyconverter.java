
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Currencyconverter {
  static Scanner sc = new Scanner(System.in);
    public static  void main(String[] args){
        System.out.println (" 1 for usd to inr");
        System.out.println(" 2 for int to inr ");
        System.out.println("Enter Your Choice:");
        int choice = sc.nextInt();
      switch (choice){
          case 1 :
              USDTOINR();
              break;
          case 2 :
              INRTOUSD();
              break;
          default:
              System.out.println("Invalid Choice");
      }
    }
    public static void INRTOUSD(){
        System.out.println("Enter amount is:");
        float amount= sc.nextFloat();
                float usdPrice=83.73F;
        System.out.println("Usd to INR is " +amount*usdPrice);
    }
    public static void USDTOINR() {
        float usdPrice = 83.73F;
        System.out.println("Enter amount is:");
        float amount = sc.nextFloat();
        System.out.println("INR to Usd is " + amount / usdPrice);
    }

}