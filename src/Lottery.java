import java.util.*;

public class Lottery {
    static int lottery;
    static int number;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coupon number(upto 4 digits): ");
        number = scan.nextInt();
        Random ran = new Random();
        lottery = ran.nextInt(9999);
        if(number == lottery){
            System.out.println("Congo! You got the lottery");
        }
        else{
            System.out.println("Ohhoo! You missed the lottery");
        }
    }
}
