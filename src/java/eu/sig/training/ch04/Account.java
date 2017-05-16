package eu.sig.training.ch04;

public class Account {
    private final float INTEREST_PERCENTAGE = 0.01f;
    private Money balance = new Money();
   
    public Transfer makeTransfer( String counterAccount, Money amount ) throws BusinessException {
    	int sum = this.sum( counterAccount );
    	
    	if ( sum % 11 == 0) {
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            Transfer result = new Transfer(this, acct, amount);
            
            return result;
        } else {
            throw new BusinessException("Invalid account number!!");
        }
    }
    
    public int sum( String counterAccount ) {
    	int sum = 0;
    	
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
        
        return sum;
    }

    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
