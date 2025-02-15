package activities;

public class NotEnoughFundsException extends RuntimeException {
	//private static final  long serialVersionUID=-4108232634220984836L;
	
	public NotEnoughFundsException(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }
}
