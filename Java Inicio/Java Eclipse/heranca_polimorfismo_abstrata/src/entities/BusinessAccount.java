package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimint) {
		super(number, holder, balance);
		this.loanLimit = loanLimint;
	}

	public Double getLoanLimint() {
		return loanLimit;
	}

	public void setLoanLimint(Double loanLimint) {
		this.loanLimit = loanLimint;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withDraw(Double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}
}
