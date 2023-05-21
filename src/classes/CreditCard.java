package classes;
public class CreditCard {

    private String accountNumber;
    private double currentSum;

    public CreditCard(String accountNumber, double currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public void addSum(double sum){
        this.currentSum = this.currentSum + sum;
    }

    public void withdrawSum(double sum){
        this.currentSum = this.currentSum - sum;
    }

    public void printInformation(){
        System.out.println("Card number is: " + this.accountNumber);
        System.out.println("Sum is: " +  this.currentSum);
    }
}
