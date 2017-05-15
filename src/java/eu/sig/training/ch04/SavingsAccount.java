package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount {
    private CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        return getTransfer(counterAccount, amount);
    }

	private Transfer getTransfer(String counterAccount, Money amount) throws BusinessException {
		int sum = registeredCounterAccount.getSum( counterAccount );
		
		if (sum % 11 == 0) {
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            Transfer result = new Transfer(this, acct, amount);
            if (result.getCounterAccount().equals(this.registeredCounterAccount)) 
            {
                return result;
            } else {
                throw new BusinessException("Counter-account not registered!");
            }
        } else {
            throw new BusinessException("Invalid account number!!");
        }
	}
}
// end::SavingsAccount[]
