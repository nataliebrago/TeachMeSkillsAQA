import classes.CreditCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CreditCard mastercard = new CreditCard("1234 1234 1234 1234",100);
        CreditCard visaCard = new CreditCard("2345 2345 2345 2345",500);
        CreditCard belCard = new CreditCard("3456 4567 4563 1234",750);

        mastercard.addSum(100);
        visaCard.addSum(200);
        belCard.withdrawSum(250);

        mastercard.printInformation();
        visaCard.printInformation();
        belCard.printInformation();
    }
}
