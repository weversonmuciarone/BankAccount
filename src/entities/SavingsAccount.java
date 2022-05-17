package entities;

public class SavingsAccount extends Account {
	private Double InterestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		InterestRate = interestRate;
	}

	public Double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(Double interestRate) {
		InterestRate = interestRate;
	}
	
	public void UpdateBalance() {
		balance += balance * InterestRate;
	}
	
	@Override
	public void withdrawn(double amount) {
		balance -= amount;
	}
	
	
}
