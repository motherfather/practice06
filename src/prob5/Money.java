package prob5;

public class Money {
	public Money(int amount) {
		this.setAmount(amount);
	}

	private int amount;

	public int getAmount() {
		return amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

//	public boolean equals(Money money) {
//		if (this.getClass() == money.getClass() 
//				&& this.getAmount() == money.getAmount()) {
//			return true;
//		}
//		return false;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
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
//		Money money1 = new Money(getAmount());
//		money1.setAmount(this.getAmount() * money.getAmount());
		return new Money( getAmount() * money.getAmount());
	}

	public Money devide(Money money) {
		Money money1 = new Money(getAmount());
		money1.setAmount(this.getAmount() / money.getAmount());
		return money1;
	}

}