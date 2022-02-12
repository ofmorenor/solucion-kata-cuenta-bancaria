import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Account {
	private double _balance;
	private OperationList _operations;
	
	public Account() {
		_balance = 0;
		_operations = new OperationList();
	}
	
	public Account(double initialBalance) {
		this();
		_balance = initialBalance;
	}
	
	
	public double getBalance() {
		return _balance;
	}
	
    public void deposit(int amount, LocalDateTime date) {
    	makeValidationsToAmount(amount);
    	_balance += (double) amount;
    	_operations.add(new Operation(date, amount, OperationType.DEPOSIT, _balance));
    }

    public void withdraw(int amount, LocalDateTime date) {
    	makeValidationsToAmount(amount);
    	_balance -= (double) amount;
    	_operations.add(new Operation(date, amount, OperationType.WITHDRAW, _balance));
    } 

    public void printStatement(PrintStream out) {
    	out.println("Date\t\t\tDebit\tCredit\tBalance");
    	_operations.getByDate().forEach(o -> o.print(out));
    }
    
    private void checkIsPositiveNumber(int number) throws Exception {
    	if(number < 0) {
        	throw new IllegalArgumentException();
        }	
    }
    
    private void makeValidationsToAmount(int amount) {
    	try {
			checkIsPositiveNumber(amount);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}
