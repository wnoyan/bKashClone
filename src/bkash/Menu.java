package bkash;

import java.util.Scanner;

class Menu {
    
    int option;
    
    void displayMenu() {
        System.out.println("bKash");
        
        System.out.println("1 Send Money");
        System.out.println("2 Mobile Recharge");
        System.out.println("3 Payment");
        System.out.println("4 Cash Out");
        System.out.println("5 Pay Bill");
        System.out.println("6 App Registration for TK50 Bonus");
        System.out.println("7 My bKash");
        System.out.println("8 Helpline");
    }
    
    void chooseOption()
    {
        System.out.print("Choose Opntion ( 1 / 2 / 3 / 4 / 5 / 6 / 7 / 8 ): ");
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        
        System.out.print((char)13);
        
        switch(option) {
            case 1:
                CSendMoney sendMoney = new CSendMoney();
                sendMoney.receiverAccount();
                sendMoney.amount();
                sendMoney.reference();
                sendMoney.confirmation();
                break;
            case 2:
                MobileRecharge mobileRecharge = new MobileRecharge();
                mobileRecharge.displayMenu();
                mobileRecharge.chooseOption();
                break;
            case 3:
                System.out.println("Payment");
                break;
            case 4:
                CCashOut cashout = new CCashOut();
                cashout.c_displayMenu();
                cashout.c_chooseOption();
                break;
            case 5:
                System.out.println("Pay Bill");
                break;
            case 6:
                System.out.println("App Registration for 50Tk Bonus");
                break;
            case 7:
                MybKash mybKash = new MybKash();
                mybKash.displayMenu();
                mybKash.chooseOption();
                break;
            case 8:
                System.out.println("Helpline");
                break;
            default:
                System.out.println("Choose Correctly!");
                chooseOption();
        }
    }
}
