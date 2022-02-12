import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.Comparator;

public class Operation {
	private LocalDateTime _date;
	private double _amount;
	private OperationType _type;
	private double _balance;
	
	public Operation(LocalDateTime date, double amount, OperationType type, double balance) {
		_date = date;
		_amount = amount;
		_type = type;
		_balance = balance;
	}
	
	public LocalDateTime getDate() {
		return _date;
	}
	
	public void print(PrintStream out) {
		String msg = ""; 
		if (_type == OperationType.DEPOSIT) {
			msg = _date + "\t" + _amount + "\t\t" + _balance;
		}
		if(_type == OperationType.WITHDRAW) {
			msg = _date + "\t\t" + _amount + "\t" + _balance;
		}
		
		out.println(msg);
	}
}
