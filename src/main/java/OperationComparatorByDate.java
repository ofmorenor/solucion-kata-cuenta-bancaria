import java.time.LocalDateTime;
import java.util.Comparator;

public class OperationComparatorByDate implements Comparator<Operation>{
	@Override
	public int compare(Operation op1, Operation op2) {
		return op2.getDate().compareTo(op1.getDate());
	}
}