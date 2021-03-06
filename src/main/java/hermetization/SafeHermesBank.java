package hermetization;
// hermetyzacja przez kompozycje
// Dzeidzicząc po tej klasie nie można dostać sie do pola bank i balance
public class SafeHermesBank extends Bank {
    private  final HermesBank bank;

    public SafeHermesBank(HermesBank bank) {
        this.bank = bank;
    }

    @Override
    public String credit(int amount) {
        return bank.credit(amount);
    }

    @Override
    public String debit(int amount) {
        return bank.debit(amount);
    }

    @Override
    public int balance() {
        return bank.balance();
    }
}
