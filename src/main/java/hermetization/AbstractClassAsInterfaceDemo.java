package hermetization;

import java.util.Random;

public class AbstractClassAsInterfaceDemo {
    public static void main(String[] args) {
        Bank bank = new SuperHakerBank();
        Random random = new Random();
        while(true){
            //Symulujemy wpłaty
            final  String feedback =bank.credit(random.nextInt(1000));
            System.out.println(feedback);
            //sprawdzamy czy mamy odpowiednią kwotę na koncie
            if(bank.balance()>=100_000){
                System.out.println("Możesz kupic samochód");
                break;
            }
        }
        System.out.println("Stan konta " + bank.balance());
        System.out.println(bank.debit(200_000));
        System.out.println("stan konta " +bank.balance());
    }
}
