package bkash;

public class CSendMoney extends MybKash implements ISendMoney{
    
    char dummy;
    char[] acc, ref;
    Integer amount, m_pin;

    @Override
    public void receiverAccount() {
        System.out.print("Enter Receiver bKash Account No: ");
        acc = scanner.next().toCharArray();
        
        if(acc.length != 11)
        {
            System.out.println("Enter Receiver bKash Account Correctly!");
            receiverAccount();
        }
    }

    @Override
    public void amount() {
        System.out.print("Enter Amount: ");
        amount = scanner.nextInt();
        
        if(amount < 100)
        {
            System.out.println("Amout Must be Greater than 100BDT!");
            amount();
        }
    }

    @Override
    public void reference() {
        System.out.print("Enter Reference: ");
        ref = scanner.next().toCharArray();
    }

    @Override
    public void confirmation() {
        System.out.print("Send Money.\nTo: ");
        System.out.println(acc);
        System.out.print("Amount: ");
        System.out.print(amount);
        System.out.print(" BDT\nReference: ");
        System.out.print(ref);
        
        System.out.print("\nEnter Menu PIN to Confirm: ");
        m_pin = scanner.nextInt();
        
        if(PIN == m_pin){
            System.out.println("Send Money Successful!");
        }else{
            System.out.println("Invalid Pin!");
            confirmation();
        }
    }
    
}
