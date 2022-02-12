 import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class AcceptanceTest {

    @Test
    public void deposit_addsAmountToBalance() {
    	// arrange
    	Account account = new Account();
    	// act
    	account.deposit(100, LocalDateTime.MIN);
    	// assert
    	assertEquals(100.0, account.getBalance(), 0.001);
    }
    
    @Test
    public void withdrow_removeAmountToBalance() {
    	// arrange
    	Account account = new Account(500);
    	// act
    	account.withdraw(50, LocalDateTime.MIN);
    	// assert
    	assertEquals(450, account.getBalance(), 0.001);
    }

}
