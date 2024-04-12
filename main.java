import java.util.Scanner;

class Bank{
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add Account");
            System.out.println("2. deposit money");
            System.out.println("3. withdraw money");
            System.out.println("4. get balance");
            System.out.println("5. Remove account");
            System.out.println("6. display total accounts");

            System.out.println("enter your choice");
            int a = sc.nextInt();

            switch (a) {
                case 1:a.addAccount();
                    
                    break;
                case 2:a.depositMoney();
                    
                    break;
                
                    case 3:a.withdrawMoney();
                    
                    break;

                    case 4:a.getbalance();
                    
                    break;

                    case 5:a.removeAccounts();
                    
                    break;
            
                    case 6:a.displayAccounts();
                    
                    break;

                   
                default:System.out.println("invalid choice");
                    break;
            }
        }
    }
}