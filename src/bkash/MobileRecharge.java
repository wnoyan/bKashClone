package bkash;

import java.util.Scanner;

public class MobileRecharge {
    
    int option;
    
    void displayMenu() {
        System.out.println("bKash");
        
        System.out.println("1 Robi");
        System.out.println("2 Airtel");
        System.out.println("3 Banglalink");
        System.out.println("4 Grameenphone");
        System.out.println("5 Teletalk");
        System.out.println("0 Main Menu");
    }
    
    void chooseOption()
    {
        System.out.print("Choose Opntion ( 1 / 2 / 3 / 4 / 5 / 0 ): ");
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        
        switch(option) {
            case 1:
                System.out.println("Robi");
                break;
            case 2:
                System.out.println("Airtel");
                break;
            case 3:
                System.out.println("Banglalink");
                break;
            case 4:
                Grameenphone grameenphone = new Grameenphone();
                grameenphone.m_displayMenu();
                grameenphone.m_chooseOption();
                break;
            case 5:
                System.out.println("Send Money");
                break;
            case 0:
                Menu menu = new Menu();
                menu.displayMenu();
                menu.chooseOption();
                break;
            default:
                System.out.println("Choose Correctly!");
                chooseOption();
        }
    }
}
