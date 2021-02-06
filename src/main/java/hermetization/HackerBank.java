package hermetization;

public class HackerBank extends GringotBank {

    @Override
    public String debit(int amount) {
      //  nie możemy dostac się sie do pola balance, bo jest prywatne
        super.debit(amount);
        return "Balance changed";
    }
}
