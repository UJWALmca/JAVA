import java.util.Scanner;

public class currency_converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inr to foreign currency converter");
        System.out.println("enetr the inr");
        float in = sc.nextInt();

while (true) {

        System.out.println("choose the currency ");
        System.out.println("1.dollars");
        System.out.println("2. yen");
        System.out.println("3.egyptian pound ");
        System.out.println("4. yuan");
int ch = sc.nextInt();

switch (ch) {
    case 1:System.out.print("inr to dollars  " );
    System.out.println(0.012*in+" dollars");
        
        break;
        case 2:System.out.print("inr to yen  " );
        System.out.println(1.78*in+" yen");
            
            break;
            case 3:System.out.print("inr to egp  " );
            System.out.println(0.60*in+" egp");
                
                break;
                case 4:System.out.print("inr to yuan  " );
                System.out.println(0.087*in+" yuan");
                    
                    break;

    default:System.out.println("invalid");
    
        break;
}
}
    }
}