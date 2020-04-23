package bkash;

import java.util.Scanner;

public class MybKash {
    int PIN = 1234;
    int BALANCE = 10000;
    
    Scanner scanner = new Scanner(System.in);
    
    int pin, new_pin1, new_pin2, option;
    
    void displayMenu() {
        System.out.println("bKash");
        
        System.out.println("1 Check Balance");
        System.out.println("2 Request Statement");
        System.out.println("3 Change Mobile Menu PIN");
        System.out.println("4 Manage Beneficiary");
        System.out.println("5 Update MNP Info");
        System.out.println("0 Menu");
    }
    
    void chooseOption()
    {
        System.out.print("Choose Opntion ( 1 / 2 / 3 / 4 / 5 / 0 ): ");
        option = scanner.nextInt();
        
        switch(option) {
            case 1:
                checkBalance();
                break;
            case 2:
                System.out.println("Request Statement");
                break;
            case 3:
                changeMenuPin();
                break;
            case 4:
                System.out.println("Manage Beneficiary");
                break;
            case 5:
                System.out.println("Update MNP Info");
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
    
    void checkBalance()
    {
        System.out.print("Enter Menu Pin: ");
        pin = scanner.nextInt();
        
        if(pin == PIN)
        {
            System.out.print("Your Current bKash Account Banalce is "+BALANCE);
            System.out.print("BDT. Your Available bKash Accout Balance is "+BALANCE);
            System.out.println("BDT.");
        }else{
            System.out.println("Invalid PIN! Enter PIN Correctly!");
            checkBalance();
        }
    }
    
    void changeMenuPin()
    {
        System.out.print("Enter Old PIN: ");
        pin = scanner.nextInt();
        
        if(pin == PIN){
            System.out.print("Enter 5-digit New PIN: ");
            new_pin1 = scanner.nextInt();
            
            System.out.print("Confirm 5-digit New PIN: ");
            new_pin2 = scanner.nextInt();
            
            if(new_pin1 == new_pin2){
                PIN = new_pin1;
                System.out.println("New PIN is Set Successfully!");
            }else{
                System.out.println("PINs don't Match!");
                changeMenuPin();
            }
        }else{
            System.out.println("Invalid PIN! Enter Correctly!");
            changeMenuPin();
        }
    }
}
