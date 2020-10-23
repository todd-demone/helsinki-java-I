
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            sum = 0;
        }
        card.addMoney(sum);
        this.money += sum;
    }
    
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < 2.50) {
            return payment;
        }
        
        this.money += 2.50;
        this.affordableMeals += 1;
        return payment - 2.50;
        
    }
    
    public boolean eatAffordably(PaymentCard card) {
             
        boolean transactionSuccess = card.takeMoney(2.50);
        if (transactionSuccess) {
            this.affordableMeals += 1;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < 4.30) {
            return payment;
        } 
        this.money += 4.30;
        this.heartyMeals += 1;
        return payment - 4.30;
    }

    public boolean eatHeartily(PaymentCard card) {
        boolean transactionSuccess = card.takeMoney(4.30);
        if(transactionSuccess) {
            this.heartyMeals += 1;
            return true;
        }
            return false;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
