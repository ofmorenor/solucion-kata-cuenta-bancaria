import java.time.LocalDateTime;

public class StartApp {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(1000, LocalDateTime.parse("2021-01-10T00:00:00"));
		account.deposit(2000, LocalDateTime.parse("2021-01-13T00:00:00"));
		account.withdraw(500, LocalDateTime.parse("2021-01-14T00:00:00"));
		
		account.printStatement(System.out);

	}

}
