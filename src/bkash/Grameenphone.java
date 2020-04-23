package bkash;

public class Grameenphone extends MybKash implements Operator{
    
    int m_option, amount, m_pin;
    
    void m_displayMenu() {
        System.out.println("bKash");
        
        System.out.println("1 Prepaid");
        System.out.println("2 Postpaid");
        System.out.println("3 Skitto");
        System.out.println("0 Main Menu");
    }
    
    void m_chooseOption()
    {
        System.out.print("Choose Opntion ( 1 / 2 / 3 / 0 ): ");
        m_option = scanner.nextInt();
        
        switch(m_option) {
            case 1:
                prepaid();
                break;
            case 2:
                System.out.println("Postpaid");
                break;
            case 3:
                System.out.println("Skitto");
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
    
    void skitto()
    {
        
    }

    @Override
    public void prepaid() {
        System.out.print("Enter Prepaid Grameenphone Number: ");
        char[] number = scanner.next().toCharArray();

        if(number.length != 11 || number[2] != '7')
        {
            System.out.println("Enter Grameenphone Prepaid Number Correctly!");
            prepaid();
        }else
        {
            System.out.print("Enter Recharge Amount : ");
            amount = scanner.nextInt();
            
            System.out.print("Mobile Recharge To: ");
            
            String str;
            str = String.valueOf(number);
            System.out.println(str);

            recharge();
        }
    }

    @Override
    public void postpaid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void recharge()
    {
        System.out.print("Enter Menu PIN To Confirm : ");
        m_pin = scanner.nextInt();
            
        if(PIN == m_pin)
        {
            System.out.println("Recharge is Successful!");
        }
        else{
            System.out.println("Invalid Menu PIN!!");
            recharge();
        }
    }
}
