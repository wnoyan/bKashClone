package bkash;

public class CCashOut extends MybKash implements ICashOut{
    
    char[] agent_number;
    Integer c_amount, c_pin, c_option;
    
    void c_displayMenu() {
        System.out.println("bKash");
        
        System.out.println("1 From Agent");
        System.out.println("2 From ATM");
        System.out.println("0 Main Menu");
    }
    
    void c_chooseOption()
    {
        System.out.print("Choose Opntion ( 1 / 2 / 0 ): ");
        c_option = scanner.nextInt();
        
        switch(c_option) {
            case 1:
                ///System.out.println("From Agent");
                fromAgent();
                break;
            case 2:
                System.out.println("From ATM");
                break;
            case 0:
                Menu menu = new Menu();
                menu.displayMenu();
                menu.chooseOption();
                break;
            default:
                System.out.println("Choose Correctly!");
                c_chooseOption();
        }
    }

    @Override
    public void fromAgent() {
        System.out.print("Enter Agent bKash Account No.: ");
        agent_number = scanner.next().toCharArray();
        
        if(agent_number.length != 11)
        {
            System.out.println("Enter Agent bKash Account Correctly!");
            fromAgent();
        }
        
        System.out.print("Enter Amount: ");
        c_amount = scanner.nextInt();
        
        if(c_amount > (BALANCE - (c_amount / 100) * 2)){
            System.out.println("Insufficient Balance!");
        }else{
            System.out.print("Cash Out.\nTo: ");
            System.out.println(agent_number);
            System.out.print("Amount BDT: ");
            System.out.print(c_amount);
        
            System.out.print("\nEnter Menu PIN to Confirm: ");
            c_pin = scanner.nextInt();
        
            if(PIN == c_pin){
                BALANCE = BALANCE - c_amount - ((c_amount / 100) * 2) ;
                System.out.println("Cash Out Successful!");
            }else{
                System.out.println("Invalid Pin!");
            }
        }
    }

    @Override
    public void fromATM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
