package entities;

public class Account {
	private static double TAX = 5.00;
	private String holder;
	private int accountNumber;
	private double balance;

	//Inicio dos Contrutores com sobrecarga;

	public Account() {

	}
	
	public Account(String holder, int accountNumber) {
		this.holder = holder;
		this.accountNumber = accountNumber;
	}

	public Account(String holder, int accountNumber, double initialDeposit) {
		this.holder = holder;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}



	// fim dos contrutores.

	// inicio dos get e setters da classe pra poder acessar os atributos privados;

	public String getName() {
		return holder;
	}

	public void setName(String holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	//fim dos get e setters.
	
	//inicio dos metodos da classe;
	
	public void deposit(double deposit) {
		balance += deposit;
		
	}
	
	public void witdraw(double wit) {
		balance -= wit + TAX;
	}
	
	public String toString() {
		return "Account: "
				+getAccountNumber()
				+", "
				+"Holder: "
				+getName()
				+", "
				+"Ballance: $ "
				+String.format("%.2f", getBalance());
	}
}
