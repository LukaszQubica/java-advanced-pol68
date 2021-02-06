package hermetization;
// klSA hERMES BANK nie zapewnia hermetyzacji bo mozna dostać się do pola balance
public class SuperHakerBank extends HermesBank {
    @Override
    public String debit(int amount) {
        balance-=amount;
        return "Yes";
    }
}
