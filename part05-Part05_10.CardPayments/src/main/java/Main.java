
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentTerminal trumanCaf = new PaymentTerminal();
        System.out.println(trumanCaf);
        
        PaymentCard toddsCard = new PaymentCard(2);
        
        System.out.println("Amount of money on the card is " + toddsCard.balance());
        
        boolean wasSuccessful = trumanCaf.eatHeartily(toddsCard);
        System.out.println("there was enough money: " + wasSuccessful);
               
        trumanCaf.addMoneyToCard(toddsCard, 100);
        
        wasSuccessful = trumanCaf.eatHeartily(toddsCard);
        System.out.println("there was enough money: " + wasSuccessful);
        
        System.out.println("amount of money on the card is " + toddsCard.balance() + " dollars");
        
        System.out.println(trumanCaf);
        
    }
}

