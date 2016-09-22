package prob5;

public class Money {
	public Money(int amount) {
		this.setAmount(amount);
	}

	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		Money money1 = new Money(getAmount());
		money1.setAmount(this.getAmount() + money.getAmount());
		return money1;
	}

	public Money minus(Money money) {
		Money money1 = new Money(getAmount());
		money1.setAmount(this.getAmount() - money.getAmount());
		return money1;
	}

	public Money multiply(Money money) {
		Money money1 = new Money(getAmount());
		money1.setAmount(this.getAmount() * money.getAmount());
		return money1;
	}

	public Money devide(Money money) {
		Money money1 = new Money(getAmount());
		money1.setAmount(this.getAmount() / money.getAmount());
		return money1;
	}

	public boolean equals(Money money) {
		if (this.getClass() == money.getClass() 
				&& this.getAmount() == money.getAmount()) {
			return true;
		}
		return false;
	}
}