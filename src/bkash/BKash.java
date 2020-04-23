package bkash;

/**
 *
 * @author Noyan Ali
 * Java Cloning Project - bKash
 */

public class BKash {
    
    public static void main(String[] args) {
        // Displaying the bKash menu
        Menu menu = new Menu();
        menu.displayMenu();
        
        // Choosing the action
        menu.chooseOption();
    }
}
